import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;

public class evl implements PathMatcher {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "#";
   private final List<evl.a> c;
   private final Map<String, PathMatcher> d = new ConcurrentHashMap<>();

   public evl(List<evl.a> $$0) {
      this.c = $$0;
   }

   public PathMatcher a(FileSystem $$0) {
      return this.d.computeIfAbsent($$0.provider().getScheme(), $$1 -> {
         List<PathMatcher> $$2;
         try {
            $$2 = this.c.stream().map($$1x -> $$1x.a($$0)).toList();
         } catch (Exception var5) {
            a.error("Failed to compile file pattern list", var5);
            return $$0xx -> false;
         }
         return switch ($$2.size()) {
            case 0 -> $$0xx -> false;
            case 1 -> (PathMatcher)$$2.get(0);
            default -> $$1x -> {
            for (PathMatcher $$2 : $$2) {
               if ($$2.matches($$1x)) {
                  return true;
               }
            }

            return false;
         };
         };
      });
   }

   @Override
   public boolean matches(Path $$0) {
      return this.a($$0.getFileSystem()).matches($$0);
   }

   public static evl a(BufferedReader $$0) {
      return new evl($$0.lines().flatMap($$0x -> evl.a.a($$0x).stream()).toList());
   }

   public static record a(evl.b a, String b) {
      public PathMatcher a(FileSystem $$0) {
         return this.a().compile($$0, this.b);
      }

      static Optional<evl.a> a(String $$0) {
         if ($$0.isBlank() || $$0.startsWith("#")) {
            return Optional.empty();
         } else if (!$$0.startsWith("[")) {
            return Optional.of(new evl.a(evl.b.b, $$0));
         } else {
            int $$1 = $$0.indexOf(93, 1);
            if ($$1 == -1) {
               throw new IllegalArgumentException("Unterminated type in line '" + $$0 + "'");
            } else {
               String $$2 = $$0.substring(1, $$1);
               String $$3 = $$0.substring($$1 + 1);

               return switch ($$2) {
                  case "glob", "regex" -> Optional.of(new evl.a(evl.b.a, $$2 + ":" + $$3));
                  case "prefix" -> Optional.of(new evl.a(evl.b.b, $$3));
                  default -> throw new IllegalArgumentException("Unsupported definition type in line '" + $$0 + "'");
               };
            }
         }
      }

      static evl.a b(String $$0) {
         return new evl.a(evl.b.a, "glob:" + $$0);
      }

      static evl.a c(String $$0) {
         return new evl.a(evl.b.a, "regex:" + $$0);
      }

      static evl.a d(String $$0) {
         return new evl.a(evl.b.b, $$0);
      }
   }

   @FunctionalInterface
   public interface b {
      evl.b a = FileSystem::getPathMatcher;
      evl.b b = ($$0, $$1) -> $$1x -> $$1x.toString().startsWith($$1);

      PathMatcher compile(FileSystem var1, String var2);
   }
}

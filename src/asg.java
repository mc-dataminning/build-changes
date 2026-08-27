import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class asg extends aru {
   private static final Logger c = LogUtils.getLogger();
   private static final Joiner d = Joiner.on("/");
   private final Path e;

   public asg(asc $$0, Path $$1) {
      super($$0);
      this.e = $$1;
   }

   @Nullable
   @Override
   public atj<InputStream> a(String... $$0) {
      v.a($$0);
      Path $$1 = v.a(this.e, List.of($$0));
      return Files.exists($$1) ? atj.create($$1) : null;
   }

   public static boolean a(Path $$0) {
      return true;
   }

   @Nullable
   @Override
   public atj<InputStream> a(asf $$0, akh $$1) {
      Path $$2 = this.e.resolve($$0.a()).resolve($$1.b());
      return a($$1, $$2);
   }

   public static atj<InputStream> a(akh $$0, Path $$1) {
      return (atj<InputStream>)v.c($$0.a()).get().map($$1x -> {
         Path $$2 = v.a($$1, $$1x);
         return b($$2);
      }, $$1x -> {
         c.error("Invalid path {}: {}", $$0, $$1x.message());
         return null;
      });
   }

   @Nullable
   private static atj<InputStream> b(Path $$0) {
      return Files.exists($$0) && a($$0) ? atj.create($$0) : null;
   }

   @Override
   public void a(asf $$0, String $$1, String $$2, asd.a $$3) {
      v.c($$2).get().ifLeft($$3x -> {
         Path $$4 = this.e.resolve($$0.a()).resolve($$1);
         a($$1, $$4, $$3x, $$3);
      }).ifRight($$1x -> c.error("Invalid path {}: {}", $$2, $$1x.message()));
   }

   public static void a(String $$0, Path $$1, List<String> $$2, asd.a $$3) {
      Path $$4 = v.a($$1, $$2);

      try (Stream<Path> $$5 = Files.find($$4, Integer.MAX_VALUE, ($$0x, $$1x) -> $$1x.isRegularFile())) {
         $$5.forEach($$3x -> {
            String $$4x = d.join($$1.relativize($$3x));
            akh $$5x = akh.a($$0, $$4x);
            if ($$5x == null) {
               ac.a(String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", $$0, $$4x));
            } else {
               $$3.accept($$5x, atj.create($$3x));
            }
         });
      } catch (NotDirectoryException | NoSuchFileException var10) {
      } catch (IOException var11) {
         c.error("Failed to list path {}", $$4, var11);
      }
   }

   @Override
   public Set<String> a(asf $$0) {
      Set<String> $$1 = Sets.newHashSet();
      Path $$2 = this.e.resolve($$0.a());

      try (DirectoryStream<Path> $$3 = Files.newDirectoryStream($$2)) {
         for (Path $$4 : $$3) {
            String $$5 = $$4.getFileName().toString();
            if (akh.h($$5)) {
               $$1.add($$5);
            } else {
               c.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", $$5, this.e);
            }
         }
      } catch (NotDirectoryException | NoSuchFileException var10) {
      } catch (IOException var11) {
         c.error("Failed to list path {}", $$2, var11);
      }

      return $$1;
   }

   @Override
   public void close() {
   }

   public static class a implements asz.c {
      private final Path a;

      public a(Path $$0) {
         this.a = $$0;
      }

      @Override
      public asd a(asc $$0) {
         return new asg($$0, this.a);
      }

      @Override
      public asd a(asc $$0, asz.a $$1) {
         asd $$2 = this.a($$0);
         List<String> $$3 = $$1.d();
         if ($$3.isEmpty()) {
            return $$2;
         } else {
            List<asd> $$4 = new ArrayList<>($$3.size());

            for (String $$5 : $$3) {
               Path $$6 = this.a.resolve($$5);
               $$4.add(new asg($$0, $$6));
            }

            return new arw($$2, $$4);
         }
      }
   }
}

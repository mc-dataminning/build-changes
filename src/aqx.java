import com.google.common.base.Splitter;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class aqx extends FileSystem {
   private static final Set<String> b = Set.of("basic");
   public static final String a = "/";
   private static final Splitter c = Splitter.on('/');
   private final FileStore d;
   private final FileSystemProvider e = new aqw();
   private final aqv f;

   aqx(String $$0, aqx.b $$1) {
      this.d = new aqu($$0);
      this.f = a($$1, this, "", null);
   }

   private static aqv a(aqx.b $$0, aqx $$1, String $$2, @Nullable aqv $$3) {
      Object2ObjectOpenHashMap<String, aqv> $$4 = new Object2ObjectOpenHashMap();
      aqv $$5 = new aqv($$1, $$2, $$3, new aqy.a($$4));
      $$0.b.forEach(($$3x, $$4x) -> $$4.put($$3x, new aqv($$1, $$3x, $$5, new aqy.b($$4x))));
      $$0.a.forEach(($$3x, $$4x) -> $$4.put($$3x, a($$4x, $$1, $$3x, $$5)));
      $$4.trim();
      return $$5;
   }

   @Override
   public FileSystemProvider provider() {
      return this.e;
   }

   @Override
   public void close() {
   }

   @Override
   public boolean isOpen() {
      return true;
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public String getSeparator() {
      return "/";
   }

   @Override
   public Iterable<Path> getRootDirectories() {
      return List.of(this.f);
   }

   @Override
   public Iterable<FileStore> getFileStores() {
      return List.of(this.d);
   }

   @Override
   public Set<String> supportedFileAttributeViews() {
      return b;
   }

   @Override
   public Path getPath(String $$0, String... $$1) {
      Stream<String> $$2 = Stream.of($$0);
      if ($$1.length > 0) {
         $$2 = Stream.concat($$2, Stream.of($$1));
      }

      String $$3 = $$2.collect(Collectors.joining("/"));
      if ($$3.equals("/")) {
         return this.f;
      } else if ($$3.startsWith("/")) {
         aqv $$4 = this.f;

         for (String $$5 : c.split($$3.substring(1))) {
            if ($$5.isEmpty()) {
               throw new IllegalArgumentException("Empty paths not allowed");
            }

            $$4 = $$4.a($$5);
         }

         return $$4;
      } else {
         aqv $$6 = null;

         for (String $$7 : c.split($$3)) {
            if ($$7.isEmpty()) {
               throw new IllegalArgumentException("Empty paths not allowed");
            }

            $$6 = new aqv(this, $$7, $$6, aqy.b);
         }

         if ($$6 == null) {
            throw new IllegalArgumentException("Empty paths not allowed");
         } else {
            return $$6;
         }
      }
   }

   @Override
   public PathMatcher getPathMatcher(String $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public UserPrincipalLookupService getUserPrincipalLookupService() {
      throw new UnsupportedOperationException();
   }

   @Override
   public WatchService newWatchService() {
      throw new UnsupportedOperationException();
   }

   public FileStore a() {
      return this.d;
   }

   public aqv b() {
      return this.f;
   }

   public static aqx.a c() {
      return new aqx.a();
   }

   public static class a {
      private final aqx.b a = new aqx.b();

      public aqx.a a(List<String> $$0, String $$1, Path $$2) {
         aqx.b $$3 = this.a;

         for (String $$4 : $$0) {
            $$3 = $$3.a.computeIfAbsent($$4, $$0x -> new aqx.b());
         }

         $$3.b.put($$1, $$2);
         return this;
      }

      public aqx.a a(List<String> $$0, Path $$1) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Path can't be empty");
         } else {
            int $$2 = $$0.size() - 1;
            return this.a($$0.subList(0, $$2), $$0.get($$2), $$1);
         }
      }

      public FileSystem a(String $$0) {
         return new aqx($$0, this.a);
      }
   }

   static record b(Map<String, aqx.b> a, Map<String, Path> b) {

      public b() {
         this(new HashMap<>(), new HashMap<>());
      }
   }
}

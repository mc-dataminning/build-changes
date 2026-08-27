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

public class amt extends FileSystem {
   private static final Set<String> b = Set.of("basic");
   public static final String a = "/";
   private static final Splitter c = Splitter.on('/');
   private final FileStore d;
   private final FileSystemProvider e = new ams();
   private final amr f;

   amt(String $$0, amt.b $$1) {
      this.d = new amq($$0);
      this.f = a($$1, this, "", null);
   }

   private static amr a(amt.b $$0, amt $$1, String $$2, @Nullable amr $$3) {
      Object2ObjectOpenHashMap<String, amr> $$4 = new Object2ObjectOpenHashMap();
      amr $$5 = new amr($$1, $$2, $$3, new amu.a($$4));
      $$0.b.forEach(($$3x, $$4x) -> $$4.put($$3x, new amr($$1, $$3x, $$5, new amu.b($$4x))));
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
         amr $$4 = this.f;

         for (String $$5 : c.split($$3.substring(1))) {
            if ($$5.isEmpty()) {
               throw new IllegalArgumentException("Empty paths not allowed");
            }

            $$4 = $$4.a($$5);
         }

         return $$4;
      } else {
         amr $$6 = null;

         for (String $$7 : c.split($$3)) {
            if ($$7.isEmpty()) {
               throw new IllegalArgumentException("Empty paths not allowed");
            }

            $$6 = new amr(this, $$7, $$6, amu.b);
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

   public amr b() {
      return this.f;
   }

   public static amt.a c() {
      return new amt.a();
   }

   public static class a {
      private final amt.b a = new amt.b();

      public amt.a a(List<String> $$0, String $$1, Path $$2) {
         amt.b $$3 = this.a;

         for (String $$4 : $$0) {
            $$3 = $$3.a.computeIfAbsent($$4, $$0x -> new amt.b());
         }

         $$3.b.put($$1, $$2);
         return this;
      }

      public amt.a a(List<String> $$0, Path $$1) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Path can't be empty");
         } else {
            int $$2 = $$0.size() - 1;
            return this.a($$0.subList(0, $$2), $$0.get($$2), $$1);
         }
      }

      public FileSystem a(String $$0) {
         return new amt($$0, this.a);
      }
   }

   static record b(Map<String, amt.b> a, Map<String, Path> b) {

      public b() {
         this(new HashMap<>(), new HashMap<>());
      }
   }
}

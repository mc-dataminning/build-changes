import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ewq {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "structure";
   private static final String c = "structures";
   private static final String d = ".nbt";
   private static final String e = ".snbt";
   private final Map<alr, Optional<ewp>> f = Maps.newConcurrentMap();
   private final DataFixer g;
   private avo h;
   private final Path i;
   private final List<ewq.b> j;
   private final jh<dno> k;
   private static final alk l = new alk("structure", ".nbt");

   public ewq(avo $$0, fah.c $$1, DataFixer $$2, jh<dno> $$3) {
      this.h = $$0;
      this.g = $$2;
      this.i = $$1.a(faf.i).normalize();
      this.k = $$3;
      Builder<ewq.b> $$4 = ImmutableList.builder();
      $$4.add(new ewq.b(this::h, this::d));
      if (ac.aV) {
         $$4.add(new ewq.b(this::g, this::c));
      }

      $$4.add(new ewq.b(this::f, this::b));
      this.j = $$4.build();
   }

   public ewp a(alr $$0) {
      Optional<ewp> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         return $$1.get();
      } else {
         ewp $$2 = new ewp();
         this.f.put($$0, Optional.of($$2));
         return $$2;
      }
   }

   public Optional<ewp> b(alr $$0) {
      return this.f.computeIfAbsent($$0, this::e);
   }

   public Stream<alr> a() {
      return this.j.stream().flatMap($$0 -> $$0.b().get()).distinct();
   }

   private Optional<ewp> e(alr $$0) {
      for (ewq.b $$1 : this.j) {
         try {
            Optional<ewp> $$2 = $$1.a().apply($$0);
            if ($$2.isPresent()) {
               return $$2;
            }
         } catch (Exception var5) {
         }
      }

      return Optional.empty();
   }

   public void a(avo $$0) {
      this.h = $$0;
      this.f.clear();
   }

   private Optional<ewp> f(alr $$0) {
      alr $$1 = l.a($$0);
      return this.a(() -> this.h.open($$1), $$1x -> b.error("Couldn't load structure {}", $$0, $$1x));
   }

   private Stream<alr> b() {
      return l.a(this.h).keySet().stream().map(l::b);
   }

   private Optional<ewp> g(alr $$0) {
      return this.a($$0, tj.c);
   }

   private Stream<alr> c() {
      if (!Files.isDirectory(tj.c)) {
         return Stream.empty();
      } else {
         List<alr> $$0 = new ArrayList<>();
         this.a(tj.c, "minecraft", ".snbt", $$0::add);
         return $$0.stream();
      }
   }

   private Optional<ewp> h(alr $$0) {
      if (!Files.isDirectory(this.i)) {
         return Optional.empty();
      } else {
         Path $$1 = this.a($$0, ".nbt");
         return this.a(() -> new FileInputStream($$1.toFile()), $$1x -> b.error("Couldn't load structure from {}", $$1, $$1x));
      }
   }

   private Stream<alr> d() {
      if (!Files.isDirectory(this.i)) {
         return Stream.empty();
      } else {
         try {
            List<alr> $$0 = new ArrayList<>();

            try (DirectoryStream<Path> $$1 = Files.newDirectoryStream(this.i, $$0x -> Files.isDirectory($$0x))) {
               for (Path $$2 : $$1) {
                  String $$3 = $$2.getFileName().toString();
                  Path $$4 = $$2.resolve("structures");
                  this.a($$4, $$3, ".nbt", $$0::add);
               }
            }

            return $$0.stream();
         } catch (IOException var9) {
            return Stream.empty();
         }
      }
   }

   private void a(Path $$0, String $$1, String $$2, Consumer<alr> $$3) {
      int $$4 = $$2.length();
      Function<String, String> $$5 = $$1x -> $$1x.substring(0, $$1x.length() - $$4);

      try (Stream<Path> $$6 = Files.find($$0, Integer.MAX_VALUE, ($$1x, $$2x) -> $$2x.isRegularFile() && $$1x.toString().endsWith($$2))) {
         $$6.forEach($$4x -> {
            try {
               $$3.accept(alr.a($$1, $$5.apply(this.a($$0, $$4x))));
            } catch (ab var7x) {
               b.error("Invalid location while listing folder {} contents", $$0, var7x);
            }
         });
      } catch (IOException var12) {
         b.error("Failed to list folder {} contents", $$0, var12);
      }
   }

   private String a(Path $$0, Path $$1) {
      return $$0.relativize($$1).toString().replace(File.separator, "/");
   }

   private Optional<ewp> a(alr $$0, Path $$1) {
      if (!Files.isDirectory($$1)) {
         return Optional.empty();
      } else {
         Path $$2 = w.b($$1, $$0.a(), ".snbt");

         try {
            Optional var6;
            try (BufferedReader $$3 = Files.newBufferedReader($$2)) {
               String $$4 = IOUtils.toString($$3);
               var6 = Optional.of(this.a(up.a($$4)));
            }

            return var6;
         } catch (NoSuchFileException var9) {
            return Optional.empty();
         } catch (CommandSyntaxException | IOException var10) {
            b.error("Couldn't load structure from {}", $$2, var10);
            return Optional.empty();
         }
      }
   }

   private Optional<ewp> a(ewq.a $$0, Consumer<Throwable> $$1) {
      try {
         Optional var5;
         try (
            InputStream $$2 = $$0.open();
            InputStream $$3 = new azh($$2);
         ) {
            var5 = Optional.of(this.a($$3));
         }

         return var5;
      } catch (FileNotFoundException var11) {
         return Optional.empty();
      } catch (Throwable var12) {
         $$1.accept(var12);
         return Optional.empty();
      }
   }

   private ewp a(InputStream $$0) throws IOException {
      ua $$1 = un.a($$0, uj.a());
      return this.a($$1);
   }

   public ewp a(ua $$0) {
      ewp $$1 = new ewp();
      int $$2 = up.b($$0, 500);
      $$1.a(this.k, bbo.f.a(this.g, $$0, $$2));
      return $$1;
   }

   public boolean c(alr $$0) {
      Optional<ewp> $$1 = this.f.get($$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         ewp $$2 = $$1.get();
         Path $$3 = this.a($$0, ".nbt");
         Path $$4 = $$3.getParent();
         if ($$4 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists($$4) ? $$4.toRealPath() : $$4);
            } catch (IOException var13) {
               b.error("Failed to create parent directory: {}", $$4);
               return false;
            }

            ua $$6 = $$2.a(new ua());

            try {
               try (OutputStream $$7 = new FileOutputStream($$3.toFile())) {
                  un.a($$6, $$7);
               }

               return true;
            } catch (Throwable var12) {
               return false;
            }
         }
      }
   }

   public Path a(alr $$0, String $$1) {
      if ($$0.a().contains("//")) {
         throw new ab("Invalid resource path: " + $$0);
      } else {
         try {
            Path $$2 = this.i.resolve($$0.b());
            Path $$3 = $$2.resolve("structures");
            Path $$4 = w.b($$3, $$0.a(), $$1);
            if ($$4.startsWith(this.i) && w.a($$4) && w.b($$4)) {
               return $$4;
            } else {
               throw new ab("Invalid resource path: " + $$4);
            }
         } catch (InvalidPathException var6) {
            throw new ab("Invalid resource path: " + $$0, var6);
         }
      }
   }

   public void d(alr $$0) {
      this.f.remove($$0);
   }

   @FunctionalInterface
   interface a {
      InputStream open() throws IOException;
   }

   static record b(Function<alr, Optional<ewp>> a, Supplier<Stream<alr>> b) {
   }
}

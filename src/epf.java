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
import java.nio.file.Paths;
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

public class epf {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "structure";
   private static final String c = "structures";
   private static final String d = ".nbt";
   private static final String e = ".snbt";
   private final Map<alc, Optional<epe>> f = Maps.newConcurrentMap();
   private final DataFixer g;
   private aut h;
   private final Path i;
   private final List<epf.b> j;
   private final jo<dhj> k;
   private static final akv l = new akv("structure", ".nbt");

   public epf(aut $$0, esv.c $$1, DataFixer $$2, jo<dhj> $$3) {
      this.h = $$0;
      this.g = $$2;
      this.i = $$1.a(est.i).normalize();
      this.k = $$3;
      Builder<epf.b> $$4 = ImmutableList.builder();
      $$4.add(new epf.b(this::h, this::d));
      if (ab.aW) {
         $$4.add(new epf.b(this::g, this::c));
      }

      $$4.add(new epf.b(this::f, this::b));
      this.j = $$4.build();
   }

   public epe a(alc $$0) {
      Optional<epe> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         return $$1.get();
      } else {
         epe $$2 = new epe();
         this.f.put($$0, Optional.of($$2));
         return $$2;
      }
   }

   public Optional<epe> b(alc $$0) {
      return this.f.computeIfAbsent($$0, this::e);
   }

   public Stream<alc> a() {
      return this.j.stream().flatMap($$0 -> $$0.b().get()).distinct();
   }

   private Optional<epe> e(alc $$0) {
      for (epf.b $$1 : this.j) {
         try {
            Optional<epe> $$2 = $$1.a().apply($$0);
            if ($$2.isPresent()) {
               return $$2;
            }
         } catch (Exception var5) {
         }
      }

      return Optional.empty();
   }

   public void a(aut $$0) {
      this.h = $$0;
      this.f.clear();
   }

   private Optional<epe> f(alc $$0) {
      alc $$1 = l.a($$0);
      return this.a(() -> this.h.open($$1), $$1x -> b.error("Couldn't load structure {}", $$0, $$1x));
   }

   private Stream<alc> b() {
      return l.a(this.h).keySet().stream().map(l::b);
   }

   private Optional<epe> g(alc $$0) {
      return this.a($$0, Paths.get(tq.c));
   }

   private Stream<alc> c() {
      Path $$0 = Paths.get(tq.c);
      if (!Files.isDirectory($$0)) {
         return Stream.empty();
      } else {
         List<alc> $$1 = new ArrayList<>();
         this.a($$0, "minecraft", ".snbt", $$1::add);
         return $$1.stream();
      }
   }

   private Optional<epe> h(alc $$0) {
      if (!Files.isDirectory(this.i)) {
         return Optional.empty();
      } else {
         Path $$1 = this.a($$0, ".nbt");
         return this.a(() -> new FileInputStream($$1.toFile()), $$1x -> b.error("Couldn't load structure from {}", $$1, $$1x));
      }
   }

   private Stream<alc> d() {
      if (!Files.isDirectory(this.i)) {
         return Stream.empty();
      } else {
         try {
            List<alc> $$0 = new ArrayList<>();

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

   private void a(Path $$0, String $$1, String $$2, Consumer<alc> $$3) {
      int $$4 = $$2.length();
      Function<String, String> $$5 = $$1x -> $$1x.substring(0, $$1x.length() - $$4);

      try (Stream<Path> $$6 = Files.find($$0, Integer.MAX_VALUE, ($$1x, $$2x) -> $$2x.isRegularFile() && $$1x.toString().endsWith($$2))) {
         $$6.forEach($$4x -> {
            try {
               $$3.accept(alc.a($$1, $$5.apply(this.a($$0, $$4x))));
            } catch (aa var7x) {
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

   private Optional<epe> a(alc $$0, Path $$1) {
      if (!Files.isDirectory($$1)) {
         return Optional.empty();
      } else {
         Path $$2 = v.b($$1, $$0.a(), ".snbt");

         try {
            Optional var6;
            try (BufferedReader $$3 = Files.newBufferedReader($$2)) {
               String $$4 = IOUtils.toString($$3);
               var6 = Optional.of(this.a(uu.a($$4)));
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

   private Optional<epe> a(epf.a $$0, Consumer<Throwable> $$1) {
      try {
         Optional var5;
         try (
            InputStream $$2 = $$0.open();
            InputStream $$3 = new ayn($$2);
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

   private epe a(InputStream $$0) throws IOException {
      uf $$1 = us.a($$0, uo.a());
      return this.a($$1);
   }

   public epe a(uf $$0) {
      epe $$1 = new epe();
      int $$2 = uu.b($$0, 500);
      $$1.a(this.k, bam.f.a(this.g, $$0, $$2));
      return $$1;
   }

   public boolean c(alc $$0) {
      Optional<epe> $$1 = this.f.get($$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         epe $$2 = $$1.get();
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

            uf $$6 = $$2.a(new uf());

            try {
               try (OutputStream $$7 = new FileOutputStream($$3.toFile())) {
                  us.a($$6, $$7);
               }

               return true;
            } catch (Throwable var12) {
               return false;
            }
         }
      }
   }

   public Path a(alc $$0, String $$1) {
      if ($$0.a().contains("//")) {
         throw new aa("Invalid resource path: " + $$0);
      } else {
         try {
            Path $$2 = this.i.resolve($$0.b());
            Path $$3 = $$2.resolve("structures");
            Path $$4 = v.b($$3, $$0.a(), $$1);
            if ($$4.startsWith(this.i) && v.a($$4) && v.b($$4)) {
               return $$4;
            } else {
               throw new aa("Invalid resource path: " + $$4);
            }
         } catch (InvalidPathException var6) {
            throw new aa("Invalid resource path: " + $$0, var6);
         }
      }
   }

   public void d(alc $$0) {
      this.f.remove($$0);
   }

   @FunctionalInterface
   interface a {
      InputStream open() throws IOException;
   }

   static record b(Function<alc, Optional<epe>> a, Supplier<Stream<alc>> b) {
   }
}

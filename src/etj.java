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

public class etj {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "structure";
   private static final String c = "structures";
   private static final String d = ".nbt";
   private static final String e = ".snbt";
   private final Map<ald, Optional<eti>> f = Maps.newConcurrentMap();
   private final DataFixer g;
   private ava h;
   private final Path i;
   private final List<etj.b> j;
   private final jt<dku> k;
   private static final akw l = new akw("structure", ".nbt");

   public etj(ava $$0, ewz.c $$1, DataFixer $$2, jt<dku> $$3) {
      this.h = $$0;
      this.g = $$2;
      this.i = $$1.a(ewx.i).normalize();
      this.k = $$3;
      Builder<etj.b> $$4 = ImmutableList.builder();
      $$4.add(new etj.b(this::h, this::d));
      if (ab.aU) {
         $$4.add(new etj.b(this::g, this::c));
      }

      $$4.add(new etj.b(this::f, this::b));
      this.j = $$4.build();
   }

   public eti a(ald $$0) {
      Optional<eti> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         return $$1.get();
      } else {
         eti $$2 = new eti();
         this.f.put($$0, Optional.of($$2));
         return $$2;
      }
   }

   public Optional<eti> b(ald $$0) {
      return this.f.computeIfAbsent($$0, this::e);
   }

   public Stream<ald> a() {
      return this.j.stream().flatMap($$0 -> $$0.b().get()).distinct();
   }

   private Optional<eti> e(ald $$0) {
      for (etj.b $$1 : this.j) {
         try {
            Optional<eti> $$2 = $$1.a().apply($$0);
            if ($$2.isPresent()) {
               return $$2;
            }
         } catch (Exception var5) {
         }
      }

      return Optional.empty();
   }

   public void a(ava $$0) {
      this.h = $$0;
      this.f.clear();
   }

   private Optional<eti> f(ald $$0) {
      ald $$1 = l.a($$0);
      return this.a(() -> this.h.open($$1), $$1x -> b.error("Couldn't load structure {}", $$0, $$1x));
   }

   private Stream<ald> b() {
      return l.a(this.h).keySet().stream().map(l::b);
   }

   private Optional<eti> g(ald $$0) {
      return this.a($$0, tg.c);
   }

   private Stream<ald> c() {
      if (!Files.isDirectory(tg.c)) {
         return Stream.empty();
      } else {
         List<ald> $$0 = new ArrayList<>();
         this.a(tg.c, "minecraft", ".snbt", $$0::add);
         return $$0.stream();
      }
   }

   private Optional<eti> h(ald $$0) {
      if (!Files.isDirectory(this.i)) {
         return Optional.empty();
      } else {
         Path $$1 = this.a($$0, ".nbt");
         return this.a(() -> new FileInputStream($$1.toFile()), $$1x -> b.error("Couldn't load structure from {}", $$1, $$1x));
      }
   }

   private Stream<ald> d() {
      if (!Files.isDirectory(this.i)) {
         return Stream.empty();
      } else {
         try {
            List<ald> $$0 = new ArrayList<>();

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

   private void a(Path $$0, String $$1, String $$2, Consumer<ald> $$3) {
      int $$4 = $$2.length();
      Function<String, String> $$5 = $$1x -> $$1x.substring(0, $$1x.length() - $$4);

      try (Stream<Path> $$6 = Files.find($$0, Integer.MAX_VALUE, ($$1x, $$2x) -> $$2x.isRegularFile() && $$1x.toString().endsWith($$2))) {
         $$6.forEach($$4x -> {
            try {
               $$3.accept(ald.a($$1, $$5.apply(this.a($$0, $$4x))));
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

   private Optional<eti> a(ald $$0, Path $$1) {
      if (!Files.isDirectory($$1)) {
         return Optional.empty();
      } else {
         Path $$2 = v.b($$1, $$0.a(), ".snbt");

         try {
            Optional var6;
            try (BufferedReader $$3 = Files.newBufferedReader($$2)) {
               String $$4 = IOUtils.toString($$3);
               var6 = Optional.of(this.a(ul.a($$4)));
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

   private Optional<eti> a(etj.a $$0, Consumer<Throwable> $$1) {
      try {
         Optional var5;
         try (
            InputStream $$2 = $$0.open();
            InputStream $$3 = new ayt($$2);
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

   private eti a(InputStream $$0) throws IOException {
      tw $$1 = uj.a($$0, uf.a());
      return this.a($$1);
   }

   public eti a(tw $$0) {
      eti $$1 = new eti();
      int $$2 = ul.b($$0, 500);
      $$1.a(this.k, bax.f.a(this.g, $$0, $$2));
      return $$1;
   }

   public boolean c(ald $$0) {
      Optional<eti> $$1 = this.f.get($$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         eti $$2 = $$1.get();
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

            tw $$6 = $$2.a(new tw());

            try {
               try (OutputStream $$7 = new FileOutputStream($$3.toFile())) {
                  uj.a($$6, $$7);
               }

               return true;
            } catch (Throwable var12) {
               return false;
            }
         }
      }
   }

   public Path a(ald $$0, String $$1) {
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

   public void d(ald $$0) {
      this.f.remove($$0);
   }

   @FunctionalInterface
   interface a {
      InputStream open() throws IOException;
   }

   static record b(Function<ald, Optional<eti>> a, Supplier<Stream<ald>> b) {
   }
}

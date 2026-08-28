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
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class emr {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "structures";
   private static final String c = ".nbt";
   private static final String d = ".snbt";
   private final Map<akk, Optional<emq>> e = Maps.newConcurrentMap();
   private final DataFixer f;
   private atu g;
   private final Path h;
   private final List<emr.b> i;
   private final jk<dff> j;
   private static final akd k = new akd("structures", ".nbt");

   public emr(atu $$0, eqc.c $$1, DataFixer $$2, jk<dff> $$3) {
      this.g = $$0;
      this.f = $$2;
      this.h = $$1.a(eqa.i).normalize();
      this.j = $$3;
      Builder<emr.b> $$4 = ImmutableList.builder();
      $$4.add(new emr.b(this::h, this::d));
      if (aa.aX) {
         $$4.add(new emr.b(this::g, this::c));
      }

      $$4.add(new emr.b(this::f, this::b));
      this.i = $$4.build();
   }

   public emq a(akk $$0) {
      Optional<emq> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         return $$1.get();
      } else {
         emq $$2 = new emq();
         this.e.put($$0, Optional.of($$2));
         return $$2;
      }
   }

   public Optional<emq> b(akk $$0) {
      return this.e.computeIfAbsent($$0, this::e);
   }

   public Stream<akk> a() {
      return this.i.stream().flatMap($$0 -> $$0.b().get()).distinct();
   }

   private Optional<emq> e(akk $$0) {
      for (emr.b $$1 : this.i) {
         try {
            Optional<emq> $$2 = $$1.a().apply($$0);
            if ($$2.isPresent()) {
               return $$2;
            }
         } catch (Exception var5) {
         }
      }

      return Optional.empty();
   }

   public void a(atu $$0) {
      this.g = $$0;
      this.e.clear();
   }

   private Optional<emq> f(akk $$0) {
      akk $$1 = k.a($$0);
      return this.a(() -> this.g.open($$1), $$1x -> a.error("Couldn't load structure {}", $$0, $$1x));
   }

   private Stream<akk> b() {
      return k.a(this.g).keySet().stream().map(k::b);
   }

   private Optional<emq> g(akk $$0) {
      return this.a($$0, Paths.get(tj.c));
   }

   private Stream<akk> c() {
      return this.a(Paths.get(tj.c), "minecraft", ".snbt");
   }

   private Optional<emq> h(akk $$0) {
      if (!Files.isDirectory(this.h)) {
         return Optional.empty();
      } else {
         Path $$1 = b(this.h, $$0, ".nbt");
         return this.a(() -> new FileInputStream($$1.toFile()), $$1x -> a.error("Couldn't load structure from {}", $$1, $$1x));
      }
   }

   private Stream<akk> d() {
      if (!Files.isDirectory(this.h)) {
         return Stream.empty();
      } else {
         try {
            return Files.list(this.h).filter($$0 -> Files.isDirectory($$0)).flatMap($$0 -> this.a($$0));
         } catch (IOException var2) {
            return Stream.empty();
         }
      }
   }

   private Stream<akk> a(Path $$0) {
      Path $$1 = $$0.resolve("structures");
      return this.a($$1, $$0.getFileName().toString(), ".nbt");
   }

   private Stream<akk> a(Path $$0, String $$1, String $$2) {
      if (!Files.isDirectory($$0)) {
         return Stream.empty();
      } else {
         int $$3 = $$2.length();
         Function<String, String> $$4 = $$1x -> $$1x.substring(0, $$1x.length() - $$3);

         try {
            return Files.walk($$0).filter($$1x -> $$1x.toString().endsWith($$2)).mapMulti(($$3x, $$4x) -> {
               try {
                  $$4x.accept(new akk($$1, $$4.apply(this.a($$0, $$3x))));
               } catch (z var7x) {
                  a.error("Invalid location while listing pack contents", var7x);
               }
            });
         } catch (IOException var7) {
            a.error("Failed to list folder contents", var7);
            return Stream.empty();
         }
      }
   }

   private String a(Path $$0, Path $$1) {
      return $$0.relativize($$1).toString().replace(File.separator, "/");
   }

   private Optional<emq> a(akk $$0, Path $$1) {
      if (!Files.isDirectory($$1)) {
         return Optional.empty();
      } else {
         Path $$2 = v.b($$1, $$0.a(), ".snbt");

         try {
            Optional var6;
            try (BufferedReader $$3 = Files.newBufferedReader($$2)) {
               String $$4 = IOUtils.toString($$3);
               var6 = Optional.of(this.a(um.a($$4)));
            }

            return var6;
         } catch (NoSuchFileException var9) {
            return Optional.empty();
         } catch (CommandSyntaxException | IOException var10) {
            a.error("Couldn't load structure from {}", $$2, var10);
            return Optional.empty();
         }
      }
   }

   private Optional<emq> a(emr.a $$0, Consumer<Throwable> $$1) {
      try {
         Optional var5;
         try (
            InputStream $$2 = $$0.open();
            InputStream $$3 = new axn($$2);
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

   private emq a(InputStream $$0) throws IOException {
      tx $$1 = uk.a($$0, ug.a());
      return this.a($$1);
   }

   public emq a(tx $$0) {
      emq $$1 = new emq();
      int $$2 = um.b($$0, 500);
      $$1.a(this.j, azl.f.a(this.f, $$0, $$2));
      return $$1;
   }

   public boolean c(akk $$0) {
      Optional<emq> $$1 = this.e.get($$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         emq $$2 = $$1.get();
         Path $$3 = b(this.h, $$0, ".nbt");
         Path $$4 = $$3.getParent();
         if ($$4 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists($$4) ? $$4.toRealPath() : $$4);
            } catch (IOException var13) {
               a.error("Failed to create parent directory: {}", $$4);
               return false;
            }

            tx $$6 = $$2.a(new tx());

            try {
               try (OutputStream $$7 = new FileOutputStream($$3.toFile())) {
                  uk.a($$6, $$7);
               }

               return true;
            } catch (Throwable var12) {
               return false;
            }
         }
      }
   }

   public Path a(akk $$0, String $$1) {
      return a(this.h, $$0, $$1);
   }

   public static Path a(Path $$0, akk $$1, String $$2) {
      try {
         Path $$3 = $$0.resolve($$1.b());
         Path $$4 = $$3.resolve("structures");
         return v.b($$4, $$1.a(), $$2);
      } catch (InvalidPathException var5) {
         throw new z("Invalid resource path: " + $$1, var5);
      }
   }

   private static Path b(Path $$0, akk $$1, String $$2) {
      if ($$1.a().contains("//")) {
         throw new z("Invalid resource path: " + $$1);
      } else {
         Path $$3 = a($$0, $$1, $$2);
         if ($$3.startsWith($$0) && v.a($$3) && v.b($$3)) {
            return $$3;
         } else {
            throw new z("Invalid resource path: " + $$3);
         }
      }
   }

   public void d(akk $$0) {
      this.e.remove($$0);
   }

   @FunctionalInterface
   interface a {
      InputStream open() throws IOException;
   }

   static record b(Function<akk, Optional<emq>> a, Supplier<Stream<akk>> b) {
   }
}

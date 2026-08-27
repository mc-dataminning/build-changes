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

public class dyr {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "structures";
   private static final String c = "gameteststructures";
   private static final String d = ".nbt";
   private static final String e = ".snbt";
   private final Map<aep, Optional<dyq>> f = Maps.newConcurrentMap();
   private final DataFixer g;
   private ank h;
   private final Path i;
   private final List<dyr.b> j;
   private final hg<csk> k;
   private static final aei l = new aei("structures", ".nbt");

   public dyr(ank $$0, ebv.c $$1, DataFixer $$2, hg<csk> $$3) {
      this.h = $$0;
      this.g = $$2;
      this.i = $$1.a(ebt.i).normalize();
      this.k = $$3;
      Builder<dyr.b> $$4 = ImmutableList.builder();
      $$4.add(new dyr.b(this::h, this::d));
      if (aa.aS) {
         $$4.add(new dyr.b(this::g, this::c));
      }

      $$4.add(new dyr.b(this::f, this::b));
      this.j = $$4.build();
   }

   public dyq a(aep $$0) {
      Optional<dyq> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         return $$1.get();
      } else {
         dyq $$2 = new dyq();
         this.f.put($$0, Optional.of($$2));
         return $$2;
      }
   }

   public Optional<dyq> b(aep $$0) {
      return this.f.computeIfAbsent($$0, this::e);
   }

   public Stream<aep> a() {
      return this.j.stream().flatMap($$0 -> $$0.b().get()).distinct();
   }

   private Optional<dyq> e(aep $$0) {
      for (dyr.b $$1 : this.j) {
         try {
            Optional<dyq> $$2 = $$1.a().apply($$0);
            if ($$2.isPresent()) {
               return $$2;
            }
         } catch (Exception var5) {
         }
      }

      return Optional.empty();
   }

   public void a(ank $$0) {
      this.h = $$0;
      this.f.clear();
   }

   private Optional<dyq> f(aep $$0) {
      aep $$1 = l.a($$0);
      return this.a(() -> this.h.open($$1), $$1x -> a.error("Couldn't load structure {}", $$0, $$1x));
   }

   private Stream<aep> b() {
      return l.a(this.h).keySet().stream().map(l::b);
   }

   private Optional<dyq> g(aep $$0) {
      return this.a($$0, Paths.get("gameteststructures"));
   }

   private Stream<aep> c() {
      return this.a(Paths.get("gameteststructures"), "minecraft", ".snbt");
   }

   private Optional<dyq> h(aep $$0) {
      if (!Files.isDirectory(this.i)) {
         return Optional.empty();
      } else {
         Path $$1 = b(this.i, $$0, ".nbt");
         return this.a(() -> new FileInputStream($$1.toFile()), $$1x -> a.error("Couldn't load structure from {}", $$1, $$1x));
      }
   }

   private Stream<aep> d() {
      if (!Files.isDirectory(this.i)) {
         return Stream.empty();
      } else {
         try {
            return Files.list(this.i).filter($$0 -> Files.isDirectory($$0)).flatMap($$0 -> this.a($$0));
         } catch (IOException var2) {
            return Stream.empty();
         }
      }
   }

   private Stream<aep> a(Path $$0) {
      Path $$1 = $$0.resolve("structures");
      return this.a($$1, $$0.getFileName().toString(), ".nbt");
   }

   private Stream<aep> a(Path $$0, String $$1, String $$2) {
      if (!Files.isDirectory($$0)) {
         return Stream.empty();
      } else {
         int $$3 = $$2.length();
         Function<String, String> $$4 = $$1x -> $$1x.substring(0, $$1x.length() - $$3);

         try {
            return Files.walk($$0).filter($$1x -> $$1x.toString().endsWith($$2)).mapMulti(($$3x, $$4x) -> {
               try {
                  $$4x.accept(new aep($$1, $$4.apply(this.a($$0, $$3x))));
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

   private Optional<dyq> a(aep $$0, Path $$1) {
      if (!Files.isDirectory($$1)) {
         return Optional.empty();
      } else {
         Path $$2 = v.b($$1, $$0.a(), ".snbt");

         try {
            Optional var6;
            try (BufferedReader $$3 = Files.newBufferedReader($$2)) {
               String $$4 = IOUtils.toString($$3);
               var6 = Optional.of(this.a(re.a($$4)));
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

   private Optional<dyq> a(dyr.a $$0, Consumer<Throwable> $$1) {
      try {
         Optional var4;
         try (InputStream $$2 = $$0.open()) {
            var4 = Optional.of(this.a($$2));
         }

         return var4;
      } catch (FileNotFoundException var8) {
         return Optional.empty();
      } catch (Throwable var9) {
         $$1.accept(var9);
         return Optional.empty();
      }
   }

   private dyq a(InputStream $$0) throws IOException {
      qs $$1 = rc.a($$0);
      return this.a($$1);
   }

   public dyq a(qs $$0) {
      dyq $$1 = new dyq();
      int $$2 = re.b($$0, 500);
      $$1.a(this.k, asq.f.a(this.g, $$0, $$2));
      return $$1;
   }

   public boolean c(aep $$0) {
      Optional<dyq> $$1 = this.f.get($$0);
      if (!$$1.isPresent()) {
         return false;
      } else {
         dyq $$2 = $$1.get();
         Path $$3 = b(this.i, $$0, ".nbt");
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

            qs $$6 = $$2.a(new qs());

            try {
               try (OutputStream $$7 = new FileOutputStream($$3.toFile())) {
                  rc.a($$6, $$7);
               }

               return true;
            } catch (Throwable var12) {
               return false;
            }
         }
      }
   }

   public Path a(aep $$0, String $$1) {
      return a(this.i, $$0, $$1);
   }

   public static Path a(Path $$0, aep $$1, String $$2) {
      try {
         Path $$3 = $$0.resolve($$1.b());
         Path $$4 = $$3.resolve("structures");
         return v.b($$4, $$1.a(), $$2);
      } catch (InvalidPathException var5) {
         throw new z("Invalid resource path: " + $$1, var5);
      }
   }

   private static Path b(Path $$0, aep $$1, String $$2) {
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

   public void d(aep $$0) {
      this.f.remove($$0);
   }

   @FunctionalInterface
   interface a {
      InputStream open() throws IOException;
   }

   static record b(Function<aep, Optional<dyq>> a, Supplier<Stream<aep>> b) {
   }
}

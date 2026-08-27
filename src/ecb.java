import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecb {
   static final Logger b = LogUtils.getLogger();
   static final DateTimeFormatter c = new DateTimeFormatterBuilder()
      .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
      .appendLiteral('-')
      .appendValue(ChronoField.MONTH_OF_YEAR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.DAY_OF_MONTH, 2)
      .appendLiteral('_')
      .appendValue(ChronoField.HOUR_OF_DAY, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
      .toFormatter();
   private static final ImmutableList<String> d = ImmutableList.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );
   private static final String e = "Data";
   private static final PathMatcher f = $$0 -> false;
   public static final String a = "allowed_symlinks.txt";
   private final Path g;
   private final Path h;
   final DataFixer i;
   private final egy j;

   public ecb(Path $$0, Path $$1, egy $$2, DataFixer $$3) {
      this.i = $$3;

      try {
         v.c($$0);
      } catch (IOException var6) {
         throw new UncheckedIOException(var6);
      }

      this.g = $$0;
      this.h = $$1;
      this.j = $$2;
   }

   public static egy a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            egy var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new egy(eha.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new egy(f);
   }

   public static ecb b(Path $$0) {
      egy $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new ecb($$0, $$0.resolve("../backups"), $$1, asw.a());
   }

   private static <T> DataResult<dlj> a(Dynamic<T> $$0, DataFixer $$1, int $$2) {
      Dynamic<T> $$3 = $$0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator $$6 = d.iterator();

      while ($$6.hasNext()) {
         String $$4 = (String)$$6.next();
         Optional<Dynamic<T>> $$5 = $$0.get($$4).result();
         if ($$5.isPresent()) {
            $$3 = $$3.set($$4, $$5.get());
         }
      }

      Dynamic<T> $$6x = asv.r.a($$1, $$3, $$2);
      return dlj.a.parse($$6x);
   }

   private static cqj a(Dynamic<?> $$0) {
      return cqj.b.parse($$0).resultOrPartial(b::error).orElse(cqj.c);
   }

   public String a() {
      return "Anvil";
   }

   public ecb.a b() throws eca {
      if (!Files.isDirectory(this.g)) {
         throw new eca(ti.c("selectWorld.load_folder_access"));
      } else {
         try {
            ecb.a var3;
            try (Stream<Path> $$0 = Files.list(this.g)) {
               List<ecb.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(ecb.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new ecb.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new eca(ti.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<ecc>> a(ecb.a $$0) {
      List<CompletableFuture<ecc>> $$1 = new ArrayList<>($$0.a.size());

      for (ecb.b $$2 : $$0.a) {
         $$1.add(
            CompletableFuture.supplyAsync(
               () -> {
                  boolean $$1x;
                  try {
                     $$1x = aqz.b($$2.f());
                  } catch (Exception var6) {
                     b.warn("Failed to read {} lock", $$2.f(), var6);
                     return null;
                  }

                  try {
                     ecc $$4 = this.a($$2, this.a($$2, $$1x));
                     return $$4 != null ? $$4 : null;
                  } catch (OutOfMemoryError var4x) {
                     arq.b();
                     System.gc();
                     b.error(LogUtils.FATAL_MARKER, "Ran out of memory trying to read summary of {}", $$2.a());
                     throw var4x;
                  } catch (StackOverflowError var5) {
                     b.error(
                        LogUtils.FATAL_MARKER,
                        "Ran out of stack trying to read summary of {}. Assuming corruption; attempting to restore from from level.dat_old.",
                        $$2.a()
                     );
                     ac.a($$2.b(), $$2.c(), $$2.a(LocalDateTime.now()), true);
                     throw var5;
                  }
               },
               ac.f()
            )
         );
      }

      return ac.d($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   @Nullable
   <T> T a(ecb.b $$0, BiFunction<Path, DataFixer, T> $$1) {
      if (!Files.exists($$0.f())) {
         return null;
      } else {
         Path $$2 = $$0.b();
         if (Files.exists($$2)) {
            T $$3 = $$1.apply($$2, this.i);
            if ($$3 != null) {
               return $$3;
            }
         }

         $$2 = $$0.c();
         return Files.exists($$2) ? $$1.apply($$2, this.i) : null;
      }
   }

   @Nullable
   private static cqj a(Path $$0, DataFixer $$1) {
      try {
         if (c($$0) instanceof qu $$3) {
            qu $$4 = $$3.p("Data");
            int $$5 = rg.b($$4, -1);
            Dynamic<?> $$6 = asv.a.a($$1, new Dynamic(rf.a, $$4), $$5);
            return a($$6);
         }
      } catch (Exception var7) {
         b.error("Exception reading {}", $$0, var7);
      }

      return null;
   }

   static BiFunction<Path, DataFixer, Pair<ech, dli.b>> a(DynamicOps<rn> $$0, cqj $$1, ht<dio> $$2, Lifecycle $$3) {
      return ($$4, $$5) -> {
         qu $$6;
         try {
            $$6 = re.a($$4.toFile());
         } catch (IOException var17) {
            throw new UncheckedIOException(var17);
         }

         qu $$9 = $$6.p("Data");
         qu $$10 = $$9.b("Player", 10) ? $$9.p("Player") : null;
         $$9.r("Player");
         int $$11 = rg.b($$9, -1);
         Dynamic<?> $$12 = asv.a.a($$5, new Dynamic($$0, $$9), $$11);
         dlj $$13 = (dlj)a($$12, $$5, $$11).getOrThrow(false, ac.a("WorldGenSettings: ", b::error));
         ecd $$14 = ecd.a($$12);
         cpu $$15 = cpu.a($$12, $$1);
         dli.b $$16 = $$13.b().a($$2);
         Lifecycle $$17 = $$16.a().add($$3);
         ecf $$18 = ecf.a($$12, $$5, $$11, $$10, $$15, $$14, $$16.d(), $$13.a(), $$17);
         return Pair.of($$18, $$16);
      };
   }

   BiFunction<Path, DataFixer, ecc> a(ecb.b $$0, boolean $$1) {
      return ($$2, $$3) -> {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<egz> $$4 = this.j.a($$2);
               if (!$$4.isEmpty()) {
                  b.warn("{}", egx.a($$2, $$4));
                  return new ecc.b($$0.a(), $$0.d());
               }
            }

            if (c($$2) instanceof qu $$6) {
               qu $$7 = $$6.p("Data");
               int $$8 = rg.b($$7, -1);
               Dynamic<?> $$9 = asv.a.a($$3, new Dynamic(rf.a, $$7), $$8);
               ecd $$10 = ecd.a($$9);
               int $$11 = $$10.a();
               if ($$11 == 19132 || $$11 == 19133) {
                  boolean $$12 = $$11 != this.f();
                  Path $$13 = $$0.d();
                  cqj $$14 = a($$9);
                  cpu $$15 = cpu.a($$9, $$14);
                  cdx $$16 = b($$9);
                  boolean $$17 = cdz.a($$16);
                  return new ecc($$15, $$10, $$0.a(), $$12, $$1, $$17, $$13);
               }
            } else {
               b.warn("Invalid root tag in {}", $$2);
            }

            return null;
         } catch (Exception var18) {
            b.error("Exception reading {}", $$2, var18);
            return null;
         }
      };
   }

   private static cdx b(Dynamic<?> $$0) {
      Set<aeu> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(aeu::a).stream()).collect(Collectors.toSet());
      return cdz.d.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static rn c(Path $$0) throws IOException {
      rz $$1 = new rz(new rw("Data", qu.b, "Player"), new rw("Data", qu.b, "WorldGenSettings"));
      re.a($$0.toFile(), $$1);
      return $$1.d();
   }

   public boolean a(String $$0) {
      try {
         Path $$1 = this.e($$0);
         Files.createDirectory($$1);
         Files.deleteIfExists($$1);
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public boolean b(String $$0) {
      return Files.isDirectory(this.e($$0));
   }

   private Path e(String $$0) {
      return this.g.resolve($$0);
   }

   public Path c() {
      return this.g;
   }

   public Path d() {
      return this.h;
   }

   public ecb.c c(String $$0) throws IOException, egx {
      Path $$1 = this.e($$0);
      List<egz> $$2 = this.j.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new egx($$1, $$2);
      } else {
         return new ecb.c($$0, $$1);
      }
   }

   public ecb.c d(String $$0) throws IOException {
      Path $$1 = this.e($$0);
      return new ecb.c($$0, $$1);
   }

   public egy e() {
      return this.j;
   }

   public static record a(List<ecb.b> a) implements Iterable<ecb.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<ecb.b> iterator() {
         return this.a.iterator();
      }

      public List<ecb.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {
      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(ebz.e);
      }

      public Path c() {
         return this.a(ebz.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(ebz.e.a() + "_corrupted_" + $$0.format(ecb.c));
      }

      public Path d() {
         return this.a(ebz.g);
      }

      public Path e() {
         return this.a(ebz.h);
      }

      public Path a(ebz $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final aqz b;
      final ecb.b c;
      private final String d;
      private final Map<ebz, Path> e = Maps.newHashMap();

      c(String $$1, Path $$2) throws IOException {
         this.d = $$1;
         this.c = new ecb.b($$2);
         this.b = aqz.a($$2);
      }

      public ecb a() {
         return ecb.this;
      }

      public String b() {
         return this.d;
      }

      public Path a(ebz $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(aet<cpq> $$0) {
         return din.a($$0, this.c.f());
      }

      private void i() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public ece c() {
         this.i();
         return new ece(this, ecb.this.i);
      }

      @Nullable
      public ecc d() {
         this.i();
         return ecb.this.a(this.c, ecb.this.a(this.c, false));
      }

      @Nullable
      public Pair<ech, dli.b> a(DynamicOps<rn> $$0, cqj $$1, ht<dio> $$2, Lifecycle $$3) {
         this.i();
         return ecb.this.a(this.c, ecb.a($$0, $$1, $$2, $$3));
      }

      @Nullable
      public cqj e() {
         this.i();
         return ecb.this.a(this.c, ecb::a);
      }

      public void a(hu $$0, ech $$1) {
         this.a($$0, $$1, null);
      }

      public void a(hu $$0, ech $$1, @Nullable qu $$2) {
         File $$3 = this.c.f().toFile();
         qu $$4 = $$1.a($$0, $$2);
         qu $$5 = new qu();
         $$5.a("Data", $$4);

         try {
            File $$6 = File.createTempFile("level", ".dat", $$3);
            re.a($$5, $$6);
            File $$7 = this.c.c().toFile();
            File $$8 = this.c.b().toFile();
            ac.a($$8, $$6, $$7);
         } catch (Exception var10) {
            ecb.b.error("Failed to save level {}", $$3, var10);
         }
      }

      public Optional<Path> f() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void g() throws IOException {
         this.i();
         final Path $$0 = this.c.e();
         ecb.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            ecb.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        ecb.b.debug("Deleting {}", $$0);
                        Files.delete($$0);
                     }

                     return FileVisitResult.CONTINUE;
                  }

                  public FileVisitResult a(Path $$0x, @Nullable IOException $$1) throws IOException {
                     if ($$1 != null) {
                        throw $$1;
                     } else {
                        if ($$0.equals(c.this.c.f())) {
                           c.this.b.close();
                           Files.deleteIfExists($$0);
                        }

                        Files.delete($$0);
                        return FileVisitResult.CONTINUE;
                     }
                  }
               });
               break;
            } catch (IOException var6) {
               if ($$1 >= 5) {
                  throw var6;
               }

               ecb.b.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.i();
         Path $$1 = this.c.b();
         if (Files.exists($$1)) {
            qu $$2 = re.a($$1.toFile());
            qu $$3 = $$2.p("Data");
            $$3.a("LevelName", $$0);
            re.a($$2, $$1.toFile());
         }
      }

      public long h() throws IOException {
         this.i();
         String $$0 = LocalDateTime.now().format(ecb.c) + "_" + this.d;
         Path $$1 = ecb.this.d();

         try {
            v.c($$1);
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }

         Path $$3 = $$1.resolve(v.a($$1, $$0, ".zip"));

         try (final ZipOutputStream $$4 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream($$3)))) {
            final Path $$5 = Paths.get(this.d);
            Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
               public FileVisitResult a(Path $$0, BasicFileAttributes $$1) throws IOException {
                  if ($$0.endsWith("session.lock")) {
                     return FileVisitResult.CONTINUE;
                  } else {
                     String $$2 = $$5.resolve(c.this.c.f().relativize($$0)).toString().replace('\\', '/');
                     ZipEntry $$3 = new ZipEntry($$2);
                     $$4.putNextEntry($$3);
                     com.google.common.io.Files.asByteSource($$0.toFile()).copyTo($$4);
                     $$4.closeEntry();
                     return FileVisitResult.CONTINUE;
                  }
               }
            });
         }

         return Files.size($$3);
      }

      @Override
      public void close() throws IOException {
         this.b.close();
      }
   }
}

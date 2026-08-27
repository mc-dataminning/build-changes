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

public class ebw {
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
   private final egt j;

   public ebw(Path $$0, Path $$1, egt $$2, DataFixer $$3) {
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

   public static egt a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            egt var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new egt(egv.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new egt(f);
   }

   public static ebw b(Path $$0) {
      egt $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new ebw($$0, $$0.resolve("../backups"), $$1, ast.a());
   }

   private static <T> DataResult<dle> a(Dynamic<T> $$0, DataFixer $$1, int $$2) {
      Dynamic<T> $$3 = $$0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator $$6 = d.iterator();

      while ($$6.hasNext()) {
         String $$4 = (String)$$6.next();
         Optional<Dynamic<T>> $$5 = $$0.get($$4).result();
         if ($$5.isPresent()) {
            $$3 = $$3.set($$4, $$5.get());
         }
      }

      Dynamic<T> $$6x = ass.r.a($$1, $$3, $$2);
      return dle.a.parse($$6x);
   }

   private static cqe a(Dynamic<?> $$0) {
      return cqe.b.parse($$0).resultOrPartial(b::error).orElse(cqe.c);
   }

   public String a() {
      return "Anvil";
   }

   public ebw.a b() throws ebv {
      if (!Files.isDirectory(this.g)) {
         throw new ebv(tf.c("selectWorld.load_folder_access"));
      } else {
         try {
            ebw.a var3;
            try (Stream<Path> $$0 = Files.list(this.g)) {
               List<ebw.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(ebw.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new ebw.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new ebv(tf.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<ebx>> a(ebw.a $$0) {
      List<CompletableFuture<ebx>> $$1 = new ArrayList<>($$0.a.size());

      for (ebw.b $$2 : $$0.a) {
         $$1.add(
            CompletableFuture.supplyAsync(
               () -> {
                  boolean $$1x;
                  try {
                     $$1x = aqw.b($$2.f());
                  } catch (Exception var6) {
                     b.warn("Failed to read {} lock", $$2.f(), var6);
                     return null;
                  }

                  try {
                     ebx $$4 = this.a($$2, this.a($$2, $$1x));
                     return $$4 != null ? $$4 : null;
                  } catch (OutOfMemoryError var4x) {
                     arn.b();
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
   <T> T a(ebw.b $$0, BiFunction<Path, DataFixer, T> $$1) {
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
   private static cqe a(Path $$0, DataFixer $$1) {
      try {
         if (c($$0) instanceof qr $$3) {
            qr $$4 = $$3.p("Data");
            int $$5 = rd.b($$4, -1);
            Dynamic<?> $$6 = ass.a.a($$1, new Dynamic(rc.a, $$4), $$5);
            return a($$6);
         }
      } catch (Exception var7) {
         b.error("Exception reading {}", $$0, var7);
      }

      return null;
   }

   static BiFunction<Path, DataFixer, Pair<ecc, dld.b>> a(DynamicOps<rk> $$0, cqe $$1, hr<dij> $$2, Lifecycle $$3) {
      return ($$4, $$5) -> {
         qr $$6;
         try {
            $$6 = rb.a($$4.toFile());
         } catch (IOException var17) {
            throw new UncheckedIOException(var17);
         }

         qr $$9 = $$6.p("Data");
         qr $$10 = $$9.b("Player", 10) ? $$9.p("Player") : null;
         $$9.r("Player");
         int $$11 = rd.b($$9, -1);
         Dynamic<?> $$12 = ass.a.a($$5, new Dynamic($$0, $$9), $$11);
         dle $$13 = (dle)a($$12, $$5, $$11).getOrThrow(false, ac.a("WorldGenSettings: ", b::error));
         eby $$14 = eby.a($$12);
         cpp $$15 = cpp.a($$12, $$1);
         dld.b $$16 = $$13.b().a($$2);
         Lifecycle $$17 = $$16.a().add($$3);
         eca $$18 = eca.a($$12, $$5, $$11, $$10, $$15, $$14, $$16.d(), $$13.a(), $$17);
         return Pair.of($$18, $$16);
      };
   }

   BiFunction<Path, DataFixer, ebx> a(ebw.b $$0, boolean $$1) {
      return ($$2, $$3) -> {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<egu> $$4 = this.j.a($$2);
               if (!$$4.isEmpty()) {
                  b.warn("{}", egs.a($$2, $$4));
                  return new ebx.b($$0.a(), $$0.d());
               }
            }

            if (c($$2) instanceof qr $$6) {
               qr $$7 = $$6.p("Data");
               int $$8 = rd.b($$7, -1);
               Dynamic<?> $$9 = ass.a.a($$3, new Dynamic(rc.a, $$7), $$8);
               eby $$10 = eby.a($$9);
               int $$11 = $$10.a();
               if ($$11 == 19132 || $$11 == 19133) {
                  boolean $$12 = $$11 != this.f();
                  Path $$13 = $$0.d();
                  cqe $$14 = a($$9);
                  cpp $$15 = cpp.a($$9, $$14);
                  cdu $$16 = b($$9);
                  boolean $$17 = cdw.a($$16);
                  return new ebx($$15, $$10, $$0.a(), $$12, $$1, $$17, $$13);
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

   private static cdu b(Dynamic<?> $$0) {
      Set<aer> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(aer::a).stream()).collect(Collectors.toSet());
      return cdw.d.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static rk c(Path $$0) throws IOException {
      rw $$1 = new rw(new rt("Data", qr.b, "Player"), new rt("Data", qr.b, "WorldGenSettings"));
      rb.a($$0.toFile(), $$1);
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

   public ebw.c c(String $$0) throws IOException, egs {
      Path $$1 = this.e($$0);
      List<egu> $$2 = this.j.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new egs($$1, $$2);
      } else {
         return new ebw.c($$0, $$1);
      }
   }

   public ebw.c d(String $$0) throws IOException {
      Path $$1 = this.e($$0);
      return new ebw.c($$0, $$1);
   }

   public egt e() {
      return this.j;
   }

   public static record a(List<ebw.b> a) implements Iterable<ebw.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<ebw.b> iterator() {
         return this.a.iterator();
      }

      public List<ebw.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {
      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(ebu.e);
      }

      public Path c() {
         return this.a(ebu.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(ebu.e.a() + "_corrupted_" + $$0.format(ebw.c));
      }

      public Path d() {
         return this.a(ebu.g);
      }

      public Path e() {
         return this.a(ebu.h);
      }

      public Path a(ebu $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final aqw b;
      final ebw.b c;
      private final String d;
      private final Map<ebu, Path> e = Maps.newHashMap();

      c(String $$1, Path $$2) throws IOException {
         this.d = $$1;
         this.c = new ebw.b($$2);
         this.b = aqw.a($$2);
      }

      public ebw a() {
         return ebw.this;
      }

      public String b() {
         return this.d;
      }

      public Path a(ebu $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(aeq<cpl> $$0) {
         return dii.a($$0, this.c.f());
      }

      private void i() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public ebz c() {
         this.i();
         return new ebz(this, ebw.this.i);
      }

      @Nullable
      public ebx d() {
         this.i();
         return ebw.this.a(this.c, ebw.this.a(this.c, false));
      }

      @Nullable
      public Pair<ecc, dld.b> a(DynamicOps<rk> $$0, cqe $$1, hr<dij> $$2, Lifecycle $$3) {
         this.i();
         return ebw.this.a(this.c, ebw.a($$0, $$1, $$2, $$3));
      }

      @Nullable
      public cqe e() {
         this.i();
         return ebw.this.a(this.c, ebw::a);
      }

      public void a(hs $$0, ecc $$1) {
         this.a($$0, $$1, null);
      }

      public void a(hs $$0, ecc $$1, @Nullable qr $$2) {
         File $$3 = this.c.f().toFile();
         qr $$4 = $$1.a($$0, $$2);
         qr $$5 = new qr();
         $$5.a("Data", $$4);

         try {
            File $$6 = File.createTempFile("level", ".dat", $$3);
            rb.a($$5, $$6);
            File $$7 = this.c.c().toFile();
            File $$8 = this.c.b().toFile();
            ac.a($$8, $$6, $$7);
         } catch (Exception var10) {
            ebw.b.error("Failed to save level {}", $$3, var10);
         }
      }

      public Optional<Path> f() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void g() throws IOException {
         this.i();
         final Path $$0 = this.c.e();
         ebw.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            ebw.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        ebw.b.debug("Deleting {}", $$0);
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

               ebw.b.warn("Failed to delete {}", this.c.f(), var6);

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
            qr $$2 = rb.a($$1.toFile());
            qr $$3 = $$2.p("Data");
            $$3.a("LevelName", $$0);
            rb.a($$2, $$1.toFile());
         }
      }

      public long h() throws IOException {
         this.i();
         String $$0 = LocalDateTime.now().format(ebw.c) + "_" + this.d;
         Path $$1 = ebw.this.d();

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

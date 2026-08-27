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
import java.nio.file.InvalidPathException;
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

public class ecy {
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
   private static final int g = 104857600;
   private final Path h;
   private final Path i;
   final DataFixer j;
   private final ehv k;

   public ecy(Path $$0, Path $$1, ehv $$2, DataFixer $$3) {
      this.j = $$3;

      try {
         v.c($$0);
      } catch (IOException var6) {
         throw new UncheckedIOException(var6);
      }

      this.h = $$0;
      this.i = $$1;
      this.k = $$2;
   }

   public static ehv a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            ehv var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new ehv(ehx.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new ehv(f);
   }

   public static ecy b(Path $$0) {
      ehv $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new ecy($$0, $$0.resolve("../backups"), $$1, aue.a());
   }

   private static <T> DataResult<dmg> a(Dynamic<T> $$0, DataFixer $$1, int $$2) {
      Dynamic<T> $$3 = $$0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator $$6 = d.iterator();

      while ($$6.hasNext()) {
         String $$4 = (String)$$6.next();
         Optional<Dynamic<T>> $$5 = $$0.get($$4).result();
         if ($$5.isPresent()) {
            $$3 = $$3.set($$4, $$5.get());
         }
      }

      Dynamic<T> $$6x = aud.r.a($$1, $$3, $$2);
      return dmg.a.parse($$6x);
   }

   private static crs a(Dynamic<?> $$0) {
      return crs.b.parse($$0).resultOrPartial(b::error).orElse(crs.c);
   }

   public String a() {
      return "Anvil";
   }

   public ecy.a b() throws ecx {
      if (!Files.isDirectory(this.h)) {
         throw new ecx(ui.c("selectWorld.load_folder_access"));
      } else {
         try {
            ecy.a var3;
            try (Stream<Path> $$0 = Files.list(this.h)) {
               List<ecy.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(ecy.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new ecy.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new ecx(ui.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<ecz>> a(ecy.a $$0) {
      List<CompletableFuture<ecz>> $$1 = new ArrayList<>($$0.a.size());

      for (ecy.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = ase.b($$2.f());
            } catch (Exception var13) {
               b.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               ecz $$4 = this.a($$2, this.a($$2, $$1x));
               return $$4 != null ? $$4 : null;
            } catch (OutOfMemoryError var12) {
               asw.b();
               System.gc();
               String $$6 = "Ran out of memory trying to read summary of world folder \"" + $$2.a() + "\"";
               b.error(LogUtils.FATAL_MARKER, $$6);
               OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
               $$7.initCause(var12);
               o $$8 = o.a($$7, $$6);
               p $$9 = $$8.a("World details");
               $$9.a("Folder Name", $$2.a());

               try {
                  long $$10 = Files.size($$2.b());
                  $$9.a("level.dat size", $$10);
               } catch (IOException var11) {
                  $$9.a("level.dat size", (Throwable)var11);
               }

               throw new y($$8);
            }
         }, ac.f()));
      }

      return ac.d($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   @Nullable
   <T> T a(ecy.b $$0, BiFunction<Path, DataFixer, T> $$1) {
      if (!Files.exists($$0.f())) {
         return null;
      } else {
         Path $$2 = $$0.b();
         if (Files.exists($$2)) {
            T $$3 = $$1.apply($$2, this.j);
            if ($$3 != null) {
               return $$3;
            }
         }

         $$2 = $$0.c();
         return Files.exists($$2) ? $$1.apply($$2, this.j) : null;
      }
   }

   @Nullable
   private static crs a(Path $$0, DataFixer $$1) {
      try {
         if (c($$0) instanceof rt $$3) {
            rt $$4 = $$3.p("Data");
            int $$5 = sg.b($$4, -1);
            Dynamic<?> $$6 = aud.a.a($$1, new Dynamic(sf.a, $$4), $$5);
            return a($$6);
         }
      } catch (Exception var7) {
         b.error("Exception reading {}", $$0, var7);
      }

      return null;
   }

   static BiFunction<Path, DataFixer, Pair<ede, dmf.b>> a(DynamicOps<sn> $$0, crs $$1, io<djl> $$2, Lifecycle $$3) {
      return ($$4, $$5) -> {
         rt $$6;
         try {
            $$6 = se.a($$4.toFile());
         } catch (IOException var17) {
            throw new UncheckedIOException(var17);
         }

         rt $$9 = $$6.p("Data");
         rt $$10 = $$9.b("Player", 10) ? $$9.p("Player") : null;
         $$9.r("Player");
         int $$11 = sg.b($$9, -1);
         Dynamic<?> $$12 = aud.a.a($$5, new Dynamic($$0, $$9), $$11);
         dmg $$13 = (dmg)a($$12, $$5, $$11).getOrThrow(false, ac.a("WorldGenSettings: ", b::error));
         eda $$14 = eda.a($$12);
         crd $$15 = crd.a($$12, $$1);
         dmf.b $$16 = $$13.b().a($$2);
         Lifecycle $$17 = $$16.a().add($$3);
         edc $$18 = edc.a($$12, $$5, $$11, $$10, $$15, $$14, $$16.d(), $$13.a(), $$17);
         return Pair.of($$18, $$16);
      };
   }

   BiFunction<Path, DataFixer, ecz> a(ecy.b $$0, boolean $$1) {
      return ($$2, $$3) -> {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<ehw> $$4 = this.k.a($$2);
               if (!$$4.isEmpty()) {
                  b.warn("{}", ehu.a($$2, $$4));
                  return new ecz.b($$0.a(), $$0.d());
               }
            }

            if (c($$2) instanceof rt $$6) {
               rt $$7 = $$6.p("Data");
               int $$8 = sg.b($$7, -1);
               Dynamic<?> $$9 = aud.a.a($$3, new Dynamic(sf.a, $$7), $$8);
               eda $$10 = eda.a($$9);
               int $$11 = $$10.a();
               if ($$11 == 19132 || $$11 == 19133) {
                  boolean $$12 = $$11 != this.f();
                  Path $$13 = $$0.d();
                  crs $$14 = a($$9);
                  crd $$15 = crd.a($$9, $$14);
                  cfg $$16 = b($$9);
                  boolean $$17 = cfi.a($$16);
                  return new ecz($$15, $$10, $$0.a(), $$12, $$1, $$17, $$13);
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

   private static cfg b(Dynamic<?> $$0) {
      Set<afw> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(afw::a).stream()).collect(Collectors.toSet());
      return cfi.d.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static sn c(Path $$0) throws IOException {
      sz $$1 = new sz(new sw("Data", rt.b, "Player"), new sw("Data", rt.b, "WorldGenSettings"));
      se.a($$0.toFile(), $$1, sc.a(104857600L));
      return $$1.d();
   }

   public boolean a(String $$0) {
      try {
         Path $$1 = this.c($$0);
         Files.createDirectory($$1);
         Files.deleteIfExists($$1);
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public boolean b(String $$0) {
      try {
         return Files.isDirectory(this.c($$0));
      } catch (InvalidPathException var3) {
         return false;
      }
   }

   public Path c(String $$0) {
      return this.h.resolve($$0);
   }

   public Path c() {
      return this.h;
   }

   public Path d() {
      return this.i;
   }

   public ecy.c d(String $$0) throws IOException, ehu {
      Path $$1 = this.c($$0);
      List<ehw> $$2 = this.k.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new ehu($$1, $$2);
      } else {
         return new ecy.c($$0, $$1);
      }
   }

   public ecy.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new ecy.c($$0, $$1);
   }

   public ehv e() {
      return this.k;
   }

   public static record a(List<ecy.b> a) implements Iterable<ecy.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<ecy.b> iterator() {
         return this.a.iterator();
      }

      public List<ecy.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {
      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(ecw.e);
      }

      public Path c() {
         return this.a(ecw.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(ecw.e.a() + "_corrupted_" + $$0.format(ecy.c));
      }

      public Path d() {
         return this.a(ecw.g);
      }

      public Path e() {
         return this.a(ecw.h);
      }

      public Path a(ecw $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final ase b;
      final ecy.b c;
      private final String d;
      private final Map<ecw, Path> e = Maps.newHashMap();

      c(String $$1, Path $$2) throws IOException {
         this.d = $$1;
         this.c = new ecy.b($$2);
         this.b = ase.a($$2);
      }

      public ecy a() {
         return ecy.this;
      }

      public String b() {
         return this.d;
      }

      public Path a(ecw $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(afv<cqz> $$0) {
         return djk.a($$0, this.c.f());
      }

      private void i() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public edb c() {
         this.i();
         return new edb(this, ecy.this.j);
      }

      @Nullable
      public ecz d() {
         this.i();
         return ecy.this.a(this.c, ecy.this.a(this.c, false));
      }

      @Nullable
      public Pair<ede, dmf.b> a(DynamicOps<sn> $$0, crs $$1, io<djl> $$2, Lifecycle $$3) {
         this.i();
         return ecy.this.a(this.c, ecy.a($$0, $$1, $$2, $$3));
      }

      @Nullable
      public crs e() {
         this.i();
         return ecy.this.a(this.c, ecy::a);
      }

      public void a(ip $$0, ede $$1) {
         this.a($$0, $$1, null);
      }

      public void a(ip $$0, ede $$1, @Nullable rt $$2) {
         File $$3 = this.c.f().toFile();
         rt $$4 = $$1.a($$0, $$2);
         rt $$5 = new rt();
         $$5.a("Data", $$4);

         try {
            File $$6 = File.createTempFile("level", ".dat", $$3);
            se.a($$5, $$6);
            File $$7 = this.c.c().toFile();
            File $$8 = this.c.b().toFile();
            ac.a($$8, $$6, $$7);
         } catch (Exception var10) {
            ecy.b.error("Failed to save level {}", $$3, var10);
         }
      }

      public Optional<Path> f() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void g() throws IOException {
         this.i();
         final Path $$0 = this.c.e();
         ecy.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            ecy.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        ecy.b.debug("Deleting {}", $$0);
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

               ecy.b.warn("Failed to delete {}", this.c.f(), var6);

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
            rt $$2 = se.a($$1.toFile());
            rt $$3 = $$2.p("Data");
            $$3.a("LevelName", $$0);
            se.a($$2, $$1.toFile());
         }
      }

      public long h() throws IOException {
         this.i();
         String $$0 = LocalDateTime.now().format(ecy.c) + "_" + this.d;
         Path $$1 = ecy.this.d();

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

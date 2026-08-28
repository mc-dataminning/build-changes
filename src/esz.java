import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
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
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esz {
   static final Logger b = LogUtils.getLogger();
   static final DateTimeFormatter c = esu.a();
   private static final String d = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String a = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private static final int g = 67108864;
   private final Path h;
   private final Path i;
   final DataFixer j;
   private final eym k;

   public esz(Path $$0, Path $$1, eym $$2, DataFixer $$3) {
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

   public static eym a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            eym var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new eym(eyo.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new eym(e);
   }

   public static esz b(Path $$0) {
      eym $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new esz($$0, $$0.resolve("../backups"), $$1, bap.a());
   }

   public static dff a(Dynamic<?> $$0) {
      return dff.b.parse($$0).resultOrPartial(b::error).orElse(dff.c);
   }

   public static amc.d a(Dynamic<?> $$0, aug $$1, boolean $$2) {
      return new amc.d($$1, a($$0), $$2, false);
   }

   public static esw a(Dynamic<?> $$0, dff $$1, kb<dyp> $$2, jq.a $$3) {
      Dynamic<?> $$4 = alc.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      ebk $$6 = (ebk)ebk.a.parse($$5).getOrThrow();
      den $$7 = den.a($$4, $$1);
      ebj.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.c());
      etd $$10 = etd.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new esw($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public esz.a b() throws esy {
      if (!Files.isDirectory(this.h)) {
         throw new esy(xe.c("selectWorld.load_folder_access"));
      } else {
         try {
            esz.a var3;
            try (Stream<Path> $$0 = Files.list(this.h)) {
               List<esz.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(esz.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new esz.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new esy(xe.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<eta>> a(esz.a $$0) {
      List<CompletableFuture<eta>> $$1 = new ArrayList<>($$0.a.size());

      for (esz.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = ayl.b($$2.f());
            } catch (Exception var13) {
               b.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               azd.b();
               System.gc();
               String $$5 = "Ran out of memory trying to read summary of world folder \"" + $$2.a() + "\"";
               b.error(LogUtils.FATAL_MARKER, $$5);
               OutOfMemoryError $$6 = new OutOfMemoryError("Ran out of memory reading level data");
               $$6.initCause(var12);
               o $$7 = o.a($$6, $$5);
               p $$8 = $$7.a("World details");
               $$8.a("Folder Name", $$2.a());

               try {
                  long $$9 = Files.size($$2.b());
                  $$8.a("level.dat size", $$9);
               } catch (IOException var11) {
                  $$8.a("level.dat size", (Throwable)var11);
               }

               throw new z($$7);
            }
         }, ad.g()));
      }

      return ad.f($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   static ug c(Path $$0) throws IOException {
      return ut.a($$0, up.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      ug $$2 = c($$0);
      ug $$3 = $$2.p("Data");
      int $$4 = uv.b($$3, -1);
      Dynamic<?> $$5 = bao.a.a($$1, new Dynamic(uu.a, $$3), $$4);
      $$5 = $$5.update("Player", $$2x -> bao.b.a($$1, $$2x, $$4));
      return $$5.update("WorldGenSettings", $$2x -> bao.r.a($$1, $$2x, $$4));
   }

   private eta a(esz.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<eyn> $$3 = this.k.a($$2);
               if (!$$3.isEmpty()) {
                  b.warn("{}", eyl.a($$2, $$3));
                  return new eta.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof ug $$5) {
               ug $$6 = $$5.p("Data");
               int $$7 = uv.b($$6, -1);
               Dynamic<?> $$8 = bao.a.a(this.j, new Dynamic(uu.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            b.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            b.error("Exception reading {}", $$2, var9);
         }
      }

      return new eta.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(esz.b $$0) {
      Instant $$1 = d($$0.b());
      if ($$1 == null) {
         $$1 = d($$0.c());
      }

      return $$1 == null ? -1L : $$1.toEpochMilli();
   }

   @Nullable
   static Instant d(Path $$0) {
      try {
         return Files.getLastModifiedTime($$0).toInstant();
      } catch (IOException var2) {
         return null;
      }
   }

   eta a(Dynamic<?> $$0, esz.b $$1, boolean $$2) {
      etb $$3 = etb.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new us("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         dff $$7 = a($$0);
         den $$8 = den.a($$0, $$7);
         cqq $$9 = b($$0);
         boolean $$10 = cqs.a($$9);
         return new eta($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static cqq b(Dynamic<?> $$0) {
      Set<ale> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(ale::c).stream()).collect(Collectors.toSet());
      return cqs.f.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static vd e(Path $$0) throws IOException {
      vp $$1 = new vp(new vm("Data", ug.b, "Player"), new vm("Data", ug.b, "WorldGenSettings"));
      ut.a($$0, $$1, up.a(104857600L));
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

   public esz.c d(String $$0) throws IOException, eyl {
      Path $$1 = this.c($$0);
      List<eyn> $$2 = this.k.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new eyl($$1, $$2);
      } else {
         return new esz.c($$0, $$1);
      }
   }

   public esz.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new esz.c($$0, $$1);
   }

   public eym e() {
      return this.k;
   }

   public static record a(List<esz.b> a) implements Iterable<esz.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<esz.b> iterator() {
         return this.a.iterator();
      }

      public List<esz.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {

      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(esx.e);
      }

      public Path c() {
         return this.a(esx.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(esx.e.a() + "_corrupted_" + $$0.format(esz.c));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(esx.e.a() + "_raw_" + $$0.format(esz.c));
      }

      public Path d() {
         return this.a(esx.g);
      }

      public Path e() {
         return this.a(esx.h);
      }

      public Path a(esx $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final ayl b;
      final esz.b c;
      private final String d;
      private final Map<esx, Path> e = Maps.newHashMap();

      c(final String $$1, final Path $$2) throws IOException {
         this.d = $$1;
         this.c = new esz.b($$2);
         this.b = ayl.a($$2);
      }

      public long a() {
         try {
            return Files.getFileStore(this.c.a).getUsableSpace();
         } catch (Exception var2) {
            return Long.MAX_VALUE;
         }
      }

      public boolean b() {
         return this.a() < 67108864L;
      }

      public void c() {
         try {
            this.close();
         } catch (IOException var2) {
            esz.b.warn("Failed to unlock access to level {}", this.f(), var2);
         }
      }

      public esz d() {
         return esz.this;
      }

      public esz.b e() {
         return this.c;
      }

      public String f() {
         return this.d;
      }

      public Path a(esx $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(ald<dej> $$0) {
         return dyo.a($$0, this.c.f());
      }

      private void o() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public etc g() {
         this.o();
         return new etc(this, esz.this.j);
      }

      public eta a(Dynamic<?> $$0) {
         this.o();
         return esz.this.a($$0, this.c, false);
      }

      public Dynamic<?> h() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> i() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.o();
         return esz.a($$0 ? this.c.c() : this.c.b(), esz.this.j);
      }

      public void a(kc $$0, etf $$1) {
         this.a($$0, $$1, null);
      }

      public void a(kc $$0, etf $$1, @Nullable ug $$2) {
         ug $$3 = $$1.a($$0, $$2);
         ug $$4 = new ug();
         $$4.a("Data", $$3);
         this.a($$4);
      }

      private void a(ug $$0) {
         Path $$1 = this.c.f();

         try {
            Path $$2 = Files.createTempFile($$1, "level", ".dat");
            ut.a($$0, $$2);
            Path $$3 = this.c.c();
            Path $$4 = this.c.b();
            ad.a($$4, $$2, $$3);
         } catch (Exception var6) {
            esz.b.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> j() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void k() throws IOException {
         this.o();
         final Path $$0 = this.c.e();
         esz.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            esz.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        esz.b.debug("Deleting {}", $$0);
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

               esz.b.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.a((Consumer<ug>)($$1 -> $$1.a("LevelName", $$0.trim())));
      }

      public void b(String $$0) throws IOException {
         this.a((Consumer<ug>)($$1 -> {
            $$1.a("LevelName", $$0.trim());
            $$1.r("Player");
         }));
      }

      private void a(Consumer<ug> $$0) throws IOException {
         this.o();
         ug $$1 = esz.c(this.c.b());
         $$0.accept($$1.p("Data"));
         this.a($$1);
      }

      public long l() throws IOException {
         this.o();
         String $$0 = LocalDateTime.now().format(esz.c) + "_" + this.d;
         Path $$1 = esz.this.d();

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

      public boolean m() {
         return Files.exists(this.c.b()) || Files.exists(this.c.c());
      }

      @Override
      public void close() throws IOException {
         this.b.close();
      }

      public boolean n() {
         return ad.a(this.c.b(), this.c.c(), this.c.a(LocalDateTime.now()), true);
      }

      @Nullable
      public Instant a(boolean $$0) {
         return esz.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

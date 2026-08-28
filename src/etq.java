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

public class etq {
   static final Logger b = LogUtils.getLogger();
   static final DateTimeFormatter c = etl.a();
   private static final String d = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String a = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private static final int g = 67108864;
   private final Path h;
   private final Path i;
   final DataFixer j;
   private final ezd k;

   public etq(Path $$0, Path $$1, ezd $$2, DataFixer $$3) {
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

   public static ezd a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            ezd var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new ezd(ezf.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new ezd(e);
   }

   public static etq b(Path $$0) {
      ezd $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new etq($$0, $$0.resolve("../backups"), $$1, bau.a());
   }

   public static dfx a(Dynamic<?> $$0) {
      return dfx.b.parse($$0).resultOrPartial(b::error).orElse(dfx.c);
   }

   public static amg.d a(Dynamic<?> $$0, aul $$1, boolean $$2) {
      return new amg.d($$1, a($$0), $$2, false);
   }

   public static etn a(Dynamic<?> $$0, dfx $$1, kd<dzg> $$2, js.a $$3) {
      Dynamic<?> $$4 = alg.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      ecb $$6 = (ecb)ecb.a.parse($$5).getOrThrow();
      dff $$7 = dff.a($$4, $$1);
      eca.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.d());
      etu $$10 = etu.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new etn($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public etq.a b() throws etp {
      if (!Files.isDirectory(this.h)) {
         throw new etp(xi.c("selectWorld.load_folder_access"));
      } else {
         try {
            etq.a var3;
            try (Stream<Path> $$0 = Files.list(this.h)) {
               List<etq.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(etq.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new etq.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new etp(xi.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<etr>> a(etq.a $$0) {
      List<CompletableFuture<etr>> $$1 = new ArrayList<>($$0.a.size());

      for (etq.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = ayq.b($$2.f());
            } catch (Exception var13) {
               b.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               azi.b();
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
         }, ae.g().a("loadLevelSummaries")));
      }

      return ae.f($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   static uk c(Path $$0) throws IOException {
      return ux.a($$0, ut.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      uk $$2 = c($$0);
      uk $$3 = $$2.p("Data");
      int $$4 = uz.b($$3, -1);
      Dynamic<?> $$5 = bat.a.a($$1, new Dynamic(uy.a, $$3), $$4);
      $$5 = $$5.update("Player", $$2x -> bat.b.a($$1, $$2x, $$4));
      return $$5.update("WorldGenSettings", $$2x -> bat.r.a($$1, $$2x, $$4));
   }

   private etr a(etq.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<eze> $$3 = this.k.a($$2);
               if (!$$3.isEmpty()) {
                  b.warn("{}", ezc.a($$2, $$3));
                  return new etr.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof uk $$5) {
               uk $$6 = $$5.p("Data");
               int $$7 = uz.b($$6, -1);
               Dynamic<?> $$8 = bat.a.a(this.j, new Dynamic(uy.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            b.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            b.error("Exception reading {}", $$2, var9);
         }
      }

      return new etr.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(etq.b $$0) {
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

   etr a(Dynamic<?> $$0, etq.b $$1, boolean $$2) {
      ets $$3 = ets.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new uw("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         dfx $$7 = a($$0);
         dff $$8 = dff.a($$0, $$7);
         crf $$9 = b($$0);
         boolean $$10 = crh.a($$9);
         return new etr($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static crf b(Dynamic<?> $$0) {
      Set<ali> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(ali::c).stream()).collect(Collectors.toSet());
      return crh.f.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static vh e(Path $$0) throws IOException {
      vt $$1 = new vt(new vq("Data", uk.b, "Player"), new vq("Data", uk.b, "WorldGenSettings"));
      ux.a($$0, $$1, ut.a(104857600L));
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

   public etq.c d(String $$0) throws IOException, ezc {
      Path $$1 = this.c($$0);
      List<eze> $$2 = this.k.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new ezc($$1, $$2);
      } else {
         return new etq.c($$0, $$1);
      }
   }

   public etq.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new etq.c($$0, $$1);
   }

   public ezd e() {
      return this.k;
   }

   public static record a(List<etq.b> a) implements Iterable<etq.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<etq.b> iterator() {
         return this.a.iterator();
      }

      public List<etq.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {

      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(eto.e);
      }

      public Path c() {
         return this.a(eto.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(eto.e.a() + "_corrupted_" + $$0.format(etq.c));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(eto.e.a() + "_raw_" + $$0.format(etq.c));
      }

      public Path d() {
         return this.a(eto.g);
      }

      public Path e() {
         return this.a(eto.h);
      }

      public Path a(eto $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final ayq b;
      final etq.b c;
      private final String d;
      private final Map<eto, Path> e = Maps.newHashMap();

      c(final String $$1, final Path $$2) throws IOException {
         this.d = $$1;
         this.c = new etq.b($$2);
         this.b = ayq.a($$2);
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
            etq.b.warn("Failed to unlock access to level {}", this.f(), var2);
         }
      }

      public etq d() {
         return etq.this;
      }

      public etq.b e() {
         return this.c;
      }

      public String f() {
         return this.d;
      }

      public Path a(eto $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(alh<dfb> $$0) {
         return dzf.a($$0, this.c.f());
      }

      private void o() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public ett g() {
         this.o();
         return new ett(this, etq.this.j);
      }

      public etr a(Dynamic<?> $$0) {
         this.o();
         return etq.this.a($$0, this.c, false);
      }

      public Dynamic<?> h() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> i() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.o();
         return etq.a($$0 ? this.c.c() : this.c.b(), etq.this.j);
      }

      public void a(ke $$0, etw $$1) {
         this.a($$0, $$1, null);
      }

      public void a(ke $$0, etw $$1, @Nullable uk $$2) {
         uk $$3 = $$1.a($$0, $$2);
         uk $$4 = new uk();
         $$4.a("Data", $$3);
         this.a($$4);
      }

      private void a(uk $$0) {
         Path $$1 = this.c.f();

         try {
            Path $$2 = Files.createTempFile($$1, "level", ".dat");
            ux.a($$0, $$2);
            Path $$3 = this.c.c();
            Path $$4 = this.c.b();
            ae.a($$4, $$2, $$3);
         } catch (Exception var6) {
            etq.b.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> j() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void k() throws IOException {
         this.o();
         final Path $$0 = this.c.e();
         etq.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            etq.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        etq.b.debug("Deleting {}", $$0);
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

               etq.b.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.a((Consumer<uk>)($$1 -> $$1.a("LevelName", $$0.trim())));
      }

      public void b(String $$0) throws IOException {
         this.a((Consumer<uk>)($$1 -> {
            $$1.a("LevelName", $$0.trim());
            $$1.r("Player");
         }));
      }

      private void a(Consumer<uk> $$0) throws IOException {
         this.o();
         uk $$1 = etq.c(this.c.b());
         $$0.accept($$1.p("Data"));
         this.a($$1);
      }

      public long l() throws IOException {
         this.o();
         String $$0 = LocalDateTime.now().format(etq.c) + "_" + this.d;
         Path $$1 = etq.this.d();

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
         return ae.a(this.c.b(), this.c.c(), this.c.a(LocalDateTime.now()), true);
      }

      @Nullable
      public Instant a(boolean $$0) {
         return etq.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

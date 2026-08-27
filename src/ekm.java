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

public class ekm {
   static final Logger b = LogUtils.getLogger();
   static final DateTimeFormatter c = ekh.a();
   private static final String d = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String a = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private final Path g;
   private final Path h;
   final DataFixer i;
   private final epj j;

   public ekm(Path $$0, Path $$1, epj $$2, DataFixer $$3) {
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

   public static epj a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            epj var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new epj(epl.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new epj(e);
   }

   public static ekm b(Path $$0) {
      epj $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new ekm($$0, $$0.resolve("../backups"), $$1, ayd.a());
   }

   public static cxv a(Dynamic<?> $$0) {
      return cxv.b.parse($$0).resultOrPartial(b::error).orElse(cxv.c);
   }

   public static akc.d a(Dynamic<?> $$0, arz $$1, boolean $$2) {
      return new akc.d($$1, a($$0), $$2, false);
   }

   public static ekj a(Dynamic<?> $$0, cxv $$1, iy<dqp> $$2, iz.b $$3) {
      Dynamic<?> $$4 = ajf.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      dtk $$6 = (dtk)dtk.a.parse($$5).getOrThrow(false, ac.a("WorldGenSettings: ", b::error));
      cxf $$7 = cxf.a($$4, $$1);
      dtj.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.e());
      ekq $$10 = ekq.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new ekj($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public ekm.a b() throws ekl {
      if (!Files.isDirectory(this.g)) {
         throw new ekl(vu.c("selectWorld.load_folder_access"));
      } else {
         try {
            ekm.a var3;
            try (Stream<Path> $$0 = Files.list(this.g)) {
               List<ekm.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(ekm.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new ekm.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new ekl(vu.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<ekn>> a(ekm.a $$0) {
      List<CompletableFuture<ekn>> $$1 = new ArrayList<>($$0.a.size());

      for (ekm.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = awc.b($$2.f());
            } catch (Exception var13) {
               b.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               awu.b();
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

               throw new y($$7);
            }
         }, ac.f()));
      }

      return ac.f($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   static ta c(Path $$0) throws IOException {
      return tn.a($$0, tj.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      ta $$2 = c($$0);
      ta $$3 = $$2.p("Data");
      int $$4 = tp.b($$3, -1);
      Dynamic<?> $$5 = ayc.a.a($$1, new Dynamic(to.a, $$3), $$4);
      Dynamic<?> $$6 = $$5.get("Player").orElseEmptyMap();
      Dynamic<?> $$7 = ayc.b.a($$1, $$6, $$4);
      $$5 = $$5.set("Player", $$7);
      Dynamic<?> $$8 = $$5.get("WorldGenSettings").orElseEmptyMap();
      Dynamic<?> $$9 = ayc.r.a($$1, $$8, $$4);
      return $$5.set("WorldGenSettings", $$9);
   }

   private ekn a(ekm.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<epk> $$3 = this.j.a($$2);
               if (!$$3.isEmpty()) {
                  b.warn("{}", epi.a($$2, $$3));
                  return new ekn.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof ta $$5) {
               ta $$6 = $$5.p("Data");
               int $$7 = tp.b($$6, -1);
               Dynamic<?> $$8 = ayc.a.a(this.i, new Dynamic(to.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            b.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            b.error("Exception reading {}", $$2, var9);
         }
      }

      return new ekn.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(ekm.b $$0) {
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

   ekn a(Dynamic<?> $$0, ekm.b $$1, boolean $$2) {
      eko $$3 = eko.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new tm("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         cxv $$7 = a($$0);
         cxf $$8 = cxf.a($$0, $$7);
         clh $$9 = b($$0);
         boolean $$10 = clj.a($$9);
         return new ekn($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static clh b(Dynamic<?> $$0) {
      Set<ajh> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(ajh::a).stream()).collect(Collectors.toSet());
      return clj.e.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static tx e(Path $$0) throws IOException {
      uj $$1 = new uj(new ug("Data", ta.b, "Player"), new ug("Data", ta.b, "WorldGenSettings"));
      tn.a($$0, $$1, tj.a(104857600L));
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
      return this.g.resolve($$0);
   }

   public Path c() {
      return this.g;
   }

   public Path d() {
      return this.h;
   }

   public ekm.c d(String $$0) throws IOException, epi {
      Path $$1 = this.c($$0);
      List<epk> $$2 = this.j.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new epi($$1, $$2);
      } else {
         return new ekm.c($$0, $$1);
      }
   }

   public ekm.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new ekm.c($$0, $$1);
   }

   public epj e() {
      return this.j;
   }

   public static record a(List<ekm.b> a) implements Iterable<ekm.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<ekm.b> iterator() {
         return this.a.iterator();
      }

      public List<ekm.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {
      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(ekk.e);
      }

      public Path c() {
         return this.a(ekk.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(ekk.e.a() + "_corrupted_" + $$0.format(ekm.c));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(ekk.e.a() + "_raw_" + $$0.format(ekm.c));
      }

      public Path d() {
         return this.a(ekk.g);
      }

      public Path e() {
         return this.a(ekk.h);
      }

      public Path a(ekk $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final awc b;
      final ekm.b c;
      private final String d;
      private final Map<ekk, Path> e = Maps.newHashMap();

      c(String $$1, Path $$2) throws IOException {
         this.d = $$1;
         this.c = new ekm.b($$2);
         this.b = awc.a($$2);
      }

      public void a() {
         try {
            this.close();
         } catch (IOException var2) {
            ekm.b.warn("Failed to unlock access to level {}", this.d(), var2);
         }
      }

      public ekm b() {
         return ekm.this;
      }

      public ekm.b c() {
         return this.c;
      }

      public String d() {
         return this.d;
      }

      public Path a(ekk $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(ajg<cxb> $$0) {
         return dqo.a($$0, this.c.f());
      }

      private void m() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public ekp e() {
         this.m();
         return new ekp(this, ekm.this.i);
      }

      public ekn a(Dynamic<?> $$0) {
         this.m();
         return ekm.this.a($$0, this.c, false);
      }

      public Dynamic<?> f() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> g() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.m();
         return ekm.a($$0 ? this.c.c() : this.c.b(), ekm.this.i);
      }

      public void a(iz $$0, eks $$1) {
         this.a($$0, $$1, null);
      }

      public void a(iz $$0, eks $$1, @Nullable ta $$2) {
         ta $$3 = $$1.a($$0, $$2);
         ta $$4 = new ta();
         $$4.a("Data", $$3);
         this.a($$4);
      }

      private void a(ta $$0) {
         Path $$1 = this.c.f();

         try {
            Path $$2 = Files.createTempFile($$1, "level", ".dat");
            tn.a($$0, $$2);
            Path $$3 = this.c.c();
            Path $$4 = this.c.b();
            ac.a($$4, $$2, $$3);
         } catch (Exception var6) {
            ekm.b.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> h() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void i() throws IOException {
         this.m();
         final Path $$0 = this.c.e();
         ekm.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            ekm.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        ekm.b.debug("Deleting {}", $$0);
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

               ekm.b.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.a((Consumer<ta>)($$1 -> $$1.a("LevelName", $$0.trim())));
      }

      public void b(String $$0) throws IOException {
         this.a((Consumer<ta>)($$1 -> {
            $$1.a("LevelName", $$0.trim());
            $$1.r("Player");
         }));
      }

      private void a(Consumer<ta> $$0) throws IOException {
         this.m();
         ta $$1 = ekm.c(this.c.b());
         $$0.accept($$1.p("Data"));
         this.a($$1);
      }

      public long j() throws IOException {
         this.m();
         String $$0 = LocalDateTime.now().format(ekm.c) + "_" + this.d;
         Path $$1 = ekm.this.d();

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

      public boolean k() {
         return Files.exists(this.c.b()) || Files.exists(this.c.c());
      }

      @Override
      public void close() throws IOException {
         this.b.close();
      }

      public boolean l() {
         return ac.a(this.c.b(), this.c.c(), this.c.a(LocalDateTime.now()), true);
      }

      @Nullable
      public Instant a(boolean $$0) {
         return ekm.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

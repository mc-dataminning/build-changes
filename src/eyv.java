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

public class eyv {
   static final Logger c = LogUtils.getLogger();
   static final DateTimeFormatter d = eyq.a();
   public static final String a = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String b = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private static final int g = 67108864;
   private final Path h;
   private final Path i;
   final DataFixer j;
   private final feg k;

   public eyv(Path $$0, Path $$1, feg $$2, DataFixer $$3) {
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

   public static feg a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            feg var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new feg(fei.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            c.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new feg(e);
   }

   public static eyv b(Path $$0) {
      feg $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new eyv($$0, $$0.resolve("../backups"), $$1, bbc.a());
   }

   public static djy a(Dynamic<?> $$0) {
      return djy.c.parse($$0).resultOrPartial(c::error).orElse(djy.d);
   }

   public static ame.d a(Dynamic<?> $$0, aun $$1, boolean $$2) {
      return new ame.d($$1, a($$0), $$2, false);
   }

   public static eys a(Dynamic<?> $$0, djy $$1, jr<eef> $$2, jg.a $$3) {
      Dynamic<?> $$4 = ale.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      ehc $$6 = (ehc)ehc.a.parse($$5).getOrThrow();
      dje $$7 = dje.a($$4, $$1);
      ehb.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.d());
      eyz $$10 = eyz.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new eys($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public eyv.a b() throws eyu {
      if (!Files.isDirectory(this.h)) {
         throw new eyu(wy.c("selectWorld.load_folder_access"));
      } else {
         try {
            eyv.a var3;
            try (Stream<Path> $$0 = Files.list(this.h)) {
               List<eyv.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(eyv.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new eyv.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new eyu(wy.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<eyw>> a(eyv.a $$0) {
      List<CompletableFuture<eyw>> $$1 = new ArrayList<>($$0.a.size());

      for (eyv.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = ayr.b($$2.f());
            } catch (Exception var13) {
               c.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               azk.b();
               String $$5 = "Ran out of memory trying to read summary of world folder \"" + $$2.a() + "\"";
               c.error(LogUtils.FATAL_MARKER, $$5);
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
         }, af.h().a("loadLevelSummaries")));
      }

      return af.f($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   static tz c(Path $$0) throws IOException {
      return um.a($$0, ui.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      tz $$2 = c($$0);
      tz $$3 = $$2.p("Data");
      int $$4 = uo.b($$3, -1);
      Dynamic<?> $$5 = bbb.a.a($$1, new Dynamic(un.a, $$3), $$4);
      $$5 = $$5.update("Player", $$2x -> bbb.b.a($$1, $$2x, $$4));
      return $$5.update("WorldGenSettings", $$2x -> bbb.r.a($$1, $$2x, $$4));
   }

   private eyw a(eyv.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<feh> $$3 = this.k.a($$2);
               if (!$$3.isEmpty()) {
                  c.warn("{}", fef.a($$2, $$3));
                  return new eyw.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof tz $$5) {
               tz $$6 = $$5.p("Data");
               int $$7 = uo.b($$6, -1);
               Dynamic<?> $$8 = bbb.a.a(this.j, new Dynamic(un.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            c.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            c.error("Exception reading {}", $$2, var9);
         }
      }

      return new eyw.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(eyv.b $$0) {
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

   eyw a(Dynamic<?> $$0, eyv.b $$1, boolean $$2) {
      eyx $$3 = eyx.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new ul("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         djy $$7 = a($$0);
         dje $$8 = dje.a($$0, $$7);
         cum $$9 = b($$0);
         boolean $$10 = cuo.a($$9);
         return new eyw($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static cum b(Dynamic<?> $$0) {
      Set<alg> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(alg::c).stream()).collect(Collectors.toSet());
      return cuo.e.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static uw e(Path $$0) throws IOException {
      vi $$1 = new vi(new vf("Data", tz.b, "Player"), new vf("Data", tz.b, "WorldGenSettings"));
      um.a($$0, $$1, ui.a(104857600L));
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

   public eyv.c d(String $$0) throws IOException, fef {
      Path $$1 = this.c($$0);
      List<feh> $$2 = this.k.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new fef($$1, $$2);
      } else {
         return new eyv.c($$0, $$1);
      }
   }

   public eyv.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new eyv.c($$0, $$1);
   }

   public feg e() {
      return this.k;
   }

   public static record a(List<eyv.b> a) implements Iterable<eyv.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<eyv.b> iterator() {
         return this.a.iterator();
      }

      public List<eyv.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {

      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(eyt.e);
      }

      public Path c() {
         return this.a(eyt.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(eyt.e.a() + "_corrupted_" + $$0.format(eyv.d));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(eyt.e.a() + "_raw_" + $$0.format(eyv.d));
      }

      public Path d() {
         return this.a(eyt.g);
      }

      public Path e() {
         return this.a(eyt.h);
      }

      public Path a(eyt $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final ayr b;
      final eyv.b c;
      private final String d;
      private final Map<eyt, Path> e = Maps.newHashMap();

      c(final String $$1, final Path $$2) throws IOException {
         this.d = $$1;
         this.c = new eyv.b($$2);
         this.b = ayr.a($$2);
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
            eyv.c.warn("Failed to unlock access to level {}", this.f(), var2);
         }
      }

      public eyv d() {
         return eyv.this;
      }

      public eyv.b e() {
         return this.c;
      }

      public String f() {
         return this.d;
      }

      public Path a(eyt $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(alf<dja> $$0) {
         return eee.a($$0, this.c.f());
      }

      private void o() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public eyy g() {
         this.o();
         return new eyy(this, eyv.this.j);
      }

      public eyw a(Dynamic<?> $$0) {
         this.o();
         return eyv.this.a($$0, this.c, false);
      }

      public Dynamic<?> h() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> i() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.o();
         return eyv.a($$0 ? this.c.c() : this.c.b(), eyv.this.j);
      }

      public void a(js $$0, ezb $$1) {
         this.a($$0, $$1, null);
      }

      public void a(js $$0, ezb $$1, @Nullable tz $$2) {
         tz $$3 = $$1.a($$0, $$2);
         tz $$4 = new tz();
         $$4.a("Data", $$3);
         this.a($$4);
      }

      private void a(tz $$0) {
         Path $$1 = this.c.f();

         try {
            Path $$2 = Files.createTempFile($$1, "level", ".dat");
            um.a($$0, $$2);
            Path $$3 = this.c.c();
            Path $$4 = this.c.b();
            af.a($$4, $$2, $$3);
         } catch (Exception var6) {
            eyv.c.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> j() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void k() throws IOException {
         this.o();
         final Path $$0 = this.c.e();
         eyv.c.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            eyv.c.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        eyv.c.debug("Deleting {}", $$0);
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

               eyv.c.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.a((Consumer<tz>)($$1 -> $$1.a("LevelName", $$0.trim())));
      }

      public void b(String $$0) throws IOException {
         this.a((Consumer<tz>)($$1 -> {
            $$1.a("LevelName", $$0.trim());
            $$1.r("Player");
         }));
      }

      private void a(Consumer<tz> $$0) throws IOException {
         this.o();
         tz $$1 = eyv.c(this.c.b());
         $$0.accept($$1.p("Data"));
         this.a($$1);
      }

      public long l() throws IOException {
         this.o();
         String $$0 = LocalDateTime.now().format(eyv.d) + "_" + this.d;
         Path $$1 = eyv.this.d();

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
         return af.a(this.c.b(), this.c.c(), this.c.a(LocalDateTime.now()), true);
      }

      @Nullable
      public Instant a(boolean $$0) {
         return eyv.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

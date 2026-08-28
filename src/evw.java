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

public class evw {
   static final Logger c = LogUtils.getLogger();
   static final DateTimeFormatter d = evr.a();
   public static final String a = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String b = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private static final int g = 67108864;
   private final Path h;
   private final Path i;
   final DataFixer j;
   private final fbh k;

   public evw(Path $$0, Path $$1, fbh $$2, DataFixer $$3) {
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

   public static fbh a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            fbh var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new fbh(fbj.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            c.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new fbh(e);
   }

   public static evw b(Path $$0) {
      fbh $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new evw($$0, $$0.resolve("../backups"), $$1, bbj.a());
   }

   public static dhw a(Dynamic<?> $$0) {
      return dhw.b.parse($$0).resultOrPartial(c::error).orElse(dhw.c);
   }

   public static amn.d a(Dynamic<?> $$0, auv $$1, boolean $$2) {
      return new amn.d($$1, a($$0), $$2, false);
   }

   public static evt a(Dynamic<?> $$0, dhw $$1, kd<ebk> $$2, js.a $$3) {
      Dynamic<?> $$4 = aln.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      eef $$6 = (eef)eef.a.parse($$5).getOrThrow();
      dhd $$7 = dhd.a($$4, $$1);
      eee.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.d());
      ewa $$10 = ewa.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new evt($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public evw.a b() throws evv {
      if (!Files.isDirectory(this.h)) {
         throw new evv(xk.c("selectWorld.load_folder_access"));
      } else {
         try {
            evw.a var3;
            try (Stream<Path> $$0 = Files.list(this.h)) {
               List<evw.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(evw.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new evw.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new evv(xk.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<evx>> a(evw.a $$0) {
      List<CompletableFuture<evx>> $$1 = new ArrayList<>($$0.a.size());

      for (evw.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = aza.b($$2.f());
            } catch (Exception var13) {
               c.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               azs.b();
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
         }, ae.g().a("loadLevelSummaries")));
      }

      return ae.f($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   static um c(Path $$0) throws IOException {
      return uz.a($$0, uv.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      um $$2 = c($$0);
      um $$3 = $$2.p("Data");
      int $$4 = vb.b($$3, -1);
      Dynamic<?> $$5 = bbi.a.a($$1, new Dynamic(va.a, $$3), $$4);
      $$5 = $$5.update("Player", $$2x -> bbi.b.a($$1, $$2x, $$4));
      return $$5.update("WorldGenSettings", $$2x -> bbi.r.a($$1, $$2x, $$4));
   }

   private evx a(evw.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<fbi> $$3 = this.k.a($$2);
               if (!$$3.isEmpty()) {
                  c.warn("{}", fbg.a($$2, $$3));
                  return new evx.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof um $$5) {
               um $$6 = $$5.p("Data");
               int $$7 = vb.b($$6, -1);
               Dynamic<?> $$8 = bbi.a.a(this.j, new Dynamic(va.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            c.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            c.error("Exception reading {}", $$2, var9);
         }
      }

      return new evx.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(evw.b $$0) {
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

   evx a(Dynamic<?> $$0, evw.b $$1, boolean $$2) {
      evy $$3 = evy.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new uy("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         dhw $$7 = a($$0);
         dhd $$8 = dhd.a($$0, $$7);
         csk $$9 = b($$0);
         boolean $$10 = csm.a($$9);
         return new evx($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static csk b(Dynamic<?> $$0) {
      Set<alp> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(alp::c).stream()).collect(Collectors.toSet());
      return csm.e.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static vj e(Path $$0) throws IOException {
      vv $$1 = new vv(new vs("Data", um.b, "Player"), new vs("Data", um.b, "WorldGenSettings"));
      uz.a($$0, $$1, uv.a(104857600L));
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

   public evw.c d(String $$0) throws IOException, fbg {
      Path $$1 = this.c($$0);
      List<fbi> $$2 = this.k.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new fbg($$1, $$2);
      } else {
         return new evw.c($$0, $$1);
      }
   }

   public evw.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new evw.c($$0, $$1);
   }

   public fbh e() {
      return this.k;
   }

   public static record a(List<evw.b> a) implements Iterable<evw.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<evw.b> iterator() {
         return this.a.iterator();
      }

      public List<evw.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {

      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(evu.e);
      }

      public Path c() {
         return this.a(evu.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(evu.e.a() + "_corrupted_" + $$0.format(evw.d));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(evu.e.a() + "_raw_" + $$0.format(evw.d));
      }

      public Path d() {
         return this.a(evu.g);
      }

      public Path e() {
         return this.a(evu.h);
      }

      public Path a(evu $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final aza b;
      final evw.b c;
      private final String d;
      private final Map<evu, Path> e = Maps.newHashMap();

      c(final String $$1, final Path $$2) throws IOException {
         this.d = $$1;
         this.c = new evw.b($$2);
         this.b = aza.a($$2);
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
            evw.c.warn("Failed to unlock access to level {}", this.f(), var2);
         }
      }

      public evw d() {
         return evw.this;
      }

      public evw.b e() {
         return this.c;
      }

      public String f() {
         return this.d;
      }

      public Path a(evu $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(alo<dgz> $$0) {
         return ebj.a($$0, this.c.f());
      }

      private void o() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public evz g() {
         this.o();
         return new evz(this, evw.this.j);
      }

      public evx a(Dynamic<?> $$0) {
         this.o();
         return evw.this.a($$0, this.c, false);
      }

      public Dynamic<?> h() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> i() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.o();
         return evw.a($$0 ? this.c.c() : this.c.b(), evw.this.j);
      }

      public void a(ke $$0, ewc $$1) {
         this.a($$0, $$1, null);
      }

      public void a(ke $$0, ewc $$1, @Nullable um $$2) {
         um $$3 = $$1.a($$0, $$2);
         um $$4 = new um();
         $$4.a("Data", $$3);
         this.a($$4);
      }

      private void a(um $$0) {
         Path $$1 = this.c.f();

         try {
            Path $$2 = Files.createTempFile($$1, "level", ".dat");
            uz.a($$0, $$2);
            Path $$3 = this.c.c();
            Path $$4 = this.c.b();
            ae.a($$4, $$2, $$3);
         } catch (Exception var6) {
            evw.c.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> j() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void k() throws IOException {
         this.o();
         final Path $$0 = this.c.e();
         evw.c.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            evw.c.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        evw.c.debug("Deleting {}", $$0);
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

               evw.c.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.a((Consumer<um>)($$1 -> $$1.a("LevelName", $$0.trim())));
      }

      public void b(String $$0) throws IOException {
         this.a((Consumer<um>)($$1 -> {
            $$1.a("LevelName", $$0.trim());
            $$1.r("Player");
         }));
      }

      private void a(Consumer<um> $$0) throws IOException {
         this.o();
         um $$1 = evw.c(this.c.b());
         $$0.accept($$1.p("Data"));
         this.a($$1);
      }

      public long l() throws IOException {
         this.o();
         String $$0 = LocalDateTime.now().format(evw.d) + "_" + this.d;
         Path $$1 = evw.this.d();

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
         return evw.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

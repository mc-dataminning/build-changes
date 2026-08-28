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

public class ezv {
   static final Logger c = LogUtils.getLogger();
   static final DateTimeFormatter d = ezq.a();
   public static final String a = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String b = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private static final int g = 67108864;
   private final Path h;
   private final Path i;
   final DataFixer j;
   private final ffg k;

   public ezv(Path $$0, Path $$1, ffg $$2, DataFixer $$3) {
      this.j = $$3;

      try {
         w.c($$0);
      } catch (IOException var6) {
         throw new UncheckedIOException(var6);
      }

      this.h = $$0;
      this.i = $$1;
      this.k = $$2;
   }

   public static ffg a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            ffg var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new ffg(ffi.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            c.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new ffg(e);
   }

   public static ezv b(Path $$0) {
      ffg $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new ezv($$0, $$0.resolve("../backups"), $$1, bbe.a());
   }

   public static dkv a(Dynamic<?> $$0) {
      return dkv.c.parse($$0).resultOrPartial(c::error).orElse(dkv.d);
   }

   public static amg.d a(Dynamic<?> $$0, aup $$1, boolean $$2) {
      return new amg.d($$1, a($$0), $$2, false);
   }

   public static ezs a(Dynamic<?> $$0, dkv $$1, js<efc> $$2, jh.a $$3) {
      Dynamic<?> $$4 = alg.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      ehz $$6 = (ehz)ehz.a.parse($$5).getOrThrow();
      dkb $$7 = dkb.a($$4, $$1);
      ehy.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.d());
      ezz $$10 = ezz.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new ezs($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public ezv.a b() throws ezu {
      if (!Files.isDirectory(this.h)) {
         throw new ezu(xa.c("selectWorld.load_folder_access"));
      } else {
         try {
            ezv.a var3;
            try (Stream<Path> $$0 = Files.list(this.h)) {
               List<ezv.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(ezv.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new ezv.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new ezu(xa.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<ezw>> a(ezv.a $$0) {
      List<CompletableFuture<ezw>> $$1 = new ArrayList<>($$0.a.size());

      for (ezv.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = ayt.b($$2.f());
            } catch (Exception var13) {
               c.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               azm.b();
               String $$5 = "Ran out of memory trying to read summary of world folder \"" + $$2.a() + "\"";
               c.error(LogUtils.FATAL_MARKER, $$5);
               OutOfMemoryError $$6 = new OutOfMemoryError("Ran out of memory reading level data");
               $$6.initCause(var12);
               p $$7 = p.a($$6, $$5);
               q $$8 = $$7.a("World details");
               $$8.a("Folder Name", $$2.a());

               try {
                  long $$9 = Files.size($$2.b());
                  $$8.a("level.dat size", $$9);
               } catch (IOException var11) {
                  $$8.a("level.dat size", (Throwable)var11);
               }

               throw new aa($$7);
            }
         }, ag.h().a("loadLevelSummaries")));
      }

      return ag.f($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int f() {
      return 19133;
   }

   static tz c(Path $$0) throws IOException {
      return um.a($$0, ui.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      tz $$2 = c($$0);
      tz $$3 = $$2.n("Data");
      int $$4 = uo.b($$3, -1);
      Dynamic<?> $$5 = bbd.a.a($$1, new Dynamic(un.a, $$3), $$4);
      $$5 = $$5.update("Player", $$2x -> bbd.b.a($$1, $$2x, $$4));
      return $$5.update("WorldGenSettings", $$2x -> bbd.r.a($$1, $$2x, $$4));
   }

   private ezw a(ezv.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<ffh> $$3 = this.k.a($$2);
               if (!$$3.isEmpty()) {
                  c.warn("{}", fff.a($$2, $$3));
                  return new ezw.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof tz $$5) {
               tz $$6 = $$5.n("Data");
               int $$7 = uo.b($$6, -1);
               Dynamic<?> $$8 = bbd.a.a(this.j, new Dynamic(un.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            c.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            c.error("Exception reading {}", $$2, var9);
         }
      }

      return new ezw.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(ezv.b $$0) {
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

   ezw a(Dynamic<?> $$0, ezv.b $$1, boolean $$2) {
      ezx $$3 = ezx.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new ul("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         dkv $$7 = a($$0);
         dkb $$8 = dkb.a($$0, $$7);
         cvh $$9 = b($$0);
         boolean $$10 = cvj.a($$9);
         return new ezw($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static cvh b(Dynamic<?> $$0) {
      Set<ali> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(ali::c).stream()).collect(Collectors.toSet());
      return cvj.e.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static uy e(Path $$0) throws IOException {
      vk $$1 = new vk(new vh("Data", tz.b, "Player"), new vh("Data", tz.b, "WorldGenSettings"));
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

   public ezv.c d(String $$0) throws IOException, fff {
      Path $$1 = this.c($$0);
      List<ffh> $$2 = this.k.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new fff($$1, $$2);
      } else {
         return new ezv.c($$0, $$1);
      }
   }

   public ezv.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new ezv.c($$0, $$1);
   }

   public ffg e() {
      return this.k;
   }

   public static record a(List<ezv.b> a) implements Iterable<ezv.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<ezv.b> iterator() {
         return this.a.iterator();
      }

      public List<ezv.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {

      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(ezt.e);
      }

      public Path c() {
         return this.a(ezt.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(ezt.e.a() + "_corrupted_" + $$0.format(ezv.d));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(ezt.e.a() + "_raw_" + $$0.format(ezv.d));
      }

      public Path d() {
         return this.a(ezt.g);
      }

      public Path e() {
         return this.a(ezt.h);
      }

      public Path a(ezt $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final ayt b;
      final ezv.b c;
      private final String d;
      private final Map<ezt, Path> e = Maps.newHashMap();

      c(final String $$1, final Path $$2) throws IOException {
         this.d = $$1;
         this.c = new ezv.b($$2);
         this.b = ayt.a($$2);
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
            ezv.c.warn("Failed to unlock access to level {}", this.f(), var2);
         }
      }

      public ezv d() {
         return ezv.this;
      }

      public ezv.b e() {
         return this.c;
      }

      public String f() {
         return this.d;
      }

      public Path a(ezt $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(alh<djx> $$0) {
         return efb.a($$0, this.c.f());
      }

      private void o() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public ezy g() {
         this.o();
         return new ezy(this, ezv.this.j);
      }

      public ezw a(Dynamic<?> $$0) {
         this.o();
         return ezv.this.a($$0, this.c, false);
      }

      public Dynamic<?> h() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> i() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.o();
         return ezv.a($$0 ? this.c.c() : this.c.b(), ezv.this.j);
      }

      public void a(jt $$0, fab $$1) {
         this.a($$0, $$1, null);
      }

      public void a(jt $$0, fab $$1, @Nullable tz $$2) {
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
            ag.a($$4, $$2, $$3);
         } catch (Exception var6) {
            ezv.c.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> j() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void k() throws IOException {
         this.o();
         final Path $$0 = this.c.e();
         ezv.c.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            ezv.c.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        ezv.c.debug("Deleting {}", $$0);
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

               ezv.c.warn("Failed to delete {}", this.c.f(), var6);

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
         tz $$1 = ezv.c(this.c.b());
         $$0.accept($$1.n("Data"));
         this.a($$1);
      }

      public long l() throws IOException {
         this.o();
         String $$0 = LocalDateTime.now().format(ezv.d) + "_" + this.d;
         Path $$1 = ezv.this.d();

         try {
            w.c($$1);
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }

         Path $$3 = $$1.resolve(w.a($$1, $$0, ".zip"));

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
         return ag.a(this.c.b(), this.c.c(), this.c.a(LocalDateTime.now()), true);
      }

      @Nullable
      public Instant a(boolean $$0) {
         return ezv.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

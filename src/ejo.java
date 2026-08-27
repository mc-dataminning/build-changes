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

public class ejo {
   static final Logger b = LogUtils.getLogger();
   static final DateTimeFormatter c = ejj.a();
   private static final String d = "Data";
   private static final PathMatcher e = $$0 -> false;
   public static final String a = "allowed_symlinks.txt";
   private static final int f = 104857600;
   private final Path g;
   private final Path h;
   final DataFixer i;
   private final eol j;

   public ejo(Path $$0, Path $$1, eol $$2, DataFixer $$3) {
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

   public static eol a(Path $$0) {
      if (Files.exists($$0)) {
         try {
            eol var2;
            try (BufferedReader $$1 = Files.newBufferedReader($$0)) {
               var2 = new eol(eon.a($$1));
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", var6);
         }
      }

      return new eol(e);
   }

   public static ejo b(Path $$0) {
      eol $$1 = a($$0.resolve("allowed_symlinks.txt"));
      return new ejo($$0, $$0.resolve("../backups"), $$1, axt.a());
   }

   public static cwy a(Dynamic<?> $$0) {
      return cwy.b.parse($$0).resultOrPartial(b::error).orElse(cwy.c);
   }

   public static ajx.d a(Dynamic<?> $$0, arq $$1, boolean $$2) {
      return new ajx.d($$1, a($$0), $$2, false);
   }

   public static ejl a(Dynamic<?> $$0, cwy $$1, ix<dpr> $$2, iy.b $$3) {
      Dynamic<?> $$4 = aja.a($$0, $$3);
      Dynamic<?> $$5 = $$4.get("WorldGenSettings").orElseEmptyMap();
      dsm $$6 = (dsm)dsm.a.parse($$5).getOrThrow(false, ac.a("WorldGenSettings: ", b::error));
      cwi $$7 = cwi.a($$4, $$1);
      dsl.b $$8 = $$6.b().a($$2);
      Lifecycle $$9 = $$8.a().add($$3.e());
      ejs $$10 = ejs.a($$4, $$7, $$8.d(), $$6.a(), $$9);
      return new ejl($$10, $$8);
   }

   public String a() {
      return "Anvil";
   }

   public ejo.a b() throws ejn {
      if (!Files.isDirectory(this.g)) {
         throw new ejn(vs.c("selectWorld.load_folder_access"));
      } else {
         try {
            ejo.a var3;
            try (Stream<Path> $$0 = Files.list(this.g)) {
               List<ejo.b> $$1 = $$0.filter($$0x -> Files.isDirectory($$0x))
                  .map(ejo.b::new)
                  .filter($$0x -> Files.isRegularFile($$0x.b()) || Files.isRegularFile($$0x.c()))
                  .toList();
               var3 = new ejo.a($$1);
            }

            return var3;
         } catch (IOException var6) {
            throw new ejn(vs.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<ejp>> a(ejo.a $$0) {
      List<CompletableFuture<ejp>> $$1 = new ArrayList<>($$0.a.size());

      for (ejo.b $$2 : $$0.a) {
         $$1.add(CompletableFuture.supplyAsync(() -> {
            boolean $$1x;
            try {
               $$1x = avs.b($$2.f());
            } catch (Exception var13) {
               b.warn("Failed to read {} lock", $$2.f(), var13);
               return null;
            }

            try {
               return this.a($$2, $$1x);
            } catch (OutOfMemoryError var12) {
               awk.b();
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

   static sy c(Path $$0) throws IOException {
      return tl.a($$0, th.a(104857600L));
   }

   static Dynamic<?> a(Path $$0, DataFixer $$1) throws IOException {
      sy $$2 = c($$0);
      sy $$3 = $$2.p("Data");
      int $$4 = tn.b($$3, -1);
      Dynamic<?> $$5 = axs.a.a($$1, new Dynamic(tm.a, $$3), $$4);
      Dynamic<?> $$6 = $$5.get("Player").orElseEmptyMap();
      Dynamic<?> $$7 = axs.b.a($$1, $$6, $$4);
      $$5 = $$5.set("Player", $$7);
      Dynamic<?> $$8 = $$5.get("WorldGenSettings").orElseEmptyMap();
      Dynamic<?> $$9 = axs.r.a($$1, $$8, $$4);
      return $$5.set("WorldGenSettings", $$9);
   }

   private ejp a(ejo.b $$0, boolean $$1) {
      Path $$2 = $$0.b();
      if (Files.exists($$2)) {
         try {
            if (Files.isSymbolicLink($$2)) {
               List<eom> $$3 = this.j.a($$2);
               if (!$$3.isEmpty()) {
                  b.warn("{}", eok.a($$2, $$3));
                  return new ejp.c($$0.a(), $$0.d());
               }
            }

            if (e($$2) instanceof sy $$5) {
               sy $$6 = $$5.p("Data");
               int $$7 = tn.b($$6, -1);
               Dynamic<?> $$8 = axs.a.a(this.i, new Dynamic(tm.a, $$6), $$7);
               return this.a($$8, $$0, $$1);
            }

            b.warn("Invalid root tag in {}", $$2);
         } catch (Exception var9) {
            b.error("Exception reading {}", $$2, var9);
         }
      }

      return new ejp.b($$0.a(), $$0.d(), a($$0));
   }

   private static long a(ejo.b $$0) {
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

   ejp a(Dynamic<?> $$0, ejo.b $$1, boolean $$2) {
      ejq $$3 = ejq.a($$0);
      int $$4 = $$3.a();
      if ($$4 != 19132 && $$4 != 19133) {
         throw new tk("Unknown data version: " + Integer.toHexString($$4));
      } else {
         boolean $$5 = $$4 != this.f();
         Path $$6 = $$1.d();
         cwy $$7 = a($$0);
         cwi $$8 = cwi.a($$0, $$7);
         ckl $$9 = b($$0);
         boolean $$10 = ckn.a($$9);
         return new ejp($$8, $$3, $$1.a(), $$5, $$2, $$10, $$6);
      }
   }

   private static ckl b(Dynamic<?> $$0) {
      Set<ajc> $$1 = $$0.get("enabled_features").asStream().flatMap($$0x -> $$0x.asString().result().map(ajc::a).stream()).collect(Collectors.toSet());
      return ckn.e.a($$1, $$0x -> {
      });
   }

   @Nullable
   private static tv e(Path $$0) throws IOException {
      uh $$1 = new uh(new ue("Data", sy.b, "Player"), new ue("Data", sy.b, "WorldGenSettings"));
      tl.a($$0, $$1, th.a(104857600L));
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

   public ejo.c d(String $$0) throws IOException, eok {
      Path $$1 = this.c($$0);
      List<eom> $$2 = this.j.a($$1, true);
      if (!$$2.isEmpty()) {
         throw new eok($$1, $$2);
      } else {
         return new ejo.c($$0, $$1);
      }
   }

   public ejo.c e(String $$0) throws IOException {
      Path $$1 = this.c($$0);
      return new ejo.c($$0, $$1);
   }

   public eol e() {
      return this.j;
   }

   public static record a(List<ejo.b> a) implements Iterable<ejo.b> {

      public boolean a() {
         return this.a.isEmpty();
      }

      @Override
      public Iterator<ejo.b> iterator() {
         return this.a.iterator();
      }

      public List<ejo.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {
      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(ejm.e);
      }

      public Path c() {
         return this.a(ejm.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(ejm.e.a() + "_corrupted_" + $$0.format(ejo.c));
      }

      public Path b(LocalDateTime $$0) {
         return this.a.resolve(ejm.e.a() + "_raw_" + $$0.format(ejo.c));
      }

      public Path d() {
         return this.a(ejm.g);
      }

      public Path e() {
         return this.a(ejm.h);
      }

      public Path a(ejm $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final avs b;
      final ejo.b c;
      private final String d;
      private final Map<ejm, Path> e = Maps.newHashMap();

      c(String $$1, Path $$2) throws IOException {
         this.d = $$1;
         this.c = new ejo.b($$2);
         this.b = avs.a($$2);
      }

      public void a() {
         try {
            this.close();
         } catch (IOException var2) {
            ejo.b.warn("Failed to unlock access to level {}", this.d(), var2);
         }
      }

      public ejo b() {
         return ejo.this;
      }

      public ejo.b c() {
         return this.c;
      }

      public String d() {
         return this.d;
      }

      public Path a(ejm $$0) {
         return this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(ajb<cwe> $$0) {
         return dpq.a($$0, this.c.f());
      }

      private void m() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public ejr e() {
         this.m();
         return new ejr(this, ejo.this.i);
      }

      public ejp a(Dynamic<?> $$0) {
         this.m();
         return ejo.this.a($$0, this.c, false);
      }

      public Dynamic<?> f() throws IOException {
         return this.b(false);
      }

      public Dynamic<?> g() throws IOException {
         return this.b(true);
      }

      private Dynamic<?> b(boolean $$0) throws IOException {
         this.m();
         return ejo.a($$0 ? this.c.c() : this.c.b(), ejo.this.i);
      }

      public void a(iy $$0, eju $$1) {
         this.a($$0, $$1, null);
      }

      public void a(iy $$0, eju $$1, @Nullable sy $$2) {
         sy $$3 = $$1.a($$0, $$2);
         sy $$4 = new sy();
         $$4.a("Data", $$3);
         this.a($$4);
      }

      private void a(sy $$0) {
         Path $$1 = this.c.f();

         try {
            Path $$2 = Files.createTempFile($$1, "level", ".dat");
            tl.a($$0, $$2);
            Path $$3 = this.c.c();
            Path $$4 = this.c.b();
            ac.a($$4, $$2, $$3);
         } catch (Exception var6) {
            ejo.b.error("Failed to save level {}", $$1, var6);
         }
      }

      public Optional<Path> h() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void i() throws IOException {
         this.m();
         final Path $$0 = this.c.e();
         ejo.b.info("Deleting level {}", this.d);

         for (int $$1 = 1; $$1 <= 5; $$1++) {
            ejo.b.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        ejo.b.debug("Deleting {}", $$0);
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

               ejo.b.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }
      }

      public void a(String $$0) throws IOException {
         this.a((Consumer<sy>)($$1 -> $$1.a("LevelName", $$0.trim())));
      }

      public void b(String $$0) throws IOException {
         this.a((Consumer<sy>)($$1 -> {
            $$1.a("LevelName", $$0.trim());
            $$1.r("Player");
         }));
      }

      private void a(Consumer<sy> $$0) throws IOException {
         this.m();
         sy $$1 = ejo.c(this.c.b());
         $$0.accept($$1.p("Data"));
         this.a($$1);
      }

      public long j() throws IOException {
         this.m();
         String $$0 = LocalDateTime.now().format(ejo.c) + "_" + this.d;
         Path $$1 = ejo.this.d();

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
         return ejo.d($$0 ? this.c.c() : this.c.b());
      }
   }
}

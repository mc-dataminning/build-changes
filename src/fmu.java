import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class fmu extends fjo {
   static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("pack.available.title");
   private static final wg c = wg.c("pack.selected.title");
   private static final wg d = wg.c("pack.openFolder");
   private static final int o = 200;
   private static final wg p = wg.c("pack.dropInfo").a(n.h);
   private static final wg q = wg.c("pack.folderInfo");
   private static final int r = 20;
   private static final ajt s = new ajt("textures/misc/unknown_pack.png");
   private final fhc u = new fhc(this);
   private final fmt v;
   @Nullable
   private fmu.a w;
   private long x;
   private fmv y;
   private fmv z;
   private final Path A;
   private fdp B;
   private final Map<String, ajt> C = Maps.newHashMap();

   public fmu(asn $$0, Consumer<asn> $$1, Path $$2, wg $$3) {
      super($$3);
      this.v = new fmt(this::D, this::a, $$0, $$1);
      this.A = $$2;
      this.w = fmu.a.a($$2);
   }

   @Override
   public void d() {
      this.v.c();
      this.C();
   }

   private void C() {
      if (this.w != null) {
         try {
            this.w.close();
            this.w = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aN_() {
      fhg $$0 = this.u.a(fhg.d().a(5));
      $$0.c().b();
      $$0.a(new few(this.n(), this.m));
      $$0.a(new few(p, this.m));
      this.y = this.c(new fmv(this.j, this, 200, this.l - 66, b));
      this.z = this.c(new fmv(this.j, this, 200, this.l - 66, c));
      fhg $$1 = this.u.b(fhg.e().a(8));
      $$1.a(fdp.a(d, $$0x -> ac.j().a(this.A.toUri())).a(ffa.a(q)).a());
      this.B = $$1.a(fdp.a(wf.d, $$0x -> this.d()).a());
      this.E();
      this.u.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      this.y.a(200, this.u);
      this.y.m(this.k / 2 - 15 - 200);
      this.z.a(200, this.u);
      this.z.m(this.k / 2 + 15);
   }

   @Override
   public void e() {
      if (this.w != null) {
         try {
            if (this.w.a()) {
               this.x = 20L;
            }
         } catch (IOException var2) {
            a.warn("Failed to poll for directory {} changes, stopping", this.A);
            this.C();
         }
      }

      if (this.x > 0L && --this.x == 0L) {
         this.E();
      }
   }

   private void D() {
      this.a(this.z, this.v.b());
      this.a(this.y, this.v.a());
      this.B.j = !this.z.aF_().isEmpty();
   }

   private void a(fmv $$0, Stream<fmt.a> $$1) {
      $$0.aF_().clear();
      fmv.a $$2 = $$0.h();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fmv.a $$3x = new fmv.a(this.j, $$0, $$2x);
         $$0.aF_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fmv $$0) {
      fmv $$1 = this.z == $$0 ? this.y : this.z;
      this.a(fcz.a($$1.i(), $$1, this));
   }

   public void m() {
      this.z.a(null);
      this.y.a(null);
   }

   private void E() {
      this.v.d();
      this.D();
      this.x = 0L;
      this.C.clear();
   }

   protected static void a(fbp $$0, List<Path> $$1, Path $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      $$1.forEach($$2x -> {
         try (Stream<Path> $$3x = Files.walk($$2x)) {
            $$3x.forEach($$3xx -> {
               try {
                  ac.b($$2x.getParent(), $$2, $$3xx);
               } catch (IOException var5) {
                  a.warn("Failed to copy datapack file  from {} to {}", new Object[]{$$3xx, $$2, var5});
                  $$3.setTrue();
               }
            });
         } catch (IOException var8) {
            a.warn("Failed to copy datapack file from {} to {}", $$2x, $$2);
            $$3.setTrue();
         }
      });
      if ($$3.isTrue()) {
         ffx.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.j.a(new fig($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            asm<Path> $$4 = new asm<Path>(this.j.be()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<err> $$5 = new ArrayList<>();

            for (Path $$6 : $$0) {
               try {
                  Path $$7 = $$4.a($$6, $$5);
                  if ($$7 == null) {
                     a.warn("Path {} does not seem like pack", $$6);
                  } else {
                     $$2.add($$7);
                     $$3.remove($$7);
                  }
               } catch (IOException var10) {
                  a.warn("Failed to check {} for packs", $$6, var10);
               }
            }

            if (!$$5.isEmpty()) {
               this.j.a(fjd.b(() -> this.j.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.j, $$2, this.A);
               this.E();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.j.a(new fia(() -> this.j.a(this), wg.c("pack.dropRejected.title"), wg.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.j.a(this);
      }, wg.c("pack.dropConfirm"), wg.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private ajt a(glk $$0, ask $$1) {
      try {
         ajt var9;
         try (aro $$2 = $$1.f()) {
            asu<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return s;
            }

            String $$4 = $$1.g();
            ajt $$5 = new ajt("minecraft", "pack/" + ac.a($$4, ajt::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               evj $$7 = evj.a($$6);
               $$0.a($$5, new gkw($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return s;
      }
   }

   private ajt a(ask $$0) {
      return this.C.computeIfAbsent($$0.g(), $$1 -> this.a(this.j.aa(), $$0));
   }

   static class a implements AutoCloseable {
      private final WatchService a;
      private final Path b;

      public a(Path $$0) throws IOException {
         this.b = $$0;
         this.a = $$0.getFileSystem().newWatchService();

         try {
            this.b($$0);

            try (DirectoryStream<Path> $$1 = Files.newDirectoryStream($$0)) {
               for (Path $$2 : $$1) {
                  if (Files.isDirectory($$2, LinkOption.NOFOLLOW_LINKS)) {
                     this.b($$2);
                  }
               }
            }
         } catch (Exception var7) {
            this.a.close();
            throw var7;
         }
      }

      @Nullable
      public static fmu.a a(Path $$0) {
         try {
            return new fmu.a($$0);
         } catch (IOException var2) {
            fmu.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
            return null;
         }
      }

      private void b(Path $$0) throws IOException {
         $$0.register(this.a, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
      }

      public boolean a() throws IOException {
         boolean $$0 = false;

         WatchKey $$1;
         while (($$1 = this.a.poll()) != null) {
            for (WatchEvent<?> $$3 : $$1.pollEvents()) {
               $$0 = true;
               if ($$1.watchable() == this.b && $$3.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                  Path $$4 = this.b.resolve((Path)$$3.context());
                  if (Files.isDirectory($$4, LinkOption.NOFOLLOW_LINKS)) {
                     this.b($$4);
                  }
               }
            }

            $$1.reset();
         }

         return $$0;
      }

      @Override
      public void close() throws IOException {
         this.a.close();
      }
   }
}

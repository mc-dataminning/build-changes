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

public class fqe extends fmy {
   static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("pack.available.title");
   private static final xl c = xl.c("pack.selected.title");
   private static final xl d = xl.c("pack.openFolder");
   private static final int r = 200;
   private static final xl s = xl.c("pack.dropInfo").a(n.h);
   private static final xl u = xl.c("pack.folderInfo");
   private static final int v = 20;
   private static final alb w = new alb("textures/misc/unknown_pack.png");
   private final fkm x = new fkm(this);
   private final fqd y;
   @Nullable
   private fqe.a z;
   private long A;
   private fqf B;
   private fqf C;
   private final Path D;
   private fgz E;
   private final Map<String, alb> F = Maps.newHashMap();

   public fqe(atw $$0, Consumer<atw> $$1, Path $$2, xl $$3) {
      super($$3);
      this.y = new fqd(this::D, this::a, $$0, $$1);
      this.D = $$2;
      this.z = fqe.a.a($$2);
   }

   @Override
   public void d() {
      this.y.c();
      this.C();
   }

   private void C() {
      if (this.z != null) {
         try {
            this.z.close();
            this.z = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aN_() {
      fkq $$0 = this.x.a(fkq.d().a(5));
      $$0.c().b();
      $$0.a(new fig(this.n(), this.p));
      $$0.a(new fig(s, this.p));
      this.B = this.c(new fqf(this.m, this, 200, this.o - 66, b));
      this.C = this.c(new fqf(this.m, this, 200, this.o - 66, c));
      fkq $$1 = this.x.b(fkq.e().a(8));
      $$1.a(fgz.a(d, $$0x -> ac.k().a(this.D.toUri())).a(fik.a(u)).a());
      this.E = $$1.a(fgz.a(xk.d, $$0x -> this.d()).a());
      this.E();
      this.x.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      this.B.a(200, this.x);
      this.B.m(this.n / 2 - 15 - 200);
      this.C.a(200, this.x);
      this.C.m(this.n / 2 + 15);
   }

   @Override
   public void e() {
      if (this.z != null) {
         try {
            if (this.z.a()) {
               this.A = 20L;
            }
         } catch (IOException var2) {
            a.warn("Failed to poll for directory {} changes, stopping", this.D);
            this.C();
         }
      }

      if (this.A > 0L && --this.A == 0L) {
         this.E();
      }
   }

   private void D() {
      this.a(this.C, this.y.b());
      this.a(this.B, this.y.a());
      this.E.j = !this.C.aF_().isEmpty();
   }

   private void a(fqf $$0, Stream<fqd.a> $$1) {
      $$0.aF_().clear();
      fqf.a $$2 = $$0.h();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fqf.a $$3x = new fqf.a(this.m, $$0, $$2x);
         $$0.aF_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fqf $$0) {
      fqf $$1 = this.C == $$0 ? this.B : this.C;
      this.a(fgj.a($$1.i(), $$1, this));
   }

   public void m() {
      this.C.a(null);
      this.B.a(null);
   }

   private void E() {
      this.y.d();
      this.D();
      this.A = 0L;
      this.F.clear();
   }

   protected static void a(ffa $$0, List<Path> $$1, Path $$2) {
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
         fjh.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.m.a(new flq($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            atv<Path> $$4 = new atv<Path>(this.m.bd()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<evd> $$5 = new ArrayList<>();

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
               this.m.a(fmn.b(() -> this.m.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.m, $$2, this.D);
               this.E();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.m.a(new flk(() -> this.m.a(this), xl.c("pack.dropRejected.title"), xl.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.m.a(this);
      }, xl.c("pack.dropConfirm"), xl.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private alb a(gov $$0, att $$1) {
      try {
         alb var9;
         try (asx $$2 = $$1.f()) {
            aud<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return w;
            }

            String $$4 = $$1.g();
            alb $$5 = new alb("minecraft", "pack/" + ac.a($$4, alb::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               eyu $$7 = eyu.a($$6);
               $$0.a($$5, new goh($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return w;
      }
   }

   private alb a(att $$0) {
      return this.F.computeIfAbsent($$0.g(), $$1 -> this.a(this.m.aa(), $$0));
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
      public static fqe.a a(Path $$0) {
         try {
            return new fqe.a($$0);
         } catch (IOException var2) {
            fqe.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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

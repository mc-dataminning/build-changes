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

public class fqz extends fnl {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("pack.available.title");
   private static final wu c = wu.c("pack.selected.title");
   private static final wu q = wu.c("pack.openFolder");
   private static final int r = 200;
   private static final wu s = wu.c("pack.dropInfo").a(n.h);
   private static final wu u = wu.c("pack.folderInfo");
   private static final int v = 20;
   private static final akk w = new akk("textures/misc/unknown_pack.png");
   private final flh x = new flh(this);
   private final fqy y;
   @Nullable
   private fqz.a z;
   private long A;
   private fra B;
   private fra C;
   private final Path D;
   private fhu E;
   private final Map<String, akk> F = Maps.newHashMap();

   public fqz(ath $$0, Consumer<ath> $$1, Path $$2, wu $$3) {
      super($$3);
      this.y = new fqy(this::E, this::a, $$0, $$1);
      this.D = $$2;
      this.z = fqz.a.a($$2);
   }

   @Override
   public void d() {
      this.y.c();
      this.D();
   }

   private void D() {
      if (this.z != null) {
         try {
            this.z.close();
            this.z = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aP_() {
      fll $$0 = this.x.a(fll.d().a(5));
      $$0.c().b();
      $$0.a(new fjb(this.n(), this.o));
      $$0.a(new fjb(s, this.o));
      this.B = this.c(new fra(this.l, this, 200, this.n - 66, b));
      this.C = this.c(new fra(this.l, this, 200, this.n - 66, c));
      fll $$1 = this.x.b(fll.e().a(8));
      $$1.a(fhu.a(q, $$0x -> ac.k().a(this.D.toUri())).a(fjf.a(u)).a());
      this.E = $$1.a(fhu.a(wt.d, $$0x -> this.d()).a());
      this.F();
      this.x.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      this.B.a(200, this.x);
      this.B.m(this.m / 2 - 15 - 200);
      this.C.a(200, this.x);
      this.C.m(this.m / 2 + 15);
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
            this.D();
         }
      }

      if (this.A > 0L && --this.A == 0L) {
         this.F();
      }
   }

   private void E() {
      this.a(this.C, this.y.b());
      this.a(this.B, this.y.a());
      this.E.j = !this.C.aG_().isEmpty();
   }

   private void a(fra $$0, Stream<fqy.a> $$1) {
      $$0.aG_().clear();
      fra.a $$2 = $$0.h();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fra.a $$3x = new fra.a(this.l, $$0, $$2x);
         $$0.aG_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fra $$0) {
      fra $$1 = this.C == $$0 ? this.B : this.C;
      this.a(fhe.a($$1.i(), $$1, this));
   }

   public void m() {
      this.C.a(null);
      this.B.a(null);
   }

   private void F() {
      this.y.d();
      this.E();
      this.A = 0L;
      this.F.clear();
   }

   protected static void a(ffw $$0, List<Path> $$1, Path $$2) {
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
         fkc.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.l.a(new fmj($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            atg<Path> $$4 = new atg<Path>(this.l.bb()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<evy> $$5 = new ArrayList<>();

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
               this.l.a(fnd.b(() -> this.l.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.l, $$2, this.D);
               this.F();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.l.a(new fme(() -> this.l.a(this), wu.c("pack.dropRejected.title"), wu.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.l.a(this);
      }, wu.c("pack.dropConfirm"), wu.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private akk a(gpr $$0, ate $$1) {
      try {
         akk var9;
         try (asi $$2 = $$1.f()) {
            ato<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return w;
            }

            String $$4 = $$1.g();
            akk $$5 = new akk("minecraft", "pack/" + ac.a($$4, akk::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               ezp $$7 = ezp.a($$6);
               $$0.a($$5, new gpd($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return w;
      }
   }

   private akk a(ate $$0) {
      return this.F.computeIfAbsent($$0.g(), $$1 -> this.a(this.l.aa(), $$0));
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
      public static fqz.a a(Path $$0) {
         try {
            return new fqz.a($$0);
         } catch (IOException var2) {
            fqz.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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

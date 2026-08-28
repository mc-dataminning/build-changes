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

public class fqj extends fnd {
   static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("pack.available.title");
   private static final xp c = xp.c("pack.selected.title");
   private static final xp d = xp.c("pack.openFolder");
   private static final int r = 200;
   private static final xp s = xp.c("pack.dropInfo").a(n.h);
   private static final xp u = xp.c("pack.folderInfo");
   private static final int v = 20;
   private static final alf w = new alf("textures/misc/unknown_pack.png");
   private final fkr x = new fkr(this);
   private final fqi y;
   @Nullable
   private fqj.a z;
   private long A;
   private fqk B;
   private fqk C;
   private final Path D;
   private fhe E;
   private final Map<String, alf> F = Maps.newHashMap();

   public fqj(aua $$0, Consumer<aua> $$1, Path $$2, xp $$3) {
      super($$3);
      this.y = new fqi(this::F, this::a, $$0, $$1);
      this.D = $$2;
      this.z = fqj.a.a($$2);
   }

   @Override
   public void d() {
      this.y.c();
      this.E();
   }

   private void E() {
      if (this.z != null) {
         try {
            this.z.close();
            this.z = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aM_() {
      fkv $$0 = this.x.a(fkv.d().a(5));
      $$0.c().b();
      $$0.a(new fil(this.n(), this.p));
      $$0.a(new fil(s, this.p));
      this.B = this.c(new fqk(this.m, this, 200, this.o - 66, b));
      this.C = this.c(new fqk(this.m, this, 200, this.o - 66, c));
      fkv $$1 = this.x.b(fkv.e().a(8));
      $$1.a(fhe.a(d, $$0x -> ac.k().a(this.D.toUri())).a(fip.a(u)).a());
      this.E = $$1.a(fhe.a(xo.d, $$0x -> this.d()).a());
      this.I();
      this.x.a($$1x -> {
         fhc var10000 = this.c($$1x);
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
            this.E();
         }
      }

      if (this.A > 0L && --this.A == 0L) {
         this.I();
      }
   }

   private void F() {
      this.a(this.C, this.y.b());
      this.a(this.B, this.y.a());
      this.E.j = !this.C.aD_().isEmpty();
   }

   private void a(fqk $$0, Stream<fqi.a> $$1) {
      $$0.aD_().clear();
      fqk.a $$2 = $$0.h();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fqk.a $$3x = new fqk.a(this.m, $$0, $$2x);
         $$0.aD_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fqk $$0) {
      fqk $$1 = this.C == $$0 ? this.B : this.C;
      this.a(fgo.a($$1.i(), $$1, this));
   }

   public void m() {
      this.C.a(null);
      this.B.a(null);
   }

   private void I() {
      this.y.d();
      this.F();
      this.A = 0L;
      this.F.clear();
   }

   protected static void a(fff $$0, List<Path> $$1, Path $$2) {
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
         fjm.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.m.a(new flv($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            atz<Path> $$4 = new atz<Path>(this.m.bd()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<evi> $$5 = new ArrayList<>();

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
               this.m.a(fms.b(() -> this.m.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.m, $$2, this.D);
               this.I();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.m.a(new flp(() -> this.m.a(this), xp.c("pack.dropRejected.title"), xp.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.m.a(this);
      }, xp.c("pack.dropConfirm"), xp.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private alf a(gpa $$0, atx $$1) {
      try {
         alf var9;
         try (atb $$2 = $$1.f()) {
            auh<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return w;
            }

            String $$4 = $$1.g();
            alf $$5 = new alf("minecraft", "pack/" + ac.a($$4, alf::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               eyz $$7 = eyz.a($$6);
               $$0.a($$5, new gom($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return w;
      }
   }

   private alf a(atx $$0) {
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
      public static fqj.a a(Path $$0) {
         try {
            return new fqj.a($$0);
         } catch (IOException var2) {
            fqj.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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

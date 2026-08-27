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

public class fry extends fon {
   static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("pack.available.title");
   private static final xe c = xe.c("pack.selected.title");
   private static final xe d = xe.c("pack.openFolder");
   private static final int r = 200;
   private static final xe s = xe.c("pack.dropInfo").a(n.h);
   private static final xe u = xe.c("pack.folderInfo");
   private static final int v = 20;
   private static final akt w = new akt("textures/misc/unknown_pack.png");
   private final fma x = new fma(this);
   private final frx y;
   @Nullable
   private fry.a z;
   private long A;
   private frz B;
   private frz C;
   private final Path D;
   private fin E;
   private final Map<String, akt> F = Maps.newHashMap();

   public fry(ato $$0, Consumer<ato> $$1, Path $$2, xe $$3) {
      super($$3);
      this.y = new frx(this::D, this::a, $$0, $$1);
      this.D = $$2;
      this.z = fry.a.a($$2);
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
      fme $$0 = this.x.a(fme.d().a(5));
      $$0.c().b();
      $$0.a(new fju(this.n(), this.p));
      $$0.a(new fju(s, this.p));
      this.B = this.c(new frz(this.m, this, 200, this.o - 66, b));
      this.C = this.c(new frz(this.m, this, 200, this.o - 66, c));
      fme $$1 = this.x.b(fme.e().a(8));
      $$1.a(fin.a(d, $$0x -> ad.j().a(this.D.toUri())).a(fjy.a(u)).a());
      this.E = $$1.a(fin.a(xd.d, $$0x -> this.d()).a());
      this.E();
      this.x.a($$1x -> {
         fil var10000 = this.c($$1x);
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
      this.E.j = !this.C.aE_().isEmpty();
   }

   private void a(frz $$0, Stream<frx.a> $$1) {
      $$0.aE_().clear();
      frz.a $$2 = $$0.h();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         frz.a $$3x = new frz.a(this.m, $$0, $$2x);
         $$0.aE_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(frz $$0) {
      frz $$1 = this.C == $$0 ? this.B : this.C;
      this.a(fhx.a($$1.i(), $$1, this));
   }

   public void B() {
      this.C.a(null);
      this.B.a(null);
   }

   private void E() {
      this.y.d();
      this.D();
      this.A = 0L;
      this.F.clear();
   }

   protected static void a(fgj $$0, List<Path> $$1, Path $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      $$1.forEach($$2x -> {
         try (Stream<Path> $$3x = Files.walk($$2x)) {
            $$3x.forEach($$3xx -> {
               try {
                  ad.b($$2x.getParent(), $$2, $$3xx);
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
         fkv.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.m.a(new fne($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            atn<Path> $$4 = new atn<Path>(this.m.bf()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<ewl> $$5 = new ArrayList<>();

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
               this.m.a(fob.b(() -> this.m.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.m, $$2, this.D);
               this.E();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.m.a(new fmy(() -> this.m.a(this), xe.c("pack.dropRejected.title"), xe.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.m.a(this);
      }, xe.c("pack.dropConfirm"), xe.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private akt a(gqz $$0, atl $$1) {
      try {
         akt var9;
         try (asp $$2 = $$1.f()) {
            atv<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return w;
            }

            String $$4 = $$1.g();
            akt $$5 = new akt("minecraft", "pack/" + ad.a($$4, akt::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               fad $$7 = fad.a($$6);
               $$0.a($$5, new gql($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return w;
      }
   }

   private akt a(atl $$0) {
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
      public static fry.a a(Path $$0) {
         try {
            return new fry.a($$0);
         } catch (IOException var2) {
            fry.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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

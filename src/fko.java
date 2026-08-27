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

public class fko extends fhh {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final vu c = vu.c("pack.dropInfo").a(n.h);
   private static final vu k = vu.c("pack.folderInfo");
   private static final int l = 20;
   private static final ajh m = new ajh("textures/misc/unknown_pack.png");
   private final fkn n;
   @Nullable
   private fko.a o;
   private long p;
   private fkp q;
   private fkp r;
   private final Path t;
   private fbi u;
   private final Map<String, ajh> v = Maps.newHashMap();

   public fko(arz $$0, Consumer<arz> $$1, Path $$2, vu $$3) {
      super($$3);
      this.n = new fkn(this::H, this::a, $$0, $$1);
      this.t = $$2;
      this.o = fko.a.a($$2);
   }

   @Override
   public void d() {
      this.n.c();
      this.E();
   }

   private void E() {
      if (this.o != null) {
         try {
            this.o.close();
            this.o = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aO_() {
      this.q = this.c(new fkp(this.f, this, 200, this.h, vu.c("pack.available.title")));
      this.q.m(this.g / 2 - 4 - 200);
      this.r = this.c(new fkp(this.f, this, 200, this.h, vu.c("pack.selected.title")));
      this.r.m(this.g / 2 + 4);
      this.c(fbi.a(vu.c("pack.openFolder"), $$0 -> ac.j().a(this.t.toUri())).a(this.g / 2 - 154, this.h - 48, 150, 20).a(fct.a(k)).a());
      this.u = this.c(fbi.a(vt.d, $$0 -> this.d()).a(this.g / 2 + 4, this.h - 48, 150, 20).a());
      this.I();
   }

   @Override
   public void e() {
      if (this.o != null) {
         try {
            if (this.o.a()) {
               this.p = 20L;
            }
         } catch (IOException var2) {
            a.warn("Failed to poll for directory {} changes, stopping", this.t);
            this.E();
         }
      }

      if (this.p > 0L && --this.p == 0L) {
         this.I();
      }
   }

   private void H() {
      this.a(this.r, this.n.b());
      this.a(this.q, this.n.a());
      this.u.j = !this.r.l().isEmpty();
   }

   private void a(fkp $$0, Stream<fkn.a> $$1) {
      $$0.l().clear();
      fkp.a $$2 = $$0.i();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fkp.a $$3x = new fkp.a(this.f, $$0, $$2x);
         $$0.l().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fkp $$0) {
      fkp $$1 = this.r == $$0 ? this.q : this.r;
      this.a(fas.a($$1.j(), $$1, this));
   }

   public void o() {
      this.r.a(null);
      this.q.a(null);
   }

   private void I() {
      this.n.d();
      this.H();
      this.p = 0L;
      this.v.clear();
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, c, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   protected static void a(ezi $$0, List<Path> $$1, Path $$2) {
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
         fdq.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.f.a(new ffz($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            ary<Path> $$4 = new ary<Path>(this.f.be()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<epk> $$5 = new ArrayList<>();

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
               this.f.a(fgw.b(() -> this.f.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.f, $$2, this.t);
               this.I();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.f.a(new fft(() -> this.f.a(this), vu.c("pack.dropRejected.title"), vu.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.f.a(this);
      }, vu.c("pack.dropConfirm"), vu.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private ajh a(gjd $$0, arw $$1) {
      try {
         ajh var9;
         try (ara $$2 = $$1.f()) {
            asg<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return m;
            }

            String $$4 = $$1.g();
            ajh $$5 = new ajh("minecraft", "pack/" + ac.a($$4, ajh::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               etc $$7 = etc.a($$6);
               $$0.a($$5, new gip($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return m;
      }
   }

   private ajh a(arw $$0) {
      return this.v.computeIfAbsent($$0.g(), $$1 -> this.a(this.f.aa(), $$0));
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
      public static fko.a a(Path $$0) {
         try {
            return new fko.a($$0);
         } catch (IOException var2) {
            fko.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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

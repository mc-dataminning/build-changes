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

public class fjo extends fgh {
   static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final vs c = vs.c("pack.dropInfo").a(n.h);
   private static final vs k = vs.c("pack.folderInfo");
   private static final int l = 20;
   private static final ajc m = new ajc("textures/misc/unknown_pack.png");
   private final fjn n;
   @Nullable
   private fjo.a o;
   private long p;
   private fjp q;
   private fjp r;
   private final Path t;
   private fak u;
   private final Map<String, ajc> v = Maps.newHashMap();

   public fjo(arq $$0, Consumer<arq> $$1, Path $$2, vs $$3) {
      super($$3);
      this.n = new fjn(this::H, this::a, $$0, $$1);
      this.t = $$2;
      this.o = fjo.a.a($$2);
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
   protected void aP_() {
      this.q = this.c(new fjp(this.f, this, 200, this.h, vs.c("pack.available.title")));
      this.q.m(this.g / 2 - 4 - 200);
      this.r = this.c(new fjp(this.f, this, 200, this.h, vs.c("pack.selected.title")));
      this.r.m(this.g / 2 + 4);
      this.c(fak.a(vs.c("pack.openFolder"), $$0 -> ac.j().a(this.t.toUri())).a(this.g / 2 - 154, this.h - 48, 150, 20).a(fbv.a(k)).a());
      this.u = this.c(fak.a(vr.d, $$0 -> this.d()).a(this.g / 2 + 4, this.h - 48, 150, 20).a());
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

   private void a(fjp $$0, Stream<fjn.a> $$1) {
      $$0.l().clear();
      fjp.a $$2 = $$0.i();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         fjp.a $$3x = new fjp.a(this.f, $$0, $$2x);
         $$0.l().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(fjp $$0) {
      fjp $$1 = this.r == $$0 ? this.q : this.r;
      this.a(ezu.a($$1.j(), $$1, this));
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
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, c, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   protected static void a(eyk $$0, List<Path> $$1, Path $$2) {
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
         fcs.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.f.a(new ffa($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            arp<Path> $$4 = new arp<Path>(this.f.bd()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<eom> $$5 = new ArrayList<>();

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
               this.f.a(ffw.b(() -> this.f.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.f, $$2, this.t);
               this.I();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.f.a(new feu(() -> this.f.a(this), vs.c("pack.dropRejected.title"), vs.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.f.a(this);
      }, vs.c("pack.dropConfirm"), vs.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private ajc a(gia $$0, arn $$1) {
      try {
         ajc var9;
         try (aqt $$2 = $$1.e()) {
            arx<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return m;
            }

            String $$4 = $$1.f();
            ajc $$5 = new ajc("minecraft", "pack/" + ac.a($$4, ajc::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               ese $$7 = ese.a($$6);
               $$0.a($$5, new ghm($$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.f(), var14);
         return m;
      }
   }

   private ajc a(arn $$0) {
      return this.v.computeIfAbsent($$0.f(), $$1 -> this.a(this.f.Z(), $$0));
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
      public static fjo.a a(Path $$0) {
         try {
            return new fjo.a($$0);
         } catch (IOException var2) {
            fjo.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
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

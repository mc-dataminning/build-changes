import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fhk extends fhf {
   private static final Logger c = LogUtils.getLogger();
   private static final vu k = vu.c("narrator.screen.title");
   public static final vu a = vu.c("title.credits");
   public static final fxe b = new fxe(new ajh("textures/gui/title/background/panorama"));
   private static final ajh l = new ajh("textures/gui/title/background/panorama_overlay.png");
   private static final String m = "Demo_World";
   @Nullable
   private fck n;
   private fbg o;
   @Nullable
   private ewy p;
   private final fxs q = new fxs(b);
   private final boolean r;
   private long t;
   @Nullable
   private fhk.a u;
   private final fbx v;

   public fhk() {
      this(false);
   }

   public fhk(boolean $$0) {
      this($$0, null);
   }

   public fhk(boolean $$0, @Nullable fbx $$1) {
      super(k);
      this.r = $$0;
      this.v = Objects.requireNonNullElseGet($$1, () -> new fbx(false));
   }

   private boolean o() {
      return this.p != null;
   }

   @Override
   public void e() {
      if (this.o()) {
         this.p.e();
      }

      this.f.aU().a(this);
   }

   public static CompletableFuture<Void> a(gja $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fbx.a, $$1), $$0.a(fbx.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean aM_() {
      return false;
   }

   @Override
   protected void aO_() {
      if (this.n == null) {
         this.n = this.f.aK().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fcl $$4 = this.c(fbk.a(20, $$0x -> this.f.a(new fgo(this, this.f.m, this.f.ag())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.c(fbg.a(vu.c("menu.options"), $$0x -> this.f.a(new fgw(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fbg.a(vu.c("menu.quit"), $$0x -> this.f.q()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fcl $$5 = this.c(fbk.b(20, $$0x -> this.f.a(new ffq(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.c(new fce($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new fgb(this)), this.i));
      if (this.p == null) {
         this.p = new ewy();
      }

      if (this.o()) {
         this.p.b(this.f, this.g, this.h);
      }

      if (!this.f.ah()) {
         this.u = new fhk.a(this.i, fbz.a(this.i, vu.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fbg.a(vu.c("menu.singleplayer"), $$0x -> this.f.a(new fmb(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vu $$2 = this.E();
      boolean $$3 = $$2 == null;
      fcr $$4 = $$2 != null ? fcr.a($$2) : null;
      this.c(fbg.a(vu.c("menu.multiplayer"), $$0x -> {
         fhf $$1x = (fhf)(this.f.m.v ? new fkd(this) : new fkf(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fbg.a(vu.c("menu.online"), $$0x -> this.f.a(new euk(this))).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vu E() {
      if (this.f.F()) {
         return null;
      } else if (this.f.I()) {
         return vu.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.H();
         if ($$0 != null) {
            return $$0.expires() != null ? vu.c("title.multiplayer.disabled.banned.temporary") : vu.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vu.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.H();
      this.c(fbg.a(vu.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.x().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.x().a("Demo_World", MinecraftServer.d, dtk.b, ecs::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.o = this.c(
         fbg.a(
               vu.c("menu.resetdemo"),
               $$0x -> {
                  ekk $$1x = this.f.m();

                  try (ekk.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new ffx(
                                 this::c,
                                 vu.c("selectWorld.deleteQuestion"),
                                 vu.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 vu.c("selectWorld.deleteButton"),
                                 vt.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fdo.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.o.j = $$2;
   }

   private boolean H() {
      try {
         boolean var2;
         try (ekk.c $$0 = this.f.m().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         fdo.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      if (this.t == 0L && this.r) {
         this.t = ac.b();
      }

      float $$4 = this.r ? (float)(ac.b() - this.t) / 1000.0F : 1.0F;
      this.q.a($$3, aww.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.r ? (float)aww.f(aww.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.r ? aww.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.v.a($$0, this.g, $$5);
      int $$6 = aww.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.u != null) {
            this.u.a($$0, $$6);
         }

         if (this.n != null && !this.f.m.c().c()) {
            this.n.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.j()) ? "" : "/" + this.f.j());
         }

         if (ezg.e().a()) {
            $$7 = $$7 + gke.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (fdc $$8 : this.l()) {
            if ($$8 instanceof fbe) {
               ((fbe)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.o() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.p.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.o() && this.p.a($$0, $$1, $$2);
   }

   @Override
   public void k() {
      if (this.p != null) {
         this.p.k();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      if (this.p != null) {
         this.p.aG_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ekk.c $$1 = this.f.m().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            fdo.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(far a, fbz b, int c, int d) {
      public void a(fat $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}

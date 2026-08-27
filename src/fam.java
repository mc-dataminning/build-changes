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

public class fam extends fah {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final ur a = ur.c("title.credits");
   public static final fpv b = new fpv(new agg("textures/gui/title/background/panorama"));
   private static final agg l = new agg("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private evq m;
   private eum n;
   @Nullable
   private eqj o;
   private final fqj p = new fqj(b);
   private final boolean q;
   private long r;
   @Nullable
   private fam.a t;
   private final evd u;

   public fam() {
      this(false);
   }

   public fam(boolean $$0) {
      this($$0, null);
   }

   public fam(boolean $$0, @Nullable evd $$1) {
      super(ur.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new evd(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void d() {
      if (this.l()) {
         this.o.d();
      }

      this.f.aR().a(this);
   }

   public static CompletableFuture<Void> a(gbi $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(evd.a, $$1), $$0.a(evd.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aO_() {
      if (this.m == null) {
         this.m = this.f.aH().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.H()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      evr $$4 = this.d(euq.a(20, $$0x -> this.f.a(new ezq(this, this.f.m, this.f.ad())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(eum.a(ur.c("menu.options"), $$0x -> this.f.a(new ezy(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(eum.a(ur.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      evr $$5 = this.d(euq.b(20, $$0x -> this.f.a(new eyt(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new evk($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new eze(this)), this.i));
      if (this.o == null) {
         this.o = new eqj();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.ae()) {
         this.t = new fam.a(this.i, evf.a(this.i, ur.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(eum.a(ur.c("menu.singleplayer"), $$0x -> this.f.a(new ffd(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      ur $$2 = this.C();
      boolean $$3 = $$2 == null;
      evx $$4 = $$2 != null ? evx.a($$2) : null;
      this.d(eum.a(ur.c("menu.multiplayer"), $$0x -> {
         fah $$1x = (fah)(this.f.m.v ? new fdf(this) : new fdh(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(eum.a(ur.c("menu.online"), $$0x -> this.E()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private ur C() {
      if (this.f.C()) {
         return null;
      } else if (this.f.F()) {
         return ur.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.E();
         if ($$0 != null) {
            return $$0.expires() != null ? ur.c("title.multiplayer.disabled.banned.temporary") : ur.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return ur.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.d(eum.a(ur.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.f, dnd.b, dwl::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         eum.a(
               ur.c("menu.resetdemo"),
               $$0x -> {
                  eeb $$1x = this.f.l();

                  try (eeb.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new eza(
                                 this::c,
                                 ur.c("selectWorld.deleteQuestion"),
                                 ur.a("selectWorld.deleteWarning", MinecraftServer.f.a()),
                                 ur.c("selectWorld.deleteButton"),
                                 uq.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     ewt.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.i = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (eeb.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         ewt.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void E() {
      this.f.a(new env(this));
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      if (this.r == 0L && this.q) {
         this.r = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0F : 1.0F;
      this.p.a($$3, ati.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)ati.f(ati.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? ati.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = ati.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.t != null) {
            this.t.a($$0, $$6);
         }

         if (this.m != null && !this.f.m.c().c()) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.H()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (esr.e().a()) {
            $$7 = $$7 + gcn.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (ewh $$8 : this.i()) {
            if ($$8 instanceof euk) {
               ((euk)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.l() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.o.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void aF_() {
      if (this.o != null) {
         this.o.aF_();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      if (this.o != null) {
         this.o.aG_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (eeb.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            ewt.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(etz a, evf b, int c, int d) {
      public void a(eub $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}

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

public class fnk extends fnf {
   private static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("narrator.screen.title");
   private static final xp c = xp.c("title.credits");
   private static final String d = "Demo_World";
   private static final float r = 2000.0F;
   @Nullable
   private fik s;
   private fhg u;
   @Nullable
   private fcz v;
   private float w = 1.0F;
   private boolean x;
   private long y;
   @Nullable
   private fnk.a z;
   private final fhx A;

   public fnk() {
      this(false);
   }

   public fnk(boolean $$0) {
      this($$0, null);
   }

   public fnk(boolean $$0, @Nullable fhx $$1) {
      super(b);
      this.x = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fhx(false));
   }

   private boolean m() {
      return this.v != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.v.e();
      }
   }

   public static CompletableFuture<Void> a(gpc $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fhx.a, $$1), $$0.a(fhx.c, $$1), $$0.a(gds.a, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected void aM_() {
      if (this.s == null) {
         this.s = this.m.aK().a();
      }

      int $$0 = this.p.a(c);
      int $$1 = this.n - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      if (this.m.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fil $$4 = this.c(fhk.a(20, $$0x -> this.m.a(new fmo(this, this.m.m, this.m.ag())), true));
      $$4.c(this.n / 2 - 124, $$3 + 72 + 12);
      this.c(fhg.a(xp.c("menu.options"), $$0x -> this.m.a(new fmw(this, this.m.m))).a(this.n / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fhg.a(xp.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fil $$5 = this.c(fhk.b(20, $$0x -> this.m.a(new flq(this, this.m.m)), true));
      $$5.c(this.n / 2 + 104, $$3 + 72 + 12);
      this.c(new fie($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fmb(this)), this.p));
      if (this.v == null) {
         this.v = new fcz();
      }

      if (this.m()) {
         this.v.b(this.m, this.n, this.o);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fhg.a(xp.c("menu.singleplayer"), $$0x -> this.m.a(new fsa(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xp $$2 = this.E();
      boolean $$3 = $$2 == null;
      fir $$4 = $$2 != null ? fir.a($$2) : null;
      this.c(fhg.a(xp.c("menu.multiplayer"), $$0x -> {
         fnf $$1x = (fnf)(this.m.m.v ? new fqd(this) : new fqe(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fhg.a(xp.c("menu.online"), $$0x -> this.m.a(new fal(this))).a(this.n / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private xp E() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xp.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xp.c("title.multiplayer.disabled.banned.temporary") : xp.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xp.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.F();
      this.c(fhg.a(xp.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, dyu.b, eic::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      this.u = this.c(
         fhg.a(
               xp.c("menu.resetdemo"),
               $$0x -> {
                  epy $$1x = this.m.m();

                  try (epy.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new flx(
                                 this::c,
                                 xp.c("selectWorld.deleteQuestion"),
                                 xp.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xp.c("selectWorld.deleteButton"),
                                 xo.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fjo.a(this.m, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.u.j = $$2;
   }

   private boolean F() {
      try {
         boolean var2;
         try (epy.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fjo.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      if (this.y == 0L && this.x) {
         this.y = ac.c();
      }

      float $$4 = 1.0F;
      if (this.x) {
         float $$5 = (float)(ac.c() - this.y) / 2000.0F;
         if ($$5 > 1.0F) {
            this.x = false;
            this.w = 1.0F;
         } else {
            $$5 = ayz.a($$5, 0.0F, 1.0F);
            $$4 = ayz.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.w = ayz.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.b($$4);
      }

      this.a($$0, $$3);
      int $$6 = ayz.f($$4 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.n, $$4);
         if (this.z != null) {
            this.z.a($$0, $$6);
         }

         if (this.s != null && !this.m.m.c().c()) {
            this.s.a($$0, this.n, this.p, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.m.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.m.j()) ? "" : "/" + this.m.j());
         }

         if (ffh.e().a()) {
            $$7 = $$7 + gqh.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.v.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void b(float $$0) {
      for (fjc $$1 : this.aD_()) {
         if ($$1 instanceof fhe $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fgt $$0, float $$1) {
      f.a($$0, this.n, this.o, this.w, this.r());
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.v.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.v != null) {
         this.v.j();
      }
   }

   @Override
   public void aE_() {
      super.aE_();
      if (this.v != null) {
         this.v.aE_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (epy.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fjo.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }

   static record a(fgr a, fhz b, int c, int d) {
      public void a(fgt $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}

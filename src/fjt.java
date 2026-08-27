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

public class fjt extends fjo {
   private static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("narrator.screen.title");
   private static final wg c = wg.c("title.credits");
   private static final String d = "Demo_World";
   @Nullable
   private fet o;
   private fdp p;
   @Nullable
   private ezh q;
   private float r;
   private final boolean s;
   private long u;
   @Nullable
   private fjt.a v;
   private final feg w;

   public fjt() {
      this(false);
   }

   public fjt(boolean $$0) {
      this($$0, null);
   }

   public fjt(boolean $$0, @Nullable feg $$1) {
      super(b);
      this.s = $$0;
      this.w = Objects.requireNonNullElseGet($$1, () -> new feg(false));
   }

   private boolean m() {
      return this.q != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.q.e();
      }

      this.j.aU().a(this);
   }

   public static CompletableFuture<Void> a(glk $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(feg.a, $$1), $$0.a(feg.c, $$1), $$0.a(g, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aN_() {
      if (this.o == null) {
         this.o = this.j.aK().a();
      }

      int $$0 = this.m.a(c);
      int $$1 = this.k - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.l / 4 + 48;
      if (this.j.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      feu $$4 = this.c(fdt.a(20, $$0x -> this.j.a(new fix(this, this.j.m, this.j.ag())), true));
      $$4.c(this.k / 2 - 124, $$3 + 72 + 12);
      this.c(fdp.a(wg.c("menu.options"), $$0x -> this.j.a(new fjf(this, this.j.m))).a(this.k / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fdp.a(wg.c("menu.quit"), $$0x -> this.j.q()).a(this.k / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      feu $$5 = this.c(fdt.b(20, $$0x -> this.j.a(new fhz(this, this.j.m)), true));
      $$5.c(this.k / 2 + 104, $$3 + 72 + 12);
      this.c(new fen($$1, this.l - 10, $$0, 10, c, $$0x -> this.j.a(new fik(this)), this.m));
      if (this.q == null) {
         this.q = new ezh();
      }

      if (this.m()) {
         this.q.b(this.j, this.k, this.l);
      }

      if (!this.j.ah()) {
         this.v = new fjt.a(this.m, fei.a(this.m, wg.c("title.32bit.deprecation"), 350, 2), this.k / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fdp.a(wg.c("menu.singleplayer"), $$0x -> this.j.a(new foj(this))).a(this.k / 2 - 100, $$0, 200, 20).a());
      wg $$2 = this.C();
      boolean $$3 = $$2 == null;
      ffa $$4 = $$2 != null ? ffa.a($$2) : null;
      this.c(fdp.a(wg.c("menu.multiplayer"), $$0x -> {
         fjo $$1x = (fjo)(this.j.m.v ? new fml(this) : new fmn(this));
         this.j.a($$1x);
      }).a(this.k / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fdp.a(wg.c("menu.online"), $$0x -> this.j.a(new ewt(this))).a(this.k / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private wg C() {
      if (this.j.F()) {
         return null;
      } else if (this.j.I()) {
         return wg.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.j.H();
         if ($$0 != null) {
            return $$0.expires() != null ? wg.c("title.multiplayer.disabled.banned.temporary") : wg.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return wg.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.c(fdp.a(wg.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.j.x().a("Demo_World", () -> this.j.a(this));
         } else {
            this.j.x().a("Demo_World", MinecraftServer.d, dvp.b, eex::a, this);
         }
      }).a(this.k / 2 - 100, $$0, 200, 20).a());
      this.p = this.c(
         fdp.a(
               wg.c("menu.resetdemo"),
               $$0x -> {
                  emr $$1x = this.j.m();

                  try (emr.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.j
                           .a(
                              new fig(
                                 this::c,
                                 wg.c("selectWorld.deleteQuestion"),
                                 wg.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 wg.c("selectWorld.deleteButton"),
                                 wf.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     ffx.a(this.j, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.k / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.p.j = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (emr.c $$0 = this.j.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         ffx.a(this.j, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.u == 0L && this.s) {
         this.u = ac.b();
      }

      this.r = this.s ? (float)(ac.b() - this.u) / 1000.0F : 1.0F;
      float $$4 = this.s ? axk.a(this.r - 1.0F, 0.0F, 1.0F) : 1.0F;
      int $$5 = axk.f($$4 * 255.0F) << 24;
      if (($$5 & -67108864) != 0) {
         if (this.v != null) {
            this.v.a($$0, $$5);
         }

         if (this.o != null && !this.j.m.c().c()) {
            this.o.a($$0, this.k, this.m, $$5);
         }

         String $$6 = "Minecraft " + aa.b().c();
         if (this.j.K()) {
            $$6 = $$6 + " Demo";
         } else {
            $$6 = $$6 + ("release".equalsIgnoreCase(this.j.j()) ? "" : "/" + this.j.j());
         }

         if (fbp.e().a()) {
            $$6 = $$6 + gmo.a("menu.modded");
         }

         $$0.b(this.m, $$6, 2, this.l - 10, 16777215 | $$5);

         for (ffl $$7 : this.aF_()) {
            if ($$7 instanceof fdn $$8) {
               $$8.a($$4);
            }
         }

         if (this.m() && $$4 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.q.a($$0, $$1, $$2, $$3);
         }

         super.a($$0, $$1, $$2, $$3);
         this.w.a($$0, this.k, $$4);
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
   }

   @Override
   protected void a(fdc $$0, float $$1) {
      f.a($$1, axk.a(this.r, 0.0F, 1.0F));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.q.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.q != null) {
         this.q.j();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      if (this.q != null) {
         this.q.aG_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (emr.c $$1 = this.j.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            ffx.b(this.j, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.j.a(this);
   }

   static record a(fda a, fei b, int c, int d) {
      public void a(fdc $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}

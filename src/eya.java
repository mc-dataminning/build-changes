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

public class eya extends exv {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final te a = te.b("Copyright Mojang AB. Do not distribute!");
   public static final fmu b = new fmu(new aep("textures/gui/title/background/panorama"));
   private static final aep l = new aep("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private etk m;
   private esi n;
   @Nullable
   private eog o;
   private final fni p = new fni(b);
   private final boolean q;
   private long s;
   @Nullable
   private eya.a t;
   private final esz u;

   public eya() {
      this(false);
   }

   public eya(boolean $$0) {
      this($$0, null);
   }

   public eya(boolean $$0, @Nullable esz $$1) {
      super(te.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new esz(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void c() {
      if (this.l()) {
         this.o.c();
      }

      this.f.aR().a(this);
   }

   public static CompletableFuture<Void> a(fyh $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(esz.a, $$1), $$0.a(esz.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected void aE_() {
      if (this.m == null) {
         this.m = this.f.aI().a();
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

      etl $$4 = this.d(esm.a(20, $$0x -> this.f.a(new exe(this, this.f.m, this.f.ad())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(esi.a(te.c("menu.options"), $$0x -> this.f.a(new exm(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(esi.a(te.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      etl $$5 = this.d(esm.b(20, $$0x -> this.f.a(new ewh(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new etg($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new ews(this)), this.i));
      if (this.o == null) {
         this.o = new eog();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.ae()) {
         this.t = new eya.a(this.i, etb.a(this.i, te.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(esi.a(te.c("menu.singleplayer"), $$0x -> this.f.a(new fcl(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      te $$2 = this.B();
      boolean $$3 = $$2 == null;
      etr $$4 = $$2 != null ? etr.a($$2) : null;
      this.d(esi.a(te.c("menu.multiplayer"), $$0x -> {
         exv $$1x = (exv)(this.f.m.v ? new far(this) : new fat(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(esi.a(te.c("menu.online"), $$0x -> this.D()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private te B() {
      if (this.f.C()) {
         return null;
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? te.c("title.multiplayer.disabled.banned.temporary") : te.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return te.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.C();
      this.d(esi.a(te.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a(this, "Demo_World");
         } else {
            this.f.w().a("Demo_World", MinecraftServer.f, dlf.b, dun::a);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         esi.a(
               te.c("menu.resetdemo"),
               $$0x -> {
                  ebv $$1x = this.f.k();

                  try (ebv.c $$2x = $$1x.d("Demo_World")) {
                     ebw $$3 = $$2x.d();
                     if ($$3 != null) {
                        this.f
                           .a(
                              new ewo(
                                 this::c,
                                 te.c("selectWorld.deleteQuestion"),
                                 te.a("selectWorld.deleteWarning", $$3.b()),
                                 te.c("selectWorld.deleteButton"),
                                 td.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     eui.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.i = $$2;
   }

   private boolean C() {
      try {
         boolean var2;
         try (ebv.c $$0 = this.f.k().d("Demo_World")) {
            var2 = $$0.d() != null;
         }

         return var2;
      } catch (IOException var6) {
         eui.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void D() {
      this.f.a(new els(this));
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      if (this.s == 0L && this.q) {
         this.s = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.s) / 1000.0F : 1.0F;
      this.p.a($$3, aro.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)aro.f(aro.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? aro.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = aro.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.t != null) {
            this.t.a($$0, $$6);
         }

         if (this.m != null) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.H()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.h()) ? "" : "/" + this.f.h());
         }

         if (eqn.d().a()) {
            $$7 = $$7 + fzm.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (etw $$8 : this.i()) {
            if ($$8 instanceof esg) {
               ((esg)$$8).a($$5);
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
   public void b(erx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void h() {
      if (this.o != null) {
         this.o.h();
      }
   }

   @Override
   public void av_() {
      super.av_();
      if (this.o != null) {
         this.o.av_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ebv.c $$1 = this.f.k().d("Demo_World")) {
            $$1.g();
         } catch (IOException var7) {
            eui.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(erv a, etb b, int c, int d) {
      public void a(erx $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}

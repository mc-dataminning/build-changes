import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffx extends hct {
   static final Logger c = LogUtils.getLogger();
   private static final xd B = xd.c("mco.selectServer.create");
   private static final xd C = xd.c("mco.selectServer.create.subtitle");
   private static final xd D = xd.c("mco.configure.world.switch.slot");
   private static final xd E = xd.c("mco.configure.world.switch.slot.subtitle");
   private static final xd F = xd.c("mco.reset.world.title");
   private static final xd G = xd.c("mco.reset.world.warning");
   public static final xd a = xd.c("mco.create.world.reset.title");
   private static final xd H = xd.c("mco.reset.world.resetting.screen.title");
   private static final xd I = xd.c("mco.reset.world.template");
   private static final xd J = xd.c("mco.reset.world.adventure");
   private static final xd K = xd.c("mco.reset.world.experience");
   private static final xd L = xd.c("mco.reset.world.inspiration");
   private final fpt M;
   private final feb N;
   private final xd O;
   private final int P;
   private final xd Q;
   private static final alb R = alb.b("textures/gui/realms/upload.png");
   private static final alb S = alb.b("textures/gui/realms/adventure.png");
   private static final alb T = alb.b("textures/gui/realms/survival_spawn.png");
   private static final alb U = alb.b("textures/gui/realms/new_world.png");
   private static final alb V = alb.b("textures/gui/realms/experience.png");
   private static final alb W = alb.b("textures/gui/realms/inspiration.png");
   fer X;
   fer Y;
   fer Z;
   fer aa;
   public final int b;
   @Nullable
   private final fhb ab;
   private final Runnable ac;
   private final fno ad = new fno(this);

   private ffx(fpt $$0, feb $$1, int $$2, xd $$3, xd $$4, int $$5, xd $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public ffx(fpt $$0, feb $$1, int $$2, xd $$3, xd $$4, int $$5, xd $$6, @Nullable fhb $$7, Runnable $$8) {
      super($$3);
      this.M = $$0;
      this.N = $$1;
      this.b = $$2;
      this.O = $$4;
      this.P = $$5;
      this.Q = $$6;
      this.ab = $$7;
      this.ac = $$8;
   }

   public static ffx a(fpt $$0, feb $$1, fhb $$2, Runnable $$3) {
      return new ffx($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static ffx a(fpt $$0, int $$1, feb $$2, Runnable $$3) {
      return new ffx($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static ffx a(fpt $$0, feb $$1, Runnable $$2) {
      return new ffx($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aT_() {
      fns $$0 = this.ad.a(fns.d());
      $$0.c().a(9 / 3);
      $$0.a(new flh(this.l, this.p), fnr::b);
      $$0.a(new flh(this.O, this.p).b(this.P), fnr::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fdk $$0 = fdk.a();

            try {
               fer $$1 = $$0.a(1, 10, feb.d.a);
               fer $$2 = $$0.a(1, 10, feb.d.c);
               fer $$3 = $$0.a(1, 10, feb.d.d);
               fer $$4 = $$0.a(1, 10, feb.d.e);
               ffx.this.m.execute(() -> {
                  ffx.this.X = $$1;
                  ffx.this.Y = $$2;
                  ffx.this.Z = $$3;
                  ffx.this.aa = $$4;
               });
            } catch (fev var6) {
               ffx.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fnn $$1 = this.ad.c(new fnn());
      fnn.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new ffx.a(this.m.h, ffw.a, U, $$0x -> this.m.a(new ffw(this::a, this.l))));
      $$2.a(new ffx.a(this.m.h, ffy.a, R, $$0x -> this.m.a(new ffy(this.ab, this.N.a, this.b, this))));
      $$2.a(new ffx.a(this.m.h, I, T, $$0x -> this.m.a(new ffz(I, this::a, feb.d.a, this.X))));
      $$2.a(fnt.b(16), 3);
      $$2.a(new ffx.a(this.m.h, J, S, $$0x -> this.m.a(new ffz(J, this::a, feb.d.c, this.Y))));
      $$2.a(new ffx.a(this.m.h, K, V, $$0x -> this.m.a(new ffz(K, this::a, feb.d.d, this.Z))));
      $$2.a(new ffx.a(this.m.h, L, W, $$0x -> this.m.a(new ffz(L, this::a, feb.d.e, this.aa))));
      this.ad.b(fka.a(xc.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fjy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xd i() {
      return xc.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable feq $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fhd($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fgs $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fhc($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fgz $$0) {
      List<fgz> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fhh(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new ffp(this.M, $$1.toArray(new fgz[0])));
   }

   class a extends fka {
      private static final alb b = alb.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alb v;

      a(final fjl $$0, final xd $$1, final alb $$2, final fka.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axn.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(ghe::C, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(ghe::C, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(ffx.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}

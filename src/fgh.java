import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgh extends hdk {
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
   private final fqd M;
   private final fel N;
   private final xd O;
   private final int P;
   private final xd Q;
   private static final alc R = alc.b("textures/gui/realms/upload.png");
   private static final alc S = alc.b("textures/gui/realms/adventure.png");
   private static final alc T = alc.b("textures/gui/realms/survival_spawn.png");
   private static final alc U = alc.b("textures/gui/realms/new_world.png");
   private static final alc V = alc.b("textures/gui/realms/experience.png");
   private static final alc W = alc.b("textures/gui/realms/inspiration.png");
   ffb X;
   ffb Y;
   ffb Z;
   ffb aa;
   public final int b;
   @Nullable
   private final fhl ab;
   private final Runnable ac;
   private final fny ad = new fny(this);

   private fgh(fqd $$0, fel $$1, int $$2, xd $$3, xd $$4, int $$5, xd $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fgh(fqd $$0, fel $$1, int $$2, xd $$3, xd $$4, int $$5, xd $$6, @Nullable fhl $$7, Runnable $$8) {
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

   public static fgh a(fqd $$0, fel $$1, fhl $$2, Runnable $$3) {
      return new fgh($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fgh a(fqd $$0, int $$1, fel $$2, Runnable $$3) {
      return new fgh($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fgh a(fqd $$0, fel $$1, Runnable $$2) {
      return new fgh($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aR_() {
      foc $$0 = this.ad.a(foc.d());
      $$0.c().a(9 / 3);
      $$0.a(new flr(this.l, this.p), fob::b);
      $$0.a(new flr(this.O, this.p).b(this.P), fob::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fdu $$0 = fdu.a();

            try {
               ffb $$1 = $$0.a(1, 10, fel.d.a);
               ffb $$2 = $$0.a(1, 10, fel.d.c);
               ffb $$3 = $$0.a(1, 10, fel.d.d);
               ffb $$4 = $$0.a(1, 10, fel.d.e);
               fgh.this.m.execute(() -> {
                  fgh.this.X = $$1;
                  fgh.this.Y = $$2;
                  fgh.this.Z = $$3;
                  fgh.this.aa = $$4;
               });
            } catch (fff var6) {
               fgh.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fnx $$1 = this.ad.c(new fnx());
      fnx.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fgh.a(this.m.h, fgg.a, U, $$0x -> this.m.a(new fgg(this::a, this.l))));
      $$2.a(new fgh.a(this.m.h, fgi.a, R, $$0x -> this.m.a(new fgi(this.ab, this.N.a, this.b, this))));
      $$2.a(new fgh.a(this.m.h, I, T, $$0x -> this.m.a(new fgj(I, this::a, fel.d.a, this.X))));
      $$2.a(fod.b(16), 3);
      $$2.a(new fgh.a(this.m.h, J, S, $$0x -> this.m.a(new fgj(J, this::a, fel.d.c, this.Y))));
      $$2.a(new fgh.a(this.m.h, K, V, $$0x -> this.m.a(new fgj(K, this::a, fel.d.d, this.Z))));
      $$2.a(new fgh.a(this.m.h, L, W, $$0x -> this.m.a(new fgj(L, this::a, fel.d.e, this.aa))));
      this.ad.b(fkk.a(xc.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fki var10000 = this.c($$1x);
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

   private void a(@Nullable ffa $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fhn($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fhc $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fhm($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fhj $$0) {
      List<fhj> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fhr(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new ffz(this.M, $$1.toArray(new fhj[0])));
   }

   class a extends fkk {
      private static final alc b = alc.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alc v;

      a(final fjv $$0, final xd $$1, final alc $$2, final fkk.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fjx $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axo.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(ghq::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(ghq::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fgh.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}

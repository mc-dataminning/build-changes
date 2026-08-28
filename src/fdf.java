import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdf extends gvi {
   static final Logger c = LogUtils.getLogger();
   private static final xp B = xp.c("mco.selectServer.create");
   private static final xp C = xp.c("mco.selectServer.create.subtitle");
   private static final xp D = xp.c("mco.configure.world.switch.slot");
   private static final xp E = xp.c("mco.configure.world.switch.slot.subtitle");
   private static final xp F = xp.c("mco.reset.world.title");
   private static final xp G = xp.c("mco.reset.world.warning");
   public static final xp a = xp.c("mco.create.world.reset.title");
   private static final xp H = xp.c("mco.reset.world.resetting.screen.title");
   private static final xp I = xp.c("mco.reset.world.template");
   private static final xp J = xp.c("mco.reset.world.adventure");
   private static final xp K = xp.c("mco.reset.world.experience");
   private static final xp L = xp.c("mco.reset.world.inspiration");
   private final fnf M;
   private final fbh N;
   private final xp O;
   private final int P;
   private final xp Q;
   private static final alf R = new alf("textures/gui/realms/upload.png");
   private static final alf S = new alf("textures/gui/realms/adventure.png");
   private static final alf T = new alf("textures/gui/realms/survival_spawn.png");
   private static final alf U = new alf("textures/gui/realms/new_world.png");
   private static final alf V = new alf("textures/gui/realms/experience.png");
   private static final alf W = new alf("textures/gui/realms/inspiration.png");
   fbz X;
   fbz Y;
   fbz Z;
   fbz aa;
   public final int b;
   @Nullable
   private final fej ab;
   private final Runnable ac;
   private final fkt ad = new fkt(this);

   private fdf(fnf $$0, fbh $$1, int $$2, xp $$3, xp $$4, int $$5, xp $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fdf(fnf $$0, fbh $$1, int $$2, xp $$3, xp $$4, int $$5, xp $$6, @Nullable fej $$7, Runnable $$8) {
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

   public static fdf a(fnf $$0, fbh $$1, fej $$2, Runnable $$3) {
      return new fdf($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fdf a(fnf $$0, int $$1, fbh $$2, Runnable $$3) {
      return new fdf($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fdf a(fnf $$0, fbh $$1, Runnable $$2) {
      return new fdf($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aM_() {
      fkx $$0 = this.ad.a(fkx.d());
      $$0.c().a(9 / 3);
      $$0.a(new fin(this.l, this.p), fkw::b);
      $$0.a(new fin(this.O, this.p).b(this.P), fkw::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            faq $$0 = faq.a();

            try {
               fbz $$1 = $$0.a(1, 10, fbh.d.a);
               fbz $$2 = $$0.a(1, 10, fbh.d.c);
               fbz $$3 = $$0.a(1, 10, fbh.d.d);
               fbz $$4 = $$0.a(1, 10, fbh.d.e);
               fdf.this.m.execute(() -> {
                  fdf.this.X = $$1;
                  fdf.this.Y = $$2;
                  fdf.this.Z = $$3;
                  fdf.this.aa = $$4;
               });
            } catch (fcd var6) {
               fdf.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fks $$1 = this.ad.c(new fks());
      fks.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fdf.a(this.m.h, fde.a, U, $$0x -> this.m.a(new fde(this::a, this.l))));
      $$2.a(new fdf.a(this.m.h, fdg.a, R, $$0x -> this.m.a(new fdg(this.ab, this.N.a, this.b, this))));
      $$2.a(new fdf.a(this.m.h, I, T, $$0x -> this.m.a(new fdh(I, this::a, fbh.d.a, this.X))));
      $$2.a(fky.b(16), 3);
      $$2.a(new fdf.a(this.m.h, J, S, $$0x -> this.m.a(new fdh(J, this::a, fbh.d.c, this.Y))));
      $$2.a(new fdf.a(this.m.h, K, V, $$0x -> this.m.a(new fdh(K, this::a, fbh.d.d, this.Z))));
      $$2.a(new fdf.a(this.m.h, L, W, $$0x -> this.m.a(new fdh(L, this::a, fbh.d.e, this.aa))));
      this.ad.b(fhg.a(xo.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xp i() {
      return xo.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable fby $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fel($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fea $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fek($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(feh $$0) {
      List<feh> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fep(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fcx(this.M, $$1.toArray(new feh[0])));
   }

   class a extends fhg {
      private static final alf b = new alf("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alf v;

      a(final fgr $$0, final xp $$1, final alf $$2, final fhg.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fgt $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.A();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.C();
         int $$6 = this.D();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(fdf.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}

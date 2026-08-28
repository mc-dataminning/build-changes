import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdd extends gvg {
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
   private final fnd M;
   private final fbf N;
   private final xp O;
   private final int P;
   private final xp Q;
   private static final alf R = new alf("textures/gui/realms/upload.png");
   private static final alf S = new alf("textures/gui/realms/adventure.png");
   private static final alf T = new alf("textures/gui/realms/survival_spawn.png");
   private static final alf U = new alf("textures/gui/realms/new_world.png");
   private static final alf V = new alf("textures/gui/realms/experience.png");
   private static final alf W = new alf("textures/gui/realms/inspiration.png");
   fbx X;
   fbx Y;
   fbx Z;
   fbx aa;
   public final int b;
   @Nullable
   private final feh ab;
   private final Runnable ac;
   private final fkr ad = new fkr(this);

   private fdd(fnd $$0, fbf $$1, int $$2, xp $$3, xp $$4, int $$5, xp $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fdd(fnd $$0, fbf $$1, int $$2, xp $$3, xp $$4, int $$5, xp $$6, @Nullable feh $$7, Runnable $$8) {
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

   public static fdd a(fnd $$0, fbf $$1, feh $$2, Runnable $$3) {
      return new fdd($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fdd a(fnd $$0, int $$1, fbf $$2, Runnable $$3) {
      return new fdd($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fdd a(fnd $$0, fbf $$1, Runnable $$2) {
      return new fdd($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aM_() {
      fkv $$0 = this.ad.a(fkv.d());
      $$0.c().a(9 / 3);
      $$0.a(new fil(this.l, this.p), fku::b);
      $$0.a(new fil(this.O, this.p).b(this.P), fku::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fao $$0 = fao.a();

            try {
               fbx $$1 = $$0.a(1, 10, fbf.d.a);
               fbx $$2 = $$0.a(1, 10, fbf.d.c);
               fbx $$3 = $$0.a(1, 10, fbf.d.d);
               fbx $$4 = $$0.a(1, 10, fbf.d.e);
               fdd.this.m.execute(() -> {
                  fdd.this.X = $$1;
                  fdd.this.Y = $$2;
                  fdd.this.Z = $$3;
                  fdd.this.aa = $$4;
               });
            } catch (fcb var6) {
               fdd.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fkq $$1 = this.ad.c(new fkq());
      fkq.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fdd.a(this.m.h, fdc.a, U, $$0x -> this.m.a(new fdc(this::a, this.l))));
      $$2.a(new fdd.a(this.m.h, fde.a, R, $$0x -> this.m.a(new fde(this.ab, this.N.a, this.b, this))));
      $$2.a(new fdd.a(this.m.h, I, T, $$0x -> this.m.a(new fdf(I, this::a, fbf.d.a, this.X))));
      $$2.a(fkw.b(16), 3);
      $$2.a(new fdd.a(this.m.h, J, S, $$0x -> this.m.a(new fdf(J, this::a, fbf.d.c, this.Y))));
      $$2.a(new fdd.a(this.m.h, K, V, $$0x -> this.m.a(new fdf(K, this::a, fbf.d.d, this.Z))));
      $$2.a(new fdd.a(this.m.h, L, W, $$0x -> this.m.a(new fdf(L, this::a, fbf.d.e, this.aa))));
      this.ad.b(fhe.a(xo.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fhc var10000 = this.c($$1x);
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

   private void a(@Nullable fbw $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fej($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fdy $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fei($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fef $$0) {
      List<fef> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fen(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fcv(this.M, $$1.toArray(new fef[0])));
   }

   class a extends fhe {
      private static final alf b = new alf("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alf v;

      a(final fgp $$0, final xp $$1, final alf $$2, final fhe.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fgr $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fdd.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}

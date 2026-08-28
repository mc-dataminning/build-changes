import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fef extends gwj {
   static final Logger c = LogUtils.getLogger();
   private static final wy A = wy.c("mco.selectServer.create");
   private static final wy B = wy.c("mco.selectServer.create.subtitle");
   private static final wy C = wy.c("mco.configure.world.switch.slot");
   private static final wy D = wy.c("mco.configure.world.switch.slot.subtitle");
   private static final wy E = wy.c("mco.reset.world.title");
   private static final wy F = wy.c("mco.reset.world.warning");
   public static final wy a = wy.c("mco.create.world.reset.title");
   private static final wy G = wy.c("mco.reset.world.resetting.screen.title");
   private static final wy H = wy.c("mco.reset.world.template");
   private static final wy I = wy.c("mco.reset.world.adventure");
   private static final wy J = wy.c("mco.reset.world.experience");
   private static final wy K = wy.c("mco.reset.world.inspiration");
   private final fnx L;
   private final fcj M;
   private final wy N;
   private final int O;
   private final wy P;
   private static final akq Q = akq.b("textures/gui/realms/upload.png");
   private static final akq R = akq.b("textures/gui/realms/adventure.png");
   private static final akq S = akq.b("textures/gui/realms/survival_spawn.png");
   private static final akq T = akq.b("textures/gui/realms/new_world.png");
   private static final akq U = akq.b("textures/gui/realms/experience.png");
   private static final akq V = akq.b("textures/gui/realms/inspiration.png");
   fcz W;
   fcz X;
   fcz Y;
   fcz Z;
   public final int b;
   @Nullable
   private final ffj aa;
   private final Runnable ab;
   private final flt ac = new flt(this);

   private fef(fnx $$0, fcj $$1, int $$2, wy $$3, wy $$4, int $$5, wy $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fef(fnx $$0, fcj $$1, int $$2, wy $$3, wy $$4, int $$5, wy $$6, @Nullable ffj $$7, Runnable $$8) {
      super($$3);
      this.L = $$0;
      this.M = $$1;
      this.b = $$2;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
      this.aa = $$7;
      this.ab = $$8;
   }

   public static fef a(fnx $$0, fcj $$1, ffj $$2, Runnable $$3) {
      return new fef($$0, $$1, $$1.n, A, B, -6250336, a, $$2, $$3);
   }

   public static fef a(fnx $$0, int $$1, fcj $$2, Runnable $$3) {
      return new fef($$0, $$2, $$1, C, D, -6250336, a, $$3);
   }

   public static fef a(fnx $$0, fcj $$1, Runnable $$2) {
      return new fef($$0, $$1, $$1.n, E, F, -65536, G, $$2);
   }

   @Override
   public void aP_() {
      flx $$0 = this.ac.a(flx.d());
      $$0.c().a(9 / 3);
      $$0.a(new fjn(this.k, this.o), flw::b);
      $$0.a(new fjn(this.N, this.o).b(this.O), flw::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fbs $$0 = fbs.a();

            try {
               fcz $$1 = $$0.a(1, 10, fcj.d.a);
               fcz $$2 = $$0.a(1, 10, fcj.d.c);
               fcz $$3 = $$0.a(1, 10, fcj.d.d);
               fcz $$4 = $$0.a(1, 10, fcj.d.e);
               fef.this.l.execute(() -> {
                  fef.this.W = $$1;
                  fef.this.X = $$2;
                  fef.this.Y = $$3;
                  fef.this.Z = $$4;
               });
            } catch (fdd var6) {
               fef.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fls $$1 = this.ac.c(new fls());
      fls.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fef.a(this.l.h, fee.a, T, $$0x -> this.l.a(new fee(this::a, this.k))));
      $$2.a(new fef.a(this.l.h, feg.a, Q, $$0x -> this.l.a(new feg(this.aa, this.M.a, this.b, this))));
      $$2.a(new fef.a(this.l.h, H, S, $$0x -> this.l.a(new feh(H, this::a, fcj.d.a, this.W))));
      $$2.a(fly.b(16), 3);
      $$2.a(new fef.a(this.l.h, I, R, $$0x -> this.l.a(new feh(I, this::a, fcj.d.c, this.X))));
      $$2.a(new fef.a(this.l.h, J, U, $$0x -> this.l.a(new feh(J, this::a, fcj.d.d, this.Y))));
      $$2.a(new fef.a(this.l.h, K, V, $$0x -> this.l.a(new feh(K, this::a, fcj.d.e, this.Z))));
      this.ac.b(fig.a(wx.k, $$0x -> this.d()).a());
      this.ac.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ac.a();
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.N);
   }

   @Override
   public void d() {
      this.l.a(this.L);
   }

   private void a(@Nullable fcy $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new ffl($$0, this.M.a, this.P, this.ab));
      }
   }

   private void a(@Nullable ffa $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new ffk($$0, this.M.a, this.P, this.ab));
      }
   }

   private void a(ffh $$0) {
      List<ffh> $$1 = new ArrayList<>();
      if (this.aa != null) {
         $$1.add(this.aa);
      }

      if (this.b != this.M.n) {
         $$1.add(new ffp(this.M.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.l.a(new fdx(this.L, $$1.toArray(new ffh[0])));
   }

   class a extends fig {
      private static final akq b = akq.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akq v;

      a(final fhr $$0, final wy $$1, final akq $$2, final fig.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.D();
         int $$6 = this.E();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(fef.this.o, this.z(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}

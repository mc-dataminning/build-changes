import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqp extends ghe {
   static final Logger c = LogUtils.getLogger();
   static final agg v = new agg("widget/slot_frame");
   private static final ur w = ur.c("mco.selectServer.create");
   private static final ur x = ur.c("mco.selectServer.create.subtitle");
   private static final ur y = ur.c("mco.configure.world.switch.slot");
   private static final ur z = ur.c("mco.configure.world.switch.slot.subtitle");
   private static final ur A = ur.c("mco.reset.world.title");
   private static final ur B = ur.c("mco.reset.world.warning");
   public static final ur a = ur.c("mco.create.world.reset.title");
   private static final ur C = ur.c("mco.reset.world.resetting.screen.title");
   private static final ur D = ur.c("mco.reset.world.template");
   private static final ur E = ur.c("mco.reset.world.adventure");
   private static final ur F = ur.c("mco.reset.world.experience");
   private static final ur G = ur.c("mco.reset.world.inspiration");
   private final fah H;
   private final eor I;
   private final ur J;
   private final int K;
   private final ur L;
   private static final agg M = new agg("textures/gui/realms/upload.png");
   private static final agg N = new agg("textures/gui/realms/adventure.png");
   private static final agg O = new agg("textures/gui/realms/survival_spawn.png");
   private static final agg P = new agg("textures/gui/realms/new_world.png");
   private static final agg Q = new agg("textures/gui/realms/experience.png");
   private static final agg R = new agg("textures/gui/realms/inspiration.png");
   epj S;
   epj T;
   epj U;
   epj V;
   public final int b;
   @Nullable
   private final erz W;
   private final Runnable X;
   private final exw Y = new exw(this);

   private eqp(fah $$0, eor $$1, int $$2, ur $$3, ur $$4, int $$5, ur $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public eqp(fah $$0, eor $$1, int $$2, ur $$3, ur $$4, int $$5, ur $$6, @Nullable erz $$7, Runnable $$8) {
      super($$3);
      this.H = $$0;
      this.I = $$1;
      this.b = $$2;
      this.J = $$4;
      this.K = $$5;
      this.L = $$6;
      this.W = $$7;
      this.X = $$8;
   }

   public static eqp a(fah $$0, eor $$1, erz $$2, Runnable $$3) {
      return new eqp($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static eqp a(fah $$0, int $$1, eor $$2, Runnable $$3) {
      return new eqp($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static eqp a(fah $$0, eor $$1, Runnable $$2) {
      return new eqp($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aO_() {
      eya $$0 = eya.d();
      $$0.a(new evt(this.e, this.i), exz::b);
      $$0.a(eyb.b(3));
      $$0.a(new evt(this.J, this.i).i(this.K), exz::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eoa $$0 = eoa.a();

            try {
               epj $$1 = $$0.a(1, 10, eor.d.a);
               epj $$2 = $$0.a(1, 10, eor.d.c);
               epj $$3 = $$0.a(1, 10, eor.d.d);
               epj $$4 = $$0.a(1, 10, eor.d.e);
               eqp.this.f.execute(() -> {
                  eqp.this.S = $$1;
                  eqp.this.T = $$2;
                  eqp.this.U = $$3;
                  eqp.this.V = $$4;
               });
            } catch (epn var6) {
               eqp.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new eqp.a(this.a(1), h(0) + 10, eqo.a, P, $$0x -> this.f.a(new eqo(this::a, this.e))));
      this.d(new eqp.a(this.a(2), h(0) + 10, eqq.a, M, $$0x -> this.f.a(new eqq(this.I.a, this.b, this))));
      this.d(new eqp.a(this.a(3), h(0) + 10, D, O, $$0x -> this.f.a(new eqr(D, this::a, eor.d.a, this.S))));
      this.d(new eqp.a(this.a(1), h(6) + 20, E, N, $$0x -> this.f.a(new eqr(E, this::a, eor.d.c, this.T))));
      this.d(new eqp.a(this.a(2), h(6) + 20, F, Q, $$0x -> this.f.a(new eqr(F, this::a, eor.d.d, this.U))));
      this.d(new eqp.a(this.a(3), h(6) + 20, G, R, $$0x -> this.f.a(new eqr(G, this::a, eor.d.e, this.V))));
      this.Y.b(eum.a(uq.k, $$0x -> this.aE_()).a());
      this.Y.a($$1 -> {
         euk var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public ur h() {
      return uq.a(this.m(), this.J);
   }

   @Override
   public void aE_() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable epi $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((err)(new eru($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable erk $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((err)(new ert($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(err $$0) {
      List<err> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new ery(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eqh(this.H, $$1.toArray(new err[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new eqh(this.H, new ery(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends eum {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final agg t;

      a(int $$0, int $$1, ur $$2, agg $$3, eum.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(eub $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.n();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.p();
         int $$6 = this.r();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(eqp.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(eqp.this.i, this.l(), $$5 + 30, $$6, $$7);
      }
   }
}

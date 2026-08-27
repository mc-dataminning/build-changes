import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djx extends dcq implements dkf {
   public static final MapCodec<djx> c = b(djx::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final drf<dro> f = dqx.bo;
   public static final drh g = dqx.aT;
   public static final dqy h = dqx.C;
   protected static final eui i = dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = din.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends djx> a() {
      return c;
   }

   public djx(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dro.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      in $$1 = $$0.a();
      ema $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == emb.c));
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(h) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (m($$0) != dro.b) {
         if (m($$0) == dro.c) {
            $$1.a($$2, $$0.a(f, dro.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avc.vT, avd.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != brn.bl && $$0.c_($$1) instanceof dot $$5 && $$0 instanceof aqh $$6 && $$5.gs().a($$6, $$1, dva.P, dva.a.a($$2))) {
         $$5.f().b($$6, dva.P, dva.a.a($$3), $$3.dl());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dro.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dad $$0, in $$1, dqh $$2) {
      dde $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dot($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return !$$0.B ? a($$2, dno.I, ($$0x, $$1x, $$2x, $$3) -> dvj.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return i;
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$3 == is.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dro m(dqh $$0) {
      return $$0.c(f);
   }

   public static boolean n(dqh $$0) {
      return m($$0) == dro.a;
   }

   public static void a(dad $$0, in $$1, dqh $$2) {
      $$0.a($$1, $$2.a(f, dro.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable brh $$0, dad $$1, in $$2, dqh $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dro.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dva.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avc.vS, avd.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable brh $$0, dad $$1, in $$2, int $$3) {
      for (is $$4 : is.values()) {
         in $$5 = $$2.a($$4);
         dqh $$6 = $$1.a_($$5);
         if ($$6.a(avr.bV)) {
            $$1.a(dvj.b($$3), $$5, dva.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avc.I, avd.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if (m($$0) == dro.b) {
         is $$4 = is.b($$3);
         if ($$4 != is.b && $$4 != is.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(kq.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      if ($$1.c_($$2) instanceof dot $$4) {
         return m($$0) == dro.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, boo.a(5));
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dox extends dhq implements dpf {
   public static final MapCodec<dox> c = b(dox::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dwh<dwq> f = dvz.bo;
   public static final dwj g = dvz.aT;
   public static final dwa h = dvz.C;
   protected static final fah i = die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dnm.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dox> a() {
      return c;
   }

   public dox(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dwq.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      jh $$1 = $$0.a();
      erk $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == erl.c));
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(h) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (o($$0) != dwq.b) {
         if (o($$0) == dwq.c) {
            $$1.a($$2, $$0.b(f, dwq.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awl.wg, awm.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
      if (!$$0.y_() && q($$2) && $$3.ar() != bul.bm && $$0.c_($$1) instanceof dtv $$5 && $$0 instanceof arn $$6 && $$5.gx().a($$6, $$1, eag.P, eag.a.a($$2))) {
         $$5.f().b($$6, eag.P, eag.a.a($$3), $$3.dv());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dwq.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dfb $$0, jh $$1, dvj $$2) {
      die $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return !$$0.C ? a($$2, dso.I, ($$0x, $$1x, $$2x, $$3) -> eap.c.a($$0x, $$3.gw(), $$3.gx())) : null;
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return i;
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dwq o(dvj $$0) {
      return $$0.c(f);
   }

   public static boolean q(dvj $$0) {
      return o($$0) == dwq.a;
   }

   public static void a(dfb $$0, jh $$1, dvj $$2) {
      $$0.a($$1, $$2.b(f, dwq.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bue $$0, dfb $$1, jh $$2, dvj $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dwq.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eag.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.wf, awm.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bue $$0, dfb $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dvj $$6 = $$1.a_($$5);
         if ($$6.a(axa.bW)) {
            $$1.a(eap.b($$3), $$5, eag.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awl.I, awm.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if (o($$0) == dwq.b) {
         jm $$4 = jm.b($$3);
         if ($$4 != jm.b && $$4 != jm.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ll.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dtv $$4) {
         return o($$0) == dwq.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brf.a(5));
      }
   }
}

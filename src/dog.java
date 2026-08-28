import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dog extends dgy implements doo {
   public static final MapCodec<dog> c = b(dog::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dvq<dvz> f = dvi.bo;
   public static final dvs g = dvi.aT;
   public static final dvj h = dvi.C;
   protected static final ezq i = dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dmv.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dog> a() {
      return c;
   }

   public dog(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dvz.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      jf $$1 = $$0.a();
      eqt $$2 = $$0.q().b_($$1);
      return this.n().b(h, Boolean.valueOf($$2.a() == equ.c));
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(h) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (o($$0) != dvz.b) {
         if (o($$0) == dvz.c) {
            $$1.a($$2, $$0.b(f, dvz.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awg.wi, awh.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
      if (!$$0.x_() && q($$2) && $$3.ao() != bty.bm && $$0.c_($$1) instanceof dte $$5 && $$0 instanceof arj $$6 && $$5.gr().a($$6, $$1, dzp.P, dzp.a.a($$2))) {
         $$5.f().b($$6, dzp.P, dzp.a.a($$3), $$3.dq());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dvz.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dej $$0, jf $$1, dus $$2) {
      dhm $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dte($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return !$$0.B ? a($$2, drx.I, ($$0x, $$1x, $$2x, $$3) -> dzy.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return i;
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$3 == jk.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dvz o(dus $$0) {
      return $$0.c(f);
   }

   public static boolean q(dus $$0) {
      return o($$0) == dvz.a;
   }

   public static void a(dej $$0, jf $$1, dus $$2) {
      $$0.a($$1, $$2.b(f, dvz.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable btr $$0, dej $$1, jf $$2, dus $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dvz.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dzp.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awg.wh, awh.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable btr $$0, dej $$1, jf $$2, int $$3) {
      for (jk $$4 : jk.values()) {
         jf $$5 = $$2.a($$4);
         dus $$6 = $$1.a_($$5);
         if ($$6.a(awv.bW)) {
            $$1.a(dzy.b($$3), $$5, dzp.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awg.I, awh.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if (o($$0) == dvz.b) {
         jk $$4 = jk.b($$3);
         if ($$4 != jk.b && $$4 != jk.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(li.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      if ($$1.c_($$2) instanceof dte $$4) {
         return o($$0) == dvz.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqu.a(5));
      }
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkp extends dby {
   public static final MapCodec<dkp> a = b(dkp::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final est g = dby.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final est h = dby.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dpz e = dpp.aE;
   public static final dpz f = dpp.aD;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cyx $$0, doz $$1, ib $$2, bpv $$3, float $$4) {
      if (!($$3 instanceof chs)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cyx $$0, doz $$1, ib $$2, bpv $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dca.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cyx $$0, ib $$1, doz $$2) {
      $$0.a(null, $$1, aum.zM, aun.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dts.f, $$1, dts.a.a($$2));
         $$0.c(2001, $$1, dby.i($$2));
      }
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, aum.zN, aun.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dts.c, $$2, dts.a.a($$0));
         } else {
            $$1.a(null, $$2, aum.zO, aun.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dts.f, $$2, dts.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dby.i($$0));
               cde $$6 = bqb.bg.a((cyx)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(cyd $$0, ib $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cyd $$0, ib $$1) {
      return $$0.a_($$1).a(avc.H);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(cyx $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cyx $$0, cjt $$1, ib $$2, doz $$3, @Nullable dmf $$4, crj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e, f);
   }

   private boolean a(cyx $$0, bpv $$1) {
      if ($$1 instanceof cde || $$1 instanceof cby) {
         return false;
      } else {
         return !($$1 instanceof bqo) ? false : $$1 instanceof cjt || $$0.aa().b(cyt.c);
      }
   }
}

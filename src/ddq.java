import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddq extends cva {
   public static final MapCodec<ddq> a = b(ddq::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ekn g = cva.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ekn h = cva.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dii e = dhy.aE;
   public static final dii f = dhy.aD;

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public ddq(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, bkq $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      if (!($$3 instanceof ccb)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(csa $$0, dhi $$1, ht $$2, bkq $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cvc.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(csa $$0, ht $$1, dhi $$2) {
      $$0.a(null, $$1, aqr.yQ, aqs.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dls.f, $$1, dls.a.a($$2));
         $$0.c(2001, $$1, cva.i($$2));
      }
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, aqr.yR, aqs.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dls.c, $$2, dls.a.a($$0));
         } else {
            $$1.a(null, $$2, aqr.yS, aqs.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dls.f, $$2, dls.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cva.i($$0));
               bxs $$6 = bku.bd.a((csa)$$1);
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

   public static boolean a(crg $$0, ht $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(crg $$0, ht $$1) {
      return $$0.a_($$1).a(arg.H);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(csa $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(csa $$0, cdu $$1, ht $$2, dhi $$3, @Nullable dfd $$4, clj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e, f);
   }

   private boolean a(csa $$0, bkq $$1) {
      if ($$1 instanceof bxs || $$1 instanceof bwm) {
         return false;
      } else {
         return !($$1 instanceof blg) ? false : $$1 instanceof cdu || $$0.Y().b(crw.c);
      }
   }
}

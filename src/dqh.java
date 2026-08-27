import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dqh extends drc<dta> {
   private static final ImmutableList<cvz> a = ImmutableList.of(cwb.H, cwb.F, cwb.kJ, cwb.dW, cwb.fn, cwb.fo, cwb.fp, cwb.fq, cwb.cv, cwb.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int an = 15;

   public dqh(Codec<dta> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dta> $$0) {
      int $$1 = $$0.c().e();
      hv $$2 = $$0.e();
      ctt $$3 = $$0.b();
      auf $$4 = $$0.d();
      dta $$5 = $$0.f();
      if (!a($$3, $$1, $$2.j())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (hv $$11 : hv.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(csz $$0, int $$1, hv $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (hv $$6 : hv.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         hv $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.j(), $$7) : a($$0, $$6.j(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (hv.a $$10 = $$8.j(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (hv)$$10)) {
                  this.a($$0, $$10, cwb.dY.o());
                  $$10.c(ia.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(cwb.dY)) {
                     break;
                  }

                  $$10.c(ia.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static hv a(csz $$0, int $$1, hv.a $$2, int $$3) {
      while ($$2.v() > $$0.J_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(ia.a);
      }

      return null;
   }

   private static boolean a(csz $$0, int $$1, hv.a $$2) {
      if (!a($$0, $$1, (hv)$$2)) {
         return false;
      } else {
         dip $$3 = $$0.a_($$2.c(ia.a));
         $$2.c(ia.b);
         return !$$3.i() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static hv a(csz $$0, hv.a $$1, int $$2) {
      while ($$1.v() < $$0.ak() && $$2 > 0) {
         $$2--;
         dip $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.i()) {
            return $$1;
         }

         $$1.c(ia.b);
      }

      return null;
   }

   private static boolean a(csz $$0, int $$1, hv $$2) {
      dip $$3 = $$0.a_($$2);
      return $$3.i() || $$3.a(cwb.H) && $$2.v() <= $$1;
   }
}

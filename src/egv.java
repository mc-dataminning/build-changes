import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egv extends ehr<ejp> {
   private static final ImmutableList<dku> a = ImmutableList.of(dkw.K, dkw.I, dkw.ll, dkw.ej, dkw.fI, dkw.fJ, dkw.fK, dkw.fL, dkw.cD, dkw.cA);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int ao = 15;

   public egv(Codec<ejp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ejp> $$0) {
      int $$1 = $$0.c().f();
      jj $$2 = $$0.e();
      dio $$3 = $$0.b();
      azs $$4 = $$0.d();
      ejp $$5 = $$0.f();
      if (!a($$3, $$1, $$2.k())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (jj $$11 : jj.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(dhq $$0, int $$1, jj $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (jj $$6 : jj.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         jj $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.k(), $$7) : a($$0, $$6.k(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (jj.a $$10 = $$8.k(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (jj)$$10)) {
                  this.a($$0, $$10, dkw.el.m());
                  $$10.c(jo.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dkw.el)) {
                     break;
                  }

                  $$10.c(jo.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static jj a(dhq $$0, int $$1, jj.a $$2, int $$3) {
      while ($$2.v() > $$0.G_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(jo.a);
      }

      return null;
   }

   private static boolean a(dhq $$0, int $$1, jj.a $$2) {
      if (!a($$0, $$1, (jj)$$2)) {
         return false;
      } else {
         dym $$3 = $$0.a_($$2.c(jo.a));
         $$2.c(jo.b);
         return !$$3.l() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static jj a(dhq $$0, jj.a $$1, int $$2) {
      while ($$1.v() <= $$0.ao() && $$2 > 0) {
         $$2--;
         dym $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.l()) {
            return $$1;
         }

         $$1.c(jo.b);
      }

      return null;
   }

   private static boolean a(dhq $$0, int $$1, jj $$2) {
      dym $$3 = $$0.a_($$2);
      return $$3.l() || $$3.a(dkw.K) && $$2.v() <= $$1;
   }
}

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejz extends ekw<emu> {
   private static final ImmutableList<dno> a = ImmutableList.of(dnq.K, dnq.I, dnq.lp, dnq.en, dnq.fM, dnq.fN, dnq.fO, dnq.fP, dnq.cG, dnq.cD);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int ap = 15;

   public ejz(Codec<emu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<emu> $$0) {
      int $$1 = $$0.c().f();
      iw $$2 = $$0.e();
      dli $$3 = $$0.b();
      bai $$4 = $$0.d();
      emu $$5 = $$0.f();
      if (!a($$3, $$1, $$2.k())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (iw $$11 : iw.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(dkk $$0, int $$1, iw $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (iw $$6 : iw.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         iw $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.k(), $$7) : a($$0, $$6.k(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (iw.a $$10 = $$8.k(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (iw)$$10)) {
                  this.a($$0, $$10, dnq.ep.m());
                  $$10.c(jc.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dnq.ep)) {
                     break;
                  }

                  $$10.c(jc.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static iw a(dkk $$0, int $$1, iw.a $$2, int $$3) {
      while ($$2.v() > $$0.K_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(jc.a);
      }

      return null;
   }

   private static boolean a(dkk $$0, int $$1, iw.a $$2) {
      if (!a($$0, $$1, (iw)$$2)) {
         return false;
      } else {
         ebq $$3 = $$0.a_($$2.c(jc.a));
         $$2.c(jc.b);
         return !$$3.l() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static iw a(dkk $$0, iw.a $$1, int $$2) {
      while ($$1.v() <= $$0.ao() && $$2 > 0) {
         $$2--;
         ebq $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.l()) {
            return $$1;
         }

         $$1.c(jc.b);
      }

      return null;
   }

   private static boolean a(dkk $$0, int $$1, iw $$2) {
      ebq $$3 = $$0.a_($$2);
      return $$3.l() || $$3.a(dnq.K) && $$2.v() <= $$1;
   }
}

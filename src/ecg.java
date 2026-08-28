import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecg extends edc<efa> {
   private static final ImmutableList<dgv> a = ImmutableList.of(dgx.H, dgx.F, dgx.kJ, dgx.dW, dgx.fn, dgx.fo, dgx.fp, dgx.fq, dgx.cv, dgx.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int ao = 15;

   public ecg(Codec<efa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efa> $$0) {
      int $$1 = $$0.c().f();
      je $$2 = $$0.e();
      dep $$3 = $$0.b();
      azk $$4 = $$0.d();
      efa $$5 = $$0.f();
      if (!a($$3, $$1, $$2.k())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (je $$11 : je.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(ddt $$0, int $$1, je $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (je $$6 : je.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         je $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.k(), $$7) : a($$0, $$6.k(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (je.a $$10 = $$8.k(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (je)$$10)) {
                  this.a($$0, $$10, dgx.dY.o());
                  $$10.c(jj.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dgx.dY)) {
                     break;
                  }

                  $$10.c(jj.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static je a(ddt $$0, int $$1, je.a $$2, int $$3) {
      while ($$2.v() > $$0.G_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(jj.a);
      }

      return null;
   }

   private static boolean a(ddt $$0, int $$1, je.a $$2) {
      if (!a($$0, $$1, (je)$$2)) {
         return false;
      } else {
         dua $$3 = $$0.a_($$2.c(jj.a));
         $$2.c(jj.b);
         return !$$3.l() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static je a(ddt $$0, je.a $$1, int $$2) {
      while ($$1.v() < $$0.an() && $$2 > 0) {
         $$2--;
         dua $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.l()) {
            return $$1;
         }

         $$1.c(jj.b);
      }

      return null;
   }

   private static boolean a(ddt $$0, int $$1, je $$2) {
      dua $$3 = $$0.a_($$2);
      return $$3.l() || $$3.a(dgx.H) && $$2.v() <= $$1;
   }
}

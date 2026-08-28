import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebi extends ecd<eeb> {
   private static final ImmutableList<dfy> a = ImmutableList.of(dga.H, dga.F, dga.kJ, dga.dW, dga.fn, dga.fo, dga.fp, dga.fq, dga.cv, dga.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int an = 15;

   public ebi(Codec<eeb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eeb> $$0) {
      int $$1 = $$0.c().f();
      jd $$2 = $$0.e();
      dds $$3 = $$0.b();
      ayw $$4 = $$0.d();
      eeb $$5 = $$0.f();
      if (!a($$3, $$1, $$2.k())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (jd $$11 : jd.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(dcx $$0, int $$1, jd $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (jd $$6 : jd.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         jd $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.k(), $$7) : a($$0, $$6.k(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (jd.a $$10 = $$8.k(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (jd)$$10)) {
                  this.a($$0, $$10, dga.dY.o());
                  $$10.c(ji.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dga.dY)) {
                     break;
                  }

                  $$10.c(ji.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static jd a(dcx $$0, int $$1, jd.a $$2, int $$3) {
      while ($$2.v() > $$0.I_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(ji.a);
      }

      return null;
   }

   private static boolean a(dcx $$0, int $$1, jd.a $$2) {
      if (!a($$0, $$1, (jd)$$2)) {
         return false;
      } else {
         dtc $$3 = $$0.a_($$2.c(ji.a));
         $$2.c(ji.b);
         return !$$3.i() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static jd a(dcx $$0, jd.a $$1, int $$2) {
      while ($$1.v() < $$0.am() && $$2 > 0) {
         $$2--;
         dtc $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.i()) {
            return $$1;
         }

         $$1.c(ji.b);
      }

      return null;
   }

   private static boolean a(dcx $$0, int $$1, jd $$2) {
      dtc $$3 = $$0.a_($$2);
      return $$3.i() || $$3.a(dga.H) && $$2.v() <= $$1;
   }
}

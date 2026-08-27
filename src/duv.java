import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class duv extends dvq<dxo> {
   private static final ImmutableList<daa> a = ImmutableList.of(dac.H, dac.F, dac.kJ, dac.dW, dac.fn, dac.fo, dac.fp, dac.fq, dac.cv, dac.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int an = 15;

   public duv(Codec<dxo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dxo> $$0) {
      int $$1 = $$0.c().e();
      ib $$2 = $$0.e();
      cxu $$3 = $$0.b();
      axd $$4 = $$0.d();
      dxo $$5 = $$0.f();
      if (!a($$3, $$1, $$2.j())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (ib $$11 : ib.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(cxa $$0, int $$1, ib $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (ib $$6 : ib.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         ib $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.j(), $$7) : a($$0, $$6.j(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (ib.a $$10 = $$8.j(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (ib)$$10)) {
                  this.a($$0, $$10, dac.dY.o());
                  $$10.c(ih.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dac.dY)) {
                     break;
                  }

                  $$10.c(ih.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static ib a(cxa $$0, int $$1, ib.a $$2, int $$3) {
      while ($$2.v() > $$0.I_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(ih.a);
      }

      return null;
   }

   private static boolean a(cxa $$0, int $$1, ib.a $$2) {
      if (!a($$0, $$1, (ib)$$2)) {
         return false;
      } else {
         dmz $$3 = $$0.a_($$2.c(ih.a));
         $$2.c(ih.b);
         return !$$3.i() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static ib a(cxa $$0, ib.a $$1, int $$2) {
      while ($$1.v() < $$0.ak() && $$2 > 0) {
         $$2--;
         dmz $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.i()) {
            return $$1;
         }

         $$1.c(ih.b);
      }

      return null;
   }

   private static boolean a(cxa $$0, int $$1, ib $$2) {
      dmz $$3 = $$0.a_($$2);
      return $$3.i() || $$3.a(dac.H) && $$2.v() <= $$1;
   }
}

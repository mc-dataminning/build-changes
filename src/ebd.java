import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebd extends eca<eee> {
   private static final ImmutableList<dfc> a = ImmutableList.of(
      dfe.am, dfe.al, dfe.ak, dfe.lH, dfe.iP, dfe.eK, dfe.gf, dfe.gg, dfe.gh, dfe.gi, dfe.dg, dfe.de, new dfc[0]
   );
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int au = 15;

   public ebd(Codec<eee> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eee> $$0) {
      int $$1 = $$0.c().e();
      ir $$2 = $$0.e();
      dcv $$3 = $$0.b();
      ayt $$4 = $$0.d();
      eee $$5 = $$0.f();
      if (!a($$3, $$1, $$2.j())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (ir $$11 : ir.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4), $$5.c());
            }
         }

         return $$10;
      }
   }

   private boolean a(dcb $$0, int $$1, ir $$2, int $$3, int $$4, dtc $$5) {
      boolean $$6 = false;

      for (ir $$7 : ir.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$8 = $$7.k($$2);
         ir $$9 = a($$0, $$1, $$7) ? a($$0, $$1, $$7.j(), $$8) : a($$0, $$7.j(), $$8);
         if ($$9 != null) {
            int $$10 = $$3 - $$8 / 2;

            for (ir.a $$11 = $$9.j(); $$10 >= 0; $$10--) {
               if (a($$0, $$1, (ir)$$11)) {
                  this.a($$0, $$11, $$5);
                  $$11.d(iw.b);
                  $$6 = true;
               } else {
                  if (!$$0.a_($$11).a(dfe.eM) && !$$0.a_($$11).a(dfe.qu)) {
                     break;
                  }

                  $$11.d(iw.b);
               }
            }
         }
      }

      return $$6;
   }

   @Nullable
   private static ir a(dcb $$0, int $$1, ir.a $$2, int $$3) {
      while ($$2.v() > $$0.J_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.d(iw.a);
      }

      return null;
   }

   private static boolean a(dcb $$0, int $$1, ir.a $$2) {
      if (!a($$0, $$1, (ir)$$2)) {
         return false;
      } else {
         dtc $$3 = $$0.a_($$2.d(iw.a));
         $$2.d(iw.b);
         return !$$3.i() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static ir a(dcb $$0, ir.a $$1, int $$2) {
      while ($$1.v() < $$0.am() && $$2 > 0) {
         $$2--;
         dtc $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.i()) {
            return $$1;
         }

         $$1.d(iw.b);
      }

      return null;
   }

   private static boolean a(dcb $$0, int $$1, ir $$2) {
      dtc $$3 = $$0.a_($$2);
      return $$3.i() || $$3.a(dfe.am) && $$2.v() <= $$1;
   }
}

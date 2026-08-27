import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxz extends dyu<eas> {
   private static final ImmutableList<dcv> a = ImmutableList.of(dcx.H, dcx.F, dcx.kJ, dcx.dW, dcx.fn, dcx.fo, dcx.fp, dcx.fq, dcx.cv, dcx.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int an = 15;

   public dxz(Codec<eas> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<eas> $$0) {
      int $$1 = $$0.c().e();
      im $$2 = $$0.e();
      dap $$3 = $$0.b();
      ayd $$4 = $$0.d();
      eas $$5 = $$0.f();
      if (!a($$3, $$1, $$2.j())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (im $$11 : im.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(czv $$0, int $$1, im $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (im $$6 : im.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         im $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.j(), $$7) : a($$0, $$6.j(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (im.a $$10 = $$8.j(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (im)$$10)) {
                  this.a($$0, $$10, dcx.dY.n());
                  $$10.c(ir.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dcx.dY)) {
                     break;
                  }

                  $$10.c(ir.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static im a(czv $$0, int $$1, im.a $$2, int $$3) {
      while ($$2.v() > $$0.I_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(ir.a);
      }

      return null;
   }

   private static boolean a(czv $$0, int $$1, im.a $$2) {
      if (!a($$0, $$1, (im)$$2)) {
         return false;
      } else {
         dpy $$3 = $$0.a_($$2.c(ir.a));
         $$2.c(ir.b);
         return !$$3.i() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static im a(czv $$0, im.a $$1, int $$2) {
      while ($$1.v() < $$0.al() && $$2 > 0) {
         $$2--;
         dpy $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.i()) {
            return $$1;
         }

         $$1.c(ir.b);
      }

      return null;
   }

   private static boolean a(czv $$0, int $$1, im $$2) {
      dpy $$3 = $$0.a_($$2);
      return $$3.i() || $$3.a(dcx.H) && $$2.v() <= $$1;
   }
}

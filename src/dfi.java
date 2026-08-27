import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfi extends dch {
   public static final MapCodec<dfi> a = b(dfi::new);

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   protected dfi(dpx.d $$0) {
      super($$0);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dot($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.v, $$0.B ? dot::a : dot::b);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      dnd $$4 = $$1.c_($$2);
      if ($$4 instanceof dot) {
         int $$5 = ((dot)$$4).f();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(kw.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return csd.i;
   }

   @Override
   protected boolean a(dpy $$0, elq $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgn extends ddm {
   public static final MapCodec<dgn> a = b(dgn::new);

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   protected dgn(drc.d $$0) {
      super($$0);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.v, $$0.B ? dpy::a : dpy::b);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      doi $$4 = $$1.c_($$2);
      if ($$4 instanceof dpy) {
         int $$5 = ((dpy)$$4).f();

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

            $$1.a(ky.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return ctq.i;
   }

   @Override
   protected boolean a(drd $$0, emv $$1) {
      return false;
   }
}

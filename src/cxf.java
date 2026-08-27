import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxf extends cuf {
   public static final MapCodec<cxf> a = b(cxf::new);

   @Override
   public MapCodec<cxf> a() {
      return a;
   }

   protected cxf(dgv.d $$0) {
      super($$0);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dgg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.v, $$0.B ? dgg::a : dgg::b);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      der $$4 = $$1.c_($$2);
      if ($$4 instanceof dgg) {
         int $$5 = ((dgg)$$4).g();

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

            $$1.a(js.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return clb.b;
   }

   @Override
   public boolean a(dgw $$0, ecf $$1) {
      return false;
   }
}

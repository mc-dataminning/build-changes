import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxs extends cur {
   public static final MapCodec<cxs> a = b(cxs::new);

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   protected cxs(dhm.d $$0) {
      super($$0);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.v, $$0.B ? dgx::a : dgx::b);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      dfi $$4 = $$1.c_($$2);
      if ($$4 instanceof dgx) {
         int $$5 = ((dgx)$$4).g();

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

            $$1.a(jw.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return clo.b;
   }

   @Override
   public boolean a(dhn $$0, ecw $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhl extends dek {
   public static final MapCodec<dhl> a = b(dhl::new);

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(dsa.d $$0) {
      super($$0);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.v, $$0.B ? dqw::a : dqw::b);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      dpg $$4 = $$1.c_($$2);
      if ($$4 instanceof dqw) {
         int $$5 = ((dqw)$$4).f();

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

            $$1.a(li.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return cuo.l;
   }

   @Override
   protected boolean a(dsb $$0, ent $$1) {
      return false;
   }
}

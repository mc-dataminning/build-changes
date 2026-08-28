import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhk extends dej {
   public static final MapCodec<dhk> a = b(dhk::new);

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   protected dhk(drz.d $$0) {
      super($$0);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.v, $$0.B ? dqv::a : dqv::b);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      dpf $$4 = $$1.c_($$2);
      if ($$4 instanceof dqv) {
         int $$5 = ((dqv)$$4).f();

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
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return cun.l;
   }

   @Override
   protected boolean a(dsa $$0, ens $$1) {
      return false;
   }
}

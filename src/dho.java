import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dho extends den {
   public static final MapCodec<dho> a = b(dho::new);

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   protected dho(dsd.d $$0) {
      super($$0);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.v, $$0.B ? dqz::a : dqz::b);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      dpj $$4 = $$1.c_($$2);
      if ($$4 instanceof dqz) {
         int $$5 = ((dqz)$$4).f();

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
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return cur.l;
   }

   @Override
   protected boolean a(dse $$0, enw $$1) {
      return false;
   }
}

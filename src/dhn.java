import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhn extends dem {
   public static final MapCodec<dhn> a = b(dhn::new);

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dsc.d $$0) {
      super($$0);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.v, $$0.B ? dqy::a : dqy::b);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      dpi $$4 = $$1.c_($$2);
      if ($$4 instanceof dqy) {
         int $$5 = ((dqy)$$4).f();

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
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return cuq.l;
   }

   @Override
   protected boolean a(dsd $$0, env $$1) {
      return false;
   }
}

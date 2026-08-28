import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhv extends deu {
   public static final MapCodec<dhv> a = b(dhv::new);

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(dsk.d $$0) {
      super($$0);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.v, $$0.B ? drh::a : drh::b);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      dpq $$4 = $$1.c_($$2);
      if ($$4 instanceof drh) {
         int $$5 = ((drh)$$4).f();

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

            $$1.a(lj.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return cud.l;
   }

   @Override
   protected boolean a(dsl $$0, eoi $$1) {
      return false;
   }
}

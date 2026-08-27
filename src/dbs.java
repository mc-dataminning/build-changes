import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbs extends cyr {
   public static final MapCodec<dbs> a = b(dbs::new);

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   protected dbs(dmd.d $$0) {
      super($$0);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dla($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.v, $$0.B ? dla::a : dla::b);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      djl $$4 = $$1.c_($$2);
      if ($$4 instanceof dla) {
         int $$5 = ((dla)$$4).f();

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

            $$1.a(kb.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return cpq.h;
   }

   @Override
   protected boolean a(dme $$0, ehq $$1) {
      return false;
   }
}

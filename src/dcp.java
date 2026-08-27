import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcp extends czo {
   public static final MapCodec<dcp> a = b(dcp::new);

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   protected dcp(dna.d $$0) {
      super($$0);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.v, $$0.B ? dlx::a : dlx::b);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      dki $$4 = $$1.c_($$2);
      if ($$4 instanceof dlx) {
         int $$5 = ((dlx)$$4).f();

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

            $$1.a(kc.aa, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return cqm.h;
   }

   @Override
   protected boolean a(dnb $$0, eio $$1) {
      return false;
   }
}

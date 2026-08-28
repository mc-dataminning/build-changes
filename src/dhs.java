import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhs extends der {
   public static final MapCodec<dhs> a = b(dhs::new);

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   protected dhs(dsg.d $$0) {
      super($$0);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.v, $$0.B ? drd::a : drd::b);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      dpn $$4 = $$1.c_($$2);
      if ($$4 instanceof drd) {
         int $$5 = ((drd)$$4).f();

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
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return cua.l;
   }

   @Override
   protected boolean a(dsh $$0, eoa $$1) {
      return false;
   }
}

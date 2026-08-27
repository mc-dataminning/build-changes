import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deu extends dbt {
   public static final MapCodec<deu> a = b(deu::new);

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   protected deu(dph.d $$0) {
      super($$0);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new doe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.v, $$0.B ? doe::a : doe::b);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      dmo $$4 = $$1.c_($$2);
      if ($$4 instanceof doe) {
         int $$5 = ((doe)$$4).f();

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

            $$1.a(kn.aa, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return crs.i;
   }

   @Override
   protected boolean a(dpi $$0, ela $$1) {
      return false;
   }
}

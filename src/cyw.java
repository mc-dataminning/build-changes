import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyw extends cvv {
   public static final MapCodec<cyw> a = b(cyw::new);

   @Override
   public MapCodec<cyw> a() {
      return a;
   }

   protected cyw(diz.d $$0) {
      super($$0);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new did($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.v, $$0.B ? did::a : did::b);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      dgo $$4 = $$1.c_($$2);
      if ($$4 instanceof did) {
         int $$5 = ((did)$$4).g();

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

            $$1.a(jx.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return cmr.f;
   }

   @Override
   public boolean a(dja $$0, eej $$1) {
      return false;
   }
}

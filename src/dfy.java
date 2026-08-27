import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfy extends cxn {
   public static final MapCodec<dfy> c = b(dfy::new);

   @Override
   public MapCodec<dfy> a() {
      return c;
   }

   protected dfy(dli.d $$0) {
      super($$0);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$0, $$2, diz.B);
   }

   @Override
   protected void a(cvr $$0, hz $$1, chl $$2) {
      dix $$3 = $$0.c_($$1);
      if ($$3 instanceof dkj) {
         $$2.a((bma)$$3);
         $$2.a(atv.at);
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atl.xD, atm.e, 1.0F, 1.0F, false);
         }

         $$1.a(jz.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

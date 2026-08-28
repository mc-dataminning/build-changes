import com.mojang.serialization.MapCodec;

public class dta extends doc {
   public static final MapCodec<dta> b = b(dta::new);

   protected dta(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dta> a() {
      return b;
   }

   @Override
   protected fcr c(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dxu $$0) {
      return true;
   }
}

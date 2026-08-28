import com.mojang.serialization.MapCodec;

public class doj extends djm {
   public static final MapCodec<doj> b = b(doj::new);

   protected doj(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends doj> a() {
      return b;
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.a();
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return 1.0F;
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return true;
   }
}

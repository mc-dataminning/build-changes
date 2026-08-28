import com.mojang.serialization.MapCodec;

public class dsc extends dnc {
   public static final MapCodec<dsc> b = b(dsc::new);

   protected dsc(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dsc> a() {
      return b;
   }

   @Override
   protected fbt c(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.a();
   }

   @Override
   protected float c(dww $$0, dfm $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dww $$0) {
      return true;
   }
}

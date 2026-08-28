import com.mojang.serialization.MapCodec;

public class dsb extends dnb {
   public static final MapCodec<dsb> b = b(dsb::new);

   protected dsb(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dsb> a() {
      return b;
   }

   @Override
   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.a();
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dwv $$0) {
      return true;
   }
}

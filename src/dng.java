import com.mojang.serialization.MapCodec;

public class dng extends dik {
   public static final MapCodec<dng> b = b(dng::new);

   protected dng(drw.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dng> a() {
      return b;
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.a();
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return true;
   }
}

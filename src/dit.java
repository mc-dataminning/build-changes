import com.mojang.serialization.MapCodec;

public abstract class dit extends dex {
   public static final dsu aE = dsq.R;

   protected dit(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dit> a();

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

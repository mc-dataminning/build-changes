import com.mojang.serialization.MapCodec;

public abstract class ddx extends dac {
   public static final dnv aE = dnr.R;

   protected ddx(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddx> a();

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

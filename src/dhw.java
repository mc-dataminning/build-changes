import com.mojang.serialization.MapCodec;

public abstract class dhw extends dea {
   public static final drx aE = drt.R;

   protected dhw(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhw> a();

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

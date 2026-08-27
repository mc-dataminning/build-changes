import com.mojang.serialization.MapCodec;

public abstract class dcj extends cyo {
   public static final dlz aE = dlv.R;

   protected dcj(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcj> a();

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

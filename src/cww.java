import com.mojang.serialization.MapCodec;

public abstract class cww extends ctc {
   public static final dfx aE = dft.R;

   protected cww(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cww> a();

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

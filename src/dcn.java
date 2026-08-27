import com.mojang.serialization.MapCodec;

public abstract class dcn extends cys {
   public static final dmd aE = dlz.R;

   protected dcn(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcn> a();

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

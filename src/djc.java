import com.mojang.serialization.MapCodec;

public abstract class djc extends dfc {
   public static final dtw aE = dts.R;

   protected djc(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djc> a();

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

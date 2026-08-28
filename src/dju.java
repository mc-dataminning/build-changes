import com.mojang.serialization.MapCodec;

public abstract class dju extends dfy {
   public static final dtw aE = dts.R;

   protected dju(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dju> a();

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

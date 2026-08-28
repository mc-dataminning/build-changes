import com.mojang.serialization.MapCodec;

public abstract class djb extends dff {
   public static final dtb aE = dsx.R;

   protected djb(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djb> a();

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

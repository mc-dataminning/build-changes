import com.mojang.serialization.MapCodec;

public abstract class dje extends dfi {
   public static final dtf aE = dtb.R;

   protected dje(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dje> a();

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

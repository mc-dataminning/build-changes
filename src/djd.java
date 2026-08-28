import com.mojang.serialization.MapCodec;

public abstract class djd extends dfh {
   public static final dte aE = dta.R;

   protected djd(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djd> a();

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

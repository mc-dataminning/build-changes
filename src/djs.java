import com.mojang.serialization.MapCodec;

public abstract class djs extends dfw {
   public static final dtu aE = dtq.R;

   protected djs(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djs> a();

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

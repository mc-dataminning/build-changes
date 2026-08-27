import com.mojang.serialization.MapCodec;

public abstract class dda extends czf {
   public static final dmy aE = dmu.R;

   protected dda(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dda> a();

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

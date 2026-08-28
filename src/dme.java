import com.mojang.serialization.MapCodec;

public abstract class dme extends dij {
   public static final dwl<jm> aF = dwe.R;

   protected dme(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dme> a();

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}

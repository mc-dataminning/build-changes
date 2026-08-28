import com.mojang.serialization.MapCodec;

public abstract class dix extends dfb {
   public static final dsy aE = dsu.R;

   protected dix(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dix> a();

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

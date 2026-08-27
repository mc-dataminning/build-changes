import com.mojang.serialization.MapCodec;

public abstract class ddv extends daa {
   public static final dnt aE = dnp.R;

   protected ddv(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddv> a();

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}

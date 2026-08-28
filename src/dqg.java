import com.mojang.serialization.MapCodec;

public abstract class dqg extends dmf {
   public static final ebf<ja> e = eax.T;

   protected dqg(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqg> a();

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}

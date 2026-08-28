import com.mojang.serialization.MapCodec;

public abstract class dqn extends dmm {
   public static final ebm<jb> e = ebe.T;

   protected dqn(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqn> a();

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}

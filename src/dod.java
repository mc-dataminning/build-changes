import com.mojang.serialization.MapCodec;

public abstract class dod extends dke {
   public static final dyo<jn> e = dyg.T;

   protected dod(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dod> a();

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}

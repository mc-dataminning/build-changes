import com.mojang.serialization.MapCodec;

public abstract class doc extends dke {
   public static final dyk<jm> aF = dyd.S;

   protected doc(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends doc> a();

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}

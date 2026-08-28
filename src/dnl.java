import com.mojang.serialization.MapCodec;

public abstract class dnl extends djn {
   public static final dxv<jn> aF = dxo.U;

   protected dnl(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnl> a();

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}

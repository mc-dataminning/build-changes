import com.mojang.serialization.MapCodec;

public abstract class dnk extends djm {
   public static final dxu<jn> aF = dxn.U;

   protected dnk(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnk> a();

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}

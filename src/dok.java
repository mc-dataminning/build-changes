import com.mojang.serialization.MapCodec;

public abstract class dok extends dkm {
   public static final dys<jm> aF = dyl.S;

   protected dok(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dok> a();

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}

import com.mojang.serialization.MapCodec;

public abstract class dni extends djk {
   public static final dxs<jn> aF = dxl.U;

   protected dni(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dni> a();

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(aF, $$1.a($$0.c(aF)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(aF)));
   }
}

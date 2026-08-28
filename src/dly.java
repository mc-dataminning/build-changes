import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dly extends dmm implements dpg {
   protected dly(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dly> a();

   @Override
   protected boolean a(eao $$0, djh $$1, iv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dxm $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      dxm $$3 = $$1.c_($$2);
      return $$3 instanceof bui ? (bui)$$3 : null;
   }

   @Nullable
   protected static <E extends dxm, A extends dxm> dxn<A> a(dxo<A> $$0, dxo<E> $$1, dxn<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

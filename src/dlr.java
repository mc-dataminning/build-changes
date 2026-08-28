import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlr extends dmf implements doz {
   protected dlr(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlr> a();

   @Override
   protected boolean a(eah $$0, dja $$1, iu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dxf $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      dxf $$3 = $$1.c_($$2);
      return $$3 instanceof buf ? (buf)$$3 : null;
   }

   @Nullable
   protected static <E extends dxf, A extends dxf> dxg<A> a(dxh<A> $$0, dxh<E> $$1, dxg<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

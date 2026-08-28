import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmd extends dmr implements dpl {
   protected dmd(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmd> a();

   @Override
   protected boolean a(eat $$0, djm $$1, iv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dxr $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      dxr $$3 = $$1.c_($$2);
      return $$3 instanceof bui ? (bui)$$3 : null;
   }

   @Nullable
   protected static <E extends dxr, A extends dxr> dxs<A> a(dxt<A> $$0, dxt<E> $$1, dxs<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

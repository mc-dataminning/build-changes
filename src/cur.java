import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cur extends cvf implements cxx {
   protected cur(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cur> a();

   @Override
   public dbk b_(dhn $$0) {
      return dbk.a;
   }

   @Override
   public boolean a(dhn $$0, csf $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dfi $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      dfi $$3 = $$1.c_($$2);
      return $$3 instanceof bje ? (bje)$$3 : null;
   }

   @Nullable
   protected static <E extends dfi, A extends dfi> dfj<A> a(dfk<A> $$0, dfk<E> $$1, dfj<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

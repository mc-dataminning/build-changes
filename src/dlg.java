import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlg extends dlu implements don {
   protected dlg(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlg> a();

   @Override
   protected boolean a(dzo $$0, dip $$1, iu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dwn $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      dwn $$3 = $$1.c_($$2);
      return $$3 instanceof bua ? (bua)$$3 : null;
   }

   @Nullable
   protected static <E extends dwn, A extends dwn> dwo<A> a(dwp<A> $$0, dwp<E> $$1, dwo<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

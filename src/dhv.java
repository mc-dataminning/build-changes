import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhv extends dij implements dlb {
   protected dhv(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhv> a();

   @Override
   protected dop a_(dvo $$0) {
      return dop.a;
   }

   @Override
   protected boolean a(dvo $$0, dff $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsr $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      dsr $$3 = $$1.c_($$2);
      return $$3 instanceof bsj ? (bsj)$$3 : null;
   }

   @Nullable
   protected static <E extends dsr, A extends dsr> dss<A> a(dst<A> $$0, dst<E> $$1, dss<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

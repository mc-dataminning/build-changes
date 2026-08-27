import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cso extends ctc implements cvs {
   protected cso(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cso> a();

   @Override
   public czg b_(dfd $$0) {
      return czg.a;
   }

   @Override
   public boolean a(dfd $$0, cqb $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcz $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      dcz $$3 = $$1.c_($$2);
      return $$3 instanceof bhh ? (bhh)$$3 : null;
   }

   @Nullable
   protected static <E extends dcz, A extends dcz> dda<A> a(ddb<A> $$0, ddb<E> $$1, dda<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

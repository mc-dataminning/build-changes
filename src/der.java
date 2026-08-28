import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class der extends dff implements dhx {
   protected der(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends der> a();

   @Override
   protected dll a_(dsh $$0) {
      return dll.a;
   }

   @Override
   protected boolean a(dsh $$0, dcd $$1, ja $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpn $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      dpn $$3 = $$1.c_($$2);
      return $$3 instanceof bqh ? (bqh)$$3 : null;
   }

   @Nullable
   protected static <E extends dpn, A extends dpn> dpo<A> a(dpp<A> $$0, dpp<E> $$1, dpo<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

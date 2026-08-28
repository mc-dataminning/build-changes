import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class deu extends dfi implements dia {
   protected deu(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends deu> a();

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.a;
   }

   @Override
   protected boolean a(dsl $$0, dcg $$1, ja $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpq $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      dpq $$3 = $$1.c_($$2);
      return $$3 instanceof bql ? (bql)$$3 : null;
   }

   @Nullable
   protected static <E extends dpq, A extends dpq> dpr<A> a(dps<A> $$0, dps<E> $$1, dpr<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

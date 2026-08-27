import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbt extends dch implements dez {
   protected dbt(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbt> a();

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected boolean a(dpi $$0, czg $$1, id $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dmo $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      dmo $$3 = $$1.c_($$2);
      return $$3 instanceof boj ? (boj)$$3 : null;
   }

   @Nullable
   protected static <E extends dmo, A extends dmo> dmp<A> a(dmq<A> $$0, dmq<E> $$1, dmp<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

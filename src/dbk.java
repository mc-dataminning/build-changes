import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbk extends dby implements deq {
   protected dbk(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbk> a();

   @Override
   protected did b_(doz $$0) {
      return did.a;
   }

   @Override
   protected boolean a(doz $$0, cyx $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dmf $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      dmf $$3 = $$1.c_($$2);
      return $$3 instanceof boe ? (boe)$$3 : null;
   }

   @Nullable
   protected static <E extends dmf, A extends dmf> dmg<A> a(dmh<A> $$0, dmh<E> $$1, dmg<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

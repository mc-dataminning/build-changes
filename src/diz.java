import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diz extends djn implements dmg {
   protected diz(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   @Override
   protected boolean a(dwy $$0, dgj $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dua $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      dua $$3 = $$1.c_($$2);
      return $$3 instanceof bsn ? (bsn)$$3 : null;
   }

   @Nullable
   protected static <E extends dua, A extends dua> dub<A> a(duc<A> $$0, duc<E> $$1, dub<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

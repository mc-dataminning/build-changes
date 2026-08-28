import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dix extends djl implements dme {
   protected dix(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dix> a();

   @Override
   protected boolean a(dww $$0, dgh $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dty $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      dty $$3 = $$1.c_($$2);
      return $$3 instanceof bsl ? (bsl)$$3 : null;
   }

   @Nullable
   protected static <E extends dty, A extends dty> dtz<A> a(dua<A> $$0, dua<E> $$1, dtz<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

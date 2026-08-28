import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dna extends dno implements dqi {
   protected dna(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dna> a();

   @Override
   protected boolean a(ebq $$0, dkj $$1, iw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dyo $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      dyo $$3 = $$1.c_($$2);
      return $$3 instanceof bve ? (bve)$$3 : null;
   }

   @Nullable
   protected static <E extends dyo, A extends dyo> dyp<A> a(dyq<A> $$0, dyq<E> $$1, dyp<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

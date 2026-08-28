import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgh extends dgv implements djn {
   protected dgh(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgh> a();

   @Override
   protected dnc a_(dua $$0) {
      return dnc.a;
   }

   @Override
   protected boolean a(dua $$0, dds $$1, je $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dre $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      dre $$3 = $$1.c_($$2);
      return $$3 instanceof brm ? (brm)$$3 : null;
   }

   @Nullable
   protected static <E extends dre, A extends dre> drf<A> a(drg<A> $$0, drg<E> $$1, drf<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

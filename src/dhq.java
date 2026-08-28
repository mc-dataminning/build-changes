import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhq extends die implements dkw {
   protected dhq(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhq> a();

   @Override
   protected dok a_(dvj $$0) {
      return dok.a;
   }

   @Override
   protected boolean a(dvj $$0, dfb $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsm $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      dsm $$3 = $$1.c_($$2);
      return $$3 instanceof bsf ? (bsf)$$3 : null;
   }

   @Nullable
   protected static <E extends dsm, A extends dsm> dsn<A> a(dso<A> $$0, dso<E> $$1, dsn<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

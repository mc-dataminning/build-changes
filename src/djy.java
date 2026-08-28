import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djy extends dkm implements dng {
   protected djy(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djy> a();

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.a;
   }

   @Override
   protected boolean a(dxv $$0, dhi $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dux $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      dux $$3 = $$1.c_($$2);
      return $$3 instanceof btl ? (btl)$$3 : null;
   }

   @Nullable
   protected static <E extends dux, A extends dux> duy<A> a(duz<A> $$0, duz<E> $$1, duy<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

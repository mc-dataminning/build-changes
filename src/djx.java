import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djx extends dkl implements dnf {
   protected djx(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djx> a();

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.a;
   }

   @Override
   protected boolean a(dxu $$0, dhh $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      duw $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      duw $$3 = $$1.c_($$2);
      return $$3 instanceof btk ? (btk)$$3 : null;
   }

   @Nullable
   protected static <E extends duw, A extends duw> dux<A> a(duy<A> $$0, duy<E> $$1, dux<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

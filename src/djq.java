import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djq extends dke implements dmy {
   protected djq(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djq> a();

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.a;
   }

   @Override
   protected boolean a(dxn $$0, dha $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dup $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      dup $$3 = $$1.c_($$2);
      return $$3 instanceof btg ? (btg)$$3 : null;
   }

   @Nullable
   protected static <E extends dup, A extends dup> duq<A> a(dur<A> $$0, dur<E> $$1, duq<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

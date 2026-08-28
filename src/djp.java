import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djp extends dkd implements dmw {
   protected djp(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djp> a();

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.a;
   }

   @Override
   protected boolean a(dxo $$0, dgz $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      duq $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      duq $$3 = $$1.c_($$2);
      return $$3 instanceof btc ? (btc)$$3 : null;
   }

   @Nullable
   protected static <E extends duq, A extends duq> dur<A> a(dus<A> $$0, dus<E> $$1, dur<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

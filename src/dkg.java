import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkg extends dku implements dnn {
   protected dkg(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkg> a();

   @Override
   protected boolean a(dym $$0, dhp $$1, jj $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dvl $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      dvl $$3 = $$1.c_($$2);
      return $$3 instanceof bts ? (bts)$$3 : null;
   }

   @Nullable
   protected static <E extends dvl, A extends dvl> dvm<A> a(dvn<A> $$0, dvn<E> $$1, dvm<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

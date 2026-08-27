import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czm extends daa implements dcs {
   protected czm(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czm> a();

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.a;
   }

   @Override
   protected boolean a(dmz $$0, cwz $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dkg $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      dkg $$3 = $$1.c_($$2);
      return $$3 instanceof bng ? (bng)$$3 : null;
   }

   @Nullable
   protected static <E extends dkg, A extends dkg> dkh<A> a(dki<A> $$0, dki<E> $$1, dkh<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

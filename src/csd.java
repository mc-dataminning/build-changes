import javax.annotation.Nullable;

public abstract class csd extends csq implements cve {
   protected csd(dfd.d $$0) {
      super($$0);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.a;
   }

   @Override
   public boolean a(dfe $$0, cpq $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcq $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      dcq $$3 = $$1.c_($$2);
      return $$3 instanceof bgw ? (bgw)$$3 : null;
   }

   @Nullable
   protected static <E extends dcq, A extends dcq> dcr<A> a(dcs<A> $$0, dcs<E> $$1, dcr<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

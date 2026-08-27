import javax.annotation.Nullable;

public abstract class csi extends csv implements cvj {
   protected csi(dfi.d $$0) {
      super($$0);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.a;
   }

   @Override
   public boolean a(dfj $$0, cpv $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcv $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      dcv $$3 = $$1.c_($$2);
      return $$3 instanceof bhb ? (bhb)$$3 : null;
   }

   @Nullable
   protected static <E extends dcv, A extends dcv> dcw<A> a(dcx<A> $$0, dcx<E> $$1, dcw<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

import javax.annotation.Nullable;

public abstract class cpa extends cpn implements csb {
   protected cpa(dca.d $$0) {
      super($$0);
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.a;
   }

   @Override
   public boolean a(dcb $$0, cmm $$1, gu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czn $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bea b(dcb $$0, cmm $$1, gu $$2) {
      czn $$3 = $$1.c_($$2);
      return $$3 instanceof bea ? (bea)$$3 : null;
   }

   @Nullable
   protected static <E extends czn, A extends czn> czo<A> a(czp<A> $$0, czp<E> $$1, czo<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

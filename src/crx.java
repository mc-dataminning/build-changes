import javax.annotation.Nullable;

public abstract class crx extends csk implements cuy {
   protected crx(dex.d $$0) {
      super($$0);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.a;
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dck $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      dck $$3 = $$1.c_($$2);
      return $$3 instanceof bgr ? (bgr)$$3 : null;
   }

   @Nullable
   protected static <E extends dck, A extends dck> dcl<A> a(dcm<A> $$0, dcm<E> $$1, dcl<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

import javax.annotation.Nullable;

public abstract class csk extends csx implements cvl {
   protected csk(dfk.d $$0) {
      super($$0);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.a;
   }

   @Override
   public boolean a(dfl $$0, cpx $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcx $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      dcx $$3 = $$1.c_($$2);
      return $$3 instanceof bhd ? (bhd)$$3 : null;
   }

   @Nullable
   protected static <E extends dcx, A extends dcx> dcy<A> a(dcz<A> $$0, dcz<E> $$1, dcy<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

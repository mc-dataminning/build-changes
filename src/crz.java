import javax.annotation.Nullable;

public abstract class crz extends csm implements cva {
   protected crz(dez.d $$0) {
      super($$0);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.a;
   }

   @Override
   public boolean a(dfa $$0, cpm $$1, gu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcm $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      dcm $$3 = $$1.c_($$2);
      return $$3 instanceof bgt ? (bgt)$$3 : null;
   }

   @Nullable
   protected static <E extends dcm, A extends dcm> dcn<A> a(dco<A> $$0, dco<E> $$1, dcn<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}

public interface cmo extends cmb<bgj> {
   @Override
   default cme<?> f() {
      return cme.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default ciy h() {
      return new ciy(csn.ob);
   }

   boolean a(ciy var1);

   boolean b(ciy var1);

   boolean c(ciy var1);
}

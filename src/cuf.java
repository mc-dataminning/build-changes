public interface cuf extends ctp<bmw> {
   @Override
   default ctu<?> e() {
      return ctu.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cqm g() {
      return new cqm(dae.ob);
   }

   boolean a(cqm var1);

   boolean b(cqm var1);

   boolean c(cqm var1);
}

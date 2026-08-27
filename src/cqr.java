public interface cqr extends cqb<bjt> {
   @Override
   default cqg<?> e() {
      return cqg.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cmx g() {
      return new cmx(cwr.ob);
   }

   boolean a(cmx var1);

   boolean b(cmx var1);

   boolean c(cmx var1);
}

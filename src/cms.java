public interface cms extends cme<bgm> {
   @Override
   default cmi<?> e() {
      return cmi.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cja g() {
      return new cja(csr.ob);
   }

   boolean a(cja var1);

   boolean b(cja var1);

   boolean c(cja var1);
}

public interface csv extends csf<blp> {
   @Override
   default csk<?> e() {
      return csk.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cpd g() {
      return new cpd(cyu.ob);
   }

   boolean a(cpd var1);

   boolean b(cpd var1);

   boolean c(cpd var1);
}

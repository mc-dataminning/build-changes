public interface cmx extends cmj<bgr> {
   @Override
   default cmn<?> e() {
      return cmn.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cjf g() {
      return new cjf(csw.ob);
   }

   boolean a(cjf var1);

   boolean b(cjf var1);

   boolean c(cjf var1);
}

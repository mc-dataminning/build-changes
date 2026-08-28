public interface dw<T> extends ct {
   @Override
   default boolean a(cuo $$0) {
      T $$1 = $$0.a(this.a());
      return $$1 != null && this.a($$0, $$1);
   }

   kp<T> a();

   boolean a(cuo var1, T var2);
}

public interface dw<T> extends ct {
   @Override
   default boolean a(cvl $$0) {
      T $$1 = $$0.a(this.a());
      return $$1 != null && this.a($$0, $$1);
   }

   kq<T> a();

   boolean a(cvl var1, T var2);
}

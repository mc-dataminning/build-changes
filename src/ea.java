public interface ea<T> extends cw {
   @Override
   default boolean a(cwp $$0) {
      T $$1 = $$0.a(this.a());
      return $$1 != null && this.a($$0, $$1);
   }

   ku<T> a();

   boolean a(cwp var1, T var2);
}

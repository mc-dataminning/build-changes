public interface dbx extends dca {
   float a(ji var1, boolean var2);

   eon y_();

   int a(jd var1, dcf var2);

   default int a(ddd $$0, jd $$1) {
      return this.y_().a($$0).b($$1);
   }

   default int b(jd $$0, int $$1) {
      return this.y_().a($$0, $$1);
   }

   default boolean h(jd $$0) {
      return this.a(ddd.a, $$0) >= this.Q();
   }
}

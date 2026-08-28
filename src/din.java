public interface din extends diq {
   float a(jb var1, boolean var2);

   ewp x_();

   int a(iv var1, diw var2);

   default int a(djv $$0, iv $$1) {
      return this.x_().a($$0).b($$1);
   }

   default int b(iv $$0, int $$1) {
      return this.x_().a($$0, $$1);
   }

   default boolean h(iv $$0) {
      return this.a(djv.a, $$0) >= 15;
   }
}

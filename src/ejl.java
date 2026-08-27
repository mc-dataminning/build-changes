public interface ejl extends bhu {
   ckj v();

   ckj c(int var1);

   void b(ckj var1);

   ddx w();

   default ckj ax_() {
      return this.c(this.aj_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean ai_() {
      return this.v().b();
   }

   @Override
   default void a() {
      this.ax_();
   }

   @Override
   default ckj b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default ckj a(int $$0) {
      return $$0 == 0 ? this.v() : ckj.b;
   }

   @Override
   default ckj a(int $$0, int $$1) {
      return $$0 != 0 ? ckj.b : this.c($$1);
   }

   @Override
   default void a(int $$0, ckj $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(ccx $$0) {
      return bhu.a(this.w(), $$0);
   }
}

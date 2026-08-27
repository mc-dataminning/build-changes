public interface ein extends bgx {
   cjl i();

   cjl c(int var1);

   void a(cjl var1);

   dcz j();

   default cjl av_() {
      return this.c(this.ag_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean af_() {
      return this.i().b();
   }

   @Override
   default void a() {
      this.av_();
   }

   @Override
   default cjl b(int $$0) {
      return this.a($$0, this.ag_());
   }

   @Override
   default cjl a(int $$0) {
      return $$0 == 0 ? this.i() : cjl.b;
   }

   @Override
   default cjl a(int $$0, int $$1) {
      return $$0 != 0 ? cjl.b : this.c($$1);
   }

   @Override
   default void a(int $$0, cjl $$1) {
      if ($$0 == 0) {
         this.a($$1);
      }
   }

   @Override
   default boolean a(cca $$0) {
      return bgx.a(this.j(), $$0);
   }
}

public interface eko extends bij {
   clb v();

   clb c(int var1);

   void b(clb var1);

   der w();

   default clb aA_() {
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
      this.aA_();
   }

   @Override
   default clb b(int $$0) {
      return this.a($$0, this.aj_());
   }

   @Override
   default clb a(int $$0) {
      return $$0 == 0 ? this.v() : clb.b;
   }

   @Override
   default clb a(int $$0, int $$1) {
      return $$0 != 0 ? clb.b : this.c($$1);
   }

   @Override
   default void a(int $$0, clb $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   @Override
   default boolean a(cdm $$0) {
      return bij.a(this.w(), $$0);
   }
}

public interface ecd extends ebt {
   void b(int var1);

   void c(int var1);

   void d(int var1);

   void a(float var1);

   default void a(gu $$0, float $$1) {
      this.b($$0.u());
      this.c($$0.v());
      this.d($$0.w());
      this.a($$1);
   }
}

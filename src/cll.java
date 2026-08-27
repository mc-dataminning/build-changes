public interface cll extends bto<clo> {
   clk gA();

   void a(clk var1);

   default clo a() {
      return this.gA().a();
   }

   default void a(clo $$0) {
      this.a(this.gA().a($$0));
   }
}

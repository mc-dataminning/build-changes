public interface cnv extends bvv<cny> {
   cnu gF();

   void a(cnu var1);

   default cny a() {
      return this.gF().a();
   }

   default void a(cny $$0) {
      this.a(this.gF().a($$0));
   }
}

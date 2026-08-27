public interface cka extends bsd<ckd> {
   cjz gA();

   void a(cjz var1);

   default ckd a() {
      return this.gA().a();
   }

   default void a(ckd $$0) {
      this.a(this.gA().a($$0));
   }
}

public interface ckw extends bsz<ckz> {
   ckv gA();

   void a(ckv var1);

   default ckz a() {
      return this.gA().a();
   }

   default void a(ckz $$0) {
      this.a(this.gA().a($$0));
   }
}

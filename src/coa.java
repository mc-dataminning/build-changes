public interface coa extends bwa<cod> {
   cnz gE();

   void a(cnz var1);

   default cod a() {
      return this.gE().a();
   }

   default void a(cod $$0) {
      this.a(this.gE().a($$0));
   }
}

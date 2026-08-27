public interface cha extends bph<chd> {
   cgz gr();

   void a(cgz var1);

   default chd a() {
      return this.gr().a();
   }

   default void a(chd $$0) {
      this.a(this.gr().a($$0));
   }
}

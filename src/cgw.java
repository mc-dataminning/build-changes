public interface cgw extends bpd<cgz> {
   cgv gr();

   void a(cgv var1);

   default cgz a() {
      return this.gr().a();
   }

   default void a(cgz $$0) {
      this.a(this.gr().a($$0));
   }
}

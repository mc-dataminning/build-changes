public interface cml extends buo<cmo> {
   cmk gB();

   void a(cmk var1);

   default cmo a() {
      return this.gB().a();
   }

   default void a(cmo $$0) {
      this.a(this.gB().a($$0));
   }
}

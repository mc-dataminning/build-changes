public interface cmn extends buq<cmq> {
   cmm gB();

   void a(cmm var1);

   default cmq a() {
      return this.gB().a();
   }

   default void a(cmq $$0) {
      this.a(this.gB().a($$0));
   }
}

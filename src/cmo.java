public interface cmo extends bur<cmr> {
   cmn gB();

   void a(cmn var1);

   default cmr a() {
      return this.gB().a();
   }

   default void a(cmr $$0) {
      this.a(this.gB().a($$0));
   }
}

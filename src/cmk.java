public interface cmk extends bun<cmn> {
   cmj gB();

   void a(cmj var1);

   default cmn a() {
      return this.gB().a();
   }

   default void a(cmn $$0) {
      this.a(this.gB().a($$0));
   }
}

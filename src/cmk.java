public interface cmk extends bum<cmn> {
   cmj gx();

   void a(cmj var1);

   default cmn a() {
      return this.gx().a();
   }

   default void a(cmn $$0) {
      this.a(this.gx().a($$0));
   }
}

public final class bst implements bsn {
   private final wp a;
   private final ctl b;

   public bst(ctl $$0, wp $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public wp p_() {
      return this.a;
   }

   @Override
   public csd createMenu(int $$0, cox $$1, coy $$2) {
      return this.b.createMenu($$0, $$1, $$2);
   }
}

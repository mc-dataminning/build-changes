public final class bmv implements bmp {
   private final vs a;
   private final cma b;

   public bmv(cma $$0, vs $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public vs Q_() {
      return this.a;
   }

   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      return this.b.createMenu($$0, $$1, $$2);
   }
}

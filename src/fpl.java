public class fpl extends fob<crm> {
   private static final alf D = new alf("textures/gui/container/shulker_box.png");

   public fpl(crm $$0, cmw $$1, xp $$2) {
      super($$0, $$1, $$2);
      this.d++;
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fgr $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
   }
}

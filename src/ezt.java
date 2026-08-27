public class ezt extends ezd<cfi> {
   private static final aez x = new aez("textures/gui/container/dispenser.png");

   public ezt(cfi $$0, cbz $$1, tl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(erz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
   }
}

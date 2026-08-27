public class emu implements emv {
   private final czu b;

   public emu(czu $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ir $$0, dpy $$1, im $$2, im $$3, int $$4, int $$5) {
      emv.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(im $$0, dcv $$1, im $$2) {
      dpy $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dpy $$0, im $$1, dcv $$2, im $$3, boolean $$4) {
      emv.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}

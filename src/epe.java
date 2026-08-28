public class epe implements epf {
   private final dcd b;

   public epe(dcd $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jf $$0, dsh $$1, ja $$2, ja $$3, int $$4, int $$5) {
      epf.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ja $$0, dff $$1, ja $$2) {
      dsh $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dsh $$0, ja $$1, dff $$2, ja $$3, boolean $$4) {
      epf.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}

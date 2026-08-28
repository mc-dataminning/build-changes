public class epk implements epl {
   private final dcf b;

   public epk(dcf $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jf $$0, dsk $$1, ja $$2, ja $$3, int $$4, int $$5) {
      epl.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ja $$0, dfh $$1, ja $$2) {
      dsk $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dsk $$0, ja $$1, dfh $$2, ja $$3, boolean $$4) {
      epl.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}

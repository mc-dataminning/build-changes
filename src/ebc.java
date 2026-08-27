public class ebc implements ebd {
   private final cpk b;

   public ebc(cpk $$0) {
      this.b = $$0;
   }

   @Override
   public void a(hb $$0, dey $$1, gv $$2, gv $$3, int $$4, int $$5) {
      ebd.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(gv $$0, csk $$1, gv $$2) {
      dey $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dey $$0, gv $$1, csk $$2, gv $$3, boolean $$4) {
      ebd.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}

public class fos extends foa<cqc> {
   private static final akk D = new akk("textures/gui/container/dispenser.png");

   public fos(cqc $$0, cmk $$1, wu $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.r = (this.c - this.o.a(this.k)) / 2;
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.q);
   }
}

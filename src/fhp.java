public class fhp extends fhd {
   protected final fiq a;

   public fhp(int $$0, int $$1, int $$2, int $$3, fiq $$4, fhd.c $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, xn.a);
   }

   public fhp(int $$0, int $$1, int $$2, int $$3, fiq $$4, fhd.c $$5, xo $$6) {
      super($$0, $$1, $$2, $$3, $$6, $$5, q);
      this.a = $$4;
   }

   public fhp(int $$0, int $$1, fiq $$2, fhd.c $$3, xo $$4) {
      this(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void b(fgq $$0, int $$1, int $$2, float $$3) {
      ale $$4 = this.a.a(this.B(), this.A());
      $$0.a($$4, this.C(), this.D(), this.g, this.h);
   }
}

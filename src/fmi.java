public class fmi extends flw {
   protected final fnj a;

   public fmi(int $$0, int $$1, int $$2, int $$3, fnj $$4, flw.c $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, xk.a);
   }

   public fmi(int $$0, int $$1, int $$2, int $$3, fnj $$4, flw.c $$5, xl $$6) {
      super($$0, $$1, $$2, $$3, $$6, $$5, q);
      this.a = $$4;
   }

   public fmi(int $$0, int $$1, fnj $$2, flw.c $$3, xl $$4) {
      this(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      all $$4 = this.a.a(this.C(), this.B());
      $$0.a(gjh::B, $$4, this.D(), this.E(), this.g, this.h);
   }
}

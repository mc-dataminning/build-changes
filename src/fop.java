public class fop extends fod {
   protected final fpr a;

   public fop(int $$0, int $$1, int $$2, int $$3, fpr $$4, fod.c $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, xu.a);
   }

   public fop(int $$0, int $$1, int $$2, int $$3, fpr $$4, fod.c $$5, xv $$6) {
      super($$0, $$1, $$2, $$3, $$6, $$5, q);
      this.a = $$4;
   }

   public fop(int $$0, int $$1, fpr $$2, fod.c $$3, xv $$4) {
      this(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void b(fnq $$0, int $$1, int $$2, float $$3) {
      alz $$4 = this.a.a(this.C(), this.B());
      $$0.a(glt::B, $$4, this.D(), this.E(), this.g, this.h);
   }
}

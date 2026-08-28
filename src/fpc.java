public class fpc extends fop {
   protected final fqd a;

   public fpc(int $$0, int $$1, int $$2, int $$3, fqd $$4, fop.c $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, wn.a);
   }

   public fpc(int $$0, int $$1, int $$2, int $$3, fqd $$4, fop.c $$5, wo $$6) {
      super($$0, $$1, $$2, $$3, $$6, $$5, q);
      this.a = $$4;
   }

   public fpc(int $$0, int $$1, fqd $$2, fop.c $$3, wo $$4) {
      this(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      aku $$4 = this.a.a(this.E(), this.D());
      $$0.a(gmf::H, $$4, this.F(), this.G(), this.g, this.h);
   }
}

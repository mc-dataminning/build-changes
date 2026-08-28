public class fqz extends fqn {
   protected final fsa a;

   public fqz(int $$0, int $$1, int $$2, int $$3, fsa $$4, fqn.c $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, wu.a);
   }

   public fqz(int $$0, int $$1, int $$2, int $$3, fsa $$4, fqn.c $$5, wv $$6) {
      super($$0, $$1, $$2, $$3, $$6, $$5, q);
      this.a = $$4;
   }

   public fqz(int $$0, int $$1, fsa $$2, fqn.c $$3, wv $$4) {
      this(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      ald $$4 = this.a.a(this.E(), this.D());
      $$0.a(goi::H, $$4, this.F(), this.G(), this.g, this.h);
   }
}

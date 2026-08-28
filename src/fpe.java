public class fpe extends fof {
   private final fnq a;
   private final xv b;
   private final xv c;

   public fpe(int $$0, int $$1, int $$2, int $$3, xv $$4, fof.c $$5, fnq $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xy.a($$4.f(), ys.a.c(true));
   }

   @Override
   public void b(fns $$0, int $$1, int $$2, float $$3) {
      xv $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | bae.f(this.l * 255.0F) << 24);
   }
}

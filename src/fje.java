public class fje extends fig {
   private final fhr a;
   private final wy b;
   private final wy c;

   public fje(int $$0, int $$1, int $$2, int $$3, wy $$4, fig.c $$5, fhr $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xb.a($$4.f(), xv.a.c(true));
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      wy $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | ayn.f(this.l * 255.0F) << 24);
   }
}

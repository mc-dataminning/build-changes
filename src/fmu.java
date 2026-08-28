public class fmu extends flw {
   private final flh a;
   private final xl b;
   private final xl c;

   public fmu(int $$0, int $$1, int $$2, int $$3, xl $$4, flw.c $$5, flh $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xo.a($$4.f(), yi.a.c(true));
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      xl $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azn.f(this.l * 255.0F) << 24);
   }
}

public class fhx extends fgz {
   private final fgk a;
   private final xl b;
   private final xl c;

   public fhx(int $$0, int $$1, int $$2, int $$3, xl $$4, fgz.c $$5, fgk $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xo.a($$4.f(), yi.a.c(true));
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      xl $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | ayu.f(this.l * 255.0F) << 24);
   }
}

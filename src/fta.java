public class fta extends fsc {
   private final frm a;
   private final wy b;
   private final wy c;

   public fta(int $$0, int $$1, int $$2, int $$3, wy $$4, fsc.c $$5, frm $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xb.a($$4.f(), xv.a.c(true));
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      wy $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | azm.f(this.l * 255.0F) << 24);
   }
}

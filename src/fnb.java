public class fnb extends fmd {
   private final flo a;
   private final xj b;
   private final xj c;

   public fnb(int $$0, int $$1, int $$2, int $$3, xj $$4, fmd.c $$5, flo $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xm.a($$4.f(), yg.a.c(true));
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      xj $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azm.f(this.l * 255.0F) << 24);
   }
}

public class flm extends fko {
   private final fjz a;
   private final xe b;
   private final xe c;

   public flm(int $$0, int $$1, int $$2, int $$3, xe $$4, fko.c $$5, fjz $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xh.a($$4.f(), yb.a.c(true));
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      xe $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azf.f(this.l * 255.0F) << 24);
   }
}

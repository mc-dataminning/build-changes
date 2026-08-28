public class fmf extends flh {
   private final fks a;
   private final xi b;
   private final xi c;

   public fmf(int $$0, int $$1, int $$2, int $$3, xi $$4, flh.c $$5, fks $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xl.a($$4.f(), yf.a.c(true));
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      xi $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azk.f(this.l * 255.0F) << 24);
   }
}

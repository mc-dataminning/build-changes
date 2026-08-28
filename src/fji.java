public class fji extends fik {
   private final fhv a;
   private final wz b;
   private final wz c;

   public fji(int $$0, int $$1, int $$2, int $$3, wz $$4, fik.c $$5, fhv $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xc.a($$4.f(), xw.a.c(true));
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      wz $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | ayo.f(this.l * 255.0F) << 24);
   }
}

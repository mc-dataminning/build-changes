public class ewc extends eve {
   private final eur a;
   private final uv b;
   private final uv c;

   public ewc(int $$0, int $$1, int $$2, int $$3, uv $$4, eve.c $$5, eur $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = uy.a($$4.f(), vs.a.c(true));
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      uv $$4 = this.n() ? this.c : this.b;
      $$0.b(this.a, $$4, this.p(), this.r(), 16777215 | atq.f(this.k * 255.0F) << 24);
   }
}

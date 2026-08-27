public class exf extends ewh {
   private final evu a;
   private final vb b;
   private final vb c;

   public exf(int $$0, int $$1, int $$2, int $$3, vb $$4, ewh.c $$5, evu $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = ve.a($$4.f(), vy.a.c(true));
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      vb $$4 = this.n() ? this.c : this.b;
      $$0.b(this.a, $$4, this.p(), this.r(), 16777215 | aty.f(this.k * 255.0F) << 24);
   }
}

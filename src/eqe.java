public class eqe extends epi {
   private final eov a;
   private final sw b;
   private final sw c;

   public eqe(int $$0, int $$1, int $$2, int $$3, sw $$4, epi.c $$5, eov $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, x);
      this.a = $$6;
      this.b = $$4;
      this.c = sy.a($$4.e(), ts.a.c(true));
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      sw $$4 = this.n() ? this.c : this.b;
      $$0.b(this.a, $$4, this.p(), this.r(), 16777215 | apa.f(this.t * 255.0F) << 24);
   }
}

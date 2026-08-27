public class etq extends ess {
   private final esf a;
   private final tn b;
   private final tn c;

   public etq(int $$0, int $$1, int $$2, int $$3, tn $$4, ess.c $$5, esf $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = tp.a($$4.e(), uj.a.c(true));
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      tn $$4 = this.o() ? this.c : this.b;
      $$0.b(this.a, $$4, this.r(), this.t(), 16777215 | ary.f(this.k * 255.0F) << 24);
   }
}

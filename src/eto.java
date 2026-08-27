public class eto extends esq {
   private final esd a;
   private final tl b;
   private final tl c;

   public eto(int $$0, int $$1, int $$2, int $$3, tl $$4, esq.c $$5, esd $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = tn.a($$4.e(), uh.a.c(true));
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      tl $$4 = this.o() ? this.c : this.b;
      $$0.b(this.a, $$4, this.r(), this.t(), 16777215 | arx.f(this.k * 255.0F) << 24);
   }
}

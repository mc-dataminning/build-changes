public class eyd extends exf {
   private final ewr a;
   private final vf b;
   private final vf c;

   public eyd(int $$0, int $$1, int $$2, int $$3, vf $$4, exf.c $$5, ewr $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = vi.a($$4.f(), wc.a.c(true));
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      vf $$4 = this.z() ? this.c : this.b;
      $$0.b(this.a, $$4, this.B(), this.C(), 16777215 | aun.f(this.l * 255.0F) << 24);
   }
}

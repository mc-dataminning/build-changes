public class ete extends esg {
   private final ert a;
   private final tf b;
   private final tf c;

   public ete(int $$0, int $$1, int $$2, int $$3, tf $$4, esg.c $$5, ert $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = th.a($$4.e(), ub.a.c(true));
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      tf $$4 = this.o() ? this.c : this.b;
      $$0.b(this.a, $$4, this.r(), this.t(), 16777215 | arp.f(this.k * 255.0F) << 24);
   }
}

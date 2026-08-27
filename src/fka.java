public class fka extends fjp {
   private static final wi a = wi.c("options.skinCustomisation.title");

   public fka(fjx $$0, fcc $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      fhk $$0 = new fhk();
      $$0.c().f(5).e(4).b();
      fhk.b $$1 = $$0.d(2);

      for (ckb $$2 : ckb.values()) {
         $$1.a(fef.b(this.c.a($$2)).a($$2.d(), ($$1x, $$2x) -> this.c.a($$2, $$2x)));
      }

      $$1.a(this.c.v().a(this.c));
      this.d.c($$0);
      super.aM_();
   }
}

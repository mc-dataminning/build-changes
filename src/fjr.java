public class fjr extends fjg {
   private static final wg a = wg.c("options.skinCustomisation.title");

   public fjr(fjo $$0, fbt $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      fhb $$0 = new fhb();
      $$0.c().f(5).e(4).b();
      fhb.b $$1 = $$0.d(2);

      for (cju $$2 : cju.values()) {
         $$1.a(fdw.b(this.c.a($$2)).a($$2.d(), ($$1x, $$2x) -> this.c.a($$2, $$2x)));
      }

      $$1.a(this.c.v().a(this.c));
      this.d.c($$0);
      super.aN_();
   }
}

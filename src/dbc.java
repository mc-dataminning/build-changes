public class dbc extends dbv {
   public dbc(dno $$0, dno $$1, dag.a $$2) {
      super($$0, $$1, jc.a, $$2);
   }

   @Override
   public xg a(dak $$0) {
      ddk $$1 = $$0.a(kl.ak);
      return (xg)($$1 != null && $$1.c().isPresent() ? xg.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(dak $$0) {
      ddk $$1 = $$0.a(kl.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kl.ak, $$1x), eae.a);
      }
   }
}

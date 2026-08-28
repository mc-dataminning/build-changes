public class das extends dbl {
   public das(dne $$0, dne $$1, czw.a $$2) {
      super($$0, $$1, jc.a, $$2);
   }

   @Override
   public xc a(daa $$0) {
      dda $$1 = $$0.a(kl.ak);
      return (xc)($$1 != null && $$1.c().isPresent() ? xc.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(daa $$0) {
      dda $$1 = $$0.a(kl.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kl.ak, $$1x), dzu.a);
      }
   }
}

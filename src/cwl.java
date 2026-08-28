public class cwl extends cxf {
   public cwl(dhm $$0, dhm $$1, cvn.a $$2) {
      super($$0, $$1, $$2, jk.a);
   }

   @Override
   public xe m(cvs $$0) {
      cyv $$1 = $$0.a(ks.ab);
      return (xe)($$1 != null && $$1.c().isPresent() ? xe.a(this.a() + ".named", $$1.c().get()) : super.m($$0));
   }

   @Override
   public void l(cvs $$0) {
      cyv $$1 = $$0.a(ks.ab);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(ks.ab, $$1x), dtj.a);
      }
   }
}

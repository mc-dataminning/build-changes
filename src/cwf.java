public class cwf extends cwz {
   public cwf(dgv $$0, dgv $$1, cvg.a $$2) {
      super($$0, $$1, $$2, jj.a);
   }

   @Override
   public xd n(cvl $$0) {
      cyn $$1 = $$0.a(kr.Y);
      return (xd)($$1 != null && $$1.c().isPresent() ? xd.a(this.a() + ".named", $$1.c().get()) : super.n($$0));
   }

   @Override
   public void m(cvl $$0) {
      cyn $$1 = $$0.a(kr.Y);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kr.Y, $$1x), dss.a);
      }
   }
}

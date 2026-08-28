public class czk extends dad {
   public czk(dlu $$0, dlu $$1, cyo.a $$2) {
      super($$0, $$1, ja.a, $$2);
   }

   @Override
   public ww a(cys $$0) {
      dbs $$1 = $$0.a(kj.ak);
      return (ww)($$1 != null && $$1.c().isPresent() ? ww.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(cys $$0) {
      dbs $$1 = $$0.a(kj.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kj.ak, $$1x), dyd.a);
      }
   }
}

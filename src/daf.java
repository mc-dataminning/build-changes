public class daf extends day {
   public daf(dmr $$0, dmr $$1, czj.a $$2) {
      super($$0, $$1, jb.a, $$2);
   }

   @Override
   public wy a(czn $$0) {
      dcn $$1 = $$0.a(kk.ak);
      return (wy)($$1 != null && $$1.c().isPresent() ? wy.a(this.n + ".named", $$1.c().get()) : super.a($$0));
   }

   @Override
   public void l(czn $$0) {
      dcn $$1 = $$0.a(kk.ak);
      if ($$1 != null && !$$1.b()) {
         $$1.a().thenAcceptAsync($$1x -> $$0.b(kk.ak, $$1x), dzh.a);
      }
   }
}

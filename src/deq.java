public interface deq extends dfb<dep> {
   @Override
   default dfm<deq> b() {
      return dfm.a;
   }

   @Override
   dfl<? extends deq> a();

   deo c();

   default jp<dak> a(dep $$0) {
      return b($$0);
   }

   static jp<dak> b(dep $$0) {
      jp<dak> $$1 = jp.a($$0.a(), dak.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         dag $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default dfe h() {
      return switch (this.c()) {
         case a -> dfd.a;
         case c -> dfd.c;
         case b -> dfd.b;
         case d -> dfd.d;
      };
   }
}

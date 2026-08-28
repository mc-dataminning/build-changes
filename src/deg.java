public interface deg extends der<def> {
   @Override
   default dfc<deg> b() {
      return dfc.a;
   }

   @Override
   dfb<? extends deg> a();

   dee c();

   default jp<daa> a(def $$0) {
      return b($$0);
   }

   static jp<daa> b(def $$0) {
      jp<daa> $$1 = jp.a($$0.a(), daa.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czw $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default deu h() {
      return switch (this.c()) {
         case a -> det.a;
         case c -> det.c;
         case b -> det.b;
         case d -> det.d;
      };
   }
}

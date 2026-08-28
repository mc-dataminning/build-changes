public interface ddt extends dee<dds> {
   @Override
   default dep<ddt> b() {
      return dep.a;
   }

   @Override
   deo<? extends ddt> a();

   ddr c();

   default jo<czn> a(dds $$0) {
      return b($$0);
   }

   static jo<czn> b(dds $$0) {
      jo<czn> $$1 = jo.a($$0.a(), czn.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czj $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default deh h() {
      return switch (this.c()) {
         case a -> deg.a;
         case c -> deg.c;
         case b -> deg.b;
         case d -> deg.d;
      };
   }
}

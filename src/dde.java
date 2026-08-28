public interface dde extends ddp<ddd> {
   @Override
   default dea<dde> b() {
      return dea.a;
   }

   @Override
   ddz<? extends dde> a();

   ddc c();

   default jn<cyy> a(ddd $$0) {
      return b($$0);
   }

   static jn<cyy> b(ddd $$0) {
      jn<cyy> $$1 = jn.a($$0.a(), cyy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cyu $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default dds h() {
      return switch (this.c()) {
         case a -> ddr.a;
         case c -> ddr.c;
         case b -> ddr.b;
         case d -> ddr.d;
      };
   }
}

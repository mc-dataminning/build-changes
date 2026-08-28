public interface dbp extends dbz<dbo> {
   @Override
   default dcj<dbp> b() {
      return dcj.a;
   }

   @Override
   dci<? extends dbp> a();

   dbn c();

   default jz<cxk> a(dbo $$0) {
      return b($$0);
   }

   static jz<cxk> b(dbo $$0) {
      jz<cxk> $$1 = jz.a($$0.a(), cxk.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxg $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dbi h() {
      return switch (this.c()) {
         case a -> dbi.a;
         case c -> dbi.c;
         case b -> dbi.b;
         case d -> dbi.d;
      };
   }
}

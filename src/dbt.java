public interface dbt extends dce<dbs> {
   @Override
   default dcp<dbt> b() {
      return dcp.a;
   }

   @Override
   dco<? extends dbt> a();

   dbr c();

   default jz<cxp> a(dbs $$0) {
      return b($$0);
   }

   static jz<cxp> b(dbs $$0) {
      jz<cxp> $$1 = jz.a($$0.a(), cxp.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxl $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dch h() {
      return switch (this.c()) {
         case a -> dcg.a;
         case c -> dcg.c;
         case b -> dcg.b;
         case d -> dcg.d;
      };
   }
}

public interface dcy extends ddj<dcx> {
   @Override
   default ddu<dcy> b() {
      return ddu.a;
   }

   @Override
   ddt<? extends dcy> a();

   dcw c();

   default jn<cys> a(dcx $$0) {
      return b($$0);
   }

   static jn<cys> b(dcx $$0) {
      jn<cys> $$1 = jn.a($$0.a(), cys.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cyo $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default ddm h() {
      return switch (this.c()) {
         case a -> ddl.a;
         case c -> ddl.c;
         case b -> ddl.b;
         case d -> ddl.d;
      };
   }
}

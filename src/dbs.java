public interface dbs extends dcd<dbr> {
   @Override
   default dco<dbs> b() {
      return dco.a;
   }

   @Override
   dcn<? extends dbs> a();

   dbq c();

   default jz<cxo> a(dbr $$0) {
      return b($$0);
   }

   static jz<cxo> b(dbr $$0) {
      jz<cxo> $$1 = jz.a($$0.a(), cxo.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxk $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dcg h() {
      return switch (this.c()) {
         case a -> dcf.a;
         case c -> dcf.c;
         case b -> dcf.b;
         case d -> dcf.d;
      };
   }
}

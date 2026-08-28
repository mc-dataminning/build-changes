public interface dar extends dbc<daq> {
   @Override
   default dbn<dar> b() {
      return dbn.a;
   }

   @Override
   dbm<? extends dar> a();

   dap c();

   default ka<cwn> a(daq $$0) {
      return b($$0);
   }

   static ka<cwn> b(daq $$0) {
      ka<cwn> $$1 = ka.a($$0.a(), cwn.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwj $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dbf h() {
      return switch (this.c()) {
         case a -> dbe.a;
         case c -> dbe.c;
         case b -> dbe.b;
         case d -> dbe.d;
      };
   }
}

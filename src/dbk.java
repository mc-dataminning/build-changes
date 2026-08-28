public interface dbk extends dbv<dbj> {
   @Override
   default dcg<dbk> b() {
      return dcg.a;
   }

   @Override
   dcf<? extends dbk> a();

   dbi c();

   default jz<cxg> a(dbj $$0) {
      return b($$0);
   }

   static jz<cxg> b(dbj $$0) {
      jz<cxg> $$1 = jz.a($$0.a(), cxg.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxc $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dby h() {
      return switch (this.c()) {
         case a -> dbx.a;
         case c -> dbx.c;
         case b -> dbx.b;
         case d -> dbx.d;
      };
   }
}

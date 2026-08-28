public interface dca extends dcl<dbz> {
   @Override
   default dcw<dca> b() {
      return dcw.a;
   }

   @Override
   dcv<? extends dca> a();

   dby c();

   default kb<cxy> a(dbz $$0) {
      return b($$0);
   }

   static kb<cxy> b(dbz $$0) {
      kb<cxy> $$1 = kb.a($$0.a(), cxy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cxu $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.j());
      }

      return $$1;
   }

   @Override
   default dco h() {
      return switch (this.c()) {
         case a -> dcn.a;
         case c -> dcn.c;
         case b -> dcn.b;
         case d -> dcn.d;
      };
   }
}

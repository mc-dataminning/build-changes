public interface dee extends dep<ded> {
   @Override
   default dfa<dee> b() {
      return dfa.a;
   }

   @Override
   dez<? extends dee> a();

   dec c();

   default jo<czy> a(ded $$0) {
      return b($$0);
   }

   static jo<czy> b(ded $$0) {
      jo<czy> $$1 = jo.a($$0.a(), czy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         czu $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default des h() {
      return switch (this.c()) {
         case a -> der.a;
         case c -> der.c;
         case b -> der.b;
         case d -> der.d;
      };
   }
}

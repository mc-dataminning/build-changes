public interface cme<C extends bgm> {
   boolean a(C var1, cpq var2);

   cja a(C var1, hu var2);

   boolean a(int var1, int var2);

   cja a(hu var1);

   default hp<cja> a(C $$0) {
      hp<cja> $$1 = hp.a($$0.b(), cja.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         civ $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cja($$3.s()));
         }
      }

      return $$1;
   }

   default hp<cmb> a() {
      return hp.a();
   }

   default boolean ah_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cja g() {
      return new cja(csr.cA);
   }

   cmh<?> ai_();

   cmi<?> e();

   default boolean i() {
      hp<cmb> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

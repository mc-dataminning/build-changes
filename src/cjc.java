public interface cjc<C extends bdq> {
   boolean a(C var1, cmm var2);

   cfz a(C var1, hs var2);

   boolean a(int var1, int var2);

   cfz a(hs var1);

   default hn<cfz> a(C $$0) {
      hn<cfz> $$1 = hn.a($$0.b(), cfz.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cfu $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cfz($$3.s()));
         }
      }

      return $$1;
   }

   default hn<ciz> a() {
      return hn.a();
   }

   default boolean ai_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String c() {
      return "";
   }

   default cfz h() {
      return new cfz(cpo.cA);
   }

   acq e();

   cje<?> aj_();

   cjf<?> f();

   default boolean j() {
      hn<ciz> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

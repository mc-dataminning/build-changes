public interface cma<C extends bgj> {
   boolean a(C var1, cpl var2);

   cix a(C var1, hs var2);

   boolean a(int var1, int var2);

   cix a(hs var1);

   default hn<cix> a(C $$0) {
      hn<cix> $$1 = hn.a($$0.b(), cix.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cis $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cix($$3.s()));
         }
      }

      return $$1;
   }

   default hn<clx> a() {
      return hn.a();
   }

   default boolean ah_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String c() {
      return "";
   }

   default cix h() {
      return new cix(csm.cA);
   }

   aer e();

   cmc<?> ai_();

   cmd<?> f();

   default boolean j() {
      hn<clx> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

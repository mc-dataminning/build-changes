public interface cmb<C extends bgj> {
   boolean a(C var1, cpm var2);

   ciy a(C var1, hs var2);

   boolean a(int var1, int var2);

   ciy a(hs var1);

   default hn<ciy> a(C $$0) {
      hn<ciy> $$1 = hn.a($$0.b(), ciy.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cit $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new ciy($$3.s()));
         }
      }

      return $$1;
   }

   default hn<cly> a() {
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

   default ciy h() {
      return new ciy(csn.cA);
   }

   aer e();

   cmd<?> aj_();

   cme<?> f();

   default boolean j() {
      hn<cly> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

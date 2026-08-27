public interface coo<C extends biq> {
   boolean a(C var1, csa var2);

   clj a(C var1, ip var2);

   boolean a(int var1, int var2);

   clj a(ip var1);

   default il<clj> a(C $$0) {
      il<clj> $$1 = il.a($$0.b(), clj.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cle $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new clj($$3.s()));
         }
      }

      return $$1;
   }

   default il<cok> a() {
      return il.a();
   }

   default boolean ap_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default clj g() {
      return new clj(cvc.cA);
   }

   cos<?> aq_();

   cot<?> e();

   default boolean i() {
      il<cok> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

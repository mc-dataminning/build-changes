public interface cof<C extends bij> {
   boolean a(C var1, crs var2);

   clb a(C var1, ip var2);

   boolean a(int var1, int var2);

   clb a(ip var1);

   default il<clb> a(C $$0) {
      il<clb> $$1 = il.a($$0.b(), clb.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ckw $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new clb($$3.s()));
         }
      }

      return $$1;
   }

   default il<coc> a() {
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

   default clb g() {
      return new clb(cuv.cA);
   }

   coj<?> aq_();

   cok<?> e();

   default boolean i() {
      il<coc> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

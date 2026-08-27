public interface cnn<C extends bhu> {
   boolean a(C var1, cqz var2);

   ckj a(C var1, ip var2);

   boolean a(int var1, int var2);

   ckj a(ip var1);

   default il<ckj> a(C $$0) {
      il<ckj> $$1 = il.a($$0.b(), ckj.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cke $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new ckj($$3.s()));
         }
      }

      return $$1;
   }

   default il<cnk> a() {
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

   default ckj g() {
      return new ckj(cuc.cA);
   }

   cnq<?> aq_();

   cnr<?> e();

   default boolean i() {
      il<cnk> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

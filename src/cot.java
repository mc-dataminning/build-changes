public interface cot<C extends biu> {
   boolean a(C var1, csf var2);

   clo a(C var1, it var2);

   boolean a(int var1, int var2);

   clo a(it var1);

   default ip<clo> a(C $$0) {
      ip<clo> $$1 = ip.a($$0.b(), clo.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         clj $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new clo($$3.s()));
         }
      }

      return $$1;
   }

   default ip<coq> a() {
      return ip.a();
   }

   default boolean ar_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default clo g() {
      return new clo(cvh.cA);
   }

   cox<?> as_();

   coy<?> e();

   default boolean i() {
      ip<coq> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

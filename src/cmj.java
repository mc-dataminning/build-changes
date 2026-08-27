public interface cmj<C extends bgr> {
   boolean a(C var1, cpv var2);

   cjf a(C var1, hr var2);

   boolean a(int var1, int var2);

   cjf a(hr var1);

   default hn<cjf> a(C $$0) {
      hn<cjf> $$1 = hn.a($$0.b(), cjf.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cja $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cjf($$3.s()));
         }
      }

      return $$1;
   }

   default hn<cmg> a() {
      return hn.a();
   }

   default boolean am_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cjf g() {
      return new cjf(csw.cA);
   }

   cmm<?> an_();

   cmn<?> e();

   default boolean i() {
      hn<cmg> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

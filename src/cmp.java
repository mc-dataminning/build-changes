public interface cmp<C extends bgx> {
   boolean a(C var1, cqb var2);

   cjl a(C var1, hr var2);

   boolean a(int var1, int var2);

   cjl a(hr var1);

   default hn<cjl> a(C $$0) {
      hn<cjl> $$1 = hn.a($$0.b(), cjl.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjg $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cjl($$3.s()));
         }
      }

      return $$1;
   }

   default hn<cmm> a() {
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

   default cjl g() {
      return new cjl(cte.cA);
   }

   cms<?> an_();

   cmt<?> e();

   default boolean i() {
      hn<cmm> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

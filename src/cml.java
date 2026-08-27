public interface cml<C extends bgt> {
   boolean a(C var1, cpx var2);

   cjh a(C var1, hu var2);

   boolean a(int var1, int var2);

   cjh a(hu var1);

   default hp<cjh> a(C $$0) {
      hp<cjh> $$1 = hp.a($$0.b(), cjh.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjc $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cjh($$3.s()));
         }
      }

      return $$1;
   }

   default hp<cmi> a() {
      return hp.a();
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

   default cjh g() {
      return new cjh(csy.cA);
   }

   cmo<?> an_();

   cmp<?> e();

   default boolean i() {
      hp<cmi> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

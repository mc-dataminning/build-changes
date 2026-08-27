public interface clz<C extends bgh> {
   boolean a(C var1, cpk var2);

   ciw a(C var1, ht var2);

   boolean a(int var1, int var2);

   ciw a(ht var1);

   default ho<ciw> a(C $$0) {
      ho<ciw> $$1 = ho.a($$0.b(), ciw.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cir $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new ciw($$3.s()));
         }
      }

      return $$1;
   }

   default ho<clw> a() {
      return ho.a();
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

   default ciw h() {
      return new ciw(csl.cA);
   }

   aep e();

   cmb<?> aj_();

   cmc<?> f();

   default boolean j() {
      ho<clw> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}

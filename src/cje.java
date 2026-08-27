public interface cje {
   String d_ = "Inventory";

   boj y();

   static void a(bqq $$0, cje $$1, cgd $$2) {
      crj $$3 = $$2.p();
      if ($$0.k($$3)) {
         boj $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.G();
         crj $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.G());
         if ($$7.d()) {
            $$2.am();
         } else {
            $$3.e($$7.G());
         }
      }
   }

   default void a(tm $$0, in.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(tm $$0, in.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

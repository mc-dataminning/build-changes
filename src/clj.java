public interface clj {
   String d_ = "Inventory";

   bqj x();

   static void a(bsq $$0, clj $$1, cig $$2) {
      cuh $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqj $$4 = $$1.x();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.G();
         cuh $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.G());
         if ($$7.d()) {
            $$2.ao();
         } else {
            $$3.e($$7.G());
         }
      }
   }

   default void a(uk $$0, jc.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.x().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(uk $$0, jc.a $$1) {
      $$0.a("Inventory", this.x().a($$1));
   }
}

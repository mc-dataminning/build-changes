public interface cif {
   String d_ = "Inventory";

   bnm y();

   static void a(bpr $$0, cif $$1, cfe $$2) {
      cqm $$3 = $$2.p();
      if ($$0.k($$3)) {
         bnm $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.M();
         cqm $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.M());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.M());
         }
      }
   }

   default void c(ta $$0) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10));
      }
   }

   default void a_(ta $$0) {
      $$0.a("Inventory", this.y().g());
   }
}

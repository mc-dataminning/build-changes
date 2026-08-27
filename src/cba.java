public interface cba {
   String c_ = "Inventory";

   bha t();

   static void a(bjd $$0, cba $$1, byi $$2) {
      cja $$3 = $$2.j();
      if ($$0.k($$3)) {
         bha $$4 = $$1.t();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cja $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.ak();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(qu $$0) {
      if ($$0.b("Inventory", 9)) {
         this.t().a($$0.c("Inventory", 10));
      }
   }

   default void a_(qu $$0) {
      $$0.a("Inventory", this.t().g());
   }
}

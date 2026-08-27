public interface cbh {
   String c_ = "Inventory";

   bhh y();

   static void a(bjk $$0, cbh $$1, byp $$2) {
      cjh $$3 = $$2.q();
      if ($$0.k($$3)) {
         bhh $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cjh $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.ak();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(qy $$0) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10));
      }
   }

   default void a_(qy $$0) {
      $$0.a("Inventory", this.y().g());
   }
}

public interface cax {
   String c_ = "Inventory";

   bgx t();

   static void a(bja $$0, cax $$1, byf $$2) {
      cix $$3 = $$2.j();
      if ($$0.k($$3)) {
         bgx $$4 = $$1.t();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cix $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.ak();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(qr $$0) {
      if ($$0.b("Inventory", 9)) {
         this.t().a($$0.c("Inventory", 10));
      }
   }

   default void a_(qr $$0) {
      $$0.a("Inventory", this.t().g());
   }
}

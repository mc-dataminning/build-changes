public interface bxz {
   String c_ = "Inventory";

   bee w();

   static void a(bgb $$0, bxz $$1, bvh $$2) {
      cfz $$3 = $$2.j();
      if ($$0.k($$3)) {
         bee $$4 = $$1.w();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cfz $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.ai();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(qr $$0) {
      if ($$0.b("Inventory", 9)) {
         this.w().a($$0.c("Inventory", 10));
      }
   }

   default void a_(qr $$0) {
      $$0.a("Inventory", this.w().g());
   }
}

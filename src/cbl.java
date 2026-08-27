public interface cbl {
   String c_ = "Inventory";

   bhl y();

   static void a(bjo $$0, cbl $$1, byt $$2) {
      cjl $$3 = $$2.q();
      if ($$0.k($$3)) {
         bhl $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cjl $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.ak();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(qw $$0) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10));
      }
   }

   default void a_(qw $$0) {
      $$0.a("Inventory", this.y().g());
   }
}

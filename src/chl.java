public interface chl {
   String d_ = "Inventory";

   bmu A();

   static void a(boz $$0, chl $$1, cel $$2) {
      cpq $$3 = $$2.q();
      if ($$0.k($$3)) {
         bmu $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.M();
         cpq $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.M());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.M());
         }
      }
   }

   default void c(sy $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(sy $$0) {
      $$0.a("Inventory", this.A().g());
   }
}

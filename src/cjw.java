public interface cjw {
   String d_ = "Inventory";

   boz y();

   static void a(brg $$0, cjw $$1, cgv $$2) {
      csd $$3 = $$2.p();
      if ($$0.k($$3)) {
         boz $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.G();
         csd $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.G());
         if ($$7.d()) {
            $$2.am();
         } else {
            $$3.e($$7.G());
         }
      }
   }

   default void a(ty $$0, ix.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ty $$0, ix.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

public interface cjl {
   String d_ = "Inventory";

   boo y();

   static void a(bqv $$0, cjl $$1, cgk $$2) {
      crs $$3 = $$2.p();
      if ($$0.k($$3)) {
         boo $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.G();
         crs $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.G());
         if ($$7.d()) {
            $$2.am();
         } else {
            $$3.e($$7.G());
         }
      }
   }

   default void a(to $$0, ip.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(to $$0, ip.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

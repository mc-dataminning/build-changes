public interface coa {
   String e_ = "Inventory";

   bso y();

   static void a(bvg $$0, coa $$1, ckz $$2) {
      cwf $$3 = $$2.m();
      if ($$0.i($$3)) {
         bso $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cwf $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.f()) {
            $$2.av();
         } else {
            $$3.e($$7.L());
         }
      }
   }

   default void a(un $$0, js.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(un $$0, js.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

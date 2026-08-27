public interface cks {
   String d_ = "Inventory";

   bpv y();

   static void a(bsc $$0, cks $$1, chr $$2) {
      csz $$3 = $$2.p();
      if ($$0.k($$3)) {
         bpv $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.G();
         csz $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.G());
         if ($$7.d()) {
            $$2.am();
         } else {
            $$3.e($$7.G());
         }
      }
   }

   default void a(ua $$0, iy.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ua $$0, iy.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

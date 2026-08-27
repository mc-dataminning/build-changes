public interface cet {
   String d_ = "Inventory";

   bkj A();

   static void a(bmn $$0, cet $$1, cbu $$2) {
      cmy $$3 = $$2.q();
      if ($$0.k($$3)) {
         bkj $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cmy $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(sn $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(sn $$0) {
      $$0.a("Inventory", this.A().g());
   }
}

public interface cem {
   String d_ = "Inventory";

   bkd A();

   static void a(bmh $$0, cem $$1, cbo $$2) {
      cmr $$3 = $$2.q();
      if ($$0.k($$3)) {
         bkd $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cmr $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(sl $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(sl $$0) {
      $$0.a("Inventory", this.A().g());
   }
}

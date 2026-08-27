public interface ces {
   String d_ = "Inventory";

   bki A();

   static void a(bmm $$0, ces $$1, cbt $$2) {
      cmx $$3 = $$2.q();
      if ($$0.k($$3)) {
         bki $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cmx $$7 = $$4.a($$3);
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

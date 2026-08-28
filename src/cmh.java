public interface cmh {
   String d_ = "Inventory";

   brc y();

   static void a(btq $$0, cmh $$1, cjg $$2) {
      cuo $$3 = $$2.p();
      if ($$0.k($$3)) {
         brc $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.I();
         cuo $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.I());
         if ($$7.e()) {
            $$2.ao();
         } else {
            $$3.e($$7.I());
         }
      }
   }

   default void a(ur $$0, jk.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ur $$0, jk.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

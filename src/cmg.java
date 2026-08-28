public interface cmg {
   String d_ = "Inventory";

   bqz x();

   static void a(btn $$0, cmg $$1, cjf $$2) {
      cuo $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqz $$4 = $$1.x();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.H();
         cuo $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.H());
         if ($$7.e()) {
            $$2.aq();
         } else {
            $$3.e($$7.H());
         }
      }
   }

   default void a(ua $$0, jo.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.x().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ua $$0, jo.a $$1) {
      $$0.a("Inventory", this.x().a($$1));
   }
}

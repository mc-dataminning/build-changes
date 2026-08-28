public interface cmi {
   String e_ = "Inventory";

   bra x();

   static void a(btp $$0, cmi $$1, cjh $$2) {
      cuq $$3 = $$2.p();
      if ($$0.k($$3)) {
         bra $$4 = $$1.x();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.H();
         cuq $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.H());
         if ($$7.e()) {
            $$2.aq();
         } else {
            $$3.e($$7.H());
         }
      }
   }

   default void a(ub $$0, jo.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.x().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ub $$0, jo.a $$1) {
      $$0.a("Inventory", this.x().a($$1));
   }
}

public interface cmj {
   String d_ = "Inventory";

   bre y();

   static void a(bts $$0, cmj $$1, cji $$2) {
      cuq $$3 = $$2.p();
      if ($$0.k($$3)) {
         bre $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.I();
         cuq $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.I());
         if ($$7.e()) {
            $$2.ao();
         } else {
            $$3.e($$7.I());
         }
      }
   }

   default void a(us $$0, jk.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(us $$0, jk.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

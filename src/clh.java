public interface clh {
   String d_ = "Inventory";

   bqd y();

   static void a(bsq $$0, clh $$1, cig $$2) {
      cto $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqd $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.I();
         cto $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.I());
         if ($$7.e()) {
            $$2.ao();
         } else {
            $$3.e($$7.I());
         }
      }
   }

   default void a(ud $$0, iz.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ud $$0, iz.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

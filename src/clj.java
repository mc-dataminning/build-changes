public interface clj {
   String d_ = "Inventory";

   bqf y();

   static void a(bss $$0, clj $$1, cii $$2) {
      ctq $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqf $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.I();
         ctq $$7 = $$4.b($$3);
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

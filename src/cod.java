public interface cod {
   String c_ = "Inventory";

   bsr v();

   static void a(arp $$0, bvj $$1, cod $$2, clc $$3) {
      cwm $$4 = $$3.j();
      if ($$1.c($$0, $$4)) {
         bsr $$5 = $$2.v();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.L();
         cwm $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.L());
         if ($$8.f()) {
            $$3.at();
         } else {
            $$4.e($$8.L());
         }
      }
   }

   default void a(ul $$0, js.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.v().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ul $$0, js.a $$1) {
      $$0.a("Inventory", this.v().a($$1));
   }
}

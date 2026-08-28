public interface cqi {
   String c_ = "Inventory";

   bui n();

   static void a(arq $$0, bxe $$1, cqi $$2, cnd $$3) {
      cyy $$4 = $$3.f();
      if ($$1.c($$0, $$4)) {
         bui $$5 = $$2.n();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         cyy $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.at();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a(tz $$0, jg.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.n().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(tz $$0, jg.a $$1) {
      $$0.a("Inventory", this.n().a($$1));
   }
}

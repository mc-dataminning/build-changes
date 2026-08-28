public interface cqt {
   String c_ = "Inventory";

   bun n();

   static void a(arq $$0, bxl $$1, cqt $$2, cno $$3) {
      czk $$4 = $$3.f();
      if ($$1.c($$0, $$4)) {
         bun $$5 = $$2.n();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         czk $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.aq();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a(tz $$0, jh.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.n().a($$0.d("Inventory", 10), $$1);
      }
   }

   default void b(tz $$0, jh.a $$1) {
      $$0.a("Inventory", this.n().a($$1));
   }
}

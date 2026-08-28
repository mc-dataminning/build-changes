public interface crh {
   String n_ = "Inventory";

   buy n();

   static void a(ars $$0, bxw $$1, crh $$2, coc $$3) {
      czy $$4 = $$3.f();
      if ($$1.c($$0, $$4)) {
         buy $$5 = $$2.n();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         czy $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.aq();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a(tz $$0, jh.a $$1) {
      $$0.o("Inventory").ifPresent($$1x -> this.n().a($$1x, $$1));
   }

   default void b(tz $$0, jh.a $$1) {
      $$0.a("Inventory", this.n().a($$1));
   }
}

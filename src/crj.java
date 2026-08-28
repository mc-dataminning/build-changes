public interface crj {
   String n_ = "Inventory";

   bva n();

   static void a(aru $$0, bxy $$1, crj $$2, coe $$3) {
      daa $$4 = $$3.f();
      if ($$1.c($$0, $$4)) {
         bva $$5 = $$2.n();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         daa $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.aq();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a(ua $$0, ji.a $$1) {
      $$0.o("Inventory").ifPresent($$1x -> this.n().a($$1x, $$1));
   }

   default void b(ua $$0, ji.a $$1) {
      $$0.a("Inventory", this.n().a($$1));
   }
}

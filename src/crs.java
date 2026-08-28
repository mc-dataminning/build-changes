public interface crs {
   String n_ = "Inventory";

   bvj u();

   static void a(asb $$0, byh $$1, crs $$2, coo $$3) {
      dak $$4 = $$3.e();
      if ($$1.c($$0, $$4)) {
         bvj $$5 = $$2.u();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         dak $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.aq();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a(ua $$0, ji.a $$1) {
      $$0.o("Inventory").ifPresent($$1x -> this.u().a($$1x, $$1));
   }

   default void b(ua $$0, ji.a $$1) {
      $$0.a("Inventory", this.u().a($$1));
   }
}

public interface cls {
   String d_ = "Inventory";

   bqm y();

   static void a(bta $$0, cls $$1, cir $$2) {
      cua $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqm $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.H();
         cua $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.H());
         if ($$7.e()) {
            $$2.ao();
         } else {
            $$3.e($$7.H());
         }
      }
   }

   default void a(tx $$0, jl.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(tx $$0, jl.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

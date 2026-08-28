public interface clw {
   String d_ = "Inventory";

   bqq x();

   static void a(bte $$0, clw $$1, civ $$2) {
      cud $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqq $$4 = $$1.x();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.H();
         cud $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.H());
         if ($$7.e()) {
            $$2.aq();
         } else {
            $$3.e($$7.H());
         }
      }
   }

   default void a(tx $$0, jl.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.x().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(tx $$0, jl.a $$1) {
      $$0.a("Inventory", this.x().a($$1));
   }
}

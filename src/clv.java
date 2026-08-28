public interface clv {
   String d_ = "Inventory";

   bqp y();

   static void a(btd $$0, clv $$1, ciu $$2) {
      cuc $$3 = $$2.p();
      if ($$0.k($$3)) {
         bqp $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.H();
         cuc $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.H());
         if ($$7.e()) {
            $$2.ap();
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

public interface cnf {
   String e_ = "Inventory";

   brw y();

   static void a(bum $$0, cnf $$1, cke $$2) {
      cvp $$3 = $$2.m();
      if ($$0.j($$3)) {
         brw $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.J();
         cvp $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.J());
         if ($$7.f()) {
            $$2.as();
         } else {
            $$3.e($$7.J());
         }
      }
   }

   default void a(uf $$0, jp.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(uf $$0, jp.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

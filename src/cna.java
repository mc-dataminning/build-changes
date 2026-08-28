public interface cna {
   String e_ = "Inventory";

   brr y();

   static void a(buh $$0, cna $$1, cjz $$2) {
      cvl $$3 = $$2.m();
      if ($$0.l($$3)) {
         brr $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.J();
         cvl $$7 = $$4.b($$3);
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

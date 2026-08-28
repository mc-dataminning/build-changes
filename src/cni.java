public interface cni {
   String e_ = "Inventory";

   brz y();

   static void a(bup $$0, cni $$1, ckh $$2) {
      cvs $$3 = $$2.m();
      if ($$0.j($$3)) {
         brz $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.K();
         cvs $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.K());
         if ($$7.f()) {
            $$2.as();
         } else {
            $$3.e($$7.K());
         }
      }
   }

   default void a(ug $$0, jq.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ug $$0, jq.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}

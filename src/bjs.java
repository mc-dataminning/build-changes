import javax.annotation.Nullable;

public interface bjs extends bje {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   agt az_();

   void a(@Nullable agt var1);

   default void a(agt $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   hv aB_();

   @Nullable
   csy i();

   static void a(cse $$0, auf $$1, hv $$2, agt $$3) {
      if ($$0.c_($$2) instanceof bjs $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(sj $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new agt($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean d_(sj $$0) {
      agt $$1 = this.az_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.aA_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cer $$0) {
      csy $$1 = this.i();
      hv $$2 = this.aB_();
      agt $$3 = this.az_();
      if ($$3 != null && $$1 != null && $$1.n() != null) {
         egm $$4 = $$1.n().aJ().getLootTable($$3);
         if ($$0 instanceof amq) {
            am.O.a((amq)$$0, $$3);
         }

         this.a(null);
         egk.a $$5 = new egk.a((amp)$$1).a(eip.f, elb.b($$2));
         if ($$0 != null) {
            $$5.a($$0.go()).a(eip.a, $$0);
         }

         $$4.a(this, $$5.a(eio.c), this.aA_());
      }
   }
}

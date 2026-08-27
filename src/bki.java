import javax.annotation.Nullable;

public interface bki extends bju {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   ahg az_();

   void a(@Nullable ahg var1);

   default void a(ahg $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   hx aB_();

   @Nullable
   ctp i();

   static void a(csv $$0, auv $$1, hx $$2, ahg $$3) {
      if ($$0.c_($$2) instanceof bki $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(sn $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new ahg($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean d_(sn $$0) {
      ahg $$1 = this.az_();
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

   default void e_(@Nullable cfi $$0) {
      ctp $$1 = this.i();
      hx $$2 = this.aB_();
      ahg $$3 = this.az_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         ehe $$4 = $$1.o().aJ().getLootTable($$3);
         if ($$0 instanceof ane) {
            am.O.a((ane)$$0, $$3);
         }

         this.a(null);
         ehc.a $$5 = new ehc.a((and)$$1).a(ejh.f, elt.b($$2));
         if ($$0 != null) {
            $$5.a($$0.go()).a(ejh.a, $$0);
         }

         $$4.a(this, $$5.a(ejg.c), this.aA_());
      }
   }
}

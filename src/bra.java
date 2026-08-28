import javax.annotation.Nullable;

public interface bra extends bql {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ald<eql> ax_();

   void a(@Nullable ald<eql> var1);

   default void a(ald<eql> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   iz az_();

   @Nullable
   dbw i();

   static void a(dbc $$0, azf $$1, iz $$2, ald<eql> $$3) {
      if ($$0.c_($$2) instanceof bra $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ur $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(lq.aU, new ale($$0.l("LootTable"))));
         if ($$0.b("LootTableSeed", 4)) {
            this.a($$0.i("LootTableSeed"));
         } else {
            this.a(0L);
         }

         return true;
      } else {
         return false;
      }
   }

   default boolean b_(ur $$0) {
      ald<eql> $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.ay_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cmv $$0) {
      dbw $$1 = this.i();
      iz $$2 = this.az_();
      ald<eql> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eql $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof arf) {
            am.Q.a((arf)$$0, $$3);
         }

         this.a(null);
         eqj.a $$5 = new eqj.a((are)$$1).a(etc.f, evp.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(etc.a, $$0);
         }

         $$4.a(this, $$5.a(etb.c), this.ay_());
      }
   }
}

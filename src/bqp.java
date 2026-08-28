import javax.annotation.Nullable;

public interface bqp extends bqa {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akj<erb> ax_();

   void a(@Nullable akj<erb> var1);

   default void a(akj<erb> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   ja az_();

   @Nullable
   dcg i();

   static void a(dbm $$0, ayo $$1, ja $$2, akj<erb> $$3) {
      if ($$0.c_($$2) instanceof bqp $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(tx $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akj.a(lr.bb, new akk($$0.l("LootTable"))));
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

   default boolean b_(tx $$0) {
      akj<erb> $$1 = this.ax_();
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

   default void e_(@Nullable cml $$0) {
      dcg $$1 = this.i();
      ja $$2 = this.az_();
      akj<erb> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         erb $$4 = $$1.o().bf().b($$3);
         if ($$0 instanceof aqn) {
            am.Q.a((aqn)$$0, $$3);
         }

         this.a(null);
         eqz.a $$5 = new eqz.a((aqm)$$1).a(ets.f, ewh.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gw()).a(ets.a, $$0);
         }

         $$4.a(this, $$5.a(etr.c), this.ay_());
      }
   }
}

import javax.annotation.Nullable;

public interface bqx extends bqi {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ala<eqi> ay_();

   void a(@Nullable ala<eqi> var1);

   default void a(ala<eqi> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   iz aA_();

   @Nullable
   dbt i();

   static void a(daz $$0, azc $$1, iz $$2, ala<eqi> $$3) {
      if ($$0.c_($$2) instanceof bqx $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ur $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ala.a(lq.aU, new alb($$0.l("LootTable"))));
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
      ala<eqi> $$1 = this.ay_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.az_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cms $$0) {
      dbt $$1 = this.i();
      iz $$2 = this.aA_();
      ala<eqi> $$3 = this.ay_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eqi $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof arc) {
            am.Q.a((arc)$$0, $$3);
         }

         this.a(null);
         eqg.a $$5 = new eqg.a((arb)$$1).a(esz.f, evm.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(esz.a, $$0);
         }

         $$4.a(this, $$5.a(esy.c), this.az_());
      }
   }
}

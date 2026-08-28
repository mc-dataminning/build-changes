import javax.annotation.Nullable;

public interface bql extends bpw {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akj<eqt> ax_();

   void a(@Nullable akj<eqt> var1);

   default void a(akj<eqt> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   ja az_();

   @Nullable
   dcd i();

   static void a(dbj $$0, aym $$1, ja $$2, akj<eqt> $$3) {
      if ($$0.c_($$2) instanceof bql $$5) {
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
      akj<eqt> $$1 = this.ax_();
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

   default void e_(@Nullable cmh $$0) {
      dcd $$1 = this.i();
      ja $$2 = this.az_();
      akj<eqt> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eqt $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aql) {
            am.Q.a((aql)$$0, $$3);
         }

         this.a(null);
         eqr.a $$5 = new eqr.a((aqk)$$1).a(etk.f, evz.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gu()).a(etk.a, $$0);
         }

         $$4.a(this, $$5.a(etj.c), this.ay_());
      }
   }
}

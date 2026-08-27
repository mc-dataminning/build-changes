import javax.annotation.Nullable;

public interface bqi extends bpt {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   aks<eru> ax_();

   void a(@Nullable aks<eru> var1);

   default void a(aks<eru> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   ir az_();

   @Nullable
   dca i();

   static void a(dbg $$0, ayt $$1, ir $$2, aks<eru> $$3) {
      if ($$0.c_($$2) instanceof bqi $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(uk $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(aks.a(li.aU, new akt($$0.l("LootTable"))));
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

   default boolean b_(uk $$0) {
      aks<eru> $$1 = this.ax_();
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

   default void e_(@Nullable cly $$0) {
      dca $$1 = this.i();
      ir $$2 = this.az_();
      aks<eru> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eru $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aqu) {
            an.Q.a((aqu)$$0, $$3);
         }

         this.a(null);
         ers.a $$5 = new ers.a((aqt)$$1).a(eug.f, ewu.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gJ()).a(eug.a, $$0);
         }

         $$4.a(this, $$5.a(euf.c), this.ay_());
      }
   }
}

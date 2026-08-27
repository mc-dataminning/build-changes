import javax.annotation.Nullable;

public interface boy extends boj {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   akf ax_();

   void a(@Nullable akf var1);

   default void a(akf $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   im az_();

   @Nullable
   czu i();

   static void a(cza $$0, ayd $$1, im $$2, akf $$3) {
      if ($$0.c_($$2) instanceof boy $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ty $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new akf($$0.l("LootTable")));
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

   default boolean b_(ty $$0) {
      akf $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.ay_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable ckl $$0) {
      czu $$1 = this.i();
      im $$2 = this.az_();
      akf $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eoi $$4 = $$1.o().aM().getLootTable($$3);
         if ($$0 instanceof aqf) {
            am.Q.a((aqf)$$0, $$3);
         }

         this.a(null);
         eog.a $$5 = new eog.a((aqe)$$1).a(eqt.f, etf.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gw()).a(eqt.a, $$0);
         }

         $$4.a(this, $$5.a(eqs.c), this.ay_());
      }
   }
}

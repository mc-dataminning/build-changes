import javax.annotation.Nullable;

public interface bme extends blp {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   aiy aC_();

   void a(@Nullable aiy var1);

   default void a(aiy $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aD_();

   void a(long var1);

   hz aE_();

   @Nullable
   cvr i();

   static void a(cux $$0, awp $$1, hz $$2, aiy $$3) {
      if ($$0.c_($$2) instanceof bme $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(sw $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new aiy($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean d_(sw $$0) {
      aiy $$1 = this.aC_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.aD_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable chl $$0) {
      cvr $$1 = this.i();
      hz $$2 = this.aE_();
      aiy $$3 = this.aC_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         ejk $$4 = $$1.o().aL().getLootTable($$3);
         if ($$0 instanceof aox) {
            am.Q.a((aox)$$0, $$3);
         }

         this.a(null);
         eji.a $$5 = new eji.a((aow)$$1).a(eln.f, enz.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gp()).a(eln.a, $$0);
         }

         $$4.a(this, $$5.a(elm.c), this.aD_());
      }
   }
}

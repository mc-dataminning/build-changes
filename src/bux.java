import javax.annotation.Nullable;

public interface bux extends buk {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alh<fam> ax_();

   void a(@Nullable alh<fam> var1);

   default void a(alh<fam> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   iv aB_();

   @Nullable
   djx i();

   static void a(djb $$0, azx $$1, iv $$2, alh<fam> $$3) {
      if ($$0.c_($$2) instanceof bux $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tz $$0) {
      alh<fam> $$1 = $$0.<alh<fam>>a("LootTable", fam.a).orElse(null);
      this.a($$1);
      this.a($$0.b("LootTableSeed", 0L));
      return $$1 != null;
   }

   default boolean c_(tz $$0) {
      alh<fam> $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", fam.a, $$1);
         long $$2 = this.aA_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void d_(@Nullable crx $$0) {
      djx $$1 = this.i();
      iv $$2 = this.aB_();
      alh<fam> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         fam $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof art) {
            aq.Q.a((art)$$0, $$3);
         }

         this.a(null);
         fak.a $$5 = new fak.a((ars)$$1).a(fdb.f, ffq.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eh()).a(fdb.a, $$0);
         }

         $$4.a(this, $$5.a(fda.c), this.aA_());
      }
   }
}

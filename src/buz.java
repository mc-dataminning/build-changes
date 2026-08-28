import javax.annotation.Nullable;

public interface buz extends bum {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alj<fao> ax_();

   void a(@Nullable alj<fao> var1);

   default void a(alj<fao> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   iw aB_();

   @Nullable
   djz i();

   static void a(djd $$0, azz $$1, iw $$2, alj<fao> $$3) {
      if ($$0.c_($$2) instanceof buz $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ua $$0) {
      alj<fao> $$1 = $$0.<alj<fao>>a("LootTable", fao.a).orElse(null);
      this.a($$1);
      this.a($$0.b("LootTableSeed", 0L));
      return $$1 != null;
   }

   default boolean c_(ua $$0) {
      alj<fao> $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", fao.a, $$1);
         long $$2 = this.aA_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void d_(@Nullable crz $$0) {
      djz $$1 = this.i();
      iw $$2 = this.aB_();
      alj<fao> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         fao $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof arv) {
            aq.Q.a((arv)$$0, $$3);
         }

         this.a(null);
         fam.a $$5 = new fam.a((aru)$$1).a(fdd.f, ffs.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eh()).a(fdd.a, $$0);
         }

         $$4.a(this, $$5.a(fdc.c), this.aA_());
      }
   }
}

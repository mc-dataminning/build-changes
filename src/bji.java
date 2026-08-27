import javax.annotation.Nullable;

public interface bji extends biu {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   agm aA_();

   void a(@Nullable agm var1);

   default void a(agm $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aB_();

   void a(long var1);

   hx aC_();

   @Nullable
   csf i();

   static void a(crl $$0, atw $$1, hx $$2, agm $$3) {
      if ($$0.c_($$2) instanceof bji $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(sd $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new agm($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean d_(sd $$0) {
      agm $$1 = this.aA_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.aB_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cdz $$0) {
      csf $$1 = this.i();
      hx $$2 = this.aC_();
      agm $$3 = this.aA_();
      if ($$3 != null && $$1 != null && $$1.n() != null) {
         efk $$4 = $$1.n().aJ().getLootTable($$3);
         if ($$0 instanceof amj) {
            al.N.a((amj)$$0, $$3);
         }

         this.a(null);
         efi.a $$5 = new efi.a((ami)$$1).a(ehn.f, ejz.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gp()).a(ehn.a, $$0);
         }

         $$4.a(this, $$5.a(ehm.c), this.aB_());
      }
   }
}

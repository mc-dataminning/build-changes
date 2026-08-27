import javax.annotation.Nullable;

public interface bkc extends bjo {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   ahd az_();

   void a(@Nullable ahd var1);

   default void a(ahd $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   hx aB_();

   @Nullable
   cti i();

   static void a(cso $$0, aup $$1, hx $$2, ahd $$3) {
      if ($$0.c_($$2) instanceof bkc $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(sl $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new ahd($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean d_(sl $$0) {
      ahd $$1 = this.az_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.aA_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cfb $$0) {
      cti $$1 = this.i();
      hx $$2 = this.aB_();
      ahd $$3 = this.az_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         egx $$4 = $$1.o().aJ().getLootTable($$3);
         if ($$0 instanceof ana) {
            am.O.a((ana)$$0, $$3);
         }

         this.a(null);
         egv.a $$5 = new egv.a((amz)$$1).a(eja.f, elm.b($$2));
         if ($$0 != null) {
            $$5.a($$0.go()).a(eja.a, $$0);
         }

         $$4.a(this, $$5.a(eiz.c), this.aA_());
      }
   }
}

import javax.annotation.Nullable;

public interface bpu extends bpf {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akg<eoq> ax_();

   void a(@Nullable akg<eoq> var1);

   default void a(akg<eoq> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   in az_();

   @Nullable
   dad i();

   static void a(czj $$0, ayg $$1, in $$2, akg<eoq> $$3) {
      if ($$0.c_($$2) instanceof bpu $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ua $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akg.a(le.aU, new akh($$0.l("LootTable"))));
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

   default boolean b_(ua $$0) {
      akg<eoq> $$1 = this.ax_();
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

   default void e_(@Nullable clh $$0) {
      dad $$1 = this.i();
      in $$2 = this.az_();
      akg<eoq> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eoq $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aqi) {
            am.Q.a((aqi)$$0, $$3);
         }

         this.a(null);
         eoo.a $$5 = new eoo.a((aqh)$$1).a(erc.f, etp.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gw()).a(erc.a, $$0);
         }

         $$4.a(this, $$5.a(erb.c), this.ay_());
      }
   }
}

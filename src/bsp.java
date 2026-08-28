import javax.annotation.Nullable;

public interface bsp extends bsc {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   aku<evv> aw_();

   void a(@Nullable aku<evv> var1);

   default void a(aku<evv> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   ji aA_();

   @Nullable
   dgh i();

   static void a(dfm $$0, azh $$1, ji $$2, aku<evv> $$3) {
      if ($$0.c_($$2) instanceof bsp $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tq $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(aku.a(mc.bg, akv.a($$0.l("LootTable"))));
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

   default boolean c_(tq $$0) {
      aku<evv> $$1 = this.aw_();
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

   default void d_(@Nullable cow $$0) {
      dgh $$1 = this.i();
      ji $$2 = this.aA_();
      aku<evv> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         evv $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof are) {
            ap.Q.a((are)$$0, $$3);
         }

         this.a(null);
         evt.a $$5 = new evt.a((ard)$$1).a(eyk.f, faz.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gF()).a(eyk.a, $$0);
         }

         $$4.a(this, $$5.a(eyj.c), this.az_());
      }
   }
}

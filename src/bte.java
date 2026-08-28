import javax.annotation.Nullable;

public interface bte extends bsr {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akt<ewt> aw_();

   void a(@Nullable akt<ewt> var1);

   default void a(akt<ewt> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   ji aA_();

   @Nullable
   dgz i();

   static void a(dgf $$0, azh $$1, ji $$2, akt<ewt> $$3) {
      if ($$0.c_($$2) instanceof bte $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tq $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akt.a(mc.bi, aku.a($$0.l("LootTable"))));
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
      akt<ewt> $$1 = this.aw_();
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

   default void d_(@Nullable cpr $$0) {
      dgz $$1 = this.i();
      ji $$2 = this.aA_();
      akt<ewt> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         ewt $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof are) {
            ap.Q.a((are)$$0, $$3);
         }

         this.a(null);
         ewr.a $$5 = new ewr.a((ard)$$1).a(ezi.f, fbx.b($$2));
         if ($$0 != null) {
            $$5.a($$0.ef()).a(ezi.a, $$0);
         }

         $$4.a(this, $$5.a(ezh.c), this.az_());
      }
   }
}

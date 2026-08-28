import javax.annotation.Nullable;

public interface bsq extends bsd {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   aku<evw> aw_();

   void a(@Nullable aku<evw> var1);

   default void a(aku<evw> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   ji aA_();

   @Nullable
   dgi i();

   static void a(dfn $$0, azh $$1, ji $$2, aku<evw> $$3) {
      if ($$0.c_($$2) instanceof bsq $$5) {
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
      aku<evw> $$1 = this.aw_();
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

   default void d_(@Nullable cox $$0) {
      dgi $$1 = this.i();
      ji $$2 = this.aA_();
      aku<evw> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         evw $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof are) {
            ap.Q.a((are)$$0, $$3);
         }

         this.a(null);
         evu.a $$5 = new evu.a((ard)$$1).a(eyl.f, fba.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gF()).a(eyl.a, $$0);
         }

         $$4.a(this, $$5.a(eyk.c), this.az_());
      }
   }
}

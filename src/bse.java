import javax.annotation.Nullable;

public interface bse extends brr {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alg<eub> ay_();

   void a(@Nullable alg<eub> var1);

   default void a(alg<eub> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aB_();

   void a(long var1);

   jg aC_();

   @Nullable
   dev i();

   static void a(dea $$0, azr $$1, jg $$2, alg<eub> $$3) {
      if ($$0.c_($$2) instanceof bse $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(uj $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alg.a(ly.bd, alh.a($$0.l("LootTable"))));
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

   default boolean c_(uj $$0) {
      alg<eub> $$1 = this.ay_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.aB_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable coh $$0) {
      dev $$1 = this.i();
      jg $$2 = this.aC_();
      alg<eub> $$3 = this.ay_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eub $$4 = $$1.o().bd().b($$3);
         if ($$0 instanceof arn) {
            an.Q.a((arn)$$0, $$3);
         }

         this.a(null);
         etz.a $$5 = new etz.a((arm)$$1).a(ews.f, ezh.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gG()).a(ews.a, $$0);
         }

         $$4.a(this, $$5.a(ewr.c), this.aB_());
      }
   }
}

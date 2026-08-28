import javax.annotation.Nullable;

public interface bsq extends bsd {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ali<eus> aw_();

   void a(@Nullable ali<eus> var1);

   default void a(ali<eus> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   jh aA_();

   @Nullable
   dfm i();

   static void a(der $$0, azu $$1, jh $$2, ali<eus> $$3) {
      if ($$0.c_($$2) instanceof bsq $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ul $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ali.a(ma.bd, alj.a($$0.l("LootTable"))));
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

   default boolean c_(ul $$0) {
      ali<eus> $$1 = this.aw_();
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

   default void d_(@Nullable cou $$0) {
      dfm $$1 = this.i();
      jh $$2 = this.aA_();
      ali<eus> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         eus $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof arq) {
            ao.Q.a((arq)$$0, $$3);
         }

         this.a(null);
         euq.a $$5 = new euq.a((arp)$$1).a(exj.f, ezy.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gD()).a(exj.a, $$0);
         }

         $$4.a(this, $$5.a(exi.c), this.az_());
      }
   }
}

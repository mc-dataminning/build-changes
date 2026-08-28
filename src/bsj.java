import javax.annotation.Nullable;

public interface bsj extends brw {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alh<euh> ax_();

   void a(@Nullable alh<euh> var1);

   default void a(alh<euh> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   jh aB_();

   @Nullable
   dfb i();

   static void a(deg $$0, azs $$1, jh $$2, alh<euh> $$3) {
      if ($$0.c_($$2) instanceof bsj $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(uk $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alh.a(lz.bd, ali.a($$0.l("LootTable"))));
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

   default boolean c_(uk $$0) {
      alh<euh> $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.aA_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable com $$0) {
      dfb $$1 = this.i();
      jh $$2 = this.aB_();
      alh<euh> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         euh $$4 = $$1.o().bc().b($$3);
         if ($$0 instanceof aro) {
            ao.Q.a((aro)$$0, $$3);
         }

         this.a(null);
         euf.a $$5 = new euf.a((arn)$$1).a(ewy.f, ezn.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gG()).a(ewy.a, $$0);
         }

         $$4.a(this, $$5.a(ewx.c), this.aA_());
      }
   }
}

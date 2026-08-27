import javax.annotation.Nullable;

public interface bnk extends bmv {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   ajh aA_();

   void a(@Nullable ajh var1);

   default void a(ajh $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aB_();

   void a(long var1);

   ib aC_();

   @Nullable
   cwz i();

   static void a(cwf $$0, axd $$1, ib $$2, ajh $$3) {
      if ($$0.c_($$2) instanceof bnk $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(ta $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new ajh($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean b(ta $$0) {
      ajh $$1 = this.aA_();
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

   default void e_(@Nullable cis $$0) {
      cwz $$1 = this.i();
      ib $$2 = this.aC_();
      ajh $$3 = this.aA_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         elc $$4 = $$1.o().aM().getLootTable($$3);
         if ($$0 instanceof apg) {
            am.Q.a((apg)$$0, $$3);
         }

         this.a(null);
         ela.a $$5 = new ela.a((apf)$$1).a(enf.f, epr.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gv()).a(enf.a, $$0);
         }

         $$4.a(this, $$5.a(ene.c), this.aB_());
      }
   }
}

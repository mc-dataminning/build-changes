import javax.annotation.Nullable;

public interface brv extends bri {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alb<etm> ax_();

   void a(@Nullable alb<etm> var1);

   default void a(alb<etm> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   je aB_();

   @Nullable
   deg i();

   static void a(ddl $$0, azl $$1, je $$2, alb<etm> $$3) {
      if ($$0.c_($$2) instanceof brv $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(uf $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alb.a(lv.bd, alc.a($$0.l("LootTable"))));
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

   default boolean c_(uf $$0) {
      alb<etm> $$1 = this.ax_();
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

   default void e_(@Nullable cnu $$0) {
      deg $$1 = this.i();
      je $$2 = this.aB_();
      alb<etm> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         etm $$4 = $$1.o().bd().b($$3);
         if ($$0 instanceof ari) {
            an.Q.a((ari)$$0, $$3);
         }

         this.a(null);
         etk.a $$5 = new etk.a((arh)$$1).a(ewd.f, eys.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(ewd.a, $$0);
         }

         $$4.a(this, $$5.a(ewc.c), this.aA_());
      }
   }
}

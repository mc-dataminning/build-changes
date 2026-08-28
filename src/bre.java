import javax.annotation.Nullable;

public interface bre extends bqp {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ale<eqp> aw_();

   void a(@Nullable ale<eqp> var1);

   default void a(ale<eqp> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ax_();

   void a(long var1);

   iz ay_();

   @Nullable
   dca i();

   static void a(dbg $$0, azh $$1, iz $$2, ale<eqp> $$3) {
      if ($$0.c_($$2) instanceof bre $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(us $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ale.a(lq.aU, new alf($$0.l("LootTable"))));
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

   default boolean b_(us $$0) {
      ale<eqp> $$1 = this.aw_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.ax_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cmz $$0) {
      dca $$1 = this.i();
      iz $$2 = this.ay_();
      ale<eqp> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eqp $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof arg) {
            am.Q.a((arg)$$0, $$3);
         }

         this.a(null);
         eqn.a $$5 = new eqn.a((arf)$$1).a(etg.f, evt.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(etg.a, $$0);
         }

         $$4.a(this, $$5.a(etf.c), this.ax_());
      }
   }
}

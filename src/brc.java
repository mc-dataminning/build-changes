import javax.annotation.Nullable;

public interface brc extends bqn {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ale<eqn> aw_();

   void a(@Nullable ale<eqn> var1);

   default void a(ale<eqn> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ax_();

   void a(long var1);

   iz ay_();

   @Nullable
   dby i();

   static void a(dbe $$0, azh $$1, iz $$2, ale<eqn> $$3) {
      if ($$0.c_($$2) instanceof brc $$5) {
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
      ale<eqn> $$1 = this.aw_();
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

   default void e_(@Nullable cmx $$0) {
      dby $$1 = this.i();
      iz $$2 = this.ay_();
      ale<eqn> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eqn $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof arg) {
            am.Q.a((arg)$$0, $$3);
         }

         this.a(null);
         eql.a $$5 = new eql.a((arf)$$1).a(ete.f, evr.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(ete.a, $$0);
         }

         $$4.a(this, $$5.a(etd.c), this.ax_());
      }
   }
}

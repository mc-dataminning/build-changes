import javax.annotation.Nullable;

public interface brb extends bqm {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ald<eqm> aw_();

   void a(@Nullable ald<eqm> var1);

   default void a(ald<eqm> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ax_();

   void a(long var1);

   iz ay_();

   @Nullable
   dbx i();

   static void a(dbd $$0, azg $$1, iz $$2, ald<eqm> $$3) {
      if ($$0.c_($$2) instanceof brb $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ur $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(lq.aU, new ale($$0.l("LootTable"))));
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

   default boolean b_(ur $$0) {
      ald<eqm> $$1 = this.aw_();
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

   default void e_(@Nullable cmw $$0) {
      dbx $$1 = this.i();
      iz $$2 = this.ay_();
      ald<eqm> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eqm $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof arf) {
            am.Q.a((arf)$$0, $$3);
         }

         this.a(null);
         eqk.a $$5 = new eqk.a((are)$$1).a(etd.f, evq.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(etd.a, $$0);
         }

         $$4.a(this, $$5.a(etc.c), this.ax_());
      }
   }
}

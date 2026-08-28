import javax.annotation.Nullable;

public interface bry extends brl {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ald<etq> ay_();

   void a(@Nullable ald<etq> var1);

   default void a(ald<etq> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aB_();

   void a(long var1);

   jf aC_();

   @Nullable
   dej i();

   static void a(ddo $$0, azn $$1, jf $$2, ald<etq> $$3) {
      if ($$0.c_($$2) instanceof bry $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ug $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(lw.be, ale.a($$0.l("LootTable"))));
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

   default boolean c_(ug $$0) {
      ald<etq> $$1 = this.ay_();
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

   default void e_(@Nullable cnx $$0) {
      dej $$1 = this.i();
      jf $$2 = this.aC_();
      ald<etq> $$3 = this.ay_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         etq $$4 = $$1.o().bd().b($$3);
         if ($$0 instanceof ark) {
            an.Q.a((ark)$$0, $$3);
         }

         this.a(null);
         eto.a $$5 = new eto.a((arj)$$1).a(ewh.f, eyw.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gz()).a(ewh.a, $$0);
         }

         $$4.a(this, $$5.a(ewg.c), this.aB_());
      }
   }
}

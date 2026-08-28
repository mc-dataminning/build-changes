import javax.annotation.Nullable;

public interface brq extends brd {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ala<esy> az_();

   void a(@Nullable ala<esy> var1);

   default void a(ala<esy> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aC_();

   void a(long var1);

   je aD_();

   @Nullable
   dds i();

   static void a(dcx $$0, azk $$1, je $$2, ala<esy> $$3) {
      if ($$0.c_($$2) instanceof brq $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(uf $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ala.a(lv.bc, alb.a($$0.l("LootTable"))));
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
      ala<esy> $$1 = this.az_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.aC_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cnp $$0) {
      dds $$1 = this.i();
      je $$2 = this.aD_();
      ala<esy> $$3 = this.az_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         esy $$4 = $$1.o().bd().b($$3);
         if ($$0 instanceof arh) {
            an.Q.a((arh)$$0, $$3);
         }

         this.a(null);
         esw.a $$5 = new esw.a((arg)$$1).a(evp.f, eye.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(evp.a, $$0);
         }

         $$4.a(this, $$5.a(evo.c), this.aC_());
      }
   }
}

import javax.annotation.Nullable;

public interface boi extends bnt {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   ajt ay_();

   void a(@Nullable ajt var1);

   default void a(ajt $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   ib aA_();

   @Nullable
   cyx i();

   static void a(cyd $$0, axr $$1, ib $$2, ajt $$3) {
      if ($$0.c_($$2) instanceof boi $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(tm $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new ajt($$0.l("LootTable")));
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

   default boolean b_(tm $$0) {
      ajt $$1 = this.ay_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.az_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cjt $$0) {
      cyx $$1 = this.i();
      ib $$2 = this.aA_();
      ajt $$3 = this.ay_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         enj $$4 = $$1.o().aM().getLootTable($$3);
         if ($$0 instanceof apt) {
            am.Q.a((apt)$$0, $$3);
         }

         this.a(null);
         enh.a $$5 = new enh.a((aps)$$1).a(epo.f, esa.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gv()).a(epo.a, $$0);
         }

         $$4.a(this, $$5.a(epn.c), this.az_());
      }
   }
}

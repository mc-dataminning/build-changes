import javax.annotation.Nullable;

public interface bon extends bny {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   ajv ax_();

   void a(@Nullable ajv var1);

   default void a(ajv $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   id az_();

   @Nullable
   czg i();

   static void a(cym $$0, axt $$1, id $$2, ajv $$3) {
      if ($$0.c_($$2) instanceof bon $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(to $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new ajv($$0.l("LootTable")));
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

   default boolean b_(to $$0) {
      ajv $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.ay_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cka $$0) {
      czg $$1 = this.i();
      id $$2 = this.az_();
      ajv $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         ens $$4 = $$1.o().aM().getLootTable($$3);
         if ($$0 instanceof apv) {
            am.Q.a((apv)$$0, $$3);
         }

         this.a(null);
         enq.a $$5 = new enq.a((apu)$$1).a(epx.f, esj.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gv()).a(epx.a, $$0);
         }

         $$4.a(this, $$5.a(epw.c), this.ay_());
      }
   }
}

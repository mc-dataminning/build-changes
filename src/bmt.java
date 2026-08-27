import javax.annotation.Nullable;

public interface bmt extends bme {
   String c = "LootTable";
   String d = "LootTableSeed";

   @Nullable
   ajc aB_();

   void a(@Nullable ajc var1);

   default void a(ajc $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aC_();

   void a(long var1);

   ib aD_();

   @Nullable
   cwe i();

   static void a(cvk $$0, awt $$1, ib $$2, ajc $$3) {
      if ($$0.c_($$2) instanceof bmt $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(sy $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(new ajc($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
         return true;
      } else {
         return false;
      }
   }

   default boolean b(sy $$0) {
      ajc $$1 = this.aB_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.toString());
         long $$2 = this.aC_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cia $$0) {
      cwe $$1 = this.i();
      ib $$2 = this.aD_();
      ajc $$3 = this.aB_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         ekg $$4 = $$1.o().aM().getLootTable($$3);
         if ($$0 instanceof apb) {
            am.Q.a((apb)$$0, $$3);
         }

         this.a(null);
         eke.a $$5 = new eke.a((apa)$$1).a(emj.f, eov.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gr()).a(emj.a, $$0);
         }

         $$4.a(this, $$5.a(emi.c), this.aC_());
      }
   }
}

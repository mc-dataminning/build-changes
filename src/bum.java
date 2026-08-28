import javax.annotation.Nullable;

public interface bum extends btz {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alf<ezy> at_();

   void a(@Nullable alf<ezy> var1);

   default void a(alf<ezy> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aw_();

   void a(long var1);

   iv ax_();

   @Nullable
   djm i();

   static void a(diq $$0, azv $$1, iv $$2, alf<ezy> $$3) {
      if ($$0.c_($$2) instanceof bum $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tz $$0) {
      alf<ezy> $$1 = $$0.<alf<ezy>>a("LootTable", ezy.a).orElse(null);
      this.a($$1);
      this.a($$0.b("LootTableSeed", 0L));
      return $$1 != null;
   }

   default boolean c_(tz $$0) {
      alf<ezy> $$1 = this.at_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", ezy.a, $$1);
         long $$2 = this.aw_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void d_(@Nullable crm $$0) {
      djm $$1 = this.i();
      iv $$2 = this.ax_();
      alf<ezy> $$3 = this.at_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         ezy $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof arr) {
            aq.Q.a((arr)$$0, $$3);
         }

         this.a(null);
         ezw.a $$5 = new ezw.a((arq)$$1).a(fcn.f, ffc.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eg()).a(fcn.a, $$0);
         }

         $$4.a(this, $$5.a(fcm.c), this.aw_());
      }
   }
}

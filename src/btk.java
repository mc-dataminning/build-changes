import javax.annotation.Nullable;

public interface btk extends bsx {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   aly<ewm> ax_();

   void a(@Nullable aly<ewm> var1);

   default void a(aly<ewm> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   jh aB_();

   @Nullable
   dha i();

   static void a(dgf $$0, bam $$1, jh $$2, aly<ewm> $$3) {
      if ($$0.c_($$2) instanceof btk $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ux $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(aly.a(mb.bf, alz.a($$0.l("LootTable"))));
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

   default boolean c_(ux $$0) {
      aly<ewm> $$1 = this.ax_();
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

   default void d_(@Nullable cps $$0) {
      dha $$1 = this.i();
      jh $$2 = this.aB_();
      aly<ewm> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         ewm $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof asi) {
            ao.Q.a((asi)$$0, $$3);
         }

         this.a(null);
         ewk.a $$5 = new ewk.a((ash)$$1).a(ezd.f, fbs.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gD()).a(ezd.a, $$0);
         }

         $$4.a(this, $$5.a(ezc.c), this.aA_());
      }
   }
}

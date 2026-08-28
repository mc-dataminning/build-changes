import javax.annotation.Nullable;

public interface bto extends btb {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   aly<ewt> ax_();

   void a(@Nullable aly<ewt> var1);

   default void a(aly<ewt> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   jh aB_();

   @Nullable
   dhh i();

   static void a(dgm $$0, bam $$1, jh $$2, aly<ewt> $$3) {
      if ($$0.c_($$2) instanceof bto $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ux $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(aly.a(mb.bg, alz.a($$0.l("LootTable"))));
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
      aly<ewt> $$1 = this.ax_();
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

   default void d_(@Nullable cpw $$0) {
      dhh $$1 = this.i();
      jh $$2 = this.aB_();
      aly<ewt> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         ewt $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof asi) {
            ao.Q.a((asi)$$0, $$3);
         }

         this.a(null);
         ewr.a $$5 = new ewr.a((ash)$$1).a(ezi.f, fbx.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gD()).a(ezi.a, $$0);
         }

         $$4.a(this, $$5.a(ezh.c), this.aA_());
      }
   }
}

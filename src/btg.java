import javax.annotation.Nullable;

public interface btg extends bst {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alo<ewn> ax_();

   void a(@Nullable alo<ewn> var1);

   default void a(alo<ewn> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   jh aB_();

   @Nullable
   dgz i();

   static void a(dge $$0, bac $$1, jh $$2, alo<ewn> $$3) {
      if ($$0.c_($$2) instanceof btg $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(um $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alo.a(mb.bg, alp.a($$0.l("LootTable"))));
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

   default boolean c_(um $$0) {
      alo<ewn> $$1 = this.ax_();
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

   default void d_(@Nullable cpo $$0) {
      dgz $$1 = this.i();
      jh $$2 = this.aB_();
      alo<ewn> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         ewn $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof ary) {
            ao.Q.a((ary)$$0, $$3);
         }

         this.a(null);
         ewl.a $$5 = new ewl.a((arx)$$1).a(ezc.f, fbr.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gF()).a(ezc.a, $$0);
         }

         $$4.a(this, $$5.a(ezb.c), this.aA_());
      }
   }
}

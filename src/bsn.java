import javax.annotation.Nullable;

public interface bsn extends bsa {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alk<eul> ax_();

   void a(@Nullable alk<eul> var1);

   default void a(alk<eul> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aA_();

   void a(long var1);

   jh aB_();

   @Nullable
   dff i();

   static void a(dek $$0, azv $$1, jh $$2, alk<eul> $$3) {
      if ($$0.c_($$2) instanceof bsn $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(un $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alk.a(ma.bd, all.a($$0.l("LootTable"))));
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

   default boolean c_(un $$0) {
      alk<eul> $$1 = this.ax_();
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

   default void e_(@Nullable cor $$0) {
      dff $$1 = this.i();
      jh $$2 = this.aB_();
      alk<eul> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         eul $$4 = $$1.o().bc().b($$3);
         if ($$0 instanceof arr) {
            ao.Q.a((arr)$$0, $$3);
         }

         this.a(null);
         euj.a $$5 = new euj.a((arq)$$1).a(exc.f, ezr.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gI()).a(exc.a, $$0);
         }

         $$4.a(this, $$5.a(exb.c), this.aA_());
      }
   }
}

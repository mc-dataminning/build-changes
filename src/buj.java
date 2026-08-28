import javax.annotation.Nullable;

public interface buj extends btw {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alf<ezm> at_();

   void a(@Nullable alf<ezm> var1);

   default void a(alf<ezm> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aw_();

   void a(long var1);

   iu ax_();

   @Nullable
   dja i();

   static void a(dig $$0, azv $$1, iu $$2, alf<ezm> $$3) {
      if ($$0.c_($$2) instanceof buj $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tz $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alf.a(mg.bq, alg.a($$0.l("LootTable"))));
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

   default boolean c_(tz $$0) {
      alf<ezm> $$1 = this.at_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.aw_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void d_(@Nullable crc $$0) {
      dja $$1 = this.i();
      iu $$2 = this.ax_();
      alf<ezm> $$3 = this.at_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         ezm $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof arr) {
            ap.Q.a((arr)$$0, $$3);
         }

         this.a(null);
         ezk.a $$5 = new ezk.a((arq)$$1).a(fcb.f, feq.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eh()).a(fcb.a, $$0);
         }

         $$4.a(this, $$5.a(fca.c), this.aw_());
      }
   }
}

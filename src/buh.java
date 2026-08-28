import javax.annotation.Nullable;

public interface buh extends btu {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alf<eze> as_();

   void a(@Nullable alf<eze> var1);

   default void a(alf<eze> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long av_();

   void a(long var1);

   iu aw_();

   @Nullable
   div i();

   static void a(dib $$0, azv $$1, iu $$2, alf<eze> $$3) {
      if ($$0.c_($$2) instanceof buh $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tz $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alf.a(mg.bp, alg.a($$0.l("LootTable"))));
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
      alf<eze> $$1 = this.as_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.av_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void d_(@Nullable cqy $$0) {
      div $$1 = this.i();
      iu $$2 = this.aw_();
      alf<eze> $$3 = this.as_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         eze $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof arr) {
            ap.Q.a((arr)$$0, $$3);
         }

         this.a(null);
         ezc.a $$5 = new ezc.a((arq)$$1).a(fbt.f, fei.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eg()).a(fbt.a, $$0);
         }

         $$4.a(this, $$5.a(fbs.c), this.av_());
      }
   }
}

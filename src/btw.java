import javax.annotation.Nullable;

public interface btw extends btj {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alc<exq> as_();

   void a(@Nullable alc<exq> var1);

   default void a(alc<exq> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long av_();

   void a(long var1);

   jj aw_();

   @Nullable
   dhp i();

   static void a(dgv $$0, azs $$1, jj $$2, alc<exq> $$3) {
      if ($$0.c_($$2) instanceof btw $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tw $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(alc.a(me.bn, ald.a($$0.l("LootTable"))));
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

   default boolean c_(tw $$0) {
      alc<exq> $$1 = this.as_();
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

   default void d_(@Nullable cqi $$0) {
      dhp $$1 = this.i();
      jj $$2 = this.aw_();
      alc<exq> $$3 = this.as_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         exq $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof aro) {
            ap.Q.a((aro)$$0, $$3);
         }

         this.a(null);
         exo.a $$5 = new exo.a((arn)$$1).a(faf.f, fcu.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eg()).a(faf.a, $$0);
         }

         $$4.a(this, $$5.a(fae.c), this.av_());
      }
   }
}

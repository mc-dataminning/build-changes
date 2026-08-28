import javax.annotation.Nullable;

public interface bue extends btr {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   ald<eys> as_();

   void a(@Nullable ald<eys> var1);

   default void a(ald<eys> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long av_();

   void a(long var1);

   iu aw_();

   @Nullable
   dip i();

   static void a(dhv $$0, azt $$1, iu $$2, ald<eys> $$3) {
      if ($$0.c_($$2) instanceof bue $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(tx $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(mg.bo, ale.a($$0.l("LootTable"))));
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

   default boolean c_(tx $$0) {
      ald<eys> $$1 = this.as_();
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

   default void d_(@Nullable cqs $$0) {
      dip $$1 = this.i();
      iu $$2 = this.aw_();
      ald<eys> $$3 = this.as_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         eys $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof arp) {
            ap.Q.a((arp)$$0, $$3);
         }

         this.a(null);
         eyq.a $$5 = new eyq.a((aro)$$1).a(fbh.f, fdw.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eg()).a(fbh.a, $$0);
         }

         $$4.a(this, $$5.a(fbg.c), this.av_());
      }
   }
}

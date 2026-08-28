import javax.annotation.Nullable;

public interface bvi extends buv {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   alq<fay> at_();

   void a(@Nullable alq<fay> var1);

   default void a(alq<fay> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aw_();

   void a(long var1);

   iw ax_();

   @Nullable
   dkj i();

   static void a(djn $$0, bai $$1, iw $$2, alq<fay> $$3) {
      if ($$0.c_($$2) instanceof bvi $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ua $$0) {
      alq<fay> $$1 = $$0.<alq<fay>>a("LootTable", fay.a).orElse(null);
      this.a($$1);
      this.a($$0.b("LootTableSeed", 0L));
      return $$1 != null;
   }

   default boolean b(ua $$0) {
      alq<fay> $$1 = this.at_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", fay.a, $$1);
         long $$2 = this.aw_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void d_(@Nullable csi $$0) {
      dkj $$1 = this.i();
      iw $$2 = this.ax_();
      alq<fay> $$3 = this.at_();
      if ($$3 != null && $$1 != null && $$1.p() != null) {
         fay $$4 = $$1.p().bc().b($$3);
         if ($$0 instanceof asc) {
            aq.Q.a((asc)$$0, $$3);
         }

         this.a(null);
         faw.a $$5 = new faw.a((asb)$$1).a(fdn.f, fgc.b($$2));
         if ($$0 != null) {
            $$5.a($$0.eh()).a(fdn.a, $$0);
         }

         $$4.a(this, $$5.a(fdm.c), this.aw_());
      }
   }
}

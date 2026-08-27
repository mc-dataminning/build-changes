import javax.annotation.Nullable;

public interface bqe extends bpp {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akm<epm> ay_();

   void a(@Nullable akm<epm> var1);

   default void a(akm<epm> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   io aA_();

   @Nullable
   daz i();

   static void a(daf $$0, aym $$1, io $$2, akm<epm> $$3) {
      if ($$0.c_($$2) instanceof bqe $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ud $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akm.a(lf.aU, new akn($$0.l("LootTable"))));
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

   default boolean b_(ud $$0) {
      akm<epm> $$1 = this.ay_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.az_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cly $$0) {
      daz $$1 = this.i();
      io $$2 = this.aA_();
      akm<epm> $$3 = this.ay_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         epm $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aqo) {
            am.Q.a((aqo)$$0, $$3);
         }

         this.a(null);
         epk.a $$5 = new epk.a((aqn)$$1).a(erz.f, eum.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(erz.a, $$0);
         }

         $$4.a(this, $$5.a(ery.c), this.az_());
      }
   }
}

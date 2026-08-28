import javax.annotation.Nullable;

public interface bqz extends bqk {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akq<erw> aB_();

   void a(@Nullable akq<erw> var1);

   default void a(akq<erw> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long aC_();

   void a(long var1);

   jd aD_();

   @Nullable
   dcw i();

   static void a(dcc $$0, ayw $$1, jd $$2, akq<erw> $$3) {
      if ($$0.c_($$2) instanceof bqz $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean b_(ub $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akq.a(lu.bc, akr.a($$0.l("LootTable"))));
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

   default boolean c_(ub $$0) {
      akq<erw> $$1 = this.aB_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.aC_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cmx $$0) {
      dcw $$1 = this.i();
      jd $$2 = this.aD_();
      akq<erw> $$3 = this.aB_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         erw $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aqv) {
            an.Q.a((aqv)$$0, $$3);
         }

         this.a(null);
         eru.a $$5 = new eru.a((aqu)$$1).a(eun.f, exc.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gu()).a(eun.a, $$0);
         }

         $$4.a(this, $$5.a(eum.c), this.aC_());
      }
   }
}

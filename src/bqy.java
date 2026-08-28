import javax.annotation.Nullable;

public interface bqy extends bqj {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akp<erq> ax_();

   void a(@Nullable akp<erq> var1);

   default void a(akp<erq> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   jd az_();

   @Nullable
   dcu i();

   static void a(dca $$0, ayv $$1, jd $$2, akp<erq> $$3) {
      if ($$0.c_($$2) instanceof bqy $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ua $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akp.a(lu.bc, akq.a($$0.l("LootTable"))));
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

   default boolean b_(ua $$0) {
      akp<erq> $$1 = this.ax_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", $$1.a().toString());
         long $$2 = this.ay_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void e_(@Nullable cmv $$0) {
      dcu $$1 = this.i();
      jd $$2 = this.az_();
      akp<erq> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         erq $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aqu) {
            an.Q.a((aqu)$$0, $$3);
         }

         this.a(null);
         ero.a $$5 = new ero.a((aqt)$$1).a(euh.f, eww.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gv()).a(euh.a, $$0);
         }

         $$4.a(this, $$5.a(eug.c), this.ay_());
      }
   }
}

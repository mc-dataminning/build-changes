import javax.annotation.Nullable;

public interface bqc extends bpn {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   akl<epk> ax_();

   void a(@Nullable akl<epk> var1);

   default void a(akl<epk> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long ay_();

   void a(long var1);

   io az_();

   @Nullable
   dax i();

   static void a(dad $$0, ayk $$1, io $$2, akl<epk> $$3) {
      if ($$0.c_($$2) instanceof bqc $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean a_(ud $$0) {
      if ($$0.b("LootTable", 8)) {
         this.a(akl.a(lf.aU, new akm($$0.l("LootTable"))));
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
      akl<epk> $$1 = this.ax_();
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

   default void e_(@Nullable clw $$0) {
      dax $$1 = this.i();
      io $$2 = this.az_();
      akl<epk> $$3 = this.ax_();
      if ($$3 != null && $$1 != null && $$1.o() != null) {
         epk $$4 = $$1.o().be().b($$3);
         if ($$0 instanceof aqn) {
            am.Q.a((aqn)$$0, $$3);
         }

         this.a(null);
         epi.a $$5 = new epi.a((aqm)$$1).a(erx.f, euk.b($$2));
         if ($$0 != null) {
            $$5.a($$0.gy()).a(erx.a, $$0);
         }

         $$4.a(this, $$5.a(erw.c), this.ay_());
      }
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crw extends bsx, btg {
   fbs dt();

   fbn cR();

   @Nullable
   aly<ewm> v();

   void a(@Nullable aly<ewm> var1);

   long x();

   void a(long var1);

   jz<cxk> B();

   void C();

   dha dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ux $$0, js.a $$1) {
      if (this.v() != null) {
         $$0.a("LootTable", this.v().a().toString());
         if (this.x() != 0L) {
            $$0.a("LootTableSeed", this.x());
         }
      } else {
         bsy.a($$0, this.B(), $$1);
      }
   }

   default void b(ux $$0, js.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(aly.a(mb.bf, alz.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsy.b($$0, this.B(), $$1);
      }
   }

   default void a(btv $$0, ash $$1, bvf $$2) {
      if ($$1.N().b(dgw.i)) {
         bta.a($$1, $$2, this);
         bvf $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bvm.bS) {
            coh.a($$1, (cps)$$3, true);
         }
      }
   }

   default bte b_(cps $$0) {
      $$0.a(this);
      return bte.a;
   }

   default void f(@Nullable cps $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.v() != null && $$1 != null) {
         ewm $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ao.Q.a((asi)$$0, this.v());
         }

         this.a(null);
         ewk.a $$3 = new ewk.a((ash)this.dV()).a(ezd.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.gD()).a(ezd.a, $$0);
         }

         $$2.a(this, $$3.a(ezc.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cxk $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cxk f_(int $$0) {
      this.f(null);
      cxk $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cxk.k;
      } else {
         this.B().set($$0, cxk.k);
         return $$1;
      }
   }

   default cxk g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cxk b(int $$0, int $$1) {
      this.f(null);
      return bsy.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cxk $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bwt h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bwt() {
         @Override
         public cxk a() {
            return crw.this.g_($$0);
         }

         @Override
         public boolean a(cxk $$0x) {
            crw.this.c($$0, $$0);
            return true;
         }
      } : bwt.a;
   }

   default boolean g(cps $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

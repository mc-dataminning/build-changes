import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface csb extends btc, btl {
   fby du();

   fbt cR();

   @Nullable
   aly<ewu> v();

   void a(@Nullable aly<ewu> var1);

   long x();

   void a(long var1);

   jz<cxp> B();

   void C();

   dhi dW();

   boolean dR();

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
         btd.a($$0, this.B(), $$1);
      }
   }

   default void b(ux $$0, js.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(aly.a(mb.bg, alz.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         btd.b($$0, this.B(), $$1);
      }
   }

   default void a(bua $$0, ash $$1, bvk $$2) {
      if ($$1.N().b(dhe.i)) {
         btf.a($$1, $$2, this);
         bvk $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bvr.bS) {
            com.a($$1, (cpx)$$3, true);
         }
      }
   }

   default btj b_(cpx $$0) {
      $$0.a(this);
      return btj.a;
   }

   default void f(@Nullable cpx $$0) {
      MinecraftServer $$1 = this.dW().p();
      if (this.v() != null && $$1 != null) {
         ewu $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ao.Q.a((asi)$$0, this.v());
         }

         this.a(null);
         ews.a $$3 = new ews.a((ash)this.dW()).a(ezj.f, this.du());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(ezj.a, $$0);
         }

         $$2.a(this, $$3.a(ezi.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cxp $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cxp f_(int $$0) {
      this.f(null);
      cxp $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cxp.j;
      } else {
         this.B().set($$0, cxp.j);
         return $$1;
      }
   }

   default cxp g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cxp b(int $$0, int $$1) {
      this.f(null);
      return btd.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cxp $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bwy h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bwy() {
         @Override
         public cxp a() {
            return csb.this.g_($$0);
         }

         @Override
         public boolean a(cxp $$0x) {
            csb.this.c($$0, $$0);
            return true;
         }
      } : bwy.a;
   }

   default boolean g(cpx $$0) {
      return !this.dR() && $$0.a(this.cR(), 4.0);
   }
}

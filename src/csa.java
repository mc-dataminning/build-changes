import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface csa extends btb, btk {
   fbx du();

   fbs cR();

   @Nullable
   aly<ewt> v();

   void a(@Nullable aly<ewt> var1);

   long x();

   void a(long var1);

   jz<cxo> B();

   void C();

   dhh dW();

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
         btc.a($$0, this.B(), $$1);
      }
   }

   default void b(ux $$0, js.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(aly.a(mb.bg, alz.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         btc.b($$0, this.B(), $$1);
      }
   }

   default void a(btz $$0, ash $$1, bvj $$2) {
      if ($$1.N().b(dhd.i)) {
         bte.a($$1, $$2, this);
         bvj $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bvq.bS) {
            col.a($$1, (cpw)$$3, true);
         }
      }
   }

   default bti b_(cpw $$0) {
      $$0.a(this);
      return bti.a;
   }

   default void f(@Nullable cpw $$0) {
      MinecraftServer $$1 = this.dW().p();
      if (this.v() != null && $$1 != null) {
         ewt $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ao.Q.a((asi)$$0, this.v());
         }

         this.a(null);
         ewr.a $$3 = new ewr.a((ash)this.dW()).a(ezi.f, this.du());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(ezi.a, $$0);
         }

         $$2.a(this, $$3.a(ezh.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cxo $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cxo f_(int $$0) {
      this.f(null);
      cxo $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cxo.j;
      } else {
         this.B().set($$0, cxo.j);
         return $$1;
      }
   }

   default cxo g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cxo b(int $$0, int $$1) {
      this.f(null);
      return btc.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cxo $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bwx h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bwx() {
         @Override
         public cxo a() {
            return csa.this.g_($$0);
         }

         @Override
         public boolean a(cxo $$0x) {
            csa.this.c($$0, $$0);
            return true;
         }
      } : bwx.a;
   }

   default boolean g(cpw $$0) {
      return !this.dR() && $$0.a(this.cR(), 4.0);
   }
}

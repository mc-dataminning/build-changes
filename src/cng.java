import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cng extends bpf, bpq {
   etp dl();

   etk cI();

   @Nullable
   akg<eoq> B();

   void a(@Nullable akg<eoq> var1);

   long C();

   void a(long var1);

   jf<csz> D();

   void E();

   dad dN();

   boolean dI();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ua $$0, iy.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bpg.a($$0, this.D(), $$1);
      }
   }

   default void b(ua $$0, iy.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akg.a(le.aU, new akh($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bpg.b($$0, this.D(), $$1);
      }
   }

   default void a(bqf $$0, dad $$1, brh $$2) {
      if ($$1.aa().b(czz.i)) {
         bpi.a($$1, $$2, this);
         if (!$$1.B) {
            brh $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == brn.bx) {
               cjy.a((clh)$$3, true);
            }
         }
      }
   }

   default bpm c_(clh $$0) {
      $$0.a(this);
      return !$$0.dN().B ? bpm.b : bpm.a;
   }

   default void f(@Nullable clh $$0) {
      MinecraftServer $$1 = this.dN().o();
      if (this.B() != null && $$1 != null) {
         eoq $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((aqi)$$0, this.B());
         }

         this.a(null);
         eoo.a $$3 = new eoo.a((aqh)this.dN()).a(erc.f, this.dl());
         if ($$0 != null) {
            $$3.a($$0.gw()).a(erc.a, $$0);
         }

         $$2.a(this, $$3.a(erb.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (csz $$0 : this.D()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   default csz e_(int $$0) {
      this.f(null);
      csz $$1 = this.D().get($$0);
      if ($$1.d()) {
         return csz.i;
      } else {
         this.D().set($$0, csz.i);
         return $$1;
      }
   }

   default csz f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default csz b(int $$0, int $$1) {
      this.f(null);
      return bpg.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, csz $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.a($$1));
   }

   default bsr g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bsr() {
         @Override
         public csz a() {
            return cng.this.f_($$0);
         }

         @Override
         public boolean a(csz $$0x) {
            cng.this.c($$0, $$0);
            return true;
         }
      } : bsr.b;
   }

   default boolean g(clh $$0) {
      return !this.dI() && $$0.a(this.cI(), 4.0);
   }
}

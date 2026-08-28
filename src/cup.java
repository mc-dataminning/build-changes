import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cup extends buk, but {
   ffq dt();

   ffl cR();

   @Nullable
   alh<fam> q();

   void a(@Nullable alh<fam> var1);

   long s();

   void a(long var1);

   jo<czy> t();

   void u();

   djx dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.al_();
   }

   default void a(tz $$0, jh.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         bul.a($$0, this.t(), $$1);
      }
   }

   default void b(tz $$0, jh.a $$1) {
      this.u();
      alh<fam> $$2 = $$0.<alh<fam>>a("LootTable", fam.a).orElse(null);
      this.a($$2);
      this.a($$0.b("LootTableSeed", 0L));
      if ($$2 == null) {
         bul.b($$0, this.t(), $$1);
      }
   }

   default void a(bvi $$0, ars $$1, bwt $$2) {
      if ($$1.O().c(djt.j)) {
         bun.a($$1, $$2, this);
         bwt $$3 = $$0.c();
         if ($$3 != null && $$3.an() == bxc.bT) {
            cqn.a($$1, (crx)$$3, true);
         }
      }
   }

   default bur b_(crx $$0) {
      $$0.a(this);
      return bur.a;
   }

   default void f(@Nullable crx $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         fam $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            aq.Q.a((art)$$0, this.q());
         }

         this.a(null);
         fak.a $$3 = new fak.a((ars)this.dV()).a(fdb.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eh()).a(fdb.a, $$0);
         }

         $$2.a(this, $$3.a(fda.c), this.s());
      }
   }

   default void ak_() {
      this.f(null);
      this.t().clear();
   }

   default boolean al_() {
      for (czy $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default czy f_(int $$0) {
      this.f(null);
      czy $$1 = this.t().get($$0);
      if ($$1.f()) {
         return czy.k;
      } else {
         this.t().set($$0, czy.k);
         return $$1;
      }
   }

   default czy g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default czy b(int $$0, int $$1) {
      this.f(null);
      return bul.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, czy $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default byl h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new byl() {
         @Override
         public czy a() {
            return cup.this.g_($$0);
         }

         @Override
         public boolean a(czy $$0x) {
            cup.this.c($$0, $$0);
            return true;
         }
      } : byl.a;
   }

   default boolean g(crx $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cub extends btz, bui {
   fex ds();

   fes cQ();

   @Nullable
   alf<ezt> q();

   void a(@Nullable alf<ezt> var1);

   long s();

   void a(long var1);

   jo<czk> t();

   void u();

   djh dU();

   boolean dP();

   @Override
   default boolean c() {
      return this.ah_();
   }

   default void a(tz $$0, jh.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         bua.a($$0, this.t(), $$1);
      }
   }

   default void b(tz $$0, jh.a $$1) {
      this.u();
      alf<ezt> $$2 = $$0.<alf<ezt>>a("LootTable", ezt.a).orElse(null);
      this.a($$2);
      this.a($$0.b("LootTableSeed", 0L));
      if ($$2 == null) {
         bua.b($$0, this.t(), $$1);
      }
   }

   default void a(bux $$0, arq $$1, bwi $$2) {
      if ($$1.O().c(djd.j)) {
         buc.a($$1, $$2, this);
         bwi $$3 = $$0.c();
         if ($$3 != null && $$3.an() == bwr.bS) {
            cpz.a($$1, (crj)$$3, true);
         }
      }
   }

   default bug b_(crj $$0) {
      $$0.a(this);
      return bug.a;
   }

   default void f(@Nullable crj $$0) {
      MinecraftServer $$1 = this.dU().p();
      if (this.q() != null && $$1 != null) {
         ezt $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            aq.Q.a((arr)$$0, this.q());
         }

         this.a(null);
         ezr.a $$3 = new ezr.a((arq)this.dU()).a(fci.f, this.ds());
         if ($$0 != null) {
            $$3.a($$0.eg()).a(fci.a, $$0);
         }

         $$2.a(this, $$3.a(fch.c), this.s());
      }
   }

   default void ag_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ah_() {
      for (czk $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default czk f_(int $$0) {
      this.f(null);
      czk $$1 = this.t().get($$0);
      if ($$1.f()) {
         return czk.k;
      } else {
         this.t().set($$0, czk.k);
         return $$1;
      }
   }

   default czk g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default czk b(int $$0, int $$1) {
      this.f(null);
      return bua.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, czk $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default bya h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bya() {
         @Override
         public czk a() {
            return cub.this.g_($$0);
         }

         @Override
         public boolean a(czk $$0x) {
            cub.this.c($$0, $$0);
            return true;
         }
      } : bya.a;
   }

   default boolean g(crj $$0) {
      return !this.dP() && $$0.a(this.cQ(), 4.0);
   }
}

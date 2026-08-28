import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cue extends btz, bui {
   ffc ds();

   fex cQ();

   @Nullable
   alf<ezy> q();

   void a(@Nullable alf<ezy> var1);

   long s();

   void a(long var1);

   jo<czn> t();

   void u();

   djm dU();

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
      alf<ezy> $$2 = $$0.<alf<ezy>>a("LootTable", ezy.a).orElse(null);
      this.a($$2);
      this.a($$0.b("LootTableSeed", 0L));
      if ($$2 == null) {
         bua.b($$0, this.t(), $$1);
      }
   }

   default void a(bux $$0, arq $$1, bwi $$2) {
      if ($$1.O().c(dji.j)) {
         buc.a($$1, $$2, this);
         bwi $$3 = $$0.c();
         if ($$3 != null && $$3.an() == bwr.bS) {
            cqc.a($$1, (crm)$$3, true);
         }
      }
   }

   default bug b_(crm $$0) {
      $$0.a(this);
      return bug.a;
   }

   default void f(@Nullable crm $$0) {
      MinecraftServer $$1 = this.dU().p();
      if (this.q() != null && $$1 != null) {
         ezy $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            aq.Q.a((arr)$$0, this.q());
         }

         this.a(null);
         ezw.a $$3 = new ezw.a((arq)this.dU()).a(fcn.f, this.ds());
         if ($$0 != null) {
            $$3.a($$0.eg()).a(fcn.a, $$0);
         }

         $$2.a(this, $$3.a(fcm.c), this.s());
      }
   }

   default void ag_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ah_() {
      for (czn $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default czn f_(int $$0) {
      this.f(null);
      czn $$1 = this.t().get($$0);
      if ($$1.f()) {
         return czn.k;
      } else {
         this.t().set($$0, czn.k);
         return $$1;
      }
   }

   default czn g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default czn b(int $$0, int $$1) {
      this.f(null);
      return bua.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, czn $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default bya h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bya() {
         @Override
         public czn a() {
            return cue.this.g_($$0);
         }

         @Override
         public boolean a(czn $$0x) {
            cue.this.c($$0, $$0);
            return true;
         }
      } : bya.a;
   }

   default boolean g(crm $$0) {
      return !this.dP() && $$0.a(this.cQ(), 4.0);
   }
}

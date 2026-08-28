import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ctp extends btu, bud {
   fei dt();

   fed cR();

   @Nullable
   alf<eze> q();

   void a(@Nullable alf<eze> var1);

   long s();

   void a(long var1);

   jn<cyy> t();

   void u();

   div dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.ag_();
   }

   default void a(tz $$0, jg.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         btv.a($$0, this.t(), $$1);
      }
   }

   default void b(tz $$0, jg.a $$1) {
      this.u();
      if ($$0.b("LootTable", 8)) {
         this.a(alf.a(mg.bp, alg.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         btv.b($$0, this.t(), $$1);
      }
   }

   default void a(bus $$0, arq $$1, bwd $$2) {
      if ($$1.O().c(dir.i)) {
         btx.a($$1, $$2, this);
         bwd $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bwm.bS) {
            cpo.a($$1, (cqy)$$3, true);
         }
      }
   }

   default bub b_(cqy $$0) {
      $$0.a(this);
      return bub.a;
   }

   default void f(@Nullable cqy $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         eze $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            ap.Q.a((arr)$$0, this.q());
         }

         this.a(null);
         ezc.a $$3 = new ezc.a((arq)this.dV()).a(fbt.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eg()).a(fbt.a, $$0);
         }

         $$2.a(this, $$3.a(fbs.c), this.s());
      }
   }

   default void af_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ag_() {
      for (cyy $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cyy f_(int $$0) {
      this.f(null);
      cyy $$1 = this.t().get($$0);
      if ($$1.f()) {
         return cyy.k;
      } else {
         this.t().set($$0, cyy.k);
         return $$1;
      }
   }

   default cyy g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default cyy b(int $$0, int $$1) {
      this.f(null);
      return btv.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, cyy $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default bxt h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bxt() {
         @Override
         public cyy a() {
            return ctp.this.g_($$0);
         }

         @Override
         public boolean a(cyy $$0x) {
            ctp.this.c($$0, $$0);
            return true;
         }
      } : bxt.a;
   }

   default boolean g(cqy $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

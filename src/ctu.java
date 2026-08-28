import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ctu extends btw, buf {
   feq dt();

   fel cR();

   @Nullable
   alf<ezm> q();

   void a(@Nullable alf<ezm> var1);

   long s();

   void a(long var1);

   jn<czd> t();

   void u();

   dja dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.ah_();
   }

   default void a(tz $$0, jg.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         btx.a($$0, this.t(), $$1);
      }
   }

   default void b(tz $$0, jg.a $$1) {
      this.u();
      if ($$0.b("LootTable", 8)) {
         this.a(alf.a(mg.bq, alg.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         btx.b($$0, this.t(), $$1);
      }
   }

   default void a(buu $$0, arq $$1, bwf $$2) {
      if ($$1.O().c(diw.j)) {
         btz.a($$1, $$2, this);
         bwf $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bwo.bS) {
            cps.a($$1, (crc)$$3, true);
         }
      }
   }

   default bud b_(crc $$0) {
      $$0.a(this);
      return bud.a;
   }

   default void f(@Nullable crc $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         ezm $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            ap.Q.a((arr)$$0, this.q());
         }

         this.a(null);
         ezk.a $$3 = new ezk.a((arq)this.dV()).a(fcb.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eh()).a(fcb.a, $$0);
         }

         $$2.a(this, $$3.a(fca.c), this.s());
      }
   }

   default void ag_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ah_() {
      for (czd $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default czd f_(int $$0) {
      this.f(null);
      czd $$1 = this.t().get($$0);
      if ($$1.f()) {
         return czd.k;
      } else {
         this.t().set($$0, czd.k);
         return $$1;
      }
   }

   default czd g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default czd b(int $$0, int $$1) {
      this.f(null);
      return btx.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, czd $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default bxv h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bxv() {
         @Override
         public czd a() {
            return ctu.this.g_($$0);
         }

         @Override
         public boolean a(czd $$0x) {
            ctu.this.c($$0, $$0);
            return true;
         }
      } : bxv.a;
   }

   default boolean g(crc $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

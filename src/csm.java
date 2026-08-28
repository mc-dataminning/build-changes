import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface csm extends btj, bts {
   fcu dt();

   fcp cR();

   @Nullable
   alc<exq> q();

   void a(@Nullable alc<exq> var1);

   long s();

   void a(long var1);

   kb<cxy> t();

   void u();

   dhp dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.ag_();
   }

   default void a(tw $$0, ju.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         btk.a($$0, this.t(), $$1);
      }
   }

   default void b(tw $$0, ju.a $$1) {
      this.u();
      if ($$0.b("LootTable", 8)) {
         this.a(alc.a(me.bn, ald.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         btk.b($$0, this.t(), $$1);
      }
   }

   default void a(buh $$0, arn $$1, bvs $$2) {
      if ($$1.O().c(dhl.i)) {
         btm.a($$1, $$2, this);
         bvs $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bwb.bR) {
            coy.a($$1, (cqi)$$3, true);
         }
      }
   }

   default btq b_(cqi $$0) {
      $$0.a(this);
      return btq.a;
   }

   default void f(@Nullable cqi $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         exq $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            ap.Q.a((aro)$$0, this.q());
         }

         this.a(null);
         exo.a $$3 = new exo.a((arn)this.dV()).a(faf.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eg()).a(faf.a, $$0);
         }

         $$2.a(this, $$3.a(fae.c), this.s());
      }
   }

   default void af_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ag_() {
      for (cxy $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cxy f_(int $$0) {
      this.f(null);
      cxy $$1 = this.t().get($$0);
      if ($$1.f()) {
         return cxy.k;
      } else {
         this.t().set($$0, cxy.k);
         return $$1;
      }
   }

   default cxy g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default cxy b(int $$0, int $$1) {
      this.f(null);
      return btk.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, cxy $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bxi h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bxi() {
         @Override
         public cxy a() {
            return csm.this.g_($$0);
         }

         @Override
         public boolean a(cxy $$0x) {
            csm.this.c($$0, $$0);
            return true;
         }
      } : bxi.a;
   }

   default boolean g(cqi $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

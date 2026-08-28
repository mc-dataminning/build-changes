import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ctj extends btr, bua {
   fdw dt();

   fdr cR();

   @Nullable
   ald<eys> q();

   void a(@Nullable ald<eys> var1);

   long s();

   void a(long var1);

   jn<cys> t();

   void u();

   dip dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.ag_();
   }

   default void a(tx $$0, jg.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         bts.a($$0, this.t(), $$1);
      }
   }

   default void b(tx $$0, jg.a $$1) {
      this.u();
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(mg.bo, ale.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bts.b($$0, this.t(), $$1);
      }
   }

   default void a(bup $$0, aro $$1, bwa $$2) {
      if ($$1.O().c(dil.i)) {
         btu.a($$1, $$2, this);
         bwa $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bwj.bS) {
            cpi.a($$1, (cqs)$$3, true);
         }
      }
   }

   default bty b_(cqs $$0) {
      $$0.a(this);
      return bty.a;
   }

   default void f(@Nullable cqs $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         eys $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            ap.Q.a((arp)$$0, this.q());
         }

         this.a(null);
         eyq.a $$3 = new eyq.a((aro)this.dV()).a(fbh.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eg()).a(fbh.a, $$0);
         }

         $$2.a(this, $$3.a(fbg.c), this.s());
      }
   }

   default void af_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ag_() {
      for (cys $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cys f_(int $$0) {
      this.f(null);
      cys $$1 = this.t().get($$0);
      if ($$1.f()) {
         return cys.k;
      } else {
         this.t().set($$0, cys.k);
         return $$1;
      }
   }

   default cys g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default cys b(int $$0, int $$1) {
      this.f(null);
      return bts.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, cys $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bxq h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bxq() {
         @Override
         public cys a() {
            return ctj.this.g_($$0);
         }

         @Override
         public boolean a(cys $$0x) {
            ctj.this.c($$0, $$0);
            return true;
         }
      } : bxq.a;
   }

   default boolean g(cqs $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

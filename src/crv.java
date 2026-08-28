import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crv extends bsr, bta {
   fbx ds();

   fbs cQ();

   @Nullable
   akt<ewt> q();

   void a(@Nullable akt<ewt> var1);

   long s();

   void a(long var1);

   ka<cxh> t();

   void u();

   dgz dU();

   boolean dP();

   @Override
   default boolean c() {
      return this.ak_();
   }

   default void a(tq $$0, jt.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         bss.a($$0, this.t(), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      this.u();
      if ($$0.b("LootTable", 8)) {
         this.a(akt.a(mc.bi, aku.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bss.b($$0, this.t(), $$1);
      }
   }

   default void a(btp $$0, ard $$1, bva $$2) {
      if ($$1.O().b(dgv.i)) {
         bsu.a($$1, $$2, this);
         bva $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bvi.bR) {
            cog.a($$1, (cpr)$$3, true);
         }
      }
   }

   default bsy b_(cpr $$0) {
      $$0.a(this);
      return bsy.a;
   }

   default void f(@Nullable cpr $$0) {
      MinecraftServer $$1 = this.dU().p();
      if (this.q() != null && $$1 != null) {
         ewt $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            ap.Q.a((are)$$0, this.q());
         }

         this.a(null);
         ewr.a $$3 = new ewr.a((ard)this.dU()).a(ezi.f, this.ds());
         if ($$0 != null) {
            $$3.a($$0.ef()).a(ezi.a, $$0);
         }

         $$2.a(this, $$3.a(ezh.c), this.s());
      }
   }

   default void aj_() {
      this.f(null);
      this.t().clear();
   }

   default boolean ak_() {
      for (cxh $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cxh f_(int $$0) {
      this.f(null);
      cxh $$1 = this.t().get($$0);
      if ($$1.f()) {
         return cxh.k;
      } else {
         this.t().set($$0, cxh.k);
         return $$1;
      }
   }

   default cxh g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default cxh b(int $$0, int $$1) {
      this.f(null);
      return bss.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, cxh $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bwq h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bwq() {
         @Override
         public cxh a() {
            return crv.this.g_($$0);
         }

         @Override
         public boolean a(cxh $$0x) {
            crv.this.c($$0, $$0);
            return true;
         }
      } : bwq.a;
   }

   default boolean g(cpr $$0) {
      return !this.dP() && $$0.a(this.cQ(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cqy extends bsd, bsm {
   ezy dt();

   ezt cR();

   @Nullable
   ali<eus> u();

   void a(@Nullable ali<eus> var1);

   long v();

   void a(long var1);

   jz<cwm> B();

   void C();

   dfm dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ul $$0, js.a $$1) {
      if (this.u() != null) {
         $$0.a("LootTable", this.u().a().toString());
         if (this.v() != 0L) {
            $$0.a("LootTableSeed", this.v());
         }
      } else {
         bse.a($$0, this.B(), $$1);
      }
   }

   default void b(ul $$0, js.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(ali.a(ma.bd, alj.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bse.b($$0, this.B(), $$1);
      }
   }

   default void a(btb $$0, arp $$1, bul $$2) {
      if ($$1.N().b(dfi.i)) {
         bsg.a($$1, $$2, this);
         bul $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bus.bO) {
            cnj.a($$1, (cou)$$3, true);
         }
      }
   }

   default bsk b_(cou $$0) {
      $$0.a(this);
      return bsk.a;
   }

   default void f(@Nullable cou $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.u() != null && $$1 != null) {
         eus $$2 = $$1.bc().b(this.u());
         if ($$0 != null) {
            ao.Q.a((arq)$$0, this.u());
         }

         this.a(null);
         euq.a $$3 = new euq.a((arp)this.dV()).a(exj.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.gD()).a(exj.a, $$0);
         }

         $$2.a(this, $$3.a(exi.c), this.v());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cwm $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwm f_(int $$0) {
      this.f(null);
      cwm $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cwm.k;
      } else {
         this.B().set($$0, cwm.k);
         return $$1;
      }
   }

   default cwm g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cwm b(int $$0, int $$1) {
      this.f(null);
      return bse.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cwm $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvz h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvz() {
         @Override
         public cwm a() {
            return cqy.this.g_($$0);
         }

         @Override
         public boolean a(cwm $$0x) {
            cqy.this.c($$0, $$0);
            return true;
         }
      } : bvz.a;
   }

   default boolean g(cou $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

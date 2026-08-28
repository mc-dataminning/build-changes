import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crb extends bsd, bsm {
   fba dt();

   fav cR();

   @Nullable
   aku<evw> v();

   void a(@Nullable aku<evw> var1);

   long x();

   void a(long var1);

   ka<cwp> E();

   void F();

   dgi dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(tq $$0, jt.a $$1) {
      if (this.v() != null) {
         $$0.a("LootTable", this.v().a().toString());
         if (this.x() != 0L) {
            $$0.a("LootTableSeed", this.x());
         }
      } else {
         bse.a($$0, this.E(), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      this.F();
      if ($$0.b("LootTable", 8)) {
         this.a(aku.a(mc.bg, akv.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bse.b($$0, this.E(), $$1);
      }
   }

   default void a(btb $$0, ard $$1, bul $$2) {
      if ($$1.O().b(dge.i)) {
         bsg.a($$1, $$2, this);
         bul $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bus.bR) {
            cnm.a($$1, (cox)$$3, true);
         }
      }
   }

   default bsk b_(cox $$0) {
      $$0.a(this);
      return bsk.a;
   }

   default void f(@Nullable cox $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.v() != null && $$1 != null) {
         evw $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ap.Q.a((are)$$0, this.v());
         }

         this.a(null);
         evu.a $$3 = new evu.a((ard)this.dV()).a(eyl.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(eyl.a, $$0);
         }

         $$2.a(this, $$3.a(eyk.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cwp $$0 : this.E()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwp f_(int $$0) {
      this.f(null);
      cwp $$1 = this.E().get($$0);
      if ($$1.f()) {
         return cwp.j;
      } else {
         this.E().set($$0, cwp.j);
         return $$1;
      }
   }

   default cwp g_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cwp b(int $$0, int $$1) {
      this.f(null);
      return bse.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cwp $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvz h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvz() {
         @Override
         public cwp a() {
            return crb.this.g_($$0);
         }

         @Override
         public boolean a(cwp $$0x) {
            crb.this.c($$0, $$0);
            return true;
         }
      } : bvz.a;
   }

   default boolean g(cox $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

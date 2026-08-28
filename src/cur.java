import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cur extends bum, buv {
   ffs dt();

   ffn cR();

   @Nullable
   alj<fao> q();

   void a(@Nullable alj<fao> var1);

   long s();

   void a(long var1);

   jp<daa> t();

   void u();

   djz dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.al_();
   }

   default void a(ua $$0, ji.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         bun.a($$0, this.t(), $$1);
      }
   }

   default void b(ua $$0, ji.a $$1) {
      this.u();
      alj<fao> $$2 = $$0.<alj<fao>>a("LootTable", fao.a).orElse(null);
      this.a($$2);
      this.a($$0.b("LootTableSeed", 0L));
      if ($$2 == null) {
         bun.b($$0, this.t(), $$1);
      }
   }

   default void a(bvk $$0, aru $$1, bwv $$2) {
      if ($$1.O().c(djv.j)) {
         bup.a($$1, $$2, this);
         bwv $$3 = $$0.c();
         if ($$3 != null && $$3.an() == bxe.bT) {
            cqp.a($$1, (crz)$$3, true);
         }
      }
   }

   default but b_(crz $$0) {
      $$0.a(this);
      return but.a;
   }

   default void f(@Nullable crz $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         fao $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            aq.Q.a((arv)$$0, this.q());
         }

         this.a(null);
         fam.a $$3 = new fam.a((aru)this.dV()).a(fdd.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eh()).a(fdd.a, $$0);
         }

         $$2.a(this, $$3.a(fdc.c), this.s());
      }
   }

   default void ak_() {
      this.f(null);
      this.t().clear();
   }

   default boolean al_() {
      for (daa $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default daa f_(int $$0) {
      this.f(null);
      daa $$1 = this.t().get($$0);
      if ($$1.f()) {
         return daa.k;
      } else {
         this.t().set($$0, daa.k);
         return $$1;
      }
   }

   default daa g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default daa b(int $$0, int $$1) {
      this.f(null);
      return bun.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, daa $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default byn h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new byn() {
         @Override
         public daa a() {
            return cur.this.g_($$0);
         }

         @Override
         public boolean a(daa $$0x) {
            cur.this.c($$0, $$0);
            return true;
         }
      } : byn.a;
   }

   default boolean g(crz $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

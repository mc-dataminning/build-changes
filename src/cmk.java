import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cmk extends boj, bou {
   etf dl();

   eta cI();

   @Nullable
   akf B();

   void a(@Nullable akf var1);

   long C();

   void a(long var1);

   je<csd> D();

   void E();

   czu dN();

   boolean dI();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ty $$0, ix.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bok.a($$0, this.D(), $$1);
      }
   }

   default void b(ty $$0, ix.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new akf($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bok.b($$0, this.D(), $$1);
      }
   }

   default void a(bpj $$0, czu $$1, bql $$2) {
      if ($$1.aa().b(czq.i)) {
         bom.a($$1, $$2, this);
         if (!$$1.B) {
            bql $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bqr.bx) {
               cjc.a((ckl)$$3, true);
            }
         }
      }
   }

   default boq c_(ckl $$0) {
      $$0.a(this);
      return !$$0.dN().B ? boq.b : boq.a;
   }

   default void f(@Nullable ckl $$0) {
      MinecraftServer $$1 = this.dN().o();
      if (this.B() != null && $$1 != null) {
         eoi $$2 = $$1.aM().getLootTable(this.B());
         if ($$0 != null) {
            am.Q.a((aqf)$$0, this.B());
         }

         this.a(null);
         eog.a $$3 = new eog.a((aqe)this.dN()).a(eqt.f, this.dl());
         if ($$0 != null) {
            $$3.a($$0.gw()).a(eqt.a, $$0);
         }

         $$2.a(this, $$3.a(eqs.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (csd $$0 : this.D()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   default csd e_(int $$0) {
      this.f(null);
      csd $$1 = this.D().get($$0);
      if ($$1.d()) {
         return csd.i;
      } else {
         this.D().set($$0, csd.i);
         return $$1;
      }
   }

   default csd f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default csd b(int $$0, int $$1) {
      this.f(null);
      return bok.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, csd $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }
   }

   default brv g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new brv() {
         @Override
         public csd a() {
            return cmk.this.f_($$0);
         }

         @Override
         public boolean a(csd $$0x) {
            cmk.this.c($$0, $$0);
            return true;
         }
      } : brv.b;
   }

   default boolean g(ckl $$0) {
      return !this.dI() && $$0.a(this.cI(), 4.0);
   }
}

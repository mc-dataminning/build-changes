import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cdp extends bgr, bhb {
   ehn dj();

   @Nullable
   aew G();

   void a(@Nullable aew var1);

   long H();

   void a(long var1);

   hn<cjf> I();

   void K();

   cpv dL();

   boolean dG();

   @Override
   default boolean af_() {
      return this.g();
   }

   default void c(qw $$0) {
      if (this.G() != null) {
         $$0.a("LootTable", this.G().toString());
         if (this.H() != 0L) {
            $$0.a("LootTableSeed", this.H());
         }
      } else {
         bgs.a($$0, this.I());
      }
   }

   default void b_(qw $$0) {
      this.K();
      if ($$0.b("LootTable", 8)) {
         this.a(new aew($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bgs.b($$0, this.I());
      }
   }

   default void a(bho $$0, cpv $$1, biq $$2) {
      if ($$1.X().b(cpr.h)) {
         bgu.a($$1, $$2, this);
         if (!$$1.B) {
            biq $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == biu.bt) {
               cal.a((cbu)$$3, true);
            }
         }
      }
   }

   default bgy c_(cbu $$0) {
      $$0.a(this);
      return !$$0.dL().B ? bgy.b : bgy.a;
   }

   default void f(@Nullable cbu $$0) {
      MinecraftServer $$1 = this.dL().n();
      if (this.G() != null && $$1 != null) {
         ecy $$2 = $$1.aH().getLootTable(this.G());
         if ($$0 != null) {
            al.N.a((akr)$$0, this.G());
         }

         this.a(null);
         ecw.a $$3 = new ecw.a((akq)this.dL()).a(efb.f, this.dj());
         if ($$0 != null) {
            $$3.a($$0.gn()).a(efb.a, $$0);
         }

         $$2.a(this, $$3.a(efa.c), this.H());
      }
   }

   default void f() {
      this.f(null);
      this.I().clear();
   }

   default boolean g() {
      for (cjf $$0 : this.I()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cjf e_(int $$0) {
      this.f(null);
      cjf $$1 = this.I().get($$0);
      if ($$1.b()) {
         return cjf.b;
      } else {
         this.I().set($$0, cjf.b);
         return $$1;
      }
   }

   default cjf f_(int $$0) {
      this.f(null);
      return this.I().get($$0);
   }

   default cjf b(int $$0, int $$1) {
      this.f(null);
      return bgs.a(this.I(), $$0, $$1);
   }

   default void c(int $$0, cjf $$1) {
      this.f(null);
      this.I().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }
   }

   default bjy g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bjy() {
         @Override
         public cjf a() {
            return cdp.this.f_($$0);
         }

         @Override
         public boolean a(cjf $$0x) {
            cdp.this.c($$0, $$0);
            return true;
         }
      } : bjy.b;
   }

   default boolean g(cbu $$0) {
      return !this.dG() && this.dj().a((ho)$$0.dj(), 8.0);
   }
}

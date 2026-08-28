import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cqj extends brr, bsa {
   ezh dv();

   ezc cS();

   @Nullable
   alg<eub> E();

   void a(@Nullable alg<eub> var1);

   long F();

   void a(long var1);

   jy<cvx> G();

   void I();

   dev dX();

   boolean dS();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(uj $$0, jr.a $$1) {
      if (this.E() != null) {
         $$0.a("LootTable", this.E().a().toString());
         if (this.F() != 0L) {
            $$0.a("LootTableSeed", this.F());
         }
      } else {
         brs.a($$0, this.G(), $$1);
      }
   }

   default void b(uj $$0, jr.a $$1) {
      this.I();
      if ($$0.b("LootTable", 8)) {
         this.a(alg.a(ly.bd, alh.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         brs.b($$0, this.G(), $$1);
      }
   }

   default void a(bsp $$0, dev $$1, btz $$2) {
      if ($$1.ac().b(der.i)) {
         bru.a($$1, $$2, this);
         if (!$$1.C) {
            btz $$3 = $$0.c();
            if ($$3 != null && $$3.aq() == bug.by) {
               cmx.a((coh)$$3, true);
            }
         }
      }
   }

   default bry c_(coh $$0) {
      $$0.a(this);
      return bry.a;
   }

   default void f(@Nullable coh $$0) {
      MinecraftServer $$1 = this.dX().o();
      if (this.E() != null && $$1 != null) {
         eub $$2 = $$1.bd().b(this.E());
         if ($$0 != null) {
            an.Q.a((arn)$$0, this.E());
         }

         this.a(null);
         etz.a $$3 = new etz.a((arm)this.dX()).a(ews.f, this.dv());
         if ($$0 != null) {
            $$3.a($$0.gG()).a(ews.a, $$0);
         }

         $$2.a(this, $$3.a(ewr.c), this.F());
      }
   }

   default void f() {
      this.f(null);
      this.G().clear();
   }

   default boolean g() {
      for (cvx $$0 : this.G()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cvx e_(int $$0) {
      this.f(null);
      cvx $$1 = this.G().get($$0);
      if ($$1.f()) {
         return cvx.k;
      } else {
         this.G().set($$0, cvx.k);
         return $$1;
      }
   }

   default cvx f_(int $$0) {
      this.f(null);
      return this.G().get($$0);
   }

   default cvx b(int $$0, int $$1) {
      this.f(null);
      return brs.a(this.G(), $$0, $$1);
   }

   default void c(int $$0, cvx $$1) {
      this.f(null);
      this.G().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvn g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvn() {
         @Override
         public cvx a() {
            return cqj.this.f_($$0);
         }

         @Override
         public boolean a(cvx $$0x) {
            cqj.this.c($$0, $$0);
            return true;
         }
      } : bvn.a;
   }

   default boolean g(coh $$0) {
      return !this.dS() && $$0.a(this.cS(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cqo extends brw, bsf {
   ezn dv();

   ezi cS();

   @Nullable
   alh<euh> E();

   void a(@Nullable alh<euh> var1);

   long F();

   void a(long var1);

   jz<cwb> G();

   void I();

   dfb dX();

   boolean dS();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(uk $$0, js.a $$1) {
      if (this.E() != null) {
         $$0.a("LootTable", this.E().a().toString());
         if (this.F() != 0L) {
            $$0.a("LootTableSeed", this.F());
         }
      } else {
         brx.a($$0, this.G(), $$1);
      }
   }

   default void b(uk $$0, js.a $$1) {
      this.I();
      if ($$0.b("LootTable", 8)) {
         this.a(alh.a(lz.bd, ali.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         brx.b($$0, this.G(), $$1);
      }
   }

   default void a(bsu $$0, dfb $$1, bue $$2) {
      if ($$1.ac().b(dex.i)) {
         brz.a($$1, $$2, this);
         if (!$$1.C) {
            bue $$3 = $$0.c();
            if ($$3 != null && $$3.ar() == bul.by) {
               cnc.a((com)$$3, true);
            }
         }
      }
   }

   default bsd c_(com $$0) {
      $$0.a(this);
      return bsd.a;
   }

   default void f(@Nullable com $$0) {
      MinecraftServer $$1 = this.dX().o();
      if (this.E() != null && $$1 != null) {
         euh $$2 = $$1.bc().b(this.E());
         if ($$0 != null) {
            ao.Q.a((aro)$$0, this.E());
         }

         this.a(null);
         euf.a $$3 = new euf.a((arn)this.dX()).a(ewy.f, this.dv());
         if ($$0 != null) {
            $$3.a($$0.gG()).a(ewy.a, $$0);
         }

         $$2.a(this, $$3.a(ewx.c), this.F());
      }
   }

   default void f() {
      this.f(null);
      this.G().clear();
   }

   default boolean g() {
      for (cwb $$0 : this.G()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwb e_(int $$0) {
      this.f(null);
      cwb $$1 = this.G().get($$0);
      if ($$1.f()) {
         return cwb.k;
      } else {
         this.G().set($$0, cwb.k);
         return $$1;
      }
   }

   default cwb f_(int $$0) {
      this.f(null);
      return this.G().get($$0);
   }

   default cwb b(int $$0, int $$1) {
      this.f(null);
      return brx.a(this.G(), $$0, $$1);
   }

   default void c(int $$0, cwb $$1) {
      this.f(null);
      this.G().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvs g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvs() {
         @Override
         public cwb a() {
            return cqo.this.f_($$0);
         }

         @Override
         public boolean a(cwb $$0x) {
            cqo.this.c($$0, $$0);
            return true;
         }
      } : bvs.a;
   }

   default boolean g(com $$0) {
      return !this.dS() && $$0.a(this.cS(), 4.0);
   }
}

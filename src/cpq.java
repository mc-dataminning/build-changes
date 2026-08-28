import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpq extends brd, brm {
   eye dq();

   exz cO();

   @Nullable
   ala<esy> E();

   void a(@Nullable ala<esy> var1);

   long F();

   void a(long var1);

   jw<cvl> G();

   void I();

   dds dS();

   boolean dN();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(uf $$0, jp.a $$1) {
      if (this.E() != null) {
         $$0.a("LootTable", this.E().a().toString());
         if (this.F() != 0L) {
            $$0.a("LootTableSeed", this.F());
         }
      } else {
         bre.a($$0, this.G(), $$1);
      }
   }

   default void b(uf $$0, jp.a $$1) {
      this.I();
      if ($$0.b("LootTable", 8)) {
         this.a(ala.a(lv.bc, alb.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bre.b($$0, this.G(), $$1);
      }
   }

   default void a(bsb $$0, dds $$1, btj $$2) {
      if ($$1.ac().b(ddo.i)) {
         brg.a($$1, $$2, this);
         if (!$$1.B) {
            btj $$3 = $$0.c();
            if ($$3 != null && $$3.ao() == btq.by) {
               cmg.a((cnp)$$3, true);
            }
         }
      }
   }

   default brk c_(cnp $$0) {
      $$0.a(this);
      return brk.a;
   }

   default void f(@Nullable cnp $$0) {
      MinecraftServer $$1 = this.dS().o();
      if (this.E() != null && $$1 != null) {
         esy $$2 = $$1.bd().b(this.E());
         if ($$0 != null) {
            an.Q.a((arh)$$0, this.E());
         }

         this.a(null);
         esw.a $$3 = new esw.a((arg)this.dS()).a(evp.f, this.dq());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(evp.a, $$0);
         }

         $$2.a(this, $$3.a(evo.c), this.F());
      }
   }

   default void f() {
      this.f(null);
      this.G().clear();
   }

   default boolean g() {
      for (cvl $$0 : this.G()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cvl e_(int $$0) {
      this.f(null);
      cvl $$1 = this.G().get($$0);
      if ($$1.f()) {
         return cvl.k;
      } else {
         this.G().set($$0, cvl.k);
         return $$1;
      }
   }

   default cvl f_(int $$0) {
      this.f(null);
      return this.G().get($$0);
   }

   default cvl b(int $$0, int $$1) {
      this.f(null);
      return bre.a(this.G(), $$0, $$1);
   }

   default void c(int $$0, cvl $$1) {
      this.f(null);
      this.G().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default buw g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new buw() {
         @Override
         public cvl a() {
            return cpq.this.f_($$0);
         }

         @Override
         public boolean a(cvl $$0x) {
            cpq.this.c($$0, $$0);
            return true;
         }
      } : buw.a;
   }

   default boolean g(cnp $$0) {
      return !this.dN() && $$0.a(this.cO(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cog extends bpw, bqh {
   evz dn();

   evu cK();

   @Nullable
   akj<eqt> B();

   void a(@Nullable akj<eqt> var1);

   long C();

   void a(long var1);

   js<cua> D();

   void E();

   dcd dP();

   boolean dK();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(tx $$0, jl.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bpx.a($$0, this.D(), $$1);
      }
   }

   default void b(tx $$0, jl.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akj.a(lr.bb, new akk($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bpx.b($$0, this.D(), $$1);
      }
   }

   default void a(bqw $$0, dcd $$1, bsd $$2) {
      if ($$1.ab().b(dbz.i)) {
         bpz.a($$1, $$2, this);
         if (!$$1.B) {
            bsd $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsj.by) {
               cky.a((cmh)$$3, true);
            }
         }
      }
   }

   default bqd c_(cmh $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqd.c : bqd.a;
   }

   default void f(@Nullable cmh $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eqt $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((aql)$$0, this.B());
         }

         this.a(null);
         eqr.a $$3 = new eqr.a((aqk)this.dP()).a(etk.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gu()).a(etk.a, $$0);
         }

         $$2.a(this, $$3.a(etj.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cua $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cua e_(int $$0) {
      this.f(null);
      cua $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cua.l;
      } else {
         this.D().set($$0, cua.l);
         return $$1;
      }
   }

   default cua f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cua b(int $$0, int $$1) {
      this.f(null);
      return bpx.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cua $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default btq g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new btq() {
         @Override
         public cua a() {
            return cog.this.f_($$0);
         }

         @Override
         public boolean a(cua $$0x) {
            cog.this.c($$0, $$0);
            return true;
         }
      } : btq.a;
   }

   default boolean g(cmh $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

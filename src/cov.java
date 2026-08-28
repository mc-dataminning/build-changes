import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cov extends bql, bqw {
   evp dn();

   evk cK();

   @Nullable
   ald<eql> B();

   void a(@Nullable ald<eql> var1);

   long C();

   void a(long var1);

   jr<cun> D();

   void E();

   dbw dP();

   boolean dK();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ur $$0, jk.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bqm.a($$0, this.D(), $$1);
      }
   }

   default void b(ur $$0, jk.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(lq.aU, new ale($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqm.b($$0, this.D(), $$1);
      }
   }

   default void a(brl $$0, dbw $$1, bss $$2) {
      if ($$1.ab().b(dbs.i)) {
         bqo.a($$1, $$2, this);
         if (!$$1.B) {
            bss $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsy.by) {
               clm.a((cmv)$$3, true);
            }
         }
      }
   }

   default bqs c_(cmv $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqs.c : bqs.a;
   }

   default void f(@Nullable cmv $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eql $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((arf)$$0, this.B());
         }

         this.a(null);
         eqj.a $$3 = new eqj.a((are)this.dP()).a(etc.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(etc.a, $$0);
         }

         $$2.a(this, $$3.a(etb.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cun $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cun e_(int $$0) {
      this.f(null);
      cun $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cun.l;
      } else {
         this.D().set($$0, cun.l);
         return $$1;
      }
   }

   default cun f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cun b(int $$0, int $$1) {
      this.f(null);
      return bqm.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cun $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default buf g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new buf() {
         @Override
         public cun a() {
            return cov.this.f_($$0);
         }

         @Override
         public boolean a(cun $$0x) {
            cov.this.c($$0, $$0);
            return true;
         }
      } : buf.a;
   }

   default boolean g(cmv $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface coz extends bqp, bra {
   evt dn();

   evo cK();

   @Nullable
   ale<eqp> B();

   void a(@Nullable ale<eqp> var1);

   long C();

   void a(long var1);

   jr<cur> D();

   void E();

   dca dP();

   boolean dK();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(us $$0, jk.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bqq.a($$0, this.D(), $$1);
      }
   }

   default void b(us $$0, jk.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(ale.a(lq.aU, new alf($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqq.b($$0, this.D(), $$1);
      }
   }

   default void a(brp $$0, dca $$1, bsw $$2) {
      if ($$1.ab().b(dbw.i)) {
         bqs.a($$1, $$2, this);
         if (!$$1.B) {
            bsw $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == btc.by) {
               clq.a((cmz)$$3, true);
            }
         }
      }
   }

   default bqw c_(cmz $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqw.c : bqw.a;
   }

   default void f(@Nullable cmz $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eqp $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((arg)$$0, this.B());
         }

         this.a(null);
         eqn.a $$3 = new eqn.a((arf)this.dP()).a(etg.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(etg.a, $$0);
         }

         $$2.a(this, $$3.a(etf.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cur $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cur e_(int $$0) {
      this.f(null);
      cur $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cur.l;
      } else {
         this.D().set($$0, cur.l);
         return $$1;
      }
   }

   default cur f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cur b(int $$0, int $$1) {
      this.f(null);
      return bqq.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cur $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default buj g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new buj() {
         @Override
         public cur a() {
            return coz.this.f_($$0);
         }

         @Override
         public boolean a(cur $$0x) {
            coz.this.c($$0, $$0);
            return true;
         }
      } : buj.a;
   }

   default boolean g(cmz $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

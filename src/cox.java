import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cox extends bqn, bqy {
   evr dn();

   evm cK();

   @Nullable
   ale<eqn> B();

   void a(@Nullable ale<eqn> var1);

   long C();

   void a(long var1);

   jr<cup> D();

   void E();

   dby dP();

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
         bqo.a($$0, this.D(), $$1);
      }
   }

   default void b(us $$0, jk.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(ale.a(lq.aU, new alf($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqo.b($$0, this.D(), $$1);
      }
   }

   default void a(brn $$0, dby $$1, bsu $$2) {
      if ($$1.ab().b(dbu.i)) {
         bqq.a($$1, $$2, this);
         if (!$$1.B) {
            bsu $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bta.by) {
               clo.a((cmx)$$3, true);
            }
         }
      }
   }

   default bqu c_(cmx $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqu.c : bqu.a;
   }

   default void f(@Nullable cmx $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eqn $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((arg)$$0, this.B());
         }

         this.a(null);
         eql.a $$3 = new eql.a((arf)this.dP()).a(ete.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(ete.a, $$0);
         }

         $$2.a(this, $$3.a(etd.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cup $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cup e_(int $$0) {
      this.f(null);
      cup $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cup.l;
      } else {
         this.D().set($$0, cup.l);
         return $$1;
      }
   }

   default cup f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cup b(int $$0, int $$1) {
      this.f(null);
      return bqo.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cup $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default buh g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new buh() {
         @Override
         public cup a() {
            return cox.this.f_($$0);
         }

         @Override
         public boolean a(cup $$0x) {
            cox.this.c($$0, $$0);
            return true;
         }
      } : buh.a;
   }

   default boolean g(cmx $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

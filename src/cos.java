import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cos extends bqi, bqt {
   evm dn();

   evh cK();

   @Nullable
   ala<eqi> B();

   void a(@Nullable ala<eqi> var1);

   long C();

   void a(long var1);

   jr<cuk> D();

   void E();

   dbt dP();

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
         bqj.a($$0, this.D(), $$1);
      }
   }

   default void b(ur $$0, jk.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(ala.a(lq.aU, new alb($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqj.b($$0, this.D(), $$1);
      }
   }

   default void a(bri $$0, dbt $$1, bsp $$2) {
      if ($$1.ab().b(dbp.i)) {
         bql.a($$1, $$2, this);
         if (!$$1.B) {
            bsp $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsv.by) {
               clj.a((cms)$$3, true);
            }
         }
      }
   }

   default bqp c_(cms $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqp.c : bqp.a;
   }

   default void f(@Nullable cms $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eqi $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((arc)$$0, this.B());
         }

         this.a(null);
         eqg.a $$3 = new eqg.a((arb)this.dP()).a(esz.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(esz.a, $$0);
         }

         $$2.a(this, $$3.a(esy.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cuk $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cuk e_(int $$0) {
      this.f(null);
      cuk $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cuk.l;
      } else {
         this.D().set($$0, cuk.l);
         return $$1;
      }
   }

   default cuk f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cuk b(int $$0, int $$1) {
      this.f(null);
      return bqj.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuk $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default buc g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new buc() {
         @Override
         public cuk a() {
            return cos.this.f_($$0);
         }

         @Override
         public boolean a(cuk $$0x) {
            cos.this.c($$0, $$0);
            return true;
         }
      } : buc.a;
   }

   default boolean g(cms $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

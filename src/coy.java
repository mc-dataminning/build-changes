import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface coy extends bqo, bqz {
   evs dn();

   evn cK();

   @Nullable
   ale<eqo> B();

   void a(@Nullable ale<eqo> var1);

   long C();

   void a(long var1);

   jr<cuq> D();

   void E();

   dbz dP();

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
         bqp.a($$0, this.D(), $$1);
      }
   }

   default void b(us $$0, jk.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(ale.a(lq.aU, new alf($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqp.b($$0, this.D(), $$1);
      }
   }

   default void a(bro $$0, dbz $$1, bsv $$2) {
      if ($$1.ab().b(dbv.i)) {
         bqr.a($$1, $$2, this);
         if (!$$1.B) {
            bsv $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == btb.by) {
               clp.a((cmy)$$3, true);
            }
         }
      }
   }

   default bqv c_(cmy $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqv.c : bqv.a;
   }

   default void f(@Nullable cmy $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eqo $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((arg)$$0, this.B());
         }

         this.a(null);
         eqm.a $$3 = new eqm.a((arf)this.dP()).a(etf.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(etf.a, $$0);
         }

         $$2.a(this, $$3.a(ete.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cuq $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cuq e_(int $$0) {
      this.f(null);
      cuq $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cuq.l;
      } else {
         this.D().set($$0, cuq.l);
         return $$1;
      }
   }

   default cuq f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cuq b(int $$0, int $$1) {
      this.f(null);
      return bqp.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuq $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bui g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bui() {
         @Override
         public cuq a() {
            return coy.this.f_($$0);
         }

         @Override
         public boolean a(cuq $$0x) {
            coy.this.c($$0, $$0);
            return true;
         }
      } : bui.a;
   }

   default boolean g(cmy $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

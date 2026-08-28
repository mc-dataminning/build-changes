import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cow extends bqm, bqx {
   evq dn();

   evl cK();

   @Nullable
   ald<eqm> B();

   void a(@Nullable ald<eqm> var1);

   long C();

   void a(long var1);

   jr<cuo> D();

   void E();

   dbx dP();

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
         bqn.a($$0, this.D(), $$1);
      }
   }

   default void b(ur $$0, jk.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(lq.aU, new ale($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqn.b($$0, this.D(), $$1);
      }
   }

   default void a(brm $$0, dbx $$1, bst $$2) {
      if ($$1.ab().b(dbt.i)) {
         bqp.a($$1, $$2, this);
         if (!$$1.B) {
            bst $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsz.by) {
               cln.a((cmw)$$3, true);
            }
         }
      }
   }

   default bqt c_(cmw $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bqt.c : bqt.a;
   }

   default void f(@Nullable cmw $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         eqm $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((arf)$$0, this.B());
         }

         this.a(null);
         eqk.a $$3 = new eqk.a((are)this.dP()).a(etd.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(etd.a, $$0);
         }

         $$2.a(this, $$3.a(etc.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cuo $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cuo e_(int $$0) {
      this.f(null);
      cuo $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cuo.l;
      } else {
         this.D().set($$0, cuo.l);
         return $$1;
      }
   }

   default cuo f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cuo b(int $$0, int $$1) {
      this.f(null);
      return bqn.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuo $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bug g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bug() {
         @Override
         public cuo a() {
            return cow.this.f_($$0);
         }

         @Override
         public boolean a(cuo $$0x) {
            cow.this.c($$0, $$0);
            return true;
         }
      } : bug.a;
   }

   default boolean g(cmw $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

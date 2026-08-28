import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cok extends bqa, bql {
   ewh dp();

   ewc cM();

   @Nullable
   akj<erb> B();

   void a(@Nullable akj<erb> var1);

   long C();

   void a(long var1);

   js<cud> D();

   void E();

   dcg dR();

   boolean dM();

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
         bqb.a($$0, this.D(), $$1);
      }
   }

   default void b(tx $$0, jl.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akj.a(lr.bb, new akk($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqb.b($$0, this.D(), $$1);
      }
   }

   default void a(bra $$0, dcg $$1, bsh $$2) {
      if ($$1.ab().b(dcc.i)) {
         bqd.a($$1, $$2, this);
         if (!$$1.B) {
            bsh $$3 = $$0.c();
            if ($$3 != null && $$3.am() == bsn.by) {
               clc.a((cml)$$3, true);
            }
         }
      }
   }

   default bqh c_(cml $$0) {
      $$0.a(this);
      return !$$0.dR().B ? bqh.c : bqh.a;
   }

   default void f(@Nullable cml $$0) {
      MinecraftServer $$1 = this.dR().o();
      if (this.B() != null && $$1 != null) {
         erb $$2 = $$1.bf().b(this.B());
         if ($$0 != null) {
            am.Q.a((aqn)$$0, this.B());
         }

         this.a(null);
         eqz.a $$3 = new eqz.a((aqm)this.dR()).a(ets.f, this.dp());
         if ($$0 != null) {
            $$3.a($$0.gw()).a(ets.a, $$0);
         }

         $$2.a(this, $$3.a(etr.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cud $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cud e_(int $$0) {
      this.f(null);
      cud $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cud.l;
      } else {
         this.D().set($$0, cud.l);
         return $$1;
      }
   }

   default cud f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cud b(int $$0, int $$1) {
      this.f(null);
      return bqb.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cud $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default btu g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new btu() {
         @Override
         public cud a() {
            return cok.this.f_($$0);
         }

         @Override
         public boolean a(cud $$0x) {
            cok.this.c($$0, $$0);
            return true;
         }
      } : btu.a;
   }

   default boolean g(cml $$0) {
      return !this.dM() && $$0.a(this.cM(), 4.0);
   }
}

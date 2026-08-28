import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cov extends bqj, bqu {
   eww do();

   ewr cL();

   @Nullable
   akp<erq> B();

   void a(@Nullable akp<erq> var1);

   long C();

   void a(long var1);

   jv<cuo> D();

   void E();

   dcu dQ();

   boolean dL();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ua $$0, jo.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bqk.a($$0, this.D(), $$1);
      }
   }

   default void b(ua $$0, jo.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akp.a(lu.bc, akq.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqk.b($$0, this.D(), $$1);
      }
   }

   default void a(brj $$0, dcu $$1, bsq $$2) {
      if ($$1.ab().b(dcq.i)) {
         bqm.a($$1, $$2, this);
         if (!$$1.B) {
            bsq $$3 = $$0.c();
            if ($$3 != null && $$3.am() == bsw.by) {
               clm.a((cmv)$$3, true);
            }
         }
      }
   }

   default bqq c_(cmv $$0) {
      $$0.a(this);
      return !$$0.dQ().B ? bqq.c : bqq.a;
   }

   default void f(@Nullable cmv $$0) {
      MinecraftServer $$1 = this.dQ().o();
      if (this.B() != null && $$1 != null) {
         erq $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            an.Q.a((aqu)$$0, this.B());
         }

         this.a(null);
         ero.a $$3 = new ero.a((aqt)this.dQ()).a(euh.f, this.do());
         if ($$0 != null) {
            $$3.a($$0.gv()).a(euh.a, $$0);
         }

         $$2.a(this, $$3.a(eug.c), this.C());
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
      return bqk.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuo $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bue g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bue() {
         @Override
         public cuo a() {
            return cov.this.f_($$0);
         }

         @Override
         public boolean a(cuo $$0x) {
            cov.this.c($$0, $$0);
            return true;
         }
      } : bue.a;
   }

   default boolean g(cmv $$0) {
      return !this.dL() && $$0.a(this.cL(), 4.0);
   }
}

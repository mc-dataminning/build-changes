import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface coj extends bpz, bqk {
   ewf do();

   ewa cL();

   @Nullable
   akj<eqz> B();

   void a(@Nullable akj<eqz> var1);

   long C();

   void a(long var1);

   js<cuc> D();

   void E();

   dcf dQ();

   boolean dL();

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
         bqa.a($$0, this.D(), $$1);
      }
   }

   default void b(tx $$0, jl.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akj.a(lr.bb, new akk($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bqa.b($$0, this.D(), $$1);
      }
   }

   default void a(bqz $$0, dcf $$1, bsg $$2) {
      if ($$1.ab().b(dcb.i)) {
         bqc.a($$1, $$2, this);
         if (!$$1.B) {
            bsg $$3 = $$0.c();
            if ($$3 != null && $$3.al() == bsm.by) {
               clb.a((cmk)$$3, true);
            }
         }
      }
   }

   default bqg c_(cmk $$0) {
      $$0.a(this);
      return !$$0.dQ().B ? bqg.c : bqg.a;
   }

   default void f(@Nullable cmk $$0) {
      MinecraftServer $$1 = this.dQ().o();
      if (this.B() != null && $$1 != null) {
         eqz $$2 = $$1.bf().b(this.B());
         if ($$0 != null) {
            am.Q.a((aqn)$$0, this.B());
         }

         this.a(null);
         eqx.a $$3 = new eqx.a((aqm)this.dQ()).a(etq.f, this.do());
         if ($$0 != null) {
            $$3.a($$0.gv()).a(etq.a, $$0);
         }

         $$2.a(this, $$3.a(etp.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cuc $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cuc e_(int $$0) {
      this.f(null);
      cuc $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cuc.l;
      } else {
         this.D().set($$0, cuc.l);
         return $$1;
      }
   }

   default cuc f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cuc b(int $$0, int $$1) {
      this.f(null);
      return bqa.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuc $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default btt g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new btt() {
         @Override
         public cuc a() {
            return coj.this.f_($$0);
         }

         @Override
         public boolean a(cuc $$0x) {
            coj.this.c($$0, $$0);
            return true;
         }
      } : btt.a;
   }

   default boolean g(cmk $$0) {
      return !this.dL() && $$0.a(this.cL(), 4.0);
   }
}

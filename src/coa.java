import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface coa extends bpt, bqe {
   ewu ds();

   ewp cP();

   @Nullable
   aks<eru> B();

   void a(@Nullable aks<eru> var1);

   long C();

   void a(long var1);

   jj<cuh> D();

   void E();

   dca dU();

   boolean dP();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(uk $$0, jc.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bpu.a($$0, this.D(), $$1);
      }
   }

   default void b(uk $$0, jc.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(aks.a(li.aU, new akt($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bpu.b($$0, this.D(), $$1);
      }
   }

   default void a(bqt $$0, dca $$1, brv $$2) {
      if ($$1.ab().b(dbw.i)) {
         bpw.a($$1, $$2, this);
         if (!$$1.C) {
            brv $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsb.bE) {
               ckp.a((cly)$$3, true);
            }
         }
      }
   }

   default bqa c_(cly $$0) {
      $$0.a(this);
      return !$$0.dU().C ? bqa.b : bqa.a;
   }

   default void f(@Nullable cly $$0) {
      MinecraftServer $$1 = this.dU().o();
      if (this.B() != null && $$1 != null) {
         eru $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            an.Q.a((aqu)$$0, this.B());
         }

         this.a(null);
         ers.a $$3 = new ers.a((aqt)this.dU()).a(eug.f, this.ds());
         if ($$0 != null) {
            $$3.a($$0.gJ()).a(eug.a, $$0);
         }

         $$2.a(this, $$3.a(euf.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cuh $$0 : this.D()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   default cuh e_(int $$0) {
      this.f(null);
      cuh $$1 = this.D().get($$0);
      if ($$1.d()) {
         return cuh.i;
      } else {
         this.D().set($$0, cuh.i);
         return $$1;
      }
   }

   default cuh f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cuh b(int $$0, int $$1) {
      this.f(null);
      return bpu.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuh $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.a($$1));
   }

   default btf g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new btf() {
         @Override
         public cuh a() {
            return coa.this.f_($$0);
         }

         @Override
         public boolean a(cuh $$0x) {
            coa.this.c($$0, $$0);
            return true;
         }
      } : btf.b;
   }

   default boolean g(cly $$0) {
      return !this.dP() && $$0.a(this.cP(), 4.0);
   }
}

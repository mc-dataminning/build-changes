import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface clz extends bny, boj {
   esj dk();

   ese cH();

   @Nullable
   ajv B();

   void a(@Nullable ajv var1);

   long C();

   void a(long var1);

   iw<crs> D();

   void E();

   czg dM();

   boolean dH();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(to $$0, ip.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bnz.a($$0, this.D(), $$1);
      }
   }

   default void b(to $$0, ip.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new ajv($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bnz.b($$0, this.D(), $$1);
      }
   }

   default void a(boy $$0, czg $$1, bqa $$2) {
      if ($$1.aa().b(czc.i)) {
         bob.a($$1, $$2, this);
         if (!$$1.B) {
            bqa $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bqg.bx) {
               cir.a((cka)$$3, true);
            }
         }
      }
   }

   default bof c_(cka $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bof.b : bof.a;
   }

   default void f(@Nullable cka $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.B() != null && $$1 != null) {
         ens $$2 = $$1.aM().getLootTable(this.B());
         if ($$0 != null) {
            am.Q.a((apv)$$0, this.B());
         }

         this.a(null);
         enq.a $$3 = new enq.a((apu)this.dM()).a(epx.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.gv()).a(epx.a, $$0);
         }

         $$2.a(this, $$3.a(epw.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (crs $$0 : this.D()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   default crs e_(int $$0) {
      this.f(null);
      crs $$1 = this.D().get($$0);
      if ($$1.d()) {
         return crs.i;
      } else {
         this.D().set($$0, crs.i);
         return $$1;
      }
   }

   default crs f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default crs b(int $$0, int $$1) {
      this.f(null);
      return bnz.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, crs $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }
   }

   default brk g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new brk() {
         @Override
         public crs a() {
            return clz.this.f_($$0);
         }

         @Override
         public boolean a(crs $$0x) {
            clz.this.c($$0, $$0);
            return true;
         }
      } : brk.b;
   }

   default boolean g(cka $$0) {
      return !this.dH() && $$0.a(this.cH(), 4.0);
   }
}

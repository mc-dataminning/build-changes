import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cji extends blp, bma {
   enz dk();

   enu cH();

   @Nullable
   aiy C();

   void a(@Nullable aiy var1);

   long D();

   void a(long var1);

   is<cpd> E();

   void G();

   cvr dM();

   boolean dH();

   @Override
   default boolean aj_() {
      return this.g();
   }

   default void c(sw $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         blq.a($$0, this.E());
      }
   }

   default void b_(sw $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new aiy($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         blq.b($$0, this.E());
      }
   }

   default void a(bmp $$0, cvr $$1, bnq $$2) {
      if ($$1.Z().b(cvn.i)) {
         bls.a($$1, $$2, this);
         if (!$$1.B) {
            bnq $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bnw.bw) {
               cgc.a((chl)$$3, true);
            }
         }
      }
   }

   default blw c_(chl $$0) {
      $$0.a(this);
      return !$$0.dM().B ? blw.b : blw.a;
   }

   default void f(@Nullable chl $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.C() != null && $$1 != null) {
         ejk $$2 = $$1.aL().getLootTable(this.C());
         if ($$0 != null) {
            am.Q.a((aox)$$0, this.C());
         }

         this.a(null);
         eji.a $$3 = new eji.a((aow)this.dM()).a(eln.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.gp()).a(eln.a, $$0);
         }

         $$2.a(this, $$3.a(elm.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cpd $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cpd e_(int $$0) {
      this.f(null);
      cpd $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cpd.h;
      } else {
         this.E().set($$0, cpd.h);
         return $$1;
      }
   }

   default cpd f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cpd b(int $$0, int $$1) {
      this.f(null);
      return blq.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cpd $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   default boz g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new boz() {
         @Override
         public cpd a() {
            return cji.this.f_($$0);
         }

         @Override
         public boolean a(cpd $$0x) {
            cji.this.c($$0, $$0);
            return true;
         }
      } : boz.b;
   }

   default boolean g(chl $$0) {
      return !this.dH() && $$0.a(this.cH(), 4.0);
   }
}

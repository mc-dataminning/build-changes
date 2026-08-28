import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cra extends bsc, bsl {
   faz dt();

   fau cR();

   @Nullable
   aku<evv> v();

   void a(@Nullable aku<evv> var1);

   long x();

   void a(long var1);

   ka<cwo> E();

   void F();

   dgh dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(tq $$0, jt.a $$1) {
      if (this.v() != null) {
         $$0.a("LootTable", this.v().a().toString());
         if (this.x() != 0L) {
            $$0.a("LootTableSeed", this.x());
         }
      } else {
         bsd.a($$0, this.E(), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      this.F();
      if ($$0.b("LootTable", 8)) {
         this.a(aku.a(mc.bg, akv.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsd.b($$0, this.E(), $$1);
      }
   }

   default void a(bta $$0, ard $$1, buk $$2) {
      if ($$1.O().b(dgd.i)) {
         bsf.a($$1, $$2, this);
         buk $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bur.bR) {
            cnl.a($$1, (cow)$$3, true);
         }
      }
   }

   default bsj b_(cow $$0) {
      $$0.a(this);
      return bsj.a;
   }

   default void f(@Nullable cow $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.v() != null && $$1 != null) {
         evv $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ap.Q.a((are)$$0, this.v());
         }

         this.a(null);
         evt.a $$3 = new evt.a((ard)this.dV()).a(eyk.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(eyk.a, $$0);
         }

         $$2.a(this, $$3.a(eyj.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cwo $$0 : this.E()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwo f_(int $$0) {
      this.f(null);
      cwo $$1 = this.E().get($$0);
      if ($$1.f()) {
         return cwo.j;
      } else {
         this.E().set($$0, cwo.j);
         return $$1;
      }
   }

   default cwo g_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cwo b(int $$0, int $$1) {
      this.f(null);
      return bsd.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cwo $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvy h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvy() {
         @Override
         public cwo a() {
            return cra.this.g_($$0);
         }

         @Override
         public boolean a(cwo $$0x) {
            cra.this.c($$0, $$0);
            return true;
         }
      } : bvy.a;
   }

   default boolean g(cow $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cgn extends bje, bjo {
   elb dk();

   @Nullable
   agt C();

   void a(@Nullable agt var1);

   long D();

   void a(long var1);

   io<cmh> E();

   void G();

   csy dM();

   boolean dH();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(sj $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         bjf.a($$0, this.E());
      }
   }

   default void b_(sj $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new agt($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bjf.b($$0, this.E());
      }
   }

   default void a(bkd $$0, csy $$1, blf $$2) {
      if ($$1.Y().b(csu.i)) {
         bjh.a($$1, $$2, this);
         if (!$$1.B) {
            blf $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == blj.bv) {
               cdi.a((cer)$$3, true);
            }
         }
      }
   }

   default bjl c_(cer $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bjl.b : bjl.a;
   }

   default void f(@Nullable cer $$0) {
      MinecraftServer $$1 = this.dM().n();
      if (this.C() != null && $$1 != null) {
         egm $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            am.O.a((amq)$$0, this.C());
         }

         this.a(null);
         egk.a $$3 = new egk.a((amp)this.dM()).a(eip.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.go()).a(eip.a, $$0);
         }

         $$2.a(this, $$3.a(eio.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cmh $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cmh e_(int $$0) {
      this.f(null);
      cmh $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cmh.f;
      } else {
         this.E().set($$0, cmh.f);
         return $$1;
      }
   }

   default cmh f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cmh b(int $$0, int $$1) {
      this.f(null);
      return bjf.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cmh $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   default bmn g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bmn() {
         @Override
         public cmh a() {
            return cgn.this.f_($$0);
         }

         @Override
         public boolean a(cmh $$0x) {
            cgn.this.c($$0, $$0);
            return true;
         }
      } : bmn.b;
   }

   default boolean g(cer $$0) {
      return !this.dH() && this.dk().a((ip)$$0.dk(), 8.0);
   }
}

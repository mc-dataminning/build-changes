import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crc extends bse, bsn {
   fbb dt();

   faw cR();

   @Nullable
   aku<evx> v();

   void a(@Nullable aku<evx> var1);

   long x();

   void a(long var1);

   ka<cwq> E();

   void F();

   dgj dV();

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
         bsf.a($$0, this.E(), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      this.F();
      if ($$0.b("LootTable", 8)) {
         this.a(aku.a(mc.bg, akv.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsf.b($$0, this.E(), $$1);
      }
   }

   default void a(btc $$0, ard $$1, bum $$2) {
      if ($$1.O().b(dgf.i)) {
         bsh.a($$1, $$2, this);
         bum $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == but.bR) {
            cnn.a($$1, (coy)$$3, true);
         }
      }
   }

   default bsl b_(coy $$0) {
      $$0.a(this);
      return bsl.a;
   }

   default void f(@Nullable coy $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.v() != null && $$1 != null) {
         evx $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ap.Q.a((are)$$0, this.v());
         }

         this.a(null);
         evv.a $$3 = new evv.a((ard)this.dV()).a(eym.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(eym.a, $$0);
         }

         $$2.a(this, $$3.a(eyl.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cwq $$0 : this.E()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwq f_(int $$0) {
      this.f(null);
      cwq $$1 = this.E().get($$0);
      if ($$1.f()) {
         return cwq.j;
      } else {
         this.E().set($$0, cwq.j);
         return $$1;
      }
   }

   default cwq g_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cwq b(int $$0, int $$1) {
      this.f(null);
      return bsf.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cwq $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bwa h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bwa() {
         @Override
         public cwq a() {
            return crc.this.g_($$0);
         }

         @Override
         public boolean a(cwq $$0x) {
            crc.this.c($$0, $$0);
            return true;
         }
      } : bwa.a;
   }

   default boolean g(coy $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

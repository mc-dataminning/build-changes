import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface chd extends bjt, bkd {
   els dk();

   @Nullable
   ahg C();

   void a(@Nullable ahg var1);

   long D();

   void a(long var1);

   iq<cmx> E();

   void G();

   cto dM();

   boolean dH();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(sn $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         bju.a($$0, this.E());
      }
   }

   default void b_(sn $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new ahg($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bju.b($$0, this.E());
      }
   }

   default void a(bks $$0, cto $$1, blu $$2) {
      if ($$1.Z().b(ctk.i)) {
         bjw.a($$1, $$2, this);
         if (!$$1.B) {
            blu $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bly.bv) {
               cdy.a((cfh)$$3, true);
            }
         }
      }
   }

   default bka c_(cfh $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bka.b : bka.a;
   }

   default void f(@Nullable cfh $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.C() != null && $$1 != null) {
         ehd $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            am.O.a((ane)$$0, this.C());
         }

         this.a(null);
         ehb.a $$3 = new ehb.a((and)this.dM()).a(ejg.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.go()).a(ejg.a, $$0);
         }

         $$2.a(this, $$3.a(ejf.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cmx $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cmx e_(int $$0) {
      this.f(null);
      cmx $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cmx.f;
      } else {
         this.E().set($$0, cmx.f);
         return $$1;
      }
   }

   default cmx f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cmx b(int $$0, int $$1) {
      this.f(null);
      return bju.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cmx $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   default bnc g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bnc() {
         @Override
         public cmx a() {
            return chd.this.f_($$0);
         }

         @Override
         public boolean a(cmx $$0x) {
            chd.this.c($$0, $$0);
            return true;
         }
      } : bnc.b;
   }

   default boolean g(cfh $$0) {
      return !this.dH() && this.dk().a((ir)$$0.dk(), 8.0);
   }
}

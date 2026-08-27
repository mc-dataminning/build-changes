import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface che extends bju, bke {
   elt dk();

   @Nullable
   ahg C();

   void a(@Nullable ahg var1);

   long D();

   void a(long var1);

   iq<cmy> E();

   void G();

   ctp dM();

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
         bjv.a($$0, this.E());
      }
   }

   default void b_(sn $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new ahg($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bjv.b($$0, this.E());
      }
   }

   default void a(bkt $$0, ctp $$1, blv $$2) {
      if ($$1.Z().b(ctl.i)) {
         bjx.a($$1, $$2, this);
         if (!$$1.B) {
            blv $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == blz.bv) {
               cdz.a((cfi)$$3, true);
            }
         }
      }
   }

   default bkb c_(cfi $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bkb.b : bkb.a;
   }

   default void f(@Nullable cfi $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.C() != null && $$1 != null) {
         ehe $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            am.O.a((ane)$$0, this.C());
         }

         this.a(null);
         ehc.a $$3 = new ehc.a((and)this.dM()).a(ejh.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.go()).a(ejh.a, $$0);
         }

         $$2.a(this, $$3.a(ejg.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cmy $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cmy e_(int $$0) {
      this.f(null);
      cmy $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cmy.f;
      } else {
         this.E().set($$0, cmy.f);
         return $$1;
      }
   }

   default cmy f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cmy b(int $$0, int $$1) {
      this.f(null);
      return bjv.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cmy $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   default bnd g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bnd() {
         @Override
         public cmy a() {
            return che.this.f_($$0);
         }

         @Override
         public boolean a(cmy $$0x) {
            che.this.c($$0, $$0);
            return true;
         }
      } : bnd.b;
   }

   default boolean g(cfi $$0) {
      return !this.dH() && this.dk().a((ir)$$0.dk(), 8.0);
   }
}

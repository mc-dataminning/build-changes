import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cfp extends biq, bja {
   eju dl();

   @Nullable
   agi C();

   void a(@Nullable agi var1);

   long D();

   void a(long var1);

   il<clj> E();

   void G();

   csa dN();

   boolean dI();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(rz $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         bir.a($$0, this.E());
      }
   }

   default void b_(rz $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new agi($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bir.b($$0, this.E());
      }
   }

   default void a(bjo $$0, csa $$1, bkq $$2) {
      if ($$1.Y().b(crw.i)) {
         bit.a($$1, $$2, this);
         if (!$$1.B) {
            bkq $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bku.bt) {
               ccl.a((cdu)$$3, true);
            }
         }
      }
   }

   default bix c_(cdu $$0) {
      $$0.a(this);
      return !$$0.dN().B ? bix.b : bix.a;
   }

   default void f(@Nullable cdu $$0) {
      MinecraftServer $$1 = this.dN().n();
      if (this.C() != null && $$1 != null) {
         eff $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            al.N.a((amf)$$0, this.C());
         }

         this.a(null);
         efd.a $$3 = new efd.a((ame)this.dN()).a(ehi.f, this.dl());
         if ($$0 != null) {
            $$3.a($$0.gp()).a(ehi.a, $$0);
         }

         $$2.a(this, $$3.a(ehh.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (clj $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default clj e_(int $$0) {
      this.f(null);
      clj $$1 = this.E().get($$0);
      if ($$1.b()) {
         return clj.b;
      } else {
         this.E().set($$0, clj.b);
         return $$1;
      }
   }

   default clj f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default clj b(int $$0, int $$1) {
      this.f(null);
      return bir.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, clj $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }
   }

   default bly g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bly() {
         @Override
         public clj a() {
            return cfp.this.f_($$0);
         }

         @Override
         public boolean a(clj $$0x) {
            cfp.this.c($$0, $$0);
            return true;
         }
      } : bly.b;
   }

   default boolean g(cdu $$0) {
      return !this.dI() && this.dl().a((im)$$0.dl(), 8.0);
   }
}

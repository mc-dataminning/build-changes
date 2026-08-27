import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cje extends bln, bly {
   ens dk();

   enn cH();

   @Nullable
   aiy C();

   void a(@Nullable aiy var1);

   long D();

   void a(long var1);

   is<coz> E();

   void G();

   cvn dM();

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
         blo.a($$0, this.E());
      }
   }

   default void b_(sw $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new aiy($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         blo.b($$0, this.E());
      }
   }

   default void a(bmn $$0, cvn $$1, bno $$2) {
      if ($$1.Z().b(cvj.i)) {
         blq.a($$1, $$2, this);
         if (!$$1.B) {
            bno $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bnu.bw) {
               cfy.a((chh)$$3, true);
            }
         }
      }
   }

   default blu c_(chh $$0) {
      $$0.a(this);
      return !$$0.dM().B ? blu.b : blu.a;
   }

   default void f(@Nullable chh $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.C() != null && $$1 != null) {
         ejd $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            am.Q.a((aow)$$0, this.C());
         }

         this.a(null);
         ejb.a $$3 = new ejb.a((aov)this.dM()).a(elg.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.gp()).a(elg.a, $$0);
         }

         $$2.a(this, $$3.a(elf.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (coz $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default coz e_(int $$0) {
      this.f(null);
      coz $$1 = this.E().get($$0);
      if ($$1.b()) {
         return coz.h;
      } else {
         this.E().set($$0, coz.h);
         return $$1;
      }
   }

   default coz f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default coz b(int $$0, int $$1) {
      this.f(null);
      return blo.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, coz $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   default box g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new box() {
         @Override
         public coz a() {
            return cje.this.f_($$0);
         }

         @Override
         public boolean a(coz $$0x) {
            cje.this.c($$0, $$0);
            return true;
         }
      } : box.b;
   }

   default boolean g(chh $$0) {
      return !this.dH() && $$0.a(this.cH(), 4.0);
   }
}

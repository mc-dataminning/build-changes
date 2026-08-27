import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cdv extends bgx, bhh {
   ehh dj();

   @Nullable
   aez G();

   void a(@Nullable aez var1);

   long H();

   void a(long var1);

   hn<cjl> I();

   void K();

   cqb dL();

   boolean dG();

   @Override
   default boolean af_() {
      return this.g();
   }

   default void c(qw $$0) {
      if (this.G() != null) {
         $$0.a("LootTable", this.G().toString());
         if (this.H() != 0L) {
            $$0.a("LootTableSeed", this.H());
         }
      } else {
         bgy.a($$0, this.I());
      }
   }

   default void b_(qw $$0) {
      this.K();
      if ($$0.b("LootTable", 8)) {
         this.a(new aez($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bgy.b($$0, this.I());
      }
   }

   default void a(bhu $$0, cqb $$1, biw $$2) {
      if ($$1.X().b(cpx.h)) {
         bha.a($$1, $$2, this);
         if (!$$1.B) {
            biw $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bja.bt) {
               car.a((cca)$$3, true);
            }
         }
      }
   }

   default bhe c_(cca $$0) {
      $$0.a(this);
      return !$$0.dL().B ? bhe.b : bhe.a;
   }

   default void f(@Nullable cca $$0) {
      MinecraftServer $$1 = this.dL().n();
      if (this.G() != null && $$1 != null) {
         ecs $$2 = $$1.aH().getLootTable(this.G());
         if ($$0 != null) {
            al.N.a((aku)$$0, this.G());
         }

         this.a(null);
         ecq.a $$3 = new ecq.a((akt)this.dL()).a(eev.f, this.dj());
         if ($$0 != null) {
            $$3.a($$0.go()).a(eev.a, $$0);
         }

         $$2.a(this, $$3.a(eeu.c), this.H());
      }
   }

   default void f() {
      this.f(null);
      this.I().clear();
   }

   default boolean g() {
      for (cjl $$0 : this.I()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cjl e_(int $$0) {
      this.f(null);
      cjl $$1 = this.I().get($$0);
      if ($$1.b()) {
         return cjl.b;
      } else {
         this.I().set($$0, cjl.b);
         return $$1;
      }
   }

   default cjl f_(int $$0) {
      this.f(null);
      return this.I().get($$0);
   }

   default cjl b(int $$0, int $$1) {
      this.f(null);
      return bgy.a(this.I(), $$0, $$1);
   }

   default void c(int $$0, cjl $$1) {
      this.f(null);
      this.I().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }
   }

   default bke g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bke() {
         @Override
         public cjl a() {
            return cdv.this.f_($$0);
         }

         @Override
         public boolean a(cjl $$0x) {
            cdv.this.c($$0, $$0);
            return true;
         }
      } : bke.b;
   }

   default boolean g(cca $$0) {
      return !this.dG() && this.dj().a((ho)$$0.dj(), 8.0);
   }
}

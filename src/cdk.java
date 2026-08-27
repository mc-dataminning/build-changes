import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cdk extends bgm, bgw {
   ehi di();

   @Nullable
   aeu A();

   void a(@Nullable aeu var1);

   long B();

   void a(long var1);

   hp<cja> D();

   void E();

   cpq dK();

   boolean dF();

   @Override
   default boolean aa_() {
      return this.g();
   }

   default void c(qu $$0) {
      if (this.A() != null) {
         $$0.a("LootTable", this.A().toString());
         if (this.B() != 0L) {
            $$0.a("LootTableSeed", this.B());
         }
      } else {
         bgn.a($$0, this.D());
      }
   }

   default void b_(qu $$0) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new aeu($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bgn.b($$0, this.D());
      }
   }

   default void a(bhj $$0, cpq $$1, bil $$2) {
      if ($$1.X().b(cpm.h)) {
         bgp.a($$1, $$2, this);
         if (!$$1.B) {
            bil $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bip.bt) {
               cag.a((cbp)$$3, true);
            }
         }
      }
   }

   default bgt c_(cbp $$0) {
      $$0.a(this);
      return !$$0.dK().B ? bgt.b : bgt.a;
   }

   default void f(@Nullable cbp $$0) {
      MinecraftServer $$1 = this.dK().n();
      if (this.A() != null && $$1 != null) {
         ect $$2 = $$1.aH().getLootTable(this.A());
         if ($$0 != null) {
            al.N.a((ako)$$0, this.A());
         }

         this.a(null);
         ecr.a $$3 = new ecr.a((akn)this.dK()).a(eew.f, this.di());
         if ($$0 != null) {
            $$3.a($$0.gm()).a(eew.a, $$0);
         }

         $$2.a(this, $$3.a(eev.c), this.B());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cja $$0 : this.D()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cja e_(int $$0) {
      this.f(null);
      cja $$1 = this.D().get($$0);
      if ($$1.b()) {
         return cja.b;
      } else {
         this.D().set($$0, cja.b);
         return $$1;
      }
   }

   default cja f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cja b(int $$0, int $$1) {
      this.f(null);
      return bgn.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cja $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }
   }

   default bjt g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bjt() {
         @Override
         public cja a() {
            return cdk.this.f_($$0);
         }

         @Override
         public boolean a(cja $$0x) {
            cdk.this.c($$0, $$0);
            return true;
         }
      } : bjt.b;
   }

   default boolean g(cbp $$0) {
      return !this.dF() && this.di().a((hq)$$0.di(), 8.0);
   }
}

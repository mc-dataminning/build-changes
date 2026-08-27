import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cdh extends bgj, bgt {
   ehd di();

   @Nullable
   aer A();

   void a(@Nullable aer var1);

   long B();

   void a(long var1);

   hn<cix> D();

   void E();

   cpl dK();

   boolean dF();

   @Override
   default boolean aa_() {
      return this.g();
   }

   default void c(qr $$0) {
      if (this.A() != null) {
         $$0.a("LootTable", this.A().toString());
         if (this.B() != 0L) {
            $$0.a("LootTableSeed", this.B());
         }
      } else {
         bgk.a($$0, this.D());
      }
   }

   default void b_(qr $$0) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new aer($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bgk.b($$0, this.D());
      }
   }

   default void a(bhg $$0, cpl $$1, bii $$2) {
      if ($$1.X().b(cph.h)) {
         bgm.a($$1, $$2, this);
         if (!$$1.B) {
            bii $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bim.bt) {
               cad.a((cbm)$$3, true);
            }
         }
      }
   }

   default bgq c_(cbm $$0) {
      $$0.a(this);
      return !$$0.dK().B ? bgq.b : bgq.a;
   }

   default void f(@Nullable cbm $$0) {
      MinecraftServer $$1 = this.dK().n();
      if (this.A() != null && $$1 != null) {
         eco $$2 = $$1.aH().getLootTable(this.A());
         if ($$0 != null) {
            ai.N.a((akl)$$0, this.A());
         }

         this.a(null);
         ecm.a $$3 = new ecm.a((akk)this.dK()).a(eer.f, this.di());
         if ($$0 != null) {
            $$3.a($$0.gm()).a(eer.a, $$0);
         }

         $$2.a(this, $$3.a(eeq.c), this.B());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cix $$0 : this.D()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cix e_(int $$0) {
      this.f(null);
      cix $$1 = this.D().get($$0);
      if ($$1.b()) {
         return cix.b;
      } else {
         this.D().set($$0, cix.b);
         return $$1;
      }
   }

   default cix f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cix b(int $$0, int $$1) {
      this.f(null);
      return bgk.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cix $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }
   }

   default bjq g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bjq() {
         @Override
         public cix a() {
            return cdh.this.f_($$0);
         }

         @Override
         public boolean a(cix $$0x) {
            cdh.this.c($$0, $$0);
            return true;
         }
      } : bjq.b;
   }

   default boolean g(cbm $$0) {
      return !this.dF() && this.di().a((ho)$$0.di(), 8.0);
   }
}

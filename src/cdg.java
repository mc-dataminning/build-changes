import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cdg extends bgh, bgr {
   ehf di();

   @Nullable
   aep A();

   void a(@Nullable aep var1);

   long B();

   void a(long var1);

   ho<ciw> D();

   void E();

   cpk dK();

   boolean dF();

   @Override
   default boolean ab_() {
      return this.g();
   }

   default void c(qs $$0) {
      if (this.A() != null) {
         $$0.a("LootTable", this.A().toString());
         if (this.B() != 0L) {
            $$0.a("LootTableSeed", this.B());
         }
      } else {
         bgi.a($$0, this.D());
      }
   }

   default void b_(qs $$0) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new aep($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bgi.b($$0, this.D());
      }
   }

   default void a(bhe $$0, cpk $$1, big $$2) {
      if ($$1.X().b(cpg.h)) {
         bgk.a($$1, $$2, this);
         if (!$$1.B) {
            big $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bik.bt) {
               cac.a((cbl)$$3, true);
            }
         }
      }
   }

   default bgo c_(cbl $$0) {
      $$0.a(this);
      return !$$0.dK().B ? bgo.b : bgo.a;
   }

   default void f(@Nullable cbl $$0) {
      MinecraftServer $$1 = this.dK().n();
      if (this.A() != null && $$1 != null) {
         ecp $$2 = $$1.aH().getLootTable(this.A());
         if ($$0 != null) {
            ai.N.a((akj)$$0, this.A());
         }

         this.a(null);
         ecn.a $$3 = new ecn.a((aki)this.dK()).a(eet.f, this.di());
         if ($$0 != null) {
            $$3.a($$0.gm()).a(eet.a, $$0);
         }

         $$2.a(this, $$3.a(ees.b), this.B());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (ciw $$0 : this.D()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default ciw e_(int $$0) {
      this.f(null);
      ciw $$1 = this.D().get($$0);
      if ($$1.b()) {
         return ciw.b;
      } else {
         this.D().set($$0, ciw.b);
         return $$1;
      }
   }

   default ciw f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default ciw b(int $$0, int $$1) {
      this.f(null);
      return bgi.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, ciw $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }
   }

   default bjp g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bjp() {
         @Override
         public ciw a() {
            return cdg.this.f_($$0);
         }

         @Override
         public boolean a(ciw $$0x) {
            cdg.this.c($$0, $$0);
            return true;
         }
      } : bjp.b;
   }

   default boolean g(cbl $$0) {
      return !this.dF() && this.di().a((hp)$$0.di(), 8.0);
   }
}

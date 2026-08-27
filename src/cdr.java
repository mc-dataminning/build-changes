import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cdr extends bgt, bhd {
   ehp dj();

   @Nullable
   aey G();

   void a(@Nullable aey var1);

   long H();

   void a(long var1);

   hp<cjh> I();

   void K();

   cpx dL();

   boolean dG();

   @Override
   default boolean af_() {
      return this.g();
   }

   default void c(qy $$0) {
      if (this.G() != null) {
         $$0.a("LootTable", this.G().toString());
         if (this.H() != 0L) {
            $$0.a("LootTableSeed", this.H());
         }
      } else {
         bgu.a($$0, this.I());
      }
   }

   default void b_(qy $$0) {
      this.K();
      if ($$0.b("LootTable", 8)) {
         this.a(new aey($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bgu.b($$0, this.I());
      }
   }

   default void a(bhq $$0, cpx $$1, bis $$2) {
      if ($$1.X().b(cpt.h)) {
         bgw.a($$1, $$2, this);
         if (!$$1.B) {
            bis $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == biw.bt) {
               can.a((cbw)$$3, true);
            }
         }
      }
   }

   default bha c_(cbw $$0) {
      $$0.a(this);
      return !$$0.dL().B ? bha.b : bha.a;
   }

   default void f(@Nullable cbw $$0) {
      MinecraftServer $$1 = this.dL().n();
      if (this.G() != null && $$1 != null) {
         eda $$2 = $$1.aH().getLootTable(this.G());
         if ($$0 != null) {
            al.N.a((akt)$$0, this.G());
         }

         this.a(null);
         ecy.a $$3 = new ecy.a((aks)this.dL()).a(efd.f, this.dj());
         if ($$0 != null) {
            $$3.a($$0.gn()).a(efd.a, $$0);
         }

         $$2.a(this, $$3.a(efc.c), this.H());
      }
   }

   default void f() {
      this.f(null);
      this.I().clear();
   }

   default boolean g() {
      for (cjh $$0 : this.I()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cjh e_(int $$0) {
      this.f(null);
      cjh $$1 = this.I().get($$0);
      if ($$1.b()) {
         return cjh.b;
      } else {
         this.I().set($$0, cjh.b);
         return $$1;
      }
   }

   default cjh f_(int $$0) {
      this.f(null);
      return this.I().get($$0);
   }

   default cjh b(int $$0, int $$1) {
      this.f(null);
      return bgu.a(this.I(), $$0, $$1);
   }

   default void c(int $$0, cjh $$1) {
      this.f(null);
      this.I().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }
   }

   default bka g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bka() {
         @Override
         public cjh a() {
            return cdr.this.f_($$0);
         }

         @Override
         public boolean a(cjh $$0x) {
            cdr.this.c($$0, $$0);
            return true;
         }
      } : bka.b;
   }

   default boolean g(cbw $$0) {
      return !this.dG() && this.dj().a((hq)$$0.dj(), 8.0);
   }
}

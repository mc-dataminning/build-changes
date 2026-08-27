import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cfh extends bij, bit {
   eji dj();

   @Nullable
   agg B();

   void a(@Nullable agg var1);

   long C();

   void a(long var1);

   il<clb> E();

   void F();

   crs dL();

   boolean dG();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(rz $$0) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bik.a($$0, this.E());
      }
   }

   default void b_(rz $$0) {
      this.F();
      if ($$0.b("LootTable", 8)) {
         this.a(new agg($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bik.b($$0, this.E());
      }
   }

   default void a(bjg $$0, crs $$1, bki $$2) {
      if ($$1.X().b(cro.i)) {
         bim.a($$1, $$2, this);
         if (!$$1.B) {
            bki $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bkm.bt) {
               ccd.a((cdm)$$3, true);
            }
         }
      }
   }

   default biq c_(cdm $$0) {
      $$0.a(this);
      return !$$0.dL().B ? biq.b : biq.a;
   }

   default void f(@Nullable cdm $$0) {
      MinecraftServer $$1 = this.dL().n();
      if (this.B() != null && $$1 != null) {
         eet $$2 = $$1.aH().getLootTable(this.B());
         if ($$0 != null) {
            al.N.a((amb)$$0, this.B());
         }

         this.a(null);
         eer.a $$3 = new eer.a((ama)this.dL()).a(egw.f, this.dj());
         if ($$0 != null) {
            $$3.a($$0.go()).a(egw.a, $$0);
         }

         $$2.a(this, $$3.a(egv.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (clb $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default clb e_(int $$0) {
      this.f(null);
      clb $$1 = this.E().get($$0);
      if ($$1.b()) {
         return clb.b;
      } else {
         this.E().set($$0, clb.b);
         return $$1;
      }
   }

   default clb f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default clb b(int $$0, int $$1) {
      this.f(null);
      return bik.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, clb $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }
   }

   default blq g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new blq() {
         @Override
         public clb a() {
            return cfh.this.f_($$0);
         }

         @Override
         public boolean a(clb $$0x) {
            cfh.this.c($$0, $$0);
            return true;
         }
      } : blq.b;
   }

   default boolean g(cdm $$0) {
      return !this.dG() && this.dj().a((im)$$0.dj(), 8.0);
   }
}

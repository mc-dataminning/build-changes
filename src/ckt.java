import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ckt extends bmw, bnh {
   ept dk();

   epo cH();

   @Nullable
   ajh B();

   void a(@Nullable ajh var1);

   long C();

   void a(long var1);

   iu<cqm> D();

   void E();

   cxb dM();

   boolean dH();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(ta $$0) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bmx.a($$0, this.D());
      }
   }

   default void b_(ta $$0) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new ajh($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bmx.b($$0, this.D());
      }
   }

   default void a(bnw $$0, cxb $$1, box $$2) {
      if ($$1.Z().b(cwx.i)) {
         bmz.a($$1, $$2, this);
         if (!$$1.B) {
            box $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bpd.by) {
               chl.a((ciu)$$3, true);
            }
         }
      }
   }

   default bnd c_(ciu $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bnd.b : bnd.a;
   }

   default void f(@Nullable ciu $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.B() != null && $$1 != null) {
         ele $$2 = $$1.aM().getLootTable(this.B());
         if ($$0 != null) {
            am.Q.a((apg)$$0, this.B());
         }

         this.a(null);
         elc.a $$3 = new elc.a((apf)this.dM()).a(enh.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.gv()).a(enh.a, $$0);
         }

         $$2.a(this, $$3.a(eng.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cqm $$0 : this.D()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cqm e_(int $$0) {
      this.f(null);
      cqm $$1 = this.D().get($$0);
      if ($$1.b()) {
         return cqm.h;
      } else {
         this.D().set($$0, cqm.h);
         return $$1;
      }
   }

   default cqm f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cqm b(int $$0, int $$1) {
      this.f(null);
      return bmx.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cqm $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   default bqg g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bqg() {
         @Override
         public cqm a() {
            return ckt.this.f_($$0);
         }

         @Override
         public boolean a(cqm $$0x) {
            ckt.this.c($$0, $$0);
            return true;
         }
      } : bqg.b;
   }

   default boolean g(ciu $$0) {
      return !this.dH() && $$0.a(this.cH(), 4.0);
   }
}

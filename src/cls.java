import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cls extends bnt, boe {
   esa dk();

   erv cH();

   @Nullable
   ajt B();

   void a(@Nullable ajt var1);

   long C();

   void a(long var1);

   iu<crj> D();

   void E();

   cyx dM();

   boolean dH();

   @Override
   default boolean ah_() {
      return this.g();
   }

   default void a(tm $$0, in.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bnu.a($$0, this.D(), $$1);
      }
   }

   default void b(tm $$0, in.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new ajt($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bnu.b($$0, this.D(), $$1);
      }
   }

   default void a(bot $$0, cyx $$1, bpv $$2) {
      if ($$1.aa().b(cyt.i)) {
         bnw.a($$1, $$2, this);
         if (!$$1.B) {
            bpv $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bqb.bx) {
               cik.a((cjt)$$3, true);
            }
         }
      }
   }

   default boa c_(cjt $$0) {
      $$0.a(this);
      return !$$0.dM().B ? boa.b : boa.a;
   }

   default void f(@Nullable cjt $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.B() != null && $$1 != null) {
         enj $$2 = $$1.aM().getLootTable(this.B());
         if ($$0 != null) {
            am.Q.a((apt)$$0, this.B());
         }

         this.a(null);
         enh.a $$3 = new enh.a((aps)this.dM()).a(epo.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.gv()).a(epo.a, $$0);
         }

         $$2.a(this, $$3.a(epn.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (crj $$0 : this.D()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   default crj e_(int $$0) {
      this.f(null);
      crj $$1 = this.D().get($$0);
      if ($$1.d()) {
         return crj.i;
      } else {
         this.D().set($$0, crj.i);
         return $$1;
      }
   }

   default crj f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default crj b(int $$0, int $$1) {
      this.f(null);
      return bnu.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, crj $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.aj_()) {
         $$1.e(this.aj_());
      }
   }

   default brf g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new brf() {
         @Override
         public crj a() {
            return cls.this.f_($$0);
         }

         @Override
         public boolean a(crj $$0x) {
            cls.this.c($$0, $$0);
            return true;
         }
      } : brf.b;
   }

   default boolean g(cjt $$0) {
      return !this.dH() && $$0.a(this.cH(), 4.0);
   }
}

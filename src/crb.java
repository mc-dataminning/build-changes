import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crb extends bsc, bsl {
   fba du();

   fav cR();

   @Nullable
   akt<evw> v();

   void a(@Nullable akt<evw> var1);

   long x();

   void a(long var1);

   ka<cwp> B();

   void C();

   dgi dW();

   boolean dR();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(tq $$0, jt.a $$1) {
      if (this.v() != null) {
         $$0.a("LootTable", this.v().a().toString());
         if (this.x() != 0L) {
            $$0.a("LootTableSeed", this.x());
         }
      } else {
         bsd.a($$0, this.B(), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(akt.a(mc.bg, aku.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsd.b($$0, this.B(), $$1);
      }
   }

   default void a(bta $$0, arc $$1, buk $$2) {
      if ($$1.O().b(dge.i)) {
         bsf.a($$1, $$2, this);
         buk $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bur.bS) {
            cnm.a($$1, (cox)$$3, true);
         }
      }
   }

   default bsj b_(cox $$0) {
      $$0.a(this);
      return bsj.a;
   }

   default void f(@Nullable cox $$0) {
      MinecraftServer $$1 = this.dW().p();
      if (this.v() != null && $$1 != null) {
         evw $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ap.Q.a((ard)$$0, this.v());
         }

         this.a(null);
         evu.a $$3 = new evu.a((arc)this.dW()).a(eyl.f, this.du());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(eyl.a, $$0);
         }

         $$2.a(this, $$3.a(eyk.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cwp $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwp f_(int $$0) {
      this.f(null);
      cwp $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cwp.j;
      } else {
         this.B().set($$0, cwp.j);
         return $$1;
      }
   }

   default cwp g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cwp b(int $$0, int $$1) {
      this.f(null);
      return bsd.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cwp $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvy h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvy() {
         @Override
         public cwp a() {
            return crb.this.g_($$0);
         }

         @Override
         public boolean a(cwp $$0x) {
            crb.this.c($$0, $$0);
            return true;
         }
      } : bvy.a;
   }

   default boolean g(cox $$0) {
      return !this.dR() && $$0.a(this.cR(), 4.0);
   }
}

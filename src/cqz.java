import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cqz extends bsb, bsk {
   fay du();

   fat cR();

   @Nullable
   akt<evu> v();

   void a(@Nullable akt<evu> var1);

   long x();

   void a(long var1);

   ka<cwn> B();

   void C();

   dgg dW();

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
         bsc.a($$0, this.B(), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(akt.a(mc.bg, aku.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsc.b($$0, this.B(), $$1);
      }
   }

   default void a(bsz $$0, arc $$1, buj $$2) {
      if ($$1.O().b(dgc.i)) {
         bse.a($$1, $$2, this);
         buj $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == buq.bR) {
            cnk.a($$1, (cov)$$3, true);
         }
      }
   }

   default bsi b_(cov $$0) {
      $$0.a(this);
      return bsi.a;
   }

   default void f(@Nullable cov $$0) {
      MinecraftServer $$1 = this.dW().p();
      if (this.v() != null && $$1 != null) {
         evu $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ap.Q.a((ard)$$0, this.v());
         }

         this.a(null);
         evs.a $$3 = new evs.a((arc)this.dW()).a(eyj.f, this.du());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(eyj.a, $$0);
         }

         $$2.a(this, $$3.a(eyi.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cwn $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwn f_(int $$0) {
      this.f(null);
      cwn $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cwn.j;
      } else {
         this.B().set($$0, cwn.j);
         return $$1;
      }
   }

   default cwn g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cwn b(int $$0, int $$1) {
      this.f(null);
      return bsc.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cwn $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvx h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvx() {
         @Override
         public cwn a() {
            return cqz.this.g_($$0);
         }

         @Override
         public boolean a(cwn $$0x) {
            cqz.this.c($$0, $$0);
            return true;
         }
      } : bvx.a;
   }

   default boolean g(cov $$0) {
      return !this.dR() && $$0.a(this.cR(), 4.0);
   }
}

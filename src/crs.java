import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crs extends bst, btc {
   fbr du();

   fbm cR();

   @Nullable
   alo<ewn> v();

   void a(@Nullable alo<ewn> var1);

   long x();

   void a(long var1);

   jz<cxg> B();

   void C();

   dgz dW();

   boolean dR();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(um $$0, js.a $$1) {
      if (this.v() != null) {
         $$0.a("LootTable", this.v().a().toString());
         if (this.x() != 0L) {
            $$0.a("LootTableSeed", this.x());
         }
      } else {
         bsu.a($$0, this.B(), $$1);
      }
   }

   default void b(um $$0, js.a $$1) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(alo.a(mb.bg, alp.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsu.b($$0, this.B(), $$1);
      }
   }

   default void a(btr $$0, arx $$1, bvb $$2) {
      if ($$1.O().b(dgv.i)) {
         bsw.a($$1, $$2, this);
         bvb $$3 = $$0.c();
         if ($$3 != null && $$3.aq() == bvi.bS) {
            cod.a($$1, (cpo)$$3, true);
         }
      }
   }

   default bta b_(cpo $$0) {
      $$0.a(this);
      return bta.a;
   }

   default void f(@Nullable cpo $$0) {
      MinecraftServer $$1 = this.dW().p();
      if (this.v() != null && $$1 != null) {
         ewn $$2 = $$1.bc().b(this.v());
         if ($$0 != null) {
            ao.Q.a((ary)$$0, this.v());
         }

         this.a(null);
         ewl.a $$3 = new ewl.a((arx)this.dW()).a(ezc.f, this.du());
         if ($$0 != null) {
            $$3.a($$0.gF()).a(ezc.a, $$0);
         }

         $$2.a(this, $$3.a(ezb.c), this.x());
      }
   }

   default void f() {
      this.f(null);
      this.B().clear();
   }

   default boolean g() {
      for (cxg $$0 : this.B()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cxg f_(int $$0) {
      this.f(null);
      cxg $$1 = this.B().get($$0);
      if ($$1.f()) {
         return cxg.j;
      } else {
         this.B().set($$0, cxg.j);
         return $$1;
      }
   }

   default cxg g_(int $$0) {
      this.f(null);
      return this.B().get($$0);
   }

   default cxg b(int $$0, int $$1) {
      this.f(null);
      return bsu.a(this.B(), $$0, $$1);
   }

   default void c(int $$0, cxg $$1) {
      this.f(null);
      this.B().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bwp h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bwp() {
         @Override
         public cxg a() {
            return crs.this.g_($$0);
         }

         @Override
         public boolean a(cxg $$0x) {
            crs.this.c($$0, $$0);
            return true;
         }
      } : bwp.a;
   }

   default boolean g(cpo $$0) {
      return !this.dR() && $$0.a(this.cR(), 4.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpw extends bri, brr {
   eys dq();

   eyn cO();

   @Nullable
   alb<etm> F();

   void a(@Nullable alb<etm> var1);

   long G();

   void a(long var1);

   jw<cvp> I();

   void J();

   deg dS();

   boolean dN();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(uf $$0, jp.a $$1) {
      if (this.F() != null) {
         $$0.a("LootTable", this.F().a().toString());
         if (this.G() != 0L) {
            $$0.a("LootTableSeed", this.G());
         }
      } else {
         brj.a($$0, this.I(), $$1);
      }
   }

   default void b(uf $$0, jp.a $$1) {
      this.J();
      if ($$0.b("LootTable", 8)) {
         this.a(alb.a(lv.bd, alc.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         brj.b($$0, this.I(), $$1);
      }
   }

   default void a(bsg $$0, deg $$1, bto $$2) {
      if ($$1.ac().b(dec.i)) {
         brl.a($$1, $$2, this);
         if (!$$1.B) {
            bto $$3 = $$0.c();
            if ($$3 != null && $$3.ao() == btv.by) {
               cml.a((cnu)$$3, true);
            }
         }
      }
   }

   default brp c_(cnu $$0) {
      $$0.a(this);
      return brp.a;
   }

   default void f(@Nullable cnu $$0) {
      MinecraftServer $$1 = this.dS().o();
      if (this.F() != null && $$1 != null) {
         etm $$2 = $$1.bd().b(this.F());
         if ($$0 != null) {
            an.Q.a((ari)$$0, this.F());
         }

         this.a(null);
         etk.a $$3 = new etk.a((arh)this.dS()).a(ewd.f, this.dq());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(ewd.a, $$0);
         }

         $$2.a(this, $$3.a(ewc.c), this.G());
      }
   }

   default void f() {
      this.f(null);
      this.I().clear();
   }

   default boolean g() {
      for (cvp $$0 : this.I()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cvp e_(int $$0) {
      this.f(null);
      cvp $$1 = this.I().get($$0);
      if ($$1.f()) {
         return cvp.k;
      } else {
         this.I().set($$0, cvp.k);
         return $$1;
      }
   }

   default cvp f_(int $$0) {
      this.f(null);
      return this.I().get($$0);
   }

   default cvp b(int $$0, int $$1) {
      this.f(null);
      return brj.a(this.I(), $$0, $$1);
   }

   default void c(int $$0, cvp $$1) {
      this.f(null);
      this.I().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default bvb g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvb() {
         @Override
         public cvp a() {
            return cpw.this.f_($$0);
         }

         @Override
         public boolean a(cvp $$0x) {
            cpw.this.c($$0, $$0);
            return true;
         }
      } : bvb.a;
   }

   default boolean g(cnu $$0) {
      return !this.dN() && $$0.a(this.cO(), 4.0);
   }
}

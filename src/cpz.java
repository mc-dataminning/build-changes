import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpz extends brl, bru {
   eyw dq();

   eyr cO();

   @Nullable
   ald<etq> F();

   void a(@Nullable ald<etq> var1);

   long G();

   void a(long var1);

   jx<cvs> I();

   void J();

   dej dS();

   boolean dN();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ug $$0, jq.a $$1) {
      if (this.F() != null) {
         $$0.a("LootTable", this.F().a().toString());
         if (this.G() != 0L) {
            $$0.a("LootTableSeed", this.G());
         }
      } else {
         brm.a($$0, this.I(), $$1);
      }
   }

   default void b(ug $$0, jq.a $$1) {
      this.J();
      if ($$0.b("LootTable", 8)) {
         this.a(ald.a(lw.be, ale.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         brm.b($$0, this.I(), $$1);
      }
   }

   default void a(bsj $$0, dej $$1, btr $$2) {
      if ($$1.ac().b(def.i)) {
         bro.a($$1, $$2, this);
         if (!$$1.B) {
            btr $$3 = $$0.c();
            if ($$3 != null && $$3.ao() == bty.by) {
               cmo.a((cnx)$$3, true);
            }
         }
      }
   }

   default brs c_(cnx $$0) {
      $$0.a(this);
      return brs.a;
   }

   default void f(@Nullable cnx $$0) {
      MinecraftServer $$1 = this.dS().o();
      if (this.F() != null && $$1 != null) {
         etq $$2 = $$1.bd().b(this.F());
         if ($$0 != null) {
            an.Q.a((ark)$$0, this.F());
         }

         this.a(null);
         eto.a $$3 = new eto.a((arj)this.dS()).a(ewh.f, this.dq());
         if ($$0 != null) {
            $$3.a($$0.gz()).a(ewh.a, $$0);
         }

         $$2.a(this, $$3.a(ewg.c), this.G());
      }
   }

   default void f() {
      this.f(null);
      this.I().clear();
   }

   default boolean g() {
      for (cvs $$0 : this.I()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cvs e_(int $$0) {
      this.f(null);
      cvs $$1 = this.I().get($$0);
      if ($$1.f()) {
         return cvs.k;
      } else {
         this.I().set($$0, cvs.k);
         return $$1;
      }
   }

   default cvs f_(int $$0) {
      this.f(null);
      return this.I().get($$0);
   }

   default cvs b(int $$0, int $$1) {
      this.f(null);
      return brm.a(this.I(), $$0, $$1);
   }

   default void c(int $$0, cvs $$1) {
      this.f(null);
      this.I().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default bve g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bve() {
         @Override
         public cvs a() {
            return cpz.this.f_($$0);
         }

         @Override
         public boolean a(cvs $$0x) {
            cpz.this.c($$0, $$0);
            return true;
         }
      } : bve.a;
   }

   default boolean g(cnx $$0) {
      return !this.dN() && $$0.a(this.cO(), 4.0);
   }
}

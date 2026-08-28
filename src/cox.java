import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cox extends bqk, bqv {
   exc dm();

   ewx cK();

   @Nullable
   akq<erw> B();

   void a(@Nullable akq<erw> var1);

   long C();

   void a(long var1);

   jv<cuq> D();

   void E();

   dcw dO();

   boolean dJ();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ub $$0, jo.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bql.a($$0, this.D(), $$1);
      }
   }

   default void b(ub $$0, jo.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akq.a(lu.bc, akr.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bql.b($$0, this.D(), $$1);
      }
   }

   default void a(brk $$0, dcw $$1, bsr $$2) {
      if ($$1.ab().b(dcs.i)) {
         bqn.a($$1, $$2, this);
         if (!$$1.B) {
            bsr $$3 = $$0.c();
            if ($$3 != null && $$3.am() == bsx.by) {
               clo.a((cmx)$$3, true);
            }
         }
      }
   }

   default bqr c_(cmx $$0) {
      $$0.a(this);
      return !$$0.dO().B ? bqr.c : bqr.a;
   }

   default void f(@Nullable cmx $$0) {
      MinecraftServer $$1 = this.dO().o();
      if (this.B() != null && $$1 != null) {
         erw $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            an.Q.a((aqv)$$0, this.B());
         }

         this.a(null);
         eru.a $$3 = new eru.a((aqu)this.dO()).a(eun.f, this.dm());
         if ($$0 != null) {
            $$3.a($$0.gu()).a(eun.a, $$0);
         }

         $$2.a(this, $$3.a(eum.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cuq $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cuq e_(int $$0) {
      this.f(null);
      cuq $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cuq.l;
      } else {
         this.D().set($$0, cuq.l);
         return $$1;
      }
   }

   default cuq f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cuq b(int $$0, int $$1) {
      this.f(null);
      return bql.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cuq $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bug g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bug() {
         @Override
         public cuq a() {
            return cox.this.f_($$0);
         }

         @Override
         public boolean a(cuq $$0x) {
            cox.this.c($$0, $$0);
            return true;
         }
      } : bug.a;
   }

   default boolean g(cmx $$0) {
      return !this.dJ() && $$0.a(this.cK(), 4.0);
   }
}

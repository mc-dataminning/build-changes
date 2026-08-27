import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cnv extends bpn, bpy {
   euk dn();

   euf cK();

   @Nullable
   akl<epk> B();

   void a(@Nullable akl<epk> var1);

   long C();

   void a(long var1);

   jg<cto> D();

   void E();

   dax dP();

   boolean dK();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(ud $$0, iz.a $$1) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().a().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bpo.a($$0, this.D(), $$1);
      }
   }

   default void b(ud $$0, iz.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akl.a(lf.aU, new akm($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bpo.b($$0, this.D(), $$1);
      }
   }

   default void a(bqn $$0, dax $$1, bru $$2) {
      if ($$1.aa().b(dat.i)) {
         bpq.a($$1, $$2, this);
         if (!$$1.B) {
            bru $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsa.by) {
               ckn.a((clw)$$3, true);
            }
         }
      }
   }

   default bpu c_(clw $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bpu.b : bpu.a;
   }

   default void f(@Nullable clw $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         epk $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((aqn)$$0, this.B());
         }

         this.a(null);
         epi.a $$3 = new epi.a((aqm)this.dP()).a(erx.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(erx.a, $$0);
         }

         $$2.a(this, $$3.a(erw.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cto $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default cto e_(int $$0) {
      this.f(null);
      cto $$1 = this.D().get($$0);
      if ($$1.e()) {
         return cto.i;
      } else {
         this.D().set($$0, cto.i);
         return $$1;
      }
   }

   default cto f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cto b(int $$0, int $$1) {
      this.f(null);
      return bpo.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cto $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default btg g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new btg() {
         @Override
         public cto a() {
            return cnv.this.f_($$0);
         }

         @Override
         public boolean a(cto $$0x) {
            cnv.this.c($$0, $$0);
            return true;
         }
      } : btg.b;
   }

   default boolean g(clw $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

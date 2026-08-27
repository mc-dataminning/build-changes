import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cnx extends bpp, bqa {
   eum dn();

   euh cK();

   @Nullable
   akm<epm> B();

   void a(@Nullable akm<epm> var1);

   long C();

   void a(long var1);

   jg<ctq> D();

   void E();

   daz dP();

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
         bpq.a($$0, this.D(), $$1);
      }
   }

   default void b(ud $$0, iz.a $$1) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(akm.a(lf.aU, new akn($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bpq.b($$0, this.D(), $$1);
      }
   }

   default void a(bqp $$0, daz $$1, brw $$2) {
      if ($$1.aa().b(dav.i)) {
         bps.a($$1, $$2, this);
         if (!$$1.B) {
            brw $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsc.by) {
               ckp.a((cly)$$3, true);
            }
         }
      }
   }

   default bpw c_(cly $$0) {
      $$0.a(this);
      return !$$0.dP().B ? bpw.b : bpw.a;
   }

   default void f(@Nullable cly $$0) {
      MinecraftServer $$1 = this.dP().o();
      if (this.B() != null && $$1 != null) {
         epm $$2 = $$1.be().b(this.B());
         if ($$0 != null) {
            am.Q.a((aqo)$$0, this.B());
         }

         this.a(null);
         epk.a $$3 = new epk.a((aqn)this.dP()).a(erz.f, this.dn());
         if ($$0 != null) {
            $$3.a($$0.gy()).a(erz.a, $$0);
         }

         $$2.a(this, $$3.a(ery.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (ctq $$0 : this.D()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   default ctq e_(int $$0) {
      this.f(null);
      ctq $$1 = this.D().get($$0);
      if ($$1.e()) {
         return ctq.i;
      } else {
         this.D().set($$0, ctq.i);
         return $$1;
      }
   }

   default ctq f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default ctq b(int $$0, int $$1) {
      this.f(null);
      return bpq.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, ctq $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bti g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bti() {
         @Override
         public ctq a() {
            return cnx.this.f_($$0);
         }

         @Override
         public boolean a(ctq $$0x) {
            cnx.this.c($$0, $$0);
            return true;
         }
      } : bti.b;
   }

   default boolean g(cly $$0) {
      return !this.dK() && $$0.a(this.cK(), 4.0);
   }
}

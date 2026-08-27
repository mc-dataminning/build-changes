import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cfu extends biu, bje {
   ejz dl();

   @Nullable
   agm C();

   void a(@Nullable agm var1);

   long D();

   void a(long var1);

   ip<clo> E();

   void G();

   csf dN();

   boolean dI();

   @Override
   default boolean aj_() {
      return this.g();
   }

   default void c(sd $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         biv.a($$0, this.E());
      }
   }

   default void b_(sd $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new agm($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         biv.b($$0, this.E());
      }
   }

   default void a(bjt $$0, csf $$1, bkv $$2) {
      if ($$1.Y().b(csb.i)) {
         bix.a($$1, $$2, this);
         if (!$$1.B) {
            bkv $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bkz.bt) {
               ccq.a((cdz)$$3, true);
            }
         }
      }
   }

   default bjb c_(cdz $$0) {
      $$0.a(this);
      return !$$0.dN().B ? bjb.b : bjb.a;
   }

   default void f(@Nullable cdz $$0) {
      MinecraftServer $$1 = this.dN().n();
      if (this.C() != null && $$1 != null) {
         efk $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            al.N.a((amj)$$0, this.C());
         }

         this.a(null);
         efi.a $$3 = new efi.a((ami)this.dN()).a(ehn.f, this.dl());
         if ($$0 != null) {
            $$3.a($$0.gp()).a(ehn.a, $$0);
         }

         $$2.a(this, $$3.a(ehm.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (clo $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default clo e_(int $$0) {
      this.f(null);
      clo $$1 = this.E().get($$0);
      if ($$1.b()) {
         return clo.b;
      } else {
         this.E().set($$0, clo.b);
         return $$1;
      }
   }

   default clo f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default clo b(int $$0, int $$1) {
      this.f(null);
      return biv.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, clo $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   default bmd g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bmd() {
         @Override
         public clo a() {
            return cfu.this.f_($$0);
         }

         @Override
         public boolean a(clo $$0x) {
            cfu.this.c($$0, $$0);
            return true;
         }
      } : bmd.b;
   }

   default boolean g(cdz $$0) {
      return !this.dI() && this.dl().a((iq)$$0.dl(), 8.0);
   }
}

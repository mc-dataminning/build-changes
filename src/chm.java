import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface chm extends bjv, bkg {
   emc dj();

   @Nullable
   ahh C();

   void a(@Nullable ahh var1);

   long D();

   void a(long var1);

   iq<cng> E();

   void G();

   ctx dL();

   boolean dG();

   @Override
   default boolean aj_() {
      return this.g();
   }

   default void c(so $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         bjw.a($$0, this.E());
      }
   }

   default void b_(so $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new ahh($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bjw.b($$0, this.E());
      }
   }

   default void a(bkv $$0, ctx $$1, blw $$2) {
      if ($$1.Z().b(ctt.i)) {
         bjy.a($$1, $$2, this);
         if (!$$1.B) {
            blw $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bmc.bw) {
               ceh.a((cfq)$$3, true);
            }
         }
      }
   }

   default bkc c_(cfq $$0) {
      $$0.a(this);
      return !$$0.dL().B ? bkc.b : bkc.a;
   }

   default void f(@Nullable cfq $$0) {
      MinecraftServer $$1 = this.dL().o();
      if (this.C() != null && $$1 != null) {
         ehn $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            am.O.a((anf)$$0, this.C());
         }

         this.a(null);
         ehl.a $$3 = new ehl.a((ane)this.dL()).a(ejq.f, this.dj());
         if ($$0 != null) {
            $$3.a($$0.go()).a(ejq.a, $$0);
         }

         $$2.a(this, $$3.a(ejp.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cng $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cng e_(int $$0) {
      this.f(null);
      cng $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cng.f;
      } else {
         this.E().set($$0, cng.f);
         return $$1;
      }
   }

   default cng f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cng b(int $$0, int $$1) {
      this.f(null);
      return bjw.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cng $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   default bng g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bng() {
         @Override
         public cng a() {
            return chm.this.f_($$0);
         }

         @Override
         public boolean a(cng $$0x) {
            chm.this.c($$0, $$0);
            return true;
         }
      } : bng.b;
   }

   default boolean g(cfq $$0) {
      return !this.dG() && this.dj().a((ir)$$0.dj(), 8.0);
   }
}

import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ces extends bhu, bie {
   eif dj();

   @Nullable
   afw B();

   void a(@Nullable afw var1);

   long C();

   void a(long var1);

   il<ckj> E();

   void F();

   cqz dL();

   boolean dG();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(rt $$0) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bhv.a($$0, this.E());
      }
   }

   default void b_(rt $$0) {
      this.F();
      if ($$0.b("LootTable", 8)) {
         this.a(new afw($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bhv.b($$0, this.E());
      }
   }

   default void a(bir $$0, cqz $$1, bjt $$2) {
      if ($$1.X().b(cqv.h)) {
         bhx.a($$1, $$2, this);
         if (!$$1.B) {
            bjt $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bjx.bt) {
               cbo.a((ccx)$$3, true);
            }
         }
      }
   }

   default bib c_(ccx $$0) {
      $$0.a(this);
      return !$$0.dL().B ? bib.b : bib.a;
   }

   default void f(@Nullable ccx $$0) {
      MinecraftServer $$1 = this.dL().n();
      if (this.B() != null && $$1 != null) {
         edq $$2 = $$1.aH().getLootTable(this.B());
         if ($$0 != null) {
            al.N.a((alr)$$0, this.B());
         }

         this.a(null);
         edo.a $$3 = new edo.a((alq)this.dL()).a(eft.f, this.dj());
         if ($$0 != null) {
            $$3.a($$0.go()).a(eft.a, $$0);
         }

         $$2.a(this, $$3.a(efs.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (ckj $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default ckj e_(int $$0) {
      this.f(null);
      ckj $$1 = this.E().get($$0);
      if ($$1.b()) {
         return ckj.b;
      } else {
         this.E().set($$0, ckj.b);
         return $$1;
      }
   }

   default ckj f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default ckj b(int $$0, int $$1) {
      this.f(null);
      return bhv.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, ckj $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }
   }

   default blb g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new blb() {
         @Override
         public ckj a() {
            return ces.this.f_($$0);
         }

         @Override
         public boolean a(ckj $$0x) {
            ces.this.c($$0, $$0);
            return true;
         }
      } : blb.b;
   }

   default boolean g(ccx $$0) {
      return !this.dG() && this.dj().a((im)$$0.dj(), 8.0);
   }
}

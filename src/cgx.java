import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cgx extends bjo, bjy {
   elm dk();

   @Nullable
   ahd C();

   void a(@Nullable ahd var1);

   long D();

   void a(long var1);

   iq<cmr> E();

   void G();

   cti dM();

   boolean dH();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(sl $$0) {
      if (this.C() != null) {
         $$0.a("LootTable", this.C().toString());
         if (this.D() != 0L) {
            $$0.a("LootTableSeed", this.D());
         }
      } else {
         bjp.a($$0, this.E());
      }
   }

   default void b_(sl $$0) {
      this.G();
      if ($$0.b("LootTable", 8)) {
         this.a(new ahd($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bjp.b($$0, this.E());
      }
   }

   default void a(bkn $$0, cti $$1, blp $$2) {
      if ($$1.Z().b(cte.i)) {
         bjr.a($$1, $$2, this);
         if (!$$1.B) {
            blp $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == blt.bv) {
               cds.a((cfb)$$3, true);
            }
         }
      }
   }

   default bjv c_(cfb $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bjv.b : bjv.a;
   }

   default void f(@Nullable cfb $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.C() != null && $$1 != null) {
         egx $$2 = $$1.aJ().getLootTable(this.C());
         if ($$0 != null) {
            am.O.a((ana)$$0, this.C());
         }

         this.a(null);
         egv.a $$3 = new egv.a((amz)this.dM()).a(eja.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.go()).a(eja.a, $$0);
         }

         $$2.a(this, $$3.a(eiz.c), this.D());
      }
   }

   default void f() {
      this.f(null);
      this.E().clear();
   }

   default boolean g() {
      for (cmr $$0 : this.E()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cmr e_(int $$0) {
      this.f(null);
      cmr $$1 = this.E().get($$0);
      if ($$1.b()) {
         return cmr.f;
      } else {
         this.E().set($$0, cmr.f);
         return $$1;
      }
   }

   default cmr f_(int $$0) {
      this.f(null);
      return this.E().get($$0);
   }

   default cmr b(int $$0, int $$1) {
      this.f(null);
      return bjp.a(this.E(), $$0, $$1);
   }

   default void c(int $$0, cmr $$1) {
      this.f(null);
      this.E().set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   default bmx g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bmx() {
         @Override
         public cmr a() {
            return cgx.this.f_($$0);
         }

         @Override
         public boolean a(cmr $$0x) {
            cgx.this.c($$0, $$0);
            return true;
         }
      } : bmx.b;
   }

   default boolean g(cfb $$0) {
      return !this.dH() && this.dk().a((ir)$$0.dk(), 8.0);
   }
}

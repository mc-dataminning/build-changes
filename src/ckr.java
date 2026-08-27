import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ckr extends bmv, bng {
   epr dk();

   epm cH();

   @Nullable
   ajh B();

   void a(@Nullable ajh var1);

   long C();

   void a(long var1);

   iu<cqk> D();

   void E();

   cwz dM();

   boolean dH();

   @Override
   default boolean ai_() {
      return this.g();
   }

   default void c(ta $$0) {
      if (this.B() != null) {
         $$0.a("LootTable", this.B().toString());
         if (this.C() != 0L) {
            $$0.a("LootTableSeed", this.C());
         }
      } else {
         bmw.a($$0, this.D());
      }
   }

   default void b_(ta $$0) {
      this.E();
      if ($$0.b("LootTable", 8)) {
         this.a(new ajh($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bmw.b($$0, this.D());
      }
   }

   default void a(bnv $$0, cwz $$1, bow $$2) {
      if ($$1.Z().b(cwv.i)) {
         bmy.a($$1, $$2, this);
         if (!$$1.B) {
            bow $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bpc.bx) {
               chj.a((cis)$$3, true);
            }
         }
      }
   }

   default bnc c_(cis $$0) {
      $$0.a(this);
      return !$$0.dM().B ? bnc.b : bnc.a;
   }

   default void f(@Nullable cis $$0) {
      MinecraftServer $$1 = this.dM().o();
      if (this.B() != null && $$1 != null) {
         elc $$2 = $$1.aM().getLootTable(this.B());
         if ($$0 != null) {
            am.Q.a((apg)$$0, this.B());
         }

         this.a(null);
         ela.a $$3 = new ela.a((apf)this.dM()).a(enf.f, this.dk());
         if ($$0 != null) {
            $$3.a($$0.gv()).a(enf.a, $$0);
         }

         $$2.a(this, $$3.a(ene.c), this.C());
      }
   }

   default void f() {
      this.f(null);
      this.D().clear();
   }

   default boolean g() {
      for (cqk $$0 : this.D()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cqk e_(int $$0) {
      this.f(null);
      cqk $$1 = this.D().get($$0);
      if ($$1.b()) {
         return cqk.h;
      } else {
         this.D().set($$0, cqk.h);
         return $$1;
      }
   }

   default cqk f_(int $$0) {
      this.f(null);
      return this.D().get($$0);
   }

   default cqk b(int $$0, int $$1) {
      this.f(null);
      return bmw.a(this.D(), $$0, $$1);
   }

   default void c(int $$0, cqk $$1) {
      this.f(null);
      this.D().set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   default bqf g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bqf() {
         @Override
         public cqk a() {
            return ckr.this.f_($$0);
         }

         @Override
         public boolean a(cqk $$0x) {
            ckr.this.c($$0, $$0);
            return true;
         }
      } : bqf.b;
   }

   default boolean g(cis $$0) {
      return !this.dH() && $$0.a(this.cH(), 4.0);
   }
}

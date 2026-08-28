import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cqs extends bsa, bsj {
   ezr dw();

   ezm cT();

   @Nullable
   alk<eul> F();

   void a(@Nullable alk<eul> var1);

   long G();

   void a(long var1);

   jz<cwf> I();

   void J();

   dff dY();

   boolean dT();

   @Override
   default boolean c() {
      return this.g();
   }

   default void a(un $$0, js.a $$1) {
      if (this.F() != null) {
         $$0.a("LootTable", this.F().a().toString());
         if (this.G() != 0L) {
            $$0.a("LootTableSeed", this.G());
         }
      } else {
         bsb.a($$0, this.I(), $$1);
      }
   }

   default void b(un $$0, js.a $$1) {
      this.J();
      if ($$0.b("LootTable", 8)) {
         this.a(alk.a(ma.bd, all.a($$0.l("LootTable"))));
         this.a($$0.i("LootTableSeed"));
      } else {
         bsb.b($$0, this.I(), $$1);
      }
   }

   default void a(bsy $$0, dff $$1, bui $$2) {
      if ($$1.ac().b(dfb.i)) {
         bsd.a($$1, $$2, this);
         if (!$$1.C) {
            bui $$3 = $$0.c();
            if ($$3 != null && $$3.ar() == bup.by) {
               cng.a((cor)$$3, true);
            }
         }
      }
   }

   default bsh c_(cor $$0) {
      $$0.a(this);
      return bsh.a;
   }

   default void f(@Nullable cor $$0) {
      MinecraftServer $$1 = this.dY().o();
      if (this.F() != null && $$1 != null) {
         eul $$2 = $$1.bc().b(this.F());
         if ($$0 != null) {
            ao.Q.a((arr)$$0, this.F());
         }

         this.a(null);
         euj.a $$3 = new euj.a((arq)this.dY()).a(exc.f, this.dw());
         if ($$0 != null) {
            $$3.a($$0.gI()).a(exc.a, $$0);
         }

         $$2.a(this, $$3.a(exb.c), this.G());
      }
   }

   default void f() {
      this.f(null);
      this.I().clear();
   }

   default boolean g() {
      for (cwf $$0 : this.I()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default cwf e_(int $$0) {
      this.f(null);
      cwf $$1 = this.I().get($$0);
      if ($$1.f()) {
         return cwf.k;
      } else {
         this.I().set($$0, cwf.k);
         return $$1;
      }
   }

   default cwf f_(int $$0) {
      this.f(null);
      return this.I().get($$0);
   }

   default cwf b(int $$0, int $$1) {
      this.f(null);
      return bsb.a(this.I(), $$0, $$1);
   }

   default void c(int $$0, cwf $$1) {
      this.f(null);
      this.I().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   default bvw g_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bvw() {
         @Override
         public cwf a() {
            return cqs.this.f_($$0);
         }

         @Override
         public boolean a(cwf $$0x) {
            cqs.this.c($$0, $$0);
            return true;
         }
      } : bvw.a;
   }

   default boolean g(cor $$0) {
      return !this.dT() && $$0.a(this.cT(), 4.0);
   }
}

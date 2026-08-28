import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cva extends buv, bve {
   fgc dt();

   ffx cR();

   @Nullable
   alq<fay> q();

   void a(@Nullable alq<fay> var1);

   long s();

   void a(long var1);

   jp<dak> t();

   void u();

   dkj dV();

   boolean dQ();

   @Override
   default boolean c() {
      return this.am_();
   }

   default void a(ua $$0, ji.a $$1) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         buw.a($$0, this.t(), $$1);
      }
   }

   default void b(ua $$0, ji.a $$1) {
      this.u();
      alq<fay> $$2 = $$0.<alq<fay>>a("LootTable", fay.a).orElse(null);
      this.a($$2);
      this.a($$0.b("LootTableSeed", 0L));
      if ($$2 == null) {
         buw.b($$0, this.t(), $$1);
      }
   }

   default void a(bvt $$0, asb $$1, bxe $$2) {
      if ($$1.O().c(dkf.j)) {
         buy.a($$1, $$2, this);
         bxe $$3 = $$0.c();
         if ($$3 != null && $$3.an() == bxn.bT) {
            cqy.a($$1, (csi)$$3, true);
         }
      }
   }

   default bvc b_(csi $$0) {
      $$0.a(this);
      return bvc.a;
   }

   default void f(@Nullable csi $$0) {
      MinecraftServer $$1 = this.dV().p();
      if (this.q() != null && $$1 != null) {
         fay $$2 = $$1.bc().b(this.q());
         if ($$0 != null) {
            aq.Q.a((asc)$$0, this.q());
         }

         this.a(null);
         faw.a $$3 = new faw.a((asb)this.dV()).a(fdn.f, this.dt());
         if ($$0 != null) {
            $$3.a($$0.eh()).a(fdn.a, $$0);
         }

         $$2.a(this, $$3.a(fdm.c), this.s());
      }
   }

   default void al_() {
      this.f(null);
      this.t().clear();
   }

   default boolean am_() {
      for (dak $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default dak f_(int $$0) {
      this.f(null);
      dak $$1 = this.t().get($$0);
      if ($$1.f()) {
         return dak.l;
      } else {
         this.t().set($$0, dak.l);
         return $$1;
      }
   }

   default dak g_(int $$0) {
      this.f(null);
      return this.t().get($$0);
   }

   default dak b(int $$0, int $$1) {
      this.f(null);
      return buw.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, dak $$1) {
      this.f(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default byw h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new byw() {
         @Override
         public dak a() {
            return cva.this.g_($$0);
         }

         @Override
         public boolean a(dak $$0x) {
            cva.this.c($$0, $$0);
            return true;
         }
      } : byw.a;
   }

   default boolean g(csi $$0) {
      return !this.dQ() && $$0.a(this.cR(), 4.0);
   }
}

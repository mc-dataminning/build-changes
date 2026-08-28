import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmd extends cly {
   private static final int bI = 47999;
   private int bJ = 47999;

   public cmd(bxe<? extends cmd> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Nullable
   @Override
   protected cly gI() {
      return bxe.bz.a(this.dV(), bxd.e);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bJ);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.bJ = $$0.b("DespawnDelay", 47999);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(1, new cfl(this, 2.0));
      this.bG.a(1, new cmd.a(this));
      this.bG.a(2, new cgl<>(this, cpu.class, true, ($$0, $$1) -> $$0.an() != bxe.bS));
      this.bG.a(2, new cgl<>(this, coh.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bJ = $$0;
   }

   @Override
   protected void a(crz $$0) {
      bwv $$1 = this.C();
      if (!($$1 instanceof crr)) {
         super.a($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.hh();
      }
   }

   private void hh() {
      if (this.hi()) {
         this.bJ = this.hj() ? ((crr)this.C()).gC() - 1 : this.bJ - 1;
         if (this.bJ <= 0) {
            this.z();
            this.aq();
         }
      }
   }

   private boolean hi() {
      return !this.gL() && !this.hk() && !this.de();
   }

   private boolean hj() {
      return this.C() instanceof crr;
   }

   private boolean hk() {
      return this.S_() && !this.hj();
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$2 == bxd.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bwl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cgs {
      private final cly a;
      private bxw b;
      private int c;

      public a(cly $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ces.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.S_()) {
            return false;
         } else if (!(this.a.C() instanceof crr $$1)) {
            return false;
         } else {
            this.b = $$1.er();
            int $$2 = $$1.et();
            return $$2 != this.c && this.a(this.b, cil.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bwv $$0 = this.a.C();
         if ($$0 instanceof crr) {
            this.c = ((crr)$$0).et();
         }

         super.d();
      }
   }
}

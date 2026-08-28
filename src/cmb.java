import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmb extends clw {
   private static final int bI = 47999;
   private int bJ = 47999;

   public cmb(bxc<? extends cmb> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Nullable
   @Override
   protected clw gI() {
      return bxc.bz.a(this.dV(), bxb.e);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bJ);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bJ = $$0.b("DespawnDelay", 47999);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(1, new cfj(this, 2.0));
      this.bG.a(1, new cmb.a(this));
      this.bG.a(2, new cgj<>(this, cps.class, true, ($$0, $$1) -> $$0.an() != bxc.bS));
      this.bG.a(2, new cgj<>(this, cof.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bJ = $$0;
   }

   @Override
   protected void a(crx $$0) {
      bwt $$1 = this.C();
      if (!($$1 instanceof crp)) {
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
         this.bJ = this.hj() ? ((crp)this.C()).gC() - 1 : this.bJ - 1;
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
      return this.C() instanceof crp;
   }

   private boolean hk() {
      return this.S_() && !this.hj();
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$2 == bxb.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bwj.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cgq {
      private final clw a;
      private bxu b;
      private int c;

      public a(clw $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.S_()) {
            return false;
         } else if (!(this.a.C() instanceof crp $$1)) {
            return false;
         } else {
            this.b = $$1.er();
            int $$2 = $$1.et();
            return $$2 != this.c && this.a(this.b, cij.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bwt $$0 = this.a.C();
         if ($$0 instanceof crp) {
            this.c = ((crp)$$0).et();
         }

         super.d();
      }
   }
}

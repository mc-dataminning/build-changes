import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmm extends cmh {
   private static final int bI = 47999;
   private int bJ = 47999;

   public cmm(bxn<? extends cmm> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Nullable
   @Override
   protected cmh gI() {
      return bxn.bz.a(this.dV(), bxm.e);
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
      this.bF.a(1, new cfu(this, 2.0));
      this.bG.a(1, new cmm.a(this));
      this.bG.a(2, new cgu<>(this, cqd.class, true, ($$0, $$1) -> $$0.an() != bxn.bS));
      this.bG.a(2, new cgu<>(this, cor.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bJ = $$0;
   }

   @Override
   protected void a(csi $$0) {
      bxe $$1 = this.C();
      if (!($$1 instanceof csa)) {
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
         this.bJ = this.hj() ? ((csa)this.C()).gC() - 1 : this.bJ - 1;
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
      return this.C() instanceof csa;
   }

   private boolean hk() {
      return this.T_() && !this.hj();
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$2 == bxm.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bwu.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends chb {
      private final cmh a;
      private byf b;
      private int c;

      public a(cmh $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cfb.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.T_()) {
            return false;
         } else if (!(this.a.C() instanceof csa $$1)) {
            return false;
         } else {
            this.b = $$1.er();
            int $$2 = $$1.et();
            return $$2 != this.c && this.a(this.b, ciu.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bxe $$0 = this.a.C();
         if ($$0 instanceof csa) {
            this.c = ((csa)$$0).et();
         }

         super.d();
      }
   }
}

import java.util.EnumSet;
import javax.annotation.Nullable;

public class cll extends clg {
   private int bF = 47999;

   public cll(bwm<? extends cll> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gt() {
      return true;
   }

   @Nullable
   @Override
   protected clg gE() {
      return bwm.by.a(this.dV(), bwl.e);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bF);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bF = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new cer(this, 2.0));
      this.bD.a(1, new cll.a(this));
      this.bD.a(2, new cfr<>(this, cot.class, true, ($$0, $$1) -> $$0.aq() != bwm.bR));
      this.bD.a(2, new cfr<>(this, cng.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bF = $$0;
   }

   @Override
   protected void a(cqy $$0) {
      bwd $$1 = this.C();
      if (!($$1 instanceof cqq)) {
         super.a($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.hd();
      }
   }

   private void hd() {
      if (this.he()) {
         this.bF = this.hf() ? ((cqq)this.C()).gy() - 1 : this.bF - 1;
         if (this.bF <= 0) {
            this.z();
            this.at();
         }
      }
   }

   private boolean he() {
      return !this.gH() && !this.hg() && !this.de();
   }

   private boolean hf() {
      return this.C() instanceof cqq;
   }

   private boolean hg() {
      return this.O_() && !this.hf();
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$2 == bwl.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bvt.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cfy {
      private final clg a;
      private bxc b;
      private int c;

      public a(clg $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.O_()) {
            return false;
         } else if (!(this.a.C() instanceof cqq $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.es();
            return $$2 != this.c && this.a(this.b, chr.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bwd $$0 = this.a.C();
         if ($$0 instanceof cqq) {
            this.c = ((cqq)$$0).es();
         }

         super.d();
      }
   }
}

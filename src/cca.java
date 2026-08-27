import javax.annotation.Nullable;

public class cca extends cby {
   @Nullable
   private ir p;

   public cca(bsq $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public eps a(ir $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eps a(brv $$0, int $$1) {
      this.p = $$0.du();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(brv $$0, double $$1) {
      eps $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.du();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void c() {
      if (!this.l()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.ds(), (double)this.a.do())
               && (!(this.a.dB() > (double)this.p.v()) || !ir.a((double)this.p.u(), this.a.dB(), (double)this.p.w()).a(this.a.ds(), (double)this.a.do()))) {
               this.a.G().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

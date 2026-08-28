import javax.annotation.Nullable;

public class cgu extends cgs {
   @Nullable
   private iv p;

   public cgu(bxl $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   public exo a(iv $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public exo a(bwi $$0, int $$1) {
      this.p = $$0.du();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bwi $$0, double $$1) {
      exo $$2 = this.a($$0, 0);
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
      if (!this.k()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.ds(), (double)this.a.dp())
               && (!(this.a.dB() > (double)this.p.v()) || !iv.a((double)this.p.u(), this.a.dB(), (double)this.p.w()).a(this.a.ds(), (double)this.a.dp()))) {
               this.a.L().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

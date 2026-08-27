import javax.annotation.Nullable;

public class bvz extends bvx {
   @Nullable
   private hx p;

   public bvz(bmq $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   public efo a(hx $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public efo a(blw $$0, int $$1) {
      this.p = $$0.dl();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(blw $$0, double $$1) {
      efo $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dl();
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
            if (!this.p.a(this.a.dj(), (double)this.a.dg())
               && (!(this.a.ds() > (double)this.p.v()) || !hx.a((double)this.p.u(), this.a.ds(), (double)this.p.w()).a(this.a.dj(), (double)this.a.dg()))) {
               this.a.K().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

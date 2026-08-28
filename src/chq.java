import javax.annotation.Nullable;

public class chq extends cho {
   @Nullable
   private iw p;

   public chq(byh $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public eyo a(iw $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eyo a(bxe $$0, int $$1) {
      this.p = $$0.dv();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bxe $$0, double $$1) {
      eyo $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dv();
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
            if (!this.p.a(this.a.dt(), (double)this.a.dq())
               && (!(this.a.dC() > (double)this.p.v()) || !iw.a((double)this.p.u(), this.a.dC(), (double)this.p.w()).a(this.a.dt(), (double)this.a.dq()))) {
               this.a.L().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

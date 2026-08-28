import javax.annotation.Nullable;

public class ccl extends ccj {
   @Nullable
   private ja p;

   public ccl(bta $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   public eop a(ja $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eop a(bsd $$0, int $$1) {
      this.p = $$0.dp();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bsd $$0, double $$1) {
      eop $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dp();
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
            if (!this.p.a(this.a.dn(), (double)this.a.dj())
               && (!(this.a.dw() > (double)this.p.v()) || !ja.a((double)this.p.u(), this.a.dw(), (double)this.p.w()).a(this.a.dn(), (double)this.a.dj()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

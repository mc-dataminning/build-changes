import javax.annotation.Nullable;

public class ccz extends ccx {
   @Nullable
   private jd p;

   public ccz(btn $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   public epm a(jd $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public epm a(bsq $$0, int $$1) {
      this.p = $$0.dq();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bsq $$0, double $$1) {
      epm $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dq();
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
            if (!this.p.a(this.a.do(), (double)this.a.dk())
               && (!(this.a.dx() > (double)this.p.v()) || !jd.a((double)this.p.u(), this.a.dx(), (double)this.p.w()).a(this.a.do(), (double)this.a.dk()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

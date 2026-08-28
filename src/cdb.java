import javax.annotation.Nullable;

public class cdb extends ccz {
   @Nullable
   private jd p;

   public cdb(btp $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   public eps a(jd $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eps a(bsr $$0, int $$1) {
      this.p = $$0.do();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bsr $$0, double $$1) {
      eps $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.do();
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
            if (!this.p.a(this.a.dm(), (double)this.a.dj())
               && (!(this.a.dv() > (double)this.p.v()) || !jd.a((double)this.p.u(), this.a.dv(), (double)this.p.w()).a(this.a.dm(), (double)this.a.dj()))) {
               this.a.J().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

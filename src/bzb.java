import javax.annotation.Nullable;

public class bzb extends byz {
   @Nullable
   private ib p;

   public bzb(bpr $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   public ejd a(ib $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public ejd a(box $$0, int $$1) {
      this.p = $$0.dm();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(box $$0, double $$1) {
      ejd $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dm();
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
            if (!this.p.a(this.a.dk(), (double)this.a.dg())
               && (!(this.a.dt() > (double)this.p.v()) || !ib.a((double)this.p.u(), this.a.dt(), (double)this.p.w()).a(this.a.dk(), (double)this.a.dg()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

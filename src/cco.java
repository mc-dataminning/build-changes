import javax.annotation.Nullable;

public class cco extends ccm {
   @Nullable
   private ja p;

   public cco(btd $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   public eov a(ja $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eov a(bsg $$0, int $$1) {
      this.p = $$0.dq();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bsg $$0, double $$1) {
      eov $$2 = this.a($$0, 0);
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
               && (!(this.a.dx() > (double)this.p.v()) || !ja.a((double)this.p.u(), this.a.dx(), (double)this.p.w()).a(this.a.do(), (double)this.a.dk()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

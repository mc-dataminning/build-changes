import javax.annotation.Nullable;

public class bss extends bsq {
   @Nullable
   private gw p;

   public bss(bjk $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   public ebd a(gw $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public ebd a(bis $$0, int $$1) {
      this.p = $$0.dl();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bis $$0, double $$1) {
      ebd $$2 = this.a($$0, 0);
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
            if (!this.p.a(this.a.dj(), (double)this.a.df())
               && (!(this.a.ds() > (double)this.p.v()) || !gw.a((double)this.p.u(), this.a.ds(), (double)this.p.w()).a(this.a.dj(), (double)this.a.df()))) {
               this.a.I().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

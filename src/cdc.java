import javax.annotation.Nullable;

public class cdc extends cda {
   @Nullable
   private iz p;

   public cdc(btr $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   public eoj a(iz $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eoj a(bsu $$0, int $$1) {
      this.p = $$0.dp();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bsu $$0, double $$1) {
      eoj $$2 = this.a($$0, 0);
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
               && (!(this.a.dw() > (double)this.p.v()) || !iz.a((double)this.p.u(), this.a.dw(), (double)this.p.w()).a(this.a.dn(), (double)this.a.dj()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

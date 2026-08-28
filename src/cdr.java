import javax.annotation.Nullable;

public class cdr extends cdp {
   @Nullable
   private je p;

   public cdr(buh $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   public eqp a(je $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eqp a(btj $$0, int $$1) {
      this.p = $$0.ds();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(btj $$0, double $$1) {
      eqp $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.ds();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void c() {
      if (!this.m()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.dq(), (double)this.a.dn())
               && (!(this.a.dz() > (double)this.p.v()) || !je.a((double)this.p.u(), this.a.dz(), (double)this.p.w()).a(this.a.dq(), (double)this.a.dn()))) {
               this.a.M().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

import javax.annotation.Nullable;

public class byj extends byh {
   @Nullable
   private ib p;

   public byj(boz $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   public eig a(ib $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eig a(bof $$0, int $$1) {
      this.p = $$0.dj();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bof $$0, double $$1) {
      eig $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dj();
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
            if (!this.p.a(this.a.dh(), (double)this.a.dd())
               && (!(this.a.dq() > (double)this.p.v()) || !ib.a((double)this.p.u(), this.a.dq(), (double)this.p.w()).a(this.a.dh(), (double)this.a.dd()))) {
               this.a.K().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

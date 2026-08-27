import javax.annotation.Nullable;

public class buq extends buo {
   @Nullable
   private ht p;

   public buq(bli $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   public edh a(ht $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public edh a(bkq $$0, int $$1) {
      this.p = $$0.dn();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bkq $$0, double $$1) {
      edh $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dn();
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
            if (!this.p.a(this.a.dl(), (double)this.a.dh())
               && (!(this.a.du() > (double)this.p.v()) || !ht.a((double)this.p.u(), this.a.du(), (double)this.p.w()).a(this.a.dl(), (double)this.a.dh()))) {
               this.a.K().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

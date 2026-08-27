import javax.annotation.Nullable;

public class buv extends but {
   @Nullable
   private hx p;

   public buv(bln $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   public edm a(hx $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public edm a(bkv $$0, int $$1) {
      this.p = $$0.dn();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bkv $$0, double $$1) {
      edm $$2 = this.a($$0, 0);
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
               && (!(this.a.du() > (double)this.p.v()) || !hx.a((double)this.p.u(), this.a.du(), (double)this.p.w()).a(this.a.dl(), (double)this.a.dh()))) {
               this.a.K().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

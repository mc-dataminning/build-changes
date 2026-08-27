import javax.annotation.Nullable;

public class cbm extends cbk {
   @Nullable
   private in p;

   public cbm(bsc $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   public emo a(in $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public emo a(brh $$0, int $$1) {
      this.p = $$0.dn();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(brh $$0, double $$1) {
      emo $$2 = this.a($$0, 0);
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
               && (!(this.a.du() > (double)this.p.v()) || !in.a((double)this.p.u(), this.a.du(), (double)this.p.w()).a(this.a.dl(), (double)this.a.dh()))) {
               this.a.H().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

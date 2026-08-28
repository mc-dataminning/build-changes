import javax.annotation.Nullable;

public class cfk extends cfi {
   @Nullable
   private jh p;

   public cfk(bvz $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public eue a(jh $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eue a(bvb $$0, int $$1) {
      this.p = $$0.dw();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bvb $$0, double $$1) {
      eue $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dw();
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
            if (!this.p.a(this.a.du(), (double)this.a.dr())
               && (!(this.a.dD() > (double)this.p.v()) || !jh.a((double)this.p.u(), this.a.dD(), (double)this.p.w()).a(this.a.du(), (double)this.a.dr()))) {
               this.a.I().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

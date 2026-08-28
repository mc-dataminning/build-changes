import javax.annotation.Nullable;

public class cfo extends cfm {
   @Nullable
   private jh p;

   public cfo(bwd $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public eud a(jh $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eud a(bvf $$0, int $$1) {
      this.p = $$0.dv();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bvf $$0, double $$1) {
      eud $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dv();
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
            if (!this.p.a(this.a.dt(), (double)this.a.dq())
               && (!(this.a.dC() > (double)this.p.v()) || !jh.a((double)this.p.u(), this.a.dC(), (double)this.p.w()).a(this.a.dt(), (double)this.a.dq()))) {
               this.a.I().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

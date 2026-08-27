import javax.annotation.Nullable;

public class bvv extends bvt {
   @Nullable
   private hx p;

   public bvv(bmm $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   public eff a(hx $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public eff a(blu $$0, int $$1) {
      this.p = $$0.dm();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(blu $$0, double $$1) {
      eff $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dm();
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
            if (!this.p.a(this.a.dk(), (double)this.a.dg())
               && (!(this.a.dt() > (double)this.p.v()) || !hx.a((double)this.p.u(), this.a.dt(), (double)this.p.w()).a(this.a.dk(), (double)this.a.dg()))) {
               this.a.K().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}

public abstract class bmm extends bmv {
   protected bgb d;
   protected gu e = gu.b;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bmm(bgb $$0) {
      this.d = $$0;
      if (!bqr.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dcb $$0 = this.d.dI().a_(this.e);
         if (!($$0.b() instanceof crp)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(crp.b);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dcb $$1 = this.d.dI().a_(this.e);
         if ($$1.b() instanceof crp) {
            ((crp)$$1.b()).a(this.d, this.d.dI(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!bqr.a(this.d)) {
         return false;
      } else if (!this.d.O) {
         return false;
      } else {
         bpi $$0 = (bpi)this.d.J();
         dxt $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               dxr $$3 = $$1.a($$2);
               this.e = new gu($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dp(), (double)this.e.w()) > 2.25)) {
                  this.f = crp.a(this.d.dI(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.di().c();
            this.f = crp.a(this.d.dI(), this.e);
            return this.f;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a;
   }

   @Override
   public void c() {
      this.a = false;
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dn());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dt());
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dn());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dt());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

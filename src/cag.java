public abstract class cag extends cap {
   protected btt d;
   protected iz e = iz.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cag(btt $$0) {
      this.d = $$0;
      if (!cen.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dse $$0 = this.d.dP().a_(this.e);
         if (!($$0.b() instanceof dhh)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dhh.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dse $$1 = this.d.dP().a_(this.e);
         if ($$1.b() instanceof dhh) {
            ((dhh)$$1.b()).a(this.d, this.d.dP(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!cen.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cdc $$0 = (cdc)this.d.K();
         eol $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eoj $$3 = $$1.a($$2);
               this.e = new iz($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dw(), (double)this.e.w()) > 2.25)) {
                  this.f = dhh.a(this.d.dP(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dp().c();
            this.f = dhh.a(this.d.dP(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.du());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dA());
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.du());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dA());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

public abstract class cbu extends ccd {
   protected bvh d;
   protected ji e = ji.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cbu(bvh $$0) {
      this.d = $$0;
      if (!cgb.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dwv $$0 = this.d.dW().a_(this.e);
         if (!($$0.b() instanceof dlr)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dlr.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dwv $$1 = this.d.dW().a_(this.e);
         if ($$1.b() instanceof dlr) {
            ((dlr)$$1.b()).a(this.d, this.d.dW(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cgb.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         ceq $$0 = (ceq)this.d.L();
         etl $$1 = $$0.i();
         if ($$1 != null && !$$1.c()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               etj $$3 = $$1.a($$2);
               this.e = new ji($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dD(), (double)this.e.w()) > 2.25)) {
                  this.f = dlr.a(this.d.dW(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dw().d();
            this.f = dlr.a(this.d.dW(), this.e);
            return this.f;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a;
   }

   @Override
   public void d() {
      this.a = false;
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dB());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dH());
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dB());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dH());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

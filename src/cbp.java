public abstract class cbp extends cby {
   protected bvc d;
   protected jh e = jh.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cbp(bvc $$0) {
      this.d = $$0;
      if (!cfw.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dvj $$0 = this.d.dX().a_(this.e);
         if (!($$0.b() instanceof dkk)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dkk.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dvj $$1 = this.d.dX().a_(this.e);
         if ($$1.b() instanceof dkk) {
            ((dkk)$$1.b()).a(this.d, this.d.dX(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cfw.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cel $$0 = (cel)this.d.P();
         ery $$1 = $$0.k();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               erw $$3 = $$1.a($$2);
               this.e = new jh($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dE(), (double)this.e.w()) > 2.25)) {
                  this.f = dkk.a(this.d.dX(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dx().d();
            this.f = dkk.a(this.d.dX(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dC());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dI());
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dC());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dI());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

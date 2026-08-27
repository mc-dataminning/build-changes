public abstract class bzc extends bzl {
   protected bsq d;
   protected ir e = ir.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bzc(bsq $$0) {
      this.d = $$0;
      if (!cdj.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dtc $$0 = this.d.dU().a_(this.e);
         if (!($$0.b() instanceof dhj)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dhj.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dtc $$1 = this.d.dU().a_(this.e);
         if ($$1.b() instanceof dhj) {
            ((dhj)$$1.b()).a(this.d, this.d.dU(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!cdj.a(this.d)) {
         return false;
      } else if (!this.d.R) {
         return false;
      } else {
         cby $$0 = (cby)this.d.J();
         eps $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               epq $$3 = $$1.a($$2);
               this.e = new ir($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dB(), (double)this.e.w()) > 2.25)) {
                  this.f = dhj.b(this.d.dU(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.du().c();
            this.f = dhj.b(this.d.dU(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dz());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dF());
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dz());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dF());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

public abstract class cae extends can {
   protected btr d;
   protected iz e = iz.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cae(btr $$0) {
      this.d = $$0;
      if (!cel.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dsc $$0 = this.d.dP().a_(this.e);
         if (!($$0.b() instanceof dhf)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dhf.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dsc $$1 = this.d.dP().a_(this.e);
         if ($$1.b() instanceof dhf) {
            ((dhf)$$1.b()).a(this.d, this.d.dP(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!cel.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cda $$0 = (cda)this.d.K();
         eoj $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eoh $$3 = $$1.a($$2);
               this.e = new iz($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dw(), (double)this.e.w()) > 2.25)) {
                  this.f = dhf.a(this.d.dP(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dp().c();
            this.f = dhf.a(this.d.dP(), this.e);
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

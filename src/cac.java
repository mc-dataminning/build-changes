public abstract class cac extends cal {
   protected btp d;
   protected iz e = iz.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cac(btp $$0) {
      this.d = $$0;
      if (!cej.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dsa $$0 = this.d.dP().a_(this.e);
         if (!($$0.b() instanceof dhd)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dhd.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dsa $$1 = this.d.dP().a_(this.e);
         if ($$1.b() instanceof dhd) {
            ((dhd)$$1.b()).a(this.d, this.d.dP(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!cej.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         ccy $$0 = (ccy)this.d.K();
         eoh $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eof $$3 = $$1.a($$2);
               this.e = new iz($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dw(), (double)this.e.w()) > 2.25)) {
                  this.f = dhd.a(this.d.dP(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dp().c();
            this.f = dhd.a(this.d.dP(), this.e);
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

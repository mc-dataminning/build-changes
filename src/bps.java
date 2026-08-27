public abstract class bps extends bqb {
   protected bji d;
   protected gw e = gw.b;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bps(bji $$0) {
      this.d = $$0;
      if (!btx.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dfj $$0 = this.d.dL().a_(this.e);
         if (!($$0.b() instanceof cux)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(cux.b);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dfj $$1 = this.d.dL().a_(this.e);
         if ($$1.b() instanceof cux) {
            ((cux)$$1.b()).a(this.d, this.d.dL(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!btx.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         bso $$0 = (bso)this.d.L();
         ebb $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eaz $$3 = $$1.a($$2);
               this.e = new gw($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.ds(), (double)this.e.w()) > 2.25)) {
                  this.f = cux.a(this.d.dL(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dl().c();
            this.f = cux.a(this.d.dL(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dq());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dw());
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dq());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dw());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

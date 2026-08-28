public abstract class cbt extends ccc {
   protected bvg d;
   protected jh e = jh.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cbt(bvg $$0) {
      this.d = $$0;
      if (!cga.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dvo $$0 = this.d.dY().a_(this.e);
         if (!($$0.b() instanceof dkp)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dkp.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dvo $$1 = this.d.dY().a_(this.e);
         if ($$1.b() instanceof dkp) {
            ((dkp)$$1.b()).a(this.d, this.d.dY(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cga.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cep $$0 = (cep)this.d.P();
         esc $$1 = $$0.k();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               esa $$3 = $$1.a($$2);
               this.e = new jh($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dF(), (double)this.e.w()) > 2.25)) {
                  this.f = dkp.a(this.d.dY(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dy().d();
            this.f = dkp.a(this.d.dY(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dD());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dJ());
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dD());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dJ());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

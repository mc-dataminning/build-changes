public abstract class cad extends cam {
   protected btp d;
   protected jd e = jd.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cad(btp $$0) {
      this.d = $$0;
      if (!cek.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dtc $$0 = this.d.dP().a_(this.e);
         if (!($$0.b() instanceof die)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(die.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dtc $$1 = this.d.dP().a_(this.e);
         if ($$1.b() instanceof die) {
            ((die)$$1.b()).a(this.d, this.d.dP(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cek.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         ccz $$0 = (ccz)this.d.N();
         epq $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               epo $$3 = $$1.a($$2);
               this.e = new jd($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dw(), (double)this.e.w()) > 2.25)) {
                  this.f = die.a(this.d.dP(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dp().d();
            this.f = die.a(this.d.dP(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.du());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dA());
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.du());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dA());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

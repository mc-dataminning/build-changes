public abstract class ccq extends ccz {
   protected bwd d;
   protected jh e = jh.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public ccq(bwd $$0) {
      this.d = $$0;
      if (!cgx.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dxn $$0 = this.d.dV().a_(this.e);
         if (!($$0.b() instanceof dmm)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dmm.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dxn $$1 = this.d.dV().a_(this.e);
         if ($$1.b() instanceof dmm) {
            ((dmm)$$1.b()).a(this.d, this.d.dV(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cgx.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         cfm $$0 = (cfm)this.d.L();
         eud $$1 = $$0.k();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eub $$3 = $$1.a($$2);
               this.e = new jh($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dC(), (double)this.e.w()) > 2.25)) {
                  this.f = dmm.a(this.d.dV(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dv().d();
            this.f = dmm.a(this.d.dV(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dA());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dG());
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dA());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dG());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

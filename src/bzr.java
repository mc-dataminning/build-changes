public abstract class bzr extends caa {
   protected bte d;
   protected ja e = ja.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bzr(bte $$0) {
      this.d = $$0;
      if (!cdy.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dsl $$0 = this.d.dR().a_(this.e);
         if (!($$0.b() instanceof dho)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dho.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dsl $$1 = this.d.dR().a_(this.e);
         if ($$1.b() instanceof dho) {
            ((dho)$$1.b()).a(this.d, this.d.dR(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!cdy.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         ccn $$0 = (ccn)this.d.J();
         eox $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eov $$3 = $$1.a($$2);
               this.e = new ja($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dy(), (double)this.e.w()) > 2.25)) {
                  this.f = dho.a(this.d.dR(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dr().c();
            this.f = dho.a(this.d.dR(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dw());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dC());
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dw());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dC());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

public abstract class bxs extends byb {
   protected brg d;
   protected im e = im.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bxs(brg $$0) {
      this.d = $$0;
      if (!cbz.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dpy $$0 = this.d.dN().a_(this.e);
         if (!($$0.b() instanceof dfb)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dfb.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dpy $$1 = this.d.dN().a_(this.e);
         if ($$1.b() instanceof dfb) {
            ((dfb)$$1.b()).a(this.d, this.d.dN(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!cbz.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cao $$0 = (cao)this.d.K();
         emf $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               emd $$3 = $$1.a($$2);
               this.e = new im($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.du(), (double)this.e.w()) > 2.25)) {
                  this.f = dfb.a(this.d.dN(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dn().c();
            this.f = dfb.a(this.d.dN(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.ds());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dy());
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.ds());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dy());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

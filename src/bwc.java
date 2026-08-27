public abstract class bwc extends bwl {
   protected bpq d;
   protected ib e = ib.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bwc(bpq $$0) {
      this.d = $$0;
      if (!caj.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dmz $$0 = this.d.dM().a_(this.e);
         if (!($$0.b() instanceof dcg)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dcg.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dmz $$1 = this.d.dM().a_(this.e);
         if ($$1.b() instanceof dcg) {
            ((dcg)$$1.b()).a(this.d, this.d.dM(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!caj.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         byy $$0 = (byy)this.d.K();
         ejc $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eja $$3 = $$1.a($$2);
               this.e = new ib($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dt(), (double)this.e.w()) > 2.25)) {
                  this.f = dcg.a(this.d.dM(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dm().c();
            this.f = dcg.a(this.d.dM(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dr());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dx());
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dr());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dx());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

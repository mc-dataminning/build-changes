public abstract class byo extends byx {
   protected bsc d;
   protected in e = in.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public byo(bsc $$0) {
      this.d = $$0;
      if (!ccv.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dqh $$0 = this.d.dN().a_(this.e);
         if (!($$0.b() instanceof dfk)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dfk.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dqh $$1 = this.d.dN().a_(this.e);
         if ($$1.b() instanceof dfk) {
            ((dfk)$$1.b()).a(this.d, this.d.dN(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!ccv.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cbk $$0 = (cbk)this.d.K();
         emo $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               emm $$3 = $$1.a($$2);
               this.e = new in($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.du(), (double)this.e.w()) > 2.25)) {
                  this.f = dfk.a(this.d.dN(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dn().c();
            this.f = dfk.a(this.d.dN(), this.e);
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

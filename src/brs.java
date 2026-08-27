public abstract class brs extends bsb {
   protected bli d;
   protected ht e = ht.b;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public brs(bli $$0) {
      this.d = $$0;
      if (!bvx.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dhi $$0 = this.d.dN().a_(this.e);
         if (!($$0.b() instanceof cxg)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(cxg.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dhi $$1 = this.d.dN().a_(this.e);
         if ($$1.b() instanceof cxg) {
            ((cxg)$$1.b()).a(this.d, this.d.dN(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!bvx.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         buo $$0 = (buo)this.d.N();
         edh $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               edf $$3 = $$1.a($$2);
               this.e = new ht($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.du(), (double)this.e.w()) > 2.25)) {
                  this.f = cxg.a(this.d.dN(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dn().c();
            this.f = cxg.a(this.d.dN(), this.e);
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
   public boolean S_() {
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

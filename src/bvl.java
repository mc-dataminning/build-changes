public abstract class bvl extends bvu {
   protected boz d;
   protected ib e = ib.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bvl(boz $$0) {
      this.d = $$0;
      if (!bzs.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dme $$0 = this.d.dJ().a_(this.e);
         if (!($$0.b() instanceof dbl)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dbl.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dme $$1 = this.d.dJ().a_(this.e);
         if ($$1.b() instanceof dbl) {
            ((dbl)$$1.b()).a(this.d, this.d.dJ(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!bzs.a(this.d)) {
         return false;
      } else if (!this.d.O) {
         return false;
      } else {
         byh $$0 = (byh)this.d.N();
         eig $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eie $$3 = $$1.a($$2);
               this.e = new ib($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dq(), (double)this.e.w()) > 2.25)) {
                  this.f = dbl.a(this.d.dJ(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dj().c();
            this.f = dbl.a(this.d.dJ(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.do());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.du());
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.do());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.du());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

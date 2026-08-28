public abstract class cdr extends cea {
   protected bxg d;
   protected iu e = iu.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cdr(bxg $$0) {
      this.d = $$0;
      if (!chy.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         eah $$0 = this.d.dV().a_(this.e);
         if (!($$0.b() instanceof dom)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dom.e);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         eah $$1 = this.d.dV().a_(this.e);
         if ($$1.b() instanceof dom) {
            ((dom)$$1.b()).a(this.d, this.d.dV(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!chy.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         cgn $$0 = (cgn)this.d.O();
         exc $$1 = $$0.i();
         if ($$1 != null && !$$1.c()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               exa $$3 = $$1.a($$2);
               this.e = new iu($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.h((double)this.e.u(), this.d.dC(), (double)this.e.w()) > 2.25)) {
                  this.f = dom.a(this.d.dV(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dv().d();
            this.f = dom.a(this.d.dV(), this.e);
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
   public boolean R_() {
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

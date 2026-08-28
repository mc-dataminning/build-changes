public abstract class cat extends cbc {
   protected buh d;
   protected je e = je.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cat(buh $$0) {
      this.d = $$0;
      if (!cfa.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dua $$0 = this.d.dS().a_(this.e);
         if (!($$0.b() instanceof djb)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(djb.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dua $$1 = this.d.dS().a_(this.e);
         if ($$1.b() instanceof djb) {
            ((djb)$$1.b()).a(this.d, this.d.dS(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cfa.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         cdp $$0 = (cdp)this.d.P();
         eqp $$1 = $$0.k();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eqn $$3 = $$1.a($$2);
               this.e = new je($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dz(), (double)this.e.w()) > 2.25)) {
                  this.f = djb.a(this.d.dS(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.ds().d();
            this.f = djb.a(this.d.dS(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dx());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dD());
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dx());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dD());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

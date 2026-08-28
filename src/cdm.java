public abstract class cdm extends cdv {
   protected bxb d;
   protected iu e = iu.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cdm(bxb $$0) {
      this.d = $$0;
      if (!cht.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dzo $$0 = this.d.dV().a_(this.e);
         if (!($$0.b() instanceof dob)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dob.e);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dzo $$1 = this.d.dV().a_(this.e);
         if ($$1.b() instanceof dob) {
            ((dob)$$1.b()).a(this.d, this.d.dV(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cht.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         cgi $$0 = (cgi)this.d.O();
         ewj $$1 = $$0.i();
         if ($$1 != null && !$$1.c()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               ewh $$3 = $$1.a($$2);
               this.e = new iu($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dC(), (double)this.e.w()) > 2.25)) {
                  this.f = dob.a(this.d.dV(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dv().d();
            this.f = dob.a(this.d.dV(), this.e);
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
   public boolean Q_() {
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

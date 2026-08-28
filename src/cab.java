public abstract class cab extends cak {
   protected btn d;
   protected jd e = jd.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cab(btn $$0) {
      this.d = $$0;
      if (!cei.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dta $$0 = this.d.dQ().a_(this.e);
         if (!($$0.b() instanceof dic)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dic.c);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dta $$1 = this.d.dQ().a_(this.e);
         if ($$1.b() instanceof dic) {
            ((dic)$$1.b()).a(this.d, this.d.dQ(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cei.a(this.d)) {
         return false;
      } else if (!this.d.Q) {
         return false;
      } else {
         ccx $$0 = (ccx)this.d.J();
         epm $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               epk $$3 = $$1.a($$2);
               this.e = new jd($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dx(), (double)this.e.w()) > 2.25)) {
                  this.f = dic.a(this.d.dQ(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dq().c();
            this.f = dic.a(this.d.dQ(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dv());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dB());
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dv());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dB());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

public abstract class bpj extends bps {
   protected biy d;
   protected gv e = gv.b;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public bpj(biy $$0) {
      this.d = $$0;
      if (!bto.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dey $$0 = this.d.dK().a_(this.e);
         if (!($$0.b() instanceof cum)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(cum.b);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dey $$1 = this.d.dK().a_(this.e);
         if ($$1.b() instanceof cum) {
            ((cum)$$1.b()).a(this.d, this.d.dK(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean a() {
      if (!bto.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         bsf $$0 = (bsf)this.d.H();
         eaq $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eao $$3 = $$1.a($$2);
               this.e = new gv($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dr(), (double)this.e.w()) > 2.25)) {
                  this.f = cum.a(this.d.dK(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dk().c();
            this.f = cum.a(this.d.dK(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dp());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dv());
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dp());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dv());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

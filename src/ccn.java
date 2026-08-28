public abstract class ccn extends ccw {
   protected bwa d;
   protected ji e = ji.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public ccn(bwa $$0) {
      this.d = $$0;
      if (!cgu.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         dxq $$0 = this.d.dU().a_(this.e);
         if (!($$0.b() instanceof dml)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dml.e);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         dxq $$1 = this.d.dU().a_(this.e);
         if ($$1.b() instanceof dml) {
            ((dml)$$1.b()).a(this.d, this.d.dU(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!cgu.a(this.d)) {
         return false;
      } else if (!this.d.P) {
         return false;
      } else {
         cfj $$0 = (cfj)this.d.O();
         euk $$1 = $$0.i();
         if ($$1 != null && !$$1.c()) {
            for (int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); $$2++) {
               eui $$3 = $$1.a($$2);
               this.e = new ji($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.i((double)this.e.u(), this.d.dB(), (double)this.e.w()) > 2.25)) {
                  this.f = dml.a(this.d.dU(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.du().d();
            this.f = dml.a(this.d.dU(), this.e);
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
      this.b = (float)((double)this.e.u() + 0.5 - this.d.dz());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dF());
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.dz());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dF());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}

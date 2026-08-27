public class fci extends fbr {
   private exf c;

   public fci() {
      super("");
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = exf.a(vf.c("multiplayer.stopSleeping"), $$0 -> this.D()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      if (!this.f.H().a(this.f.R())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void aE_() {
      this.D();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.H().a(this.f.R()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.D();
      }

      if (!this.f.H().a(this.f.R())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         if (this.b(this.b.a(), true)) {
            this.f.a(null);
            this.b.a("");
            this.f.l.d().d();
         }

         return true;
      }
   }

   private void D() {
      fns $$0 = this.f.s.cn;
      $$0.b(new aen(this.f.s, aen.a.c));
   }

   public void n() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new fbr(this.b.a()));
      }
   }
}

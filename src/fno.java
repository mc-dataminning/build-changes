public class fno extends fmx {
   private fik c;

   public fno() {
      super("");
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.c = fik.a(wz.c("multiplayer.stopSleeping"), $$0 -> this.C()).a(this.m / 2 - 100, this.n - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      if (!this.l.J().a(this.l.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.l.J().a(this.l.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
      }

      if (!this.l.J().a(this.l.T())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.b(this.b.a(), true);
         this.b.a("");
         this.l.l.d().d();
         return true;
      }
   }

   private void C() {
      fze $$0 = this.l.s.h;
      $$0.b(new ahn(this.l.s, ahn.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.l.a(null);
      } else {
         this.l.a(new fmx(this.b.a()));
      }
   }
}

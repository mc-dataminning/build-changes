public class fnk extends fmt {
   private fig c;

   public fnk() {
      super("");
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = fig.a(wy.c("multiplayer.stopSleeping"), $$0 -> this.D()).a(this.m / 2 - 100, this.n - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      if (!this.l.J().a(this.l.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.l.J().a(this.l.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.D();
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

   private void D() {
      fza $$0 = this.l.s.h;
      $$0.b(new ahm(this.l.s, ahm.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.l.a(null);
      } else {
         this.l.a(new fmt(this.b.a()));
      }
   }
}

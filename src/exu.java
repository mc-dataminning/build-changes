public class exu extends exd {
   private ess c;

   public exu() {
      super("");
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.c = ess.a(tn.c("multiplayer.stopSleeping"), $$0 -> this.l()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      if (!this.f.H().a(this.f.R())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void az_() {
      this.l();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.H().a(this.f.R()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l();
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

   private void l() {
      fja $$0 = this.f.s.cn;
      $$0.b(new ach(this.f.s, ach.a.c));
   }

   public void k() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new exd(this.b.a()));
      }
   }
}

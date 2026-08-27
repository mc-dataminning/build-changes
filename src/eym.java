public class eym extends exv {
   private etj c;

   public eym() {
      super("");
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c = etj.a(ui.c("multiplayer.stopSleeping"), $$0 -> this.C()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      if (!this.f.H().a(this.f.R())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void aC_() {
      this.C();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.H().a(this.f.R()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
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

   private void C() {
      fjs $$0 = this.f.s.cn;
      $$0.b(new add(this.f.s, add.a.c));
   }

   public void l() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new exv(this.b.a()));
      }
   }
}

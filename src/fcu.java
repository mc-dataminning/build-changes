public class fcu extends fcd {
   private exr c;

   public fcu() {
      super("");
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = exr.a(vg.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      if (!this.f.H().a(this.f.R())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.H().a(this.f.R()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.E();
      }

      if (!this.f.H().a(this.f.R())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.b(this.b.a(), true);
         this.b.a("");
         this.f.l.d().d();
         return true;
      }
   }

   private void E() {
      fof $$0 = this.f.s.cr;
      $$0.b(new aeo(this.f.s, aeo.a.c));
   }

   public void o() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new fcd(this.b.a()));
      }
   }
}

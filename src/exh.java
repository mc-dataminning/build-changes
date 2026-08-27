public class exh extends ewq {
   private esh c;

   public exh() {
      super("");
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.c = esh.a(tf.c("multiplayer.stopSleeping"), $$0 -> this.l()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      if (!this.f.H().a(this.f.R())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void au_() {
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
      fij $$0 = this.f.v.cl;
      $$0.b(new aca(this.f.v, aca.a.c));
   }

   public void k() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new ewq(this.b.a()));
      }
   }
}

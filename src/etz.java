public class etz extends eti {
   private epi c;

   public etz() {
      super("");
   }

   @Override
   protected void b() {
      super.b();
      this.c = epi.a(sw.c("multiplayer.stopSleeping"), $$0 -> this.l()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (!this.f.G().a(this.f.Q())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aw_() {
      this.l();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.G().a(this.f.Q()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l();
      }

      if (!this.f.G().a(this.f.Q())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         if (this.b(this.b.b(), true)) {
            this.f.a(null);
            this.b.a("");
            this.f.l.d().d();
         }

         return true;
      }
   }

   private void l() {
      fex $$0 = this.f.t.cl;
      $$0.a(new aae(this.f.t, aae.a.c));
   }

   public void k() {
      if (this.b.b().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new eti(this.b.b()));
      }
   }
}

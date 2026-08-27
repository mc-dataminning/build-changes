public class fgp extends ffx {
   private fbi c;

   public fgp() {
      super("");
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c = fbi.a(vu.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      if (!this.f.J().a(this.f.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.J().a(this.f.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.E();
      }

      if (!this.f.J().a(this.f.T())) {
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
      fsb $$0 = this.f.s.cu;
      $$0.b(new agd(this.f.s, agd.a.c));
   }

   public void o() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new ffx(this.b.a()));
      }
   }
}

public class fjf extends fin {
   private fdy c;

   public fjf() {
      super("");
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c = fdy.a(wi.c("multiplayer.stopSleeping"), $$0 -> this.C()).a(this.k / 2 - 100, this.l - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      if (!this.j.J().a(this.j.T())) {
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
      return !this.j.J().a(this.j.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
      }

      if (!this.j.J().a(this.j.T())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.b(this.b.a(), true);
         this.b.a("");
         this.j.l.d().d();
         return true;
      }
   }

   private void C() {
      fur $$0 = this.j.s.cv;
      $$0.b(new agr(this.j.s, agr.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.j.a(null);
      } else {
         this.j.a(new fin(this.b.a()));
      }
   }
}

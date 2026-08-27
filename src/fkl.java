public class fkl extends fjt {
   private ffe c;

   public fkl() {
      super("");
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c = ffe.a(wu.c("multiplayer.stopSleeping"), $$0 -> this.C()).a(this.n / 2 - 100, this.o - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      if (!this.m.J().a(this.m.T())) {
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
      return !this.m.J().a(this.m.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
      }

      if (!this.m.J().a(this.m.T())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.b(this.b.a(), true);
         this.b.a("");
         this.m.l.d().d();
         return true;
      }
   }

   private void C() {
      fvx $$0 = this.m.s.h;
      $$0.b(new ahd(this.m.s, ahd.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.m.a(null);
      } else {
         this.m.a(new fjt(this.b.a()));
      }
   }
}

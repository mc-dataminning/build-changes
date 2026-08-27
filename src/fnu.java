public class fnu extends fnc {
   private fin c;

   public fnu() {
      super("");
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = fin.a(xe.c("multiplayer.stopSleeping"), $$0 -> this.B()).a(this.n / 2 - 100, this.o - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      if (!this.m.J().a(this.m.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void d() {
      this.B();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.m.J().a(this.m.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.B();
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

   private void B() {
      fzo $$0 = this.m.s.h;
      $$0.b(new ahp(this.m.s, ahp.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.m.a(null);
      } else {
         this.m.a(new fnc(this.b.a()));
      }
   }
}

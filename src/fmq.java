public class fmq extends flz {
   private fhm c;

   public fmq() {
      super("");
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c = fhm.a(wu.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.m / 2 - 100, this.n - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      if (!this.l.J().a(this.l.T())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.l.J().a(this.l.T()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.E();
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

   private void E() {
      fye $$0 = this.l.s.cB;
      $$0.b(new ahg(this.l.s, ahg.a.c));
   }

   public void m() {
      if (this.b.a().isEmpty()) {
         this.l.a(null);
      } else {
         this.l.a(new flz(this.b.a()));
      }
   }
}

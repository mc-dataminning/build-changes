public class fcb extends fbk {
   private ewy c;

   public fcb() {
      super("");
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = ewy.a(vd.c("multiplayer.stopSleeping"), $$0 -> this.C()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      if (!this.f.G().a(this.f.Q())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void aE_() {
      this.C();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.G().a(this.f.Q()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
      }

      if (!this.f.G().a(this.f.Q())) {
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
      fnl $$0 = this.f.s.cn;
      $$0.b(new aek(this.f.s, aek.a.c));
   }

   public void n() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new fbk(this.b.a()));
      }
   }
}

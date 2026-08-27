public class ffp extends fey {
   private fak c;

   public ffp() {
      super("");
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = fak.a(vs.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      if (!this.f.I().a(this.f.S())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.f.I().a(this.f.S()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.E();
      }

      if (!this.f.I().a(this.f.S())) {
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
      frb $$0 = this.f.s.cr;
      $$0.b(new afz(this.f.s, afz.a.c));
   }

   public void o() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new fey(this.b.a()));
      }
   }
}

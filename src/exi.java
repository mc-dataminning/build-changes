public class exi extends ewr {
   private esg c;

   public exi() {
      super("");
   }

   @Override
   protected void aC_() {
      super.aC_();
      this.c = esg.a(tf.c("multiplayer.stopSleeping"), $$0 -> this.l()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.d(this.c);
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      if (!this.f.H().a(this.f.R())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public void at_() {
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
      fio $$0 = this.f.s.cl;
      $$0.b(new aca(this.f.s, aca.a.c));
   }

   public void k() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new ewr(this.b.a()));
      }
   }
}

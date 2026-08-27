public class fet extends fec {
   private ezo c;

   public fet() {
      super("");
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.c = ezo.a(vq.c("multiplayer.stopSleeping"), $$0 -> this.E()).a(this.g / 2 - 100, this.h - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      if (!this.f.I().a(this.f.S())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
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
      fqf $$0 = this.f.s.cq;
      $$0.b(new afv(this.f.s, afv.a.c));
   }

   public void o() {
      if (this.b.a().isEmpty()) {
         this.f.a(null);
      } else {
         this.f.a(new fec(this.b.a()));
      }
   }
}

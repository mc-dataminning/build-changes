public class cgr extends cgt {
   public cgr(bxl $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected exq a(int $$0) {
      this.o = new exl();
      return new exq(this.o, $$0);
   }

   @Override
   protected boolean a(ffc $$0, ffc $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bk() || !this.a.bX();
   }

   @Override
   protected ffc b() {
      return this.a.ds();
   }

   @Override
   public exo a(bwi $$0, int $$1) {
      return this.a($$0.du(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.h();
      }

      if (!this.k()) {
         if (this.a()) {
            this.j();
         } else if (this.c != null && !this.c.c()) {
            ffc $$0 = this.c.a(this.a);
            if (this.a.dy() == azm.a($$0.d) && this.a.dA() == azm.a($$0.e) && this.a.dE() == azm.a($$0.f)) {
               this.c.a();
            }
         }

         agm.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            ffc $$1 = this.c.a(this.a);
            this.a.L().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public boolean a(iv $$0) {
      return this.b.a_($$0).b(this.b, $$0, this.a);
   }
}

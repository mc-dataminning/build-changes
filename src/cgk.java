public class cgk extends cgm {
   public cgk(bxe $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected eww a(int $$0) {
      this.o = new ewr();
      return new eww(this.o, $$0);
   }

   @Override
   protected boolean a(fei $$0, fei $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bm() || !this.a.bZ();
   }

   @Override
   protected fei b() {
      return this.a.dt();
   }

   @Override
   public ewu a(bwd $$0, int $$1) {
      return this.a($$0.dv(), $$1);
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
            fei $$0 = this.c.a(this.a);
            if (this.a.dz() == azm.a($$0.d) && this.a.dB() == azm.a($$0.e) && this.a.dF() == azm.a($$0.f)) {
               this.c.a();
            }
         }

         agm.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fei $$1 = this.c.a(this.a);
            this.a.L().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public boolean a(iu $$0) {
      return this.b.a_($$0).b(this.b, $$0, this.a);
   }
}

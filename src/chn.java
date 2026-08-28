public class chn extends chp {
   public chn(byh $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected eyq a(int $$0) {
      this.o = new eyl();
      return new eyq(this.o, $$0);
   }

   @Override
   protected boolean a(fgc $$0, fgc $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bl() || !this.a.bY();
   }

   @Override
   protected fgc b() {
      return this.a.dt();
   }

   @Override
   public eyo a(bxe $$0, int $$1) {
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
            fgc $$0 = this.c.a(this.a);
            if (this.a.dz() == azz.a($$0.d) && this.a.dB() == azz.a($$0.e) && this.a.dF() == azz.a($$0.f)) {
               this.c.a();
            }
         }

         agx.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fgc $$1 = this.c.a(this.a);
            this.a.K().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public boolean a(iw $$0) {
      return this.b.a_($$0).b(this.b, $$0, this.a);
   }
}

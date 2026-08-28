public class cfz extends cgb {
   public cfz(bwt $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected evj a(int $$0) {
      this.o = new eve();
      return new evj(this.o, $$0);
   }

   @Override
   protected boolean a(fcu $$0, fcu $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bm() || !this.a.bZ();
   }

   @Override
   protected fcu b() {
      return this.a.dt();
   }

   @Override
   public evh a(bvs $$0, int $$1) {
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
            fcu $$0 = this.c.a(this.a);
            if (this.a.dz() == azk.a($$0.d) && this.a.dB() == azk.a($$0.e) && this.a.dF() == azk.a($$0.f)) {
               this.c.a();
            }
         }

         agj.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fcu $$1 = this.c.a(this.a);
            this.a.L().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public boolean a(jj $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

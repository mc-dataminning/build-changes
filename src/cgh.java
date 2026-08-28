public class cgh extends cgj {
   public cgh(bxb $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected ewl a(int $$0) {
      this.o = new ewg();
      return new ewl(this.o, $$0);
   }

   @Override
   protected boolean a(fdw $$0, fdw $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bm() || !this.a.bZ();
   }

   @Override
   protected fdw b() {
      return this.a.dt();
   }

   @Override
   public ewj a(bwa $$0, int $$1) {
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
            fdw $$0 = this.c.a(this.a);
            if (this.a.dz() == azk.a($$0.d) && this.a.dB() == azk.a($$0.e) && this.a.dF() == azk.a($$0.f)) {
               this.c.a();
            }
         }

         agk.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fdw $$1 = this.c.a(this.a);
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

public class ces extends ceu {
   public ces(bvk $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected etq a(int $$0) {
      this.o = new etl();
      return new etq(this.o, $$0);
   }

   @Override
   protected boolean a(fbb $$0, fbb $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bn() || !this.a.bZ();
   }

   @Override
   protected fbb b() {
      return this.a.dt();
   }

   @Override
   public eto a(bum $$0, int $$1) {
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
            fbb $$0 = this.c.a(this.a);
            if (this.a.dz() == ayz.a($$0.d) && this.a.dB() == ayz.a($$0.e) && this.a.dF() == ayz.a($$0.f)) {
               this.c.a();
            }
         }

         agd.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fbb $$1 = this.c.a(this.a);
            this.a.N().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public boolean a(ji $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

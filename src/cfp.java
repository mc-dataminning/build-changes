public class cfp extends cfr {
   public cfp(bwh $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected eum a(int $$0) {
      this.o = new euh();
      this.o.a(true);
      return new eum(this.o, $$0);
   }

   @Override
   protected boolean a(fbx $$0, fbx $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.a.bn() || !this.a.bZ();
   }

   @Override
   protected fbx b() {
      return this.a.dt();
   }

   @Override
   public euk a(bvj $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.j();
      }

      if (!this.m()) {
         if (this.a()) {
            this.l();
         } else if (this.c != null && !this.c.c()) {
            fbx $$0 = this.c.a(this.a);
            if (this.a.dz() == bae.a($$0.d) && this.a.dB() == bae.a($$0.e) && this.a.dF() == bae.a($$0.f)) {
               this.c.a();
            }
         }

         ahj.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            fbx $$1 = this.c.a(this.a);
            this.a.I().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public boolean d() {
      return this.o.d();
   }

   public void c(boolean $$0) {
      this.o.a($$0);
   }

   public boolean e() {
      return this.o.d();
   }

   @Override
   public boolean a(jh $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

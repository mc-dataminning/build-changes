public class cfi extends cfk {
   public cfi(bwa $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eum a(int $$0) {
      this.o = new euh();
      return new eum(this.o, $$0);
   }

   @Override
   protected boolean a(fbx $$0, fbx $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bl() || !this.a.bY();
   }

   @Override
   protected fbx b() {
      return this.a.ds();
   }

   @Override
   public euk a(bva $$0, int $$1) {
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
            fbx $$0 = this.c.a(this.a);
            if (this.a.dy() == ayz.a($$0.d) && this.a.dA() == ayz.a($$0.e) && this.a.dE() == ayz.a($$0.f)) {
               this.c.a();
            }
         }

         agc.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fbx $$1 = this.c.a(this.a);
            this.a.L().a($$1.d, $$1.e, $$1.f, this.d);
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

public class chc extends che {
   public chc(bxw $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eye a(int $$0) {
      this.o = new exz();
      return new eye(this.o, $$0);
   }

   @Override
   protected boolean a(ffq $$0, ffq $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bl() || !this.a.bY();
   }

   @Override
   protected ffq b() {
      return this.a.dt();
   }

   @Override
   public eyc a(bwt $$0, int $$1) {
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
            ffq $$0 = this.c.a(this.a);
            if (this.a.dz() == azo.a($$0.d) && this.a.dB() == azo.a($$0.e) && this.a.dF() == azo.a($$0.f)) {
               this.c.a();
            }
         }

         ago.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            ffq $$1 = this.c.a(this.a);
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

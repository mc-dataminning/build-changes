public class bph extends bpj {
   public bph(bgb $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected dxv a(int $$0) {
      this.o = new dxq();
      this.o.a(true);
      return new dxv(this.o, $$0);
   }

   @Override
   protected boolean a(eei $$0, eei $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.o() || !this.a.bM();
   }

   @Override
   protected eei b() {
      return this.a.dg();
   }

   @Override
   public dxt a(bfj $$0, int $$1) {
      return this.a($$0.di(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            eei $$0 = this.c.a(this.a);
            if (this.a.dm() == apa.a($$0.c) && this.a.do() == apa.a($$0.d) && this.a.ds() == apa.a($$0.e)) {
               this.c.a();
            }
         }

         za.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eei $$1 = this.c.a(this.a);
            this.a.G().a($$1.c, $$1.d, $$1.e, this.d);
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
   public boolean a(gu $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

public class bse extends bsg {
   public bse(biy $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected eas a(int $$0) {
      this.o = new ean();
      this.o.a(true);
      return new eas(this.o, $$0);
   }

   @Override
   protected boolean a(ehf $$0, ehf $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bb() || !this.a.bN();
   }

   @Override
   protected ehf b() {
      return this.a.di();
   }

   @Override
   public eaq a(big $$0, int $$1) {
      return this.a($$0.dk(), $$1);
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
            ehf $$0 = this.c.a(this.a);
            if (this.a.do() == aro.a($$0.c) && this.a.dq() == aro.a($$0.d) && this.a.du() == aro.a($$0.e)) {
               this.c.a();
            }
         }

         aau.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehf $$1 = this.c.a(this.a);
            this.a.E().a($$1.c, $$1.d, $$1.e, this.d);
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
   public boolean a(gv $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

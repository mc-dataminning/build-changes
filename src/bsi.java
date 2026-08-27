public class bsi extends bsk {
   public bsi(bjd $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected eay a(int $$0) {
      this.o = new eat();
      this.o.a(true);
      return new eay(this.o, $$0);
   }

   @Override
   protected boolean a(ehi $$0, ehi $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bb() || !this.a.bN();
   }

   @Override
   protected ehi b() {
      return this.a.di();
   }

   @Override
   public eaw a(bil $$0, int $$1) {
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
            ehi $$0 = this.c.a(this.a);
            if (this.a.do() == ars.a($$0.c) && this.a.dq() == ars.a($$0.d) && this.a.du() == ars.a($$0.e)) {
               this.c.a();
            }
         }

         aay.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehi $$1 = this.c.a(this.a);
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
   public boolean a(gw $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

public class bsn extends bsp {
   public bsn(bji $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebd a(int $$0) {
      this.o = new eay();
      this.o.a(true);
      return new ebd(this.o, $$0);
   }

   @Override
   protected boolean a(ehn $$0, ehn $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bb() || !this.a.bN();
   }

   @Override
   protected ehn b() {
      return this.a.dj();
   }

   @Override
   public ebb a(biq $$0, int $$1) {
      return this.a($$0.dl(), $$1);
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
            ehn $$0 = this.c.a(this.a);
            if (this.a.dp() == arw.a($$0.c) && this.a.dr() == arw.a($$0.d) && this.a.dv() == arw.a($$0.e)) {
               this.c.a();
            }
         }

         abb.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehn $$1 = this.c.a(this.a);
            this.a.I().a($$1.c, $$1.d, $$1.e, this.d);
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

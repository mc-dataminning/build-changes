public class btq extends bts {
   public btq(bkl $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebv a(int $$0) {
      this.o = new ebq();
      this.o.a(true);
      return new ebv(this.o, $$0);
   }

   @Override
   protected boolean a(eif $$0, eif $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bb() || !this.a.bN();
   }

   @Override
   protected eif b() {
      return this.a.dj();
   }

   @Override
   public ebt a(bjt $$0, int $$1) {
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
            eif $$0 = this.c.a(this.a);
            if (this.a.dp() == asy.a($$0.c) && this.a.dr() == asy.a($$0.d) && this.a.dv() == asy.a($$0.e)) {
               this.c.a();
            }
         }

         abz.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eif $$1 = this.c.a(this.a);
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
   public boolean a(ht $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

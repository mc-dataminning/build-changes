public class byg extends byi {
   public byg(boz $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected eii a(int $$0) {
      this.o = new eid();
      this.o.a(true);
      return new eii(this.o, $$0);
   }

   @Override
   protected boolean a(eov $$0, eov $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bd() || !this.a.bL();
   }

   @Override
   protected eov b() {
      return this.a.dh();
   }

   @Override
   public eig a(bof $$0, int $$1) {
      return this.a($$0.dj(), $$1);
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
            eov $$0 = this.c.a(this.a);
            if (this.a.dn() == awm.a($$0.c) && this.a.dp() == awm.a($$0.d) && this.a.dt() == awm.a($$0.e)) {
               this.c.a();
            }
         }

         aes.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eov $$1 = this.c.a(this.a);
            this.a.K().a($$1.c, $$1.d, $$1.e, this.d);
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
   public boolean a(ib $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

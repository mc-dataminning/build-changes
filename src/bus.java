public class bus extends buu {
   public bus(bln $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected edo a(int $$0) {
      this.o = new edj();
      this.o.a(true);
      return new edo(this.o, $$0);
   }

   @Override
   protected boolean a(ejz $$0, ejz $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bd() || !this.a.bO();
   }

   @Override
   protected ejz b() {
      return this.a.dl();
   }

   @Override
   public edm a(bkv $$0, int $$1) {
      return this.a($$0.dn(), $$1);
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
            ejz $$0 = this.c.a(this.a);
            if (this.a.dr() == atq.a($$0.c) && this.a.dt() == atq.a($$0.d) && this.a.dx() == atq.a($$0.e)) {
               this.c.a();
            }
         }

         aco.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ejz $$1 = this.c.a(this.a);
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
   public boolean a(hx $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

public class bsg extends bsi {
   public bsg(bja $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected eau a(int $$0) {
      this.o = new eap();
      this.o.a(true);
      return new eau(this.o, $$0);
   }

   @Override
   protected boolean a(ehe $$0, ehe $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bb() || !this.a.bN();
   }

   @Override
   protected ehe b() {
      return this.a.di();
   }

   @Override
   public eas a(bii $$0, int $$1) {
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
            ehe $$0 = this.c.a(this.a);
            if (this.a.do() == arp.a($$0.c) && this.a.dq() == arp.a($$0.d) && this.a.du() == arp.a($$0.e)) {
               this.c.a();
            }
         }

         aav.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehe $$1 = this.c.a(this.a);
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
   public boolean a(gu $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

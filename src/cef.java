public class cef extends ceh {
   public cef(bux $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected eru a(int $$0) {
      this.o = new erp();
      this.o.a(true);
      return new eru(this.o, $$0);
   }

   @Override
   protected boolean a(ezh $$0, ezh $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.a.bo() || !this.a.ca();
   }

   @Override
   protected ezh b() {
      return this.a.dv();
   }

   @Override
   public ers a(btz $$0, int $$1) {
      return this.a($$0.dx(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.j();
      }

      if (!this.m()) {
         if (this.a()) {
            this.l();
         } else if (this.c != null && !this.c.c()) {
            ezh $$0 = this.c.a(this.a);
            if (this.a.dB() == azj.a($$0.d) && this.a.dD() == azj.a($$0.e) && this.a.dH() == azj.a($$0.f)) {
               this.c.a();
            }
         }

         agr.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            ezh $$1 = this.c.a(this.a);
            this.a.M().a($$1.d, $$1.e, $$1.f, this.d);
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
   public boolean a(jg $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

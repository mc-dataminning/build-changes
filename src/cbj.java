public class cbj extends cbl {
   public cbj(bsc $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected emq a(int $$0) {
      this.o = new eml();
      this.o.a(true);
      return new emq(this.o, $$0);
   }

   @Override
   protected boolean a(etp $$0, etp $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bg() || !this.a.bP();
   }

   @Override
   protected etp b() {
      return this.a.dl();
   }

   @Override
   public emo a(brh $$0, int $$1) {
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
            etp $$0 = this.c.a(this.a);
            if (this.a.dr() == axz.a($$0.c) && this.a.dt() == axz.a($$0.d) && this.a.dx() == axz.a($$0.e)) {
               this.c.a();
            }
         }

         afw.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            etp $$1 = this.c.a(this.a);
            this.a.H().a($$1.c, $$1.d, $$1.e, this.d);
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
   public boolean a(in $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}

public class coz extends cpd {
   private final cnx a;
   private final ckl b;
   private int c;

   public coz(ckl $$0, cnx $$1, boj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(csd $$0) {
      return false;
   }

   @Override
   public csd a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(csd $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(csd $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dN(), this.b, this.c);
      }

      if (this.d instanceof cox $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(ckl $$0, csd $$1) {
      this.b_($$1);
      je<csd> $$2 = $$0.dN().r().c(cwl.a, this.a, $$0.dN());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         csd $$4 = this.a.a($$3);
         csd $$5 = $$2.get($$3);
         if (!$$4.d()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.d()) {
            if ($$4.d()) {
               this.a.a($$3, $$5);
            } else if (csd.c($$4, $$5)) {
               $$5.f($$4.G());
               this.a.a($$3, $$5);
            } else if (!this.b.ga().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}

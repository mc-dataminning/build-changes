public class css extends csw {
   private final crr a;
   private final cnx b;
   private int g;

   public css(cnx $$0, crr $$1, brl $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cvs $$0) {
      return false;
   }

   @Override
   public cvs a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().K());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cvs $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cvs $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dS(), this.b, this.g);
      }

      if (this.c instanceof csq $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cnx $$0, cvs $$1) {
      this.b_($$1);
      czz.a $$2 = this.a.aE_();
      czz $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jx<cvs> $$6 = $$0.dS().r().c(daq.a, $$3, $$0.dS());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.aA_();
            cvs $$10 = this.a.a($$9);
            cvs $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (cvs.c($$10, $$11)) {
                  $$11.g($$10.K());
                  this.a.a($$9, $$11);
               } else if (!this.b.gd().f($$11)) {
                  this.b.a($$11, false);
               }
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}

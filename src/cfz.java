public class cfz extends cgd {
   private final cez a;
   private final cbu b;
   private int c;

   public cfz(cbu $$0, cez $$1, bgr $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cjf $$0) {
      return false;
   }

   @Override
   public cjf a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cjf $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cjf $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dL(), this.b, this.c);
      }

      if (this.d instanceof cfx $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cbu $$0, cjf $$1) {
      this.b_($$1);
      hp<cjf> $$2 = $$0.dL().q().c(cmn.a, this.a, $$0.dL());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cjf $$4 = this.a.a($$3);
         cjf $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cjf.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fR().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}

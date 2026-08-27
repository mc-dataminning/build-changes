public class chd extends chh {
   private final cgd a;
   private final ccx b;
   private int c;

   public chd(ccx $$0, cgd $$1, bhu $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(ckj $$0) {
      return false;
   }

   @Override
   public ckj a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(ckj $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(ckj $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dL(), this.b, this.c);
      }

      if (this.d instanceof chb $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(ccx $$0, ckj $$1) {
      this.b_($$1);
      il<ckj> $$2 = $$0.dL().q().c(cnr.a, this.a, $$0.dL());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ckj $$4 = this.a.a($$3);
         ckj $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (ckj.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fS().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}

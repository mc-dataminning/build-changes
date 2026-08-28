public class cqw extends cra {
   private final cpv a;
   private final cmh b;
   private int g;

   public cqw(cmh $$0, cpv $$1, bpw $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cua $$0) {
      return false;
   }

   @Override
   public cua a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cua $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cua $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dP(), this.b, this.g);
      }

      if (this.c instanceof cqu $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cmh $$0, cua $$1) {
      this.b_($$1);
      js<cua> $$2 = $$0.dP().r().c(cym.a, this.a.aA_(), $$0.dP());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cua $$4 = this.a.a($$3);
         cua $$5 = $$2.get($$3);
         if (!$$4.e()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.e()) {
            if ($$4.e()) {
               this.a.a($$3, $$5);
            } else if (cua.c($$4, $$5)) {
               $$5.g($$4.H());
               this.a.a($$3, $$5);
            } else if (!this.b.fY().f($$5)) {
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

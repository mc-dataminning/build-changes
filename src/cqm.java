public class cqm extends cqq {
   private final cpl a;
   private final cly b;
   private int g;

   public cqm(cly $$0, cpl $$1, bpp $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(ctq $$0) {
      return false;
   }

   @Override
   public ctq a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(ctq $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(ctq $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dP(), this.b, this.g);
      }

      if (this.c instanceof cqk $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cly $$0, ctq $$1) {
      this.b_($$1);
      jg<ctq> $$2 = $$0.dP().r().c(cyb.a, this.a, $$0.dP());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ctq $$4 = this.a.a($$3);
         ctq $$5 = $$2.get($$3);
         if (!$$4.e()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.e()) {
            if ($$4.e()) {
               this.a.a($$3, $$5);
            } else if (ctq.c($$4, $$5)) {
               $$5.g($$4.I());
               this.a.a($$3, $$5);
            } else if (!this.b.gc().f($$5)) {
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

public class crk extends cro {
   private final cqj a;
   private final cmw b;
   private int g;

   public crk(cmw $$0, cqj $$1, bqm $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cuo $$0) {
      return false;
   }

   @Override
   public cuo a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuo $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cuo $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dP(), this.b, this.g);
      }

      if (this.c instanceof cri $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cmw $$0, cuo $$1) {
      this.b_($$1);
      jr<cuo> $$2 = $$0.dP().r().c(cyz.a, this.a, $$0.dP());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cuo $$4 = this.a.a($$3);
         cuo $$5 = $$2.get($$3);
         if (!$$4.e()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.e()) {
            if ($$4.e()) {
               this.a.a($$3, $$5);
            } else if (cuo.c($$4, $$5)) {
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

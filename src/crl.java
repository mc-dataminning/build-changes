public class crl extends crp {
   private final cqk a;
   private final cmx b;
   private int g;

   public crl(cmx $$0, cqk $$1, bqn $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cup $$0) {
      return false;
   }

   @Override
   public cup a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cup $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cup $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dP(), this.b, this.g);
      }

      if (this.c instanceof crj $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cmx $$0, cup $$1) {
      this.b_($$1);
      jr<cup> $$2 = $$0.dP().r().c(cza.a, this.a, $$0.dP());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cup $$4 = this.a.a($$3);
         cup $$5 = $$2.get($$3);
         if (!$$4.e()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.e()) {
            if ($$4.e()) {
               this.a.a($$3, $$5);
            } else if (cup.c($$4, $$5)) {
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

public class crn extends crr {
   private final cqm a;
   private final cmz b;
   private int g;

   public crn(cmz $$0, cqm $$1, bqp $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cur $$0) {
      return false;
   }

   @Override
   public cur a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cur $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cur $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dP(), this.b, this.g);
      }

      if (this.c instanceof crl $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   @Override
   public void a(cmz $$0, cur $$1) {
      this.b_($$1);
      jr<cur> $$2 = $$0.dP().r().c(czc.a, this.a, $$0.dP());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cur $$4 = this.a.a($$3);
         cur $$5 = $$2.get($$3);
         if (!$$4.e()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.e()) {
            if ($$4.e()) {
               this.a.a($$3, $$5);
            } else if (cur.c($$4, $$5)) {
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

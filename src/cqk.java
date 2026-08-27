public class cqk extends cqo {
   private final cpj a;
   private final clw b;
   private int c;

   public cqk(clw $$0, cpj $$1, bpn $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cto $$0) {
      return false;
   }

   @Override
   public cto a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cto $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cto $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dP(), this.b, this.c);
      }

      if (this.d instanceof cqi $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(clw $$0, cto $$1) {
      this.b_($$1);
      jg<cto> $$2 = $$0.dP().r().c(cxz.a, this.a, $$0.dP());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cto $$4 = this.a.a($$3);
         cto $$5 = $$2.get($$3);
         if (!$$4.e()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.e()) {
            if ($$4.e()) {
               this.a.a($$3, $$5);
            } else if (cto.c($$4, $$5)) {
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

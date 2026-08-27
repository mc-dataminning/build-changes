public class cct extends ccx {
   private final cbt a;
   private final byo b;
   private int c;

   public cct(byo $$0, cbt $$1, bdq $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cfz $$0) {
      return false;
   }

   @Override
   public cfz a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cfz $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cfz $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dI(), this.b, this.c);
      }

      if (this.d instanceof ccr $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(byo $$0, cfz $$1) {
      this.b_($$1);
      hn<cfz> $$2 = $$0.dI().q().c(cjf.a, this.a, $$0.dI());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cfz $$4 = this.a.a($$3);
         cfz $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cfz.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fN().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}

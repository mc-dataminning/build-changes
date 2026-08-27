public class cka extends cke {
   private final ciz a;
   private final cfq b;
   private int c;

   public cka(cfq $$0, ciz $$1, bjv $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cng $$0) {
      return false;
   }

   @Override
   public cng a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cng $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cng $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dL(), this.b, this.c);
      }

      if (this.d instanceof cjy $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cfq $$0, cng $$1) {
      this.b_($$1);
      iq<cng> $$2 = $$0.dL().r().c(cqp.a, this.a, $$0.dL());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cng $$4 = this.a.a($$3);
         cng $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cng.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fS().e($$5)) {
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

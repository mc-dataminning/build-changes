public class chv extends chz {
   private final cgu a;
   private final cdm b;
   private int c;

   public chv(cdm $$0, cgu $$1, bij $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(clb $$0) {
      return false;
   }

   @Override
   public clb a(int $$0) {
      if (this.g()) {
         this.c = this.c + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(clb $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(clb $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dL(), this.b, this.c);
      }

      if (this.d instanceof cht $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cdm $$0, clb $$1) {
      this.b_($$1);
      il<clb> $$2 = $$0.dL().q().c(cok.a, this.a, $$0.dL());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         clb $$4 = this.a.a($$3);
         clb $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (clb.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fS().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}

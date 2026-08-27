public class cfr extends cfv {
   private final cer a;
   private final cbm b;
   private int c;

   public cfr(cbm $$0, cer $$1, bgj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cix $$0) {
      return false;
   }

   @Override
   public cix a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cix $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cix $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dK(), this.b, this.c);
      }

      if (this.d instanceof cfp $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cbm $$0, cix $$1) {
      this.b_($$1);
      hn<cix> $$2 = $$0.dK().q().c(cmd.a, this.a, $$0.dK());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cix $$4 = this.a.a($$3);
         cix $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cix.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fQ().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }
}

public class cpv extends cpz {
   private final cou a;
   private final clh b;
   private int c;

   public cpv(clh $$0, cou $$1, bpf $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(csz $$0) {
      return false;
   }

   @Override
   public csz a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(csz $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(csz $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dN(), this.b, this.c);
      }

      if (this.d instanceof cpt $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(clh $$0, csz $$1) {
      this.b_($$1);
      jf<csz> $$2 = $$0.dN().r().c(cxi.a, this.a, $$0.dN());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         csz $$4 = this.a.a($$3);
         csz $$5 = $$2.get($$3);
         if (!$$4.d()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.d()) {
            if ($$4.d()) {
               this.a.a($$3, $$5);
            } else if (csz.c($$4, $$5)) {
               $$5.g($$4.G());
               this.a.a($$3, $$5);
            } else if (!this.b.ga().f($$5)) {
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

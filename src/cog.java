public class cog extends cok {
   private final cnf a;
   private final cjt b;
   private int c;

   public cog(cjt $$0, cnf $$1, bnt $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(crj $$0) {
      return false;
   }

   @Override
   public crj a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(crj $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(crj $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dM(), this.b, this.c);
      }

      if (this.d instanceof coe $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cjt $$0, crj $$1) {
      this.b_($$1);
      iu<crj> $$2 = $$0.dM().r().c(cvo.a, this.a, $$0.dM());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         crj $$4 = this.a.a($$3);
         crj $$5 = $$2.get($$3);
         if (!$$4.d()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.d()) {
            if ($$4.d()) {
               this.a.a($$3, $$5);
            } else if (crj.c($$4, $$5)) {
               $$5.f($$4.G());
               this.a.a($$3, $$5);
            } else if (!this.b.fZ().e($$5)) {
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

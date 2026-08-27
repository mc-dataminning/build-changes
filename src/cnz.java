public class cnz extends cok {
   private final cnx a;
   private final cjt b;
   private int c;
   private final cxu h;

   public cnz(cjt $$0, cxu $$1, cnx $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
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
   protected void b_(crj $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cjt $$0, crj $$1) {
      this.b_($$1);
      cxv $$2 = this.a.g();
      if ($$2 != null) {
         crj $$3 = this.a.a(0);
         crj $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(auw.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}

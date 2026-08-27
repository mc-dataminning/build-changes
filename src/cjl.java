public class cjl extends cjw {
   private final cjj a;
   private final cfi b;
   private int c;
   private final csm h;

   public cjl(cfi $$0, csm $$1, cjj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cmy $$0) {
      return false;
   }

   @Override
   public cmy a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cmy $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmy $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cfi $$0, cmy $$1) {
      this.b_($$1);
      csn $$2 = this.a.g();
      if ($$2 != null) {
         cmy $$3 = this.a.a(0);
         cmy $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(asc.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}

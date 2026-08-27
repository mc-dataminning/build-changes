public class cjt extends cke {
   private final cjr a;
   private final cfq b;
   private int c;
   private final csu h;

   public cjt(cfq $$0, csu $$1, cjr $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
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
   protected void b_(cng $$0) {
      $$0.a(this.b.dL(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cfq $$0, cng $$1) {
      this.b_($$1);
      csv $$2 = this.a.g();
      if ($$2 != null) {
         cng $$3 = this.a.a(0);
         cng $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(asd.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}

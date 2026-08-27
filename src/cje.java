public class cje extends cjp {
   private final cjc a;
   private final cfb b;
   private int c;
   private final csf h;

   public cje(cfb $$0, csf $$1, cjc $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cmr $$0) {
      return false;
   }

   @Override
   public cmr a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cmr $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmr $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cfb $$0, cmr $$1) {
      this.b_($$1);
      csg $$2 = this.a.g();
      if ($$2 != null) {
         cmr $$3 = this.a.a(0);
         cmr $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(arw.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}

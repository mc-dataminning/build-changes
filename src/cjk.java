public class cjk extends cjv {
   private final cji a;
   private final cfh b;
   private int c;
   private final csl h;

   public cjk(cfh $$0, csl $$1, cji $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cmx $$0) {
      return false;
   }

   @Override
   public cmx a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cmx $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmx $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cfh $$0, cmx $$1) {
      this.b_($$1);
      csm $$2 = this.a.g();
      if ($$2 != null) {
         cmx $$3 = this.a.a(0);
         cmx $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(asb.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}

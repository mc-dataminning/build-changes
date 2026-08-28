public class cwr extends cxp {
   private final crz a;
   private int b;

   public cwr(crz $$0, bum $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(daa $$0) {
      return false;
   }

   @Override
   public daa a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(crz $$0, daa $$1) {
      this.c_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(daa $$0, int $$1) {
      this.b += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(daa $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof arv $$1 && this.c instanceof dxr $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}

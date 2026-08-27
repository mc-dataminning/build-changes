public class cml extends cnj {
   private final cis a;
   private int b;

   public cml(cis $$0, bmv $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cqk $$0) {
      return false;
   }

   @Override
   public cqk a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cis $$0, cqk $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cqk $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cqk $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof apg $$1 && this.d instanceof djv $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}

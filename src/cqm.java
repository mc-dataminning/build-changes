public class cqm extends crk {
   private final cms a;
   private int b;

   public cqm(cms $$0, bqi $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cuk $$0) {
      return false;
   }

   @Override
   public cuk a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   public void a(cms $$0, cuk $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cuk $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuk $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof arc $$1 && this.c instanceof doq $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}

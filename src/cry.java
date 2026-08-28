public class cry extends csw {
   private final cnx a;
   private int b;

   public cry(cnx $$0, brl $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cvs $$0) {
      return false;
   }

   @Override
   public cvs a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().K());
      }

      return super.a($$0);
   }

   @Override
   public void a(cnx $$0, cvs $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cvs $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cvs $$0) {
      $$0.a(this.a.dS(), this.a, this.b);
      if (this.a instanceof ark $$1 && this.c instanceof drj $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}

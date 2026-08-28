public class csl extends csw {
   private final csj a;
   private final cnx b;
   private int g;
   private final ddf h;

   public csl(cnx $$0, ddf $$1, csj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cvs $$0) {
      return false;
   }

   @Override
   public cvs a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().K());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cvs $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cvs $$0) {
      $$0.a(this.b.dS(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cnx $$0, cvs $$1) {
      this.b_($$1);
      ddg $$2 = this.a.g();
      if ($$2 != null) {
         cvs $$3 = this.a.a(0);
         cvs $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awq.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}

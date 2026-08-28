public class ctn extends cty {
   private final ctl a;
   private final cow b;
   private int g;
   private final dfd h;

   public ctn(cow $$0, dfd $$1, ctl $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwo $$0) {
      return false;
   }

   @Override
   public cwo a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwo $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwo $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cow $$0, cwo $$1) {
      this.b_($$1);
      dfe $$2 = this.a.g();
      if ($$2 != null) {
         cwo $$3 = this.a.a(0);
         cwo $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.x() + $$2.q());
      }
   }
}

public class chw extends cih {
   private final chu a;
   private final cdu b;
   private int c;
   private final cqx h;

   public chw(cdu $$0, cqx $$1, chu $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(clj $$0) {
      return false;
   }

   @Override
   public clj a(int $$0) {
      if (this.g()) {
         this.c = this.c + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(clj $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(clj $$0) {
      $$0.a(this.b.dN(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cdu $$0, clj $$1) {
      this.b_($$1);
      cqy $$2 = this.a.g();
      if ($$2 != null) {
         clj $$3 = this.a.a(0);
         clj $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(arb.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}

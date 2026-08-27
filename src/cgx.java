public class cgx extends chh {
   private final cgv a;
   private final ccx b;
   private int c;
   private final cpw h;

   public cgx(ccx $$0, cpw $$1, cgv $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(ckj $$0) {
      return false;
   }

   @Override
   public ckj a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(ckj $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(ckj $$0) {
      $$0.a(this.b.dL(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(ccx $$0, ckj $$1) {
      this.b_($$1);
      cpx $$2 = this.a.g();
      if ($$2 != null) {
         ckj $$3 = this.a.a(0);
         ckj $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(aqn.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.o());
      }
   }
}

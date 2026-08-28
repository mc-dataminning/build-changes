public abstract class ciu extends bxd {
   private static final int cd = 100;
   private int ce;

   protected ciu(bvr<? extends ciu> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public boolean b(asi $$0) {
      ux $$1 = new ux();
      $$1.a("id", this.bK());
      this.f($$1);
      if ($$0.h($$1)) {
         this.at();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void h() {
      this.ce++;
      super.h();
   }

   public boolean gE() {
      return this.ce > 100;
   }
}

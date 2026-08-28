public abstract class ckm extends byq {
   private static final int bM = 100;
   private int bN;

   protected ckm(bxc<? extends ckm> $$0, djx $$1) {
      super($$0, $$1);
   }

   public boolean b(art $$0) {
      tz $$1 = new tz();
      $$1.a("id", this.bI());
      this.h($$1);
      if ($$0.j($$1)) {
         this.aq();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void h() {
      this.bN++;
      super.h();
   }

   public boolean gK() {
      return this.bN > 100;
   }
}

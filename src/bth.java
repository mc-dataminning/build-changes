public class bth extends cge {
   private static final akk<Integer> cc = ako.a(bth.class, akm.b);

   public bth(bta<? extends bth> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected lg s() {
      return li.aP;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   protected avz u() {
      return awa.kJ;
   }

   @Override
   protected avz v() {
      return awa.kG;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.kI;
   }

   @Override
   protected avz o_() {
      return awa.kH;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void n_() {
      super.n_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dP().a(li.aQ, this.d(0.6), this.dx(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(cc, $$0);
   }

   public int y() {
      return this.ao.a(cc);
   }

   public static boolean a(bta<? extends btp> $$0, dcn $$1, btt $$2, iz $$3, azh $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfb.G);
   }
}

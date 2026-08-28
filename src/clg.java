import javax.annotation.Nullable;

public class clg extends cle implements bvw {
   private static final int b = 50;
   private static final int c = 70;
   private static final ajx<Boolean> d = akb.a(clg.class, ajz.k);
   public static final String a = "sheared";

   public static bwm.a gr() {
      return cle.m().a(bwn.s, 16.0);
   }

   public clg(buq<? extends clg> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("sheared", this.gs());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gs() {
      return this.al.a(d);
   }

   public void x(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.sS) && this.a()) {
         if (this.dW() instanceof arc $$3) {
            this.a($$3, awa.h, $$2);
            this.a(ebr.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsi.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avy u() {
      return avz.cn;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.cp;
   }

   @Override
   protected avy o_() {
      return avz.co;
   }

   @Override
   protected avy p() {
      return avz.cr;
   }

   @Override
   protected cpc a(cwn $$0, float $$1, @Nullable cwn $$2) {
      cpc $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpe $$4) {
         $$4.a(new bto(btq.s, 100));
      }

      return $$3;
   }

   @Override
   protected int x() {
      return 50;
   }

   @Override
   protected int gp() {
      return 70;
   }

   @Override
   public void a(arc $$0, awa $$1, cwn $$2) {
      $$0.a(null, this, avz.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(arc $$0, cwn $$1) {
      this.a($$0, evl.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.ds()));
   }

   @Override
   public boolean a() {
      return !this.gs() && this.bL();
   }
}

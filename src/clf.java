import javax.annotation.Nullable;

public class clf extends cld implements bvv {
   private static final int c = 50;
   private static final int d = 70;
   private static final ako<Boolean> e = aks.a(clf.class, akq.k);
   public static final String b = "sheared";

   public static bwl.a gy() {
      return cld.q().a(bwm.s, 16.0);
   }

   public clf(bup<? extends clf> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("sheared", this.gz());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gz() {
      return this.am.a(e);
   }

   public void x(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.sm) && this.a()) {
         this.a(awp.h, $$2);
         this.a(eak.M, $$0);
         if (!this.dY().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awn w() {
      return awo.cn;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.cp;
   }

   @Override
   protected awn o_() {
      return awo.co;
   }

   @Override
   protected awn t() {
      return awo.cr;
   }

   @Override
   protected coy a(cwf $$0, float $$1, @Nullable cwf $$2) {
      coy $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpa $$4) {
         $$4.a(new btn(btp.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gv() {
      return 50;
   }

   @Override
   protected int gw() {
      return 70;
   }

   @Override
   public void a(awp $$0, cwf $$1) {
      this.dY().a(null, this, awo.cq, $$0, 1.0F, 1.0F);
      this.k($$1);
      this.x(true);
   }

   private void k(cwf $$0) {
      this.a(euc.aQ, $$0, $$0x -> this.a($$0x, this.du()));
   }

   @Override
   public boolean a() {
      return !this.gz() && this.bN();
   }
}

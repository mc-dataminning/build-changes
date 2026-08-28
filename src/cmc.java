import javax.annotation.Nullable;

public class cmc extends cma implements bwp {
   private static final int b = 50;
   private static final int c = 70;
   private static final ajx<Boolean> d = akb.a(cmc.class, ajz.k);
   public static final String a = "sheared";

   public static bxf.a gs() {
      return cma.j().a(bxg.s, 16.0);
   }

   public cmc(bvi<? extends cmc> $$0, dgz $$1) {
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
      $$0.a("sheared", this.gt());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gt() {
      return this.al.a(d);
   }

   public void w(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.sU) && this.a()) {
         if (this.dU() instanceof ard $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ecp.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz u() {
      return awa.cn;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.cp;
   }

   @Override
   protected avz l_() {
      return awa.co;
   }

   @Override
   protected avz m() {
      return awa.cr;
   }

   @Override
   protected cpy a(cxh $$0, float $$1, @Nullable cxh $$2) {
      cpy $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqa $$4) {
         $$4.a(new bue(bug.s, 100));
      }

      return $$3;
   }

   @Override
   protected int q() {
      return 50;
   }

   @Override
   protected int t() {
      return 70;
   }

   @Override
   public void a(ard $$0, awb $$1, cxh $$2) {
      $$0.a(null, this, awa.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(ard $$0, cxh $$1) {
      this.a($$0, ewk.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dq()));
   }

   @Override
   public boolean a() {
      return !this.gt() && this.bJ();
   }
}

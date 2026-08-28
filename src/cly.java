import javax.annotation.Nullable;

public class cly extends clw implements bwo {
   private static final int b = 50;
   private static final int c = 70;
   private static final aks<Boolean> d = akw.a(cly.class, aku.k);
   public static final String a = "sheared";

   public static bxe.a gq() {
      return clw.m().a(bxf.s, 16.0);
   }

   public cly(bvi<? extends cly> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gr() {
      return this.al.a(d);
   }

   public void x(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.sS) && this.a()) {
         if (this.dW() instanceof arx $$3) {
            this.a($$3, aww.h, $$2);
            this.a(eck.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awu u() {
      return awv.cn;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.cp;
   }

   @Override
   protected awu o_() {
      return awv.co;
   }

   @Override
   protected awu p() {
      return awv.cr;
   }

   @Override
   protected cpv a(cxg $$0, float $$1, @Nullable cxg $$2) {
      cpv $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpx $$4) {
         $$4.a(new bug(bui.s, 100));
      }

      return $$3;
   }

   @Override
   protected int x() {
      return 50;
   }

   @Override
   protected int go() {
      return 70;
   }

   @Override
   public void a(arx $$0, aww $$1, cxg $$2) {
      $$0.a(null, this, awv.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(arx $$0, cxg $$1) {
      this.a($$0, ewe.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.ds()));
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bL();
   }
}

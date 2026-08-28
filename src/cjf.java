import java.util.List;

public class cjf extends cjm {
   public static final float b = bsm.D.l() / bsm.Y.l();
   private static final int e = 1200;
   private static final int ca = 50;
   private static final int cb = 6000;
   private static final int cc = 2;
   private static final int cd = 1200;

   public cjf(bsm<? extends cjf> $$0, dcf $$1) {
      super($$0, $$1);
      this.fR();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bui.a s() {
      return cjm.go().a(buj.v, 0.3F).a(buj.c, 8.0).a(buj.s, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avg v() {
      return this.bi() ? avh.hO : avh.hP;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.bi() ? avh.hU : avh.hV;
   }

   @Override
   protected avg o_() {
      return this.bi() ? avh.hR : avh.hS;
   }

   @Override
   protected avg y() {
      return avh.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.am()) % 1200 == 0) {
         bro $$0 = new bro(brq.d, 6000, 2);
         List<aqn> $$1 = brp.a((aqm)this.dQ(), this, this.do(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new acu(acu.l, this.aX() ? 0.0F : 1.0F)));
      }

      if (!this.fY()) {
         this.a(this.dq(), 16);
      }
   }
}

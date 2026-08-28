import java.util.List;

public class cjq extends cjx {
   public static final float b = bsw.D.l() / bsw.Y.l();
   private static final int e = 1200;
   private static final int ca = 50;
   private static final int cb = 6000;
   private static final int cc = 2;
   private static final int cd = 1200;

   public cjq(bsw<? extends cjq> $$0, dcu $$1) {
      super($$0, $$1);
      this.fP();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static but.a s() {
      return cjx.gm().a(buu.v, 0.3F).a(buu.c, 8.0).a(buu.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected avn v() {
      return this.bi() ? avo.hO : avo.hP;
   }

   @Override
   protected avn d(brj $$0) {
      return this.bi() ? avo.hU : avo.hV;
   }

   @Override
   protected avn n_() {
      return this.bi() ? avo.hR : avo.hS;
   }

   @Override
   protected avn x() {
      return avo.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.an()) % 1200 == 0) {
         bry $$0 = new bry(bsa.d, 6000, 2);
         List<aqu> $$1 = brz.a((aqt)this.dQ(), this, this.do(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new ada(ada.l, this.aX() ? 0.0F : 1.0F)));
      }

      if (!this.fW()) {
         this.a(this.dq(), 16);
      }
   }
}

import java.util.List;

public class cks extends ckz {
   public static final float b = bty.D.l() / bty.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cks(bty<? extends cks> $$0, dej $$1) {
      super($$0, $$1);
      this.fW();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bvt.a q() {
      return ckz.go().a(bvu.v, 0.3F).a(bvu.c, 8.0).a(bvu.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected awf w() {
      return this.bl() ? awg.hP : awg.hQ;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.bl() ? awg.hV : awg.hW;
   }

   @Override
   protected awf o_() {
      return this.bl() ? awg.hS : awg.hT;
   }

   @Override
   protected awf y() {
      return awg.hU;
   }

   @Override
   protected void ac() {
      super.ac();
      if ((this.ag + this.ap()) % 1200 == 0) {
         bsy $$0 = new bsy(bta.d, 6000, 2);
         List<ark> $$1 = bsz.a((arj)this.dS(), this, this.dq(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adh(adh.l, this.ba() ? 0.0F : 1.0F)));
      }

      if (!this.gc()) {
         this.a(this.ds(), 16);
      }
   }
}

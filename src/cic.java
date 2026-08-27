import java.util.List;

public class cic extends cij {
   public static final float b = brn.D.k() / brn.Y.k();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cic(brn<? extends cic> $$0, dad $$1) {
      super($$0, $$1);
      this.fT();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static btg.a r() {
      return cij.gp().a(bth.r, 0.3F).a(bth.c, 8.0).a(bth.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avb v() {
      return this.bf() ? avc.hJ : avc.hK;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.bf() ? avc.hP : avc.hQ;
   }

   @Override
   protected avb o_() {
      return this.bf() ? avc.hM : avc.hN;
   }

   @Override
   protected avb y() {
      return avc.hO;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ai + this.aj()) % 1200 == 0) {
         bqt $$0 = new bqt(bqv.d, 6000, 2);
         List<aqi> $$1 = bqu.a((aqh)this.dN(), this, this.dl(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new act(act.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.ga()) {
         this.a(this.dn(), 16);
      }
   }
}

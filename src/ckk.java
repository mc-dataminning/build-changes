import java.util.List;

public class ckk extends ckr {
   public static final float b = btq.D.l() / btq.Y.l();
   private static final int e = 1200;
   private static final int bZ = 50;
   private static final int ca = 6000;
   private static final int cb = 2;
   private static final int cc = 1200;

   public ckk(btq<? extends ckk> $$0, dds $$1) {
      super($$0, $$1);
      this.fV();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bvl.a q() {
      return ckr.go().a(bvm.v, 0.3F).a(bvm.c, 8.0).a(bvm.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected awc w() {
      return this.bl() ? awd.hP : awd.hQ;
   }

   @Override
   protected awc d(bsb $$0) {
      return this.bl() ? awd.hV : awd.hW;
   }

   @Override
   protected awc n_() {
      return this.bl() ? awd.hS : awd.hT;
   }

   @Override
   protected awc y() {
      return awd.hU;
   }

   @Override
   protected void ad() {
      super.ad();
      if ((this.ag + this.ap()) % 1200 == 0) {
         bsq $$0 = new bsq(bss.d, 6000, 2);
         List<arh> $$1 = bsr.a((arg)this.dS(), this, this.dq(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adg(adg.l, this.ba() ? 0.0F : 1.0F)));
      }

      if (!this.gc()) {
         this.a(this.ds(), 16);
      }
   }
}

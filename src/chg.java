import java.util.List;

public class chg extends chn {
   public static final float b = bqr.D.k() / bqr.Y.k();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public chg(bqr<? extends chg> $$0, czu $$1) {
      super($$0, $$1);
      this.fT();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bsk.a r() {
      return chn.gp().a(bsl.r, 0.3F).a(bsl.c, 8.0).a(bsl.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected auy v() {
      return this.bf() ? auz.hJ : auz.hK;
   }

   @Override
   protected auy d(bpj $$0) {
      return this.bf() ? auz.hP : auz.hQ;
   }

   @Override
   protected auy o_() {
      return this.bf() ? auz.hM : auz.hN;
   }

   @Override
   protected auy y() {
      return auz.hO;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ai + this.aj()) % 1200 == 0) {
         bpx $$0 = new bpx(bpz.d, 6000, 2);
         List<aqf> $$1 = bpy.a((aqe)this.dN(), this, this.dl(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new acr(acr.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.ga()) {
         this.a(this.dn(), 16);
      }
   }
}

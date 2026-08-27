import java.util.List;

public class cgo extends cgv {
   public static final float b = bqb.D.k() / bqb.Y.k();
   private static final int e = 1200;
   private static final int bX = 50;
   private static final int bY = 6000;
   private static final int bZ = 2;
   private static final int ca = 1200;

   public cgo(bqb<? extends cgo> $$0, cyx $$1) {
      super($$0, $$1);
      this.fS();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bru.a r() {
      return cgv.gn().a(brv.r, 0.3F).a(brv.c, 8.0).a(brv.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected aul v() {
      return this.bf() ? aum.hJ : aum.hK;
   }

   @Override
   protected aul d(bot $$0) {
      return this.bf() ? aum.hP : aum.hQ;
   }

   @Override
   protected aul o_() {
      return this.bf() ? aum.hM : aum.hN;
   }

   @Override
   protected aul y() {
      return aum.hO;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bph $$0 = new bph(bpj.d, 6000, 2);
         List<apt> $$1 = bpi.a((aps)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new acf(acf.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fZ()) {
         this.a(this.dm(), 16);
      }
   }
}

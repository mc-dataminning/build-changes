import java.util.List;

public class cgv extends chc {
   public static final float b = bqg.D.k() / bqg.Y.k();
   private static final int e = 1200;
   private static final int bX = 50;
   private static final int bY = 6000;
   private static final int bZ = 2;
   private static final int ca = 1200;

   public cgv(bqg<? extends cgv> $$0, czg $$1) {
      super($$0, $$1);
      this.fS();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static brz.a r() {
      return chc.gn().a(bsa.r, 0.3F).a(bsa.c, 8.0).a(bsa.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected aun v() {
      return this.bf() ? auo.hJ : auo.hK;
   }

   @Override
   protected aun d(boy $$0) {
      return this.bf() ? auo.hP : auo.hQ;
   }

   @Override
   protected aun o_() {
      return this.bf() ? auo.hM : auo.hN;
   }

   @Override
   protected aun y() {
      return auo.hO;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bpm $$0 = new bpm(bpo.d, 6000, 2);
         List<apv> $$1 = bpn.a((apu)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new ach(ach.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fZ()) {
         this.a(this.dm(), 16);
      }
   }
}

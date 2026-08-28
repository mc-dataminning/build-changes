import java.util.List;

public class clo extends clv {
   public static final float a = but.M.l() / but.ai.l();
   private static final int d = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public clo(but<? extends clo> $$0, dgj $$1) {
      super($$0, $$1);
      this.fY();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bwp.a m() {
      return clv.x().a(bwq.v, 0.3F).a(bwq.c, 8.0).a(bwq.s, 80.0);
   }

   @Override
   public int p() {
      return 60;
   }

   @Override
   protected avz u() {
      return this.bm() ? awa.ij : awa.ik;
   }

   @Override
   protected avz e(btc $$0) {
      return this.bm() ? awa.ip : awa.iq;
   }

   @Override
   protected avz o_() {
      return this.bm() ? awa.im : awa.in;
   }

   @Override
   protected avz t() {
      return awa.io;
   }

   @Override
   protected void a(ard $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         btr $$1 = new btr(btt.d, 6000, 2);
         List<are> $$2 = bts.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new act(act.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.ge()) {
         this.a(this.dv(), 16);
      }
   }
}

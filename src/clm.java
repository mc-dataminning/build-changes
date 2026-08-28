import java.util.List;

public class clm extends clt {
   public static final float a = bur.N.l() / bur.aj.l();
   private static final int d = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public clm(bur<? extends clm> $$0, dgi $$1) {
      super($$0, $$1);
      this.aj();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bwn.a m() {
      return clt.x().a(bwo.v, 0.3F).a(bwo.c, 8.0).a(bwo.s, 80.0);
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
   protected avz e(bta $$0) {
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
   protected void a(arc $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         btp $$1 = new btp(btr.d, 6000, 2);
         List<ard> $$2 = btq.a($$0, this, this.du(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new acs(acs.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dw(), 16);
      }
   }
}

import java.util.List;

public class cmh extends cmo {
   public static final float a = bvi.M.l() / bvi.ai.l();
   private static final int d = 1200;
   private static final int bF = 50;
   private static final int bG = 6000;
   private static final int bH = 2;
   private static final int bI = 1200;

   public cmh(bvi<? extends cmh> $$0, dgz $$1) {
      super($$0, $$1);
      this.ga();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bxf.a j() {
      return cmo.q().a(bxg.v, 0.3F).a(bxg.c, 8.0).a(bxg.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected avz u() {
      return this.bj() ? awa.ij : awa.ik;
   }

   @Override
   protected avz e(btp $$0) {
      return this.bj() ? awa.ip : awa.iq;
   }

   @Override
   protected avz l_() {
      return this.bj() ? awa.im : awa.in;
   }

   @Override
   protected avz n() {
      return awa.io;
   }

   @Override
   protected void a(ard $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         bue $$1 = new bue(bug.d, 6000, 2);
         List<are> $$2 = buf.a($$0, this, this.ds(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new acs(acs.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.gg()) {
         this.a(this.du(), 16);
      }
   }
}

import java.util.List;

public class coc extends coj {
   public static final float a = bwr.M.l() / bwr.ai.l();
   private static final int d = 1200;
   private static final int bG = 50;
   private static final int bH = 6000;
   private static final int bI = 2;
   private static final int bJ = 1200;

   public coc(bwr<? extends coc> $$0, djm $$1) {
      super($$0, $$1);
      this.gb();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static byo.a j() {
      return coj.q().a(byp.v, 0.3F).a(byp.c, 8.0).a(byp.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awm u() {
      return this.bh() ? awn.im : awn.in;
   }

   @Override
   protected awm e(bux $$0) {
      return this.bh() ? awn.is : awn.it;
   }

   @Override
   protected awm l_() {
      return this.bh() ? awn.ip : awn.iq;
   }

   @Override
   protected awm n() {
      return awn.ir;
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if ((this.af + this.ao()) % 1200 == 0) {
         bvm $$1 = new bvm(bvo.d, 6000, 2);
         List<arr> $$2 = bvn.a($$0, this, this.ds(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adb(adb.l, this.aZ() ? 0.0F : 1.0F)));
      }

      if (!this.gh()) {
         this.a(this.du(), 16);
      }
   }
}

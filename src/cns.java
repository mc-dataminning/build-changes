import java.util.List;

public class cns extends cnz {
   public static final float a = bwo.M.l() / bwo.ai.l();
   private static final int d = 1200;
   private static final int bG = 50;
   private static final int bH = 6000;
   private static final int bI = 2;
   private static final int bJ = 1200;

   public cns(bwo<? extends cns> $$0, dja $$1) {
      super($$0, $$1);
      this.fZ();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static byj.a j() {
      return cnz.q().a(byk.v, 0.3F).a(byk.c, 8.0).a(byk.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awm u() {
      return this.bj() ? awn.im : awn.in;
   }

   @Override
   protected awm e(buu $$0) {
      return this.bj() ? awn.is : awn.it;
   }

   @Override
   protected awm l_() {
      return this.bj() ? awn.ip : awn.iq;
   }

   @Override
   protected awm n() {
      return awn.ir;
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         bvj $$1 = new bvj(bvl.d, 6000, 2);
         List<arr> $$2 = bvk.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adb(adb.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.gf()) {
         this.a(this.dv(), 16);
      }
   }
}

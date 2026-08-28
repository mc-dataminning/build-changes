import java.util.List;

public class cno extends cnv {
   public static final float a = bwm.M.l() / bwm.ai.l();
   private static final int d = 1200;
   private static final int bF = 50;
   private static final int bG = 6000;
   private static final int bH = 2;
   private static final int bI = 1200;

   public cno(bwm<? extends cno> $$0, div $$1) {
      super($$0, $$1);
      this.fY();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static byh.a j() {
      return cnv.q().a(byi.v, 0.3F).a(byi.c, 8.0).a(byi.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awm u() {
      return this.bj() ? awn.ik : awn.il;
   }

   @Override
   protected awm e(bus $$0) {
      return this.bj() ? awn.iq : awn.ir;
   }

   @Override
   protected awm l_() {
      return this.bj() ? awn.in : awn.io;
   }

   @Override
   protected awm n() {
      return awn.ip;
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         bvh $$1 = new bvh(bvj.d, 6000, 2);
         List<arr> $$2 = bvi.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adb(adb.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.ge()) {
         this.a(this.dv(), 16);
      }
   }
}

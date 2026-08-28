import java.util.List;

public class cni extends cnp {
   public static final float a = bwj.M.l() / bwj.ai.l();
   private static final int d = 1200;
   private static final int bF = 50;
   private static final int bG = 6000;
   private static final int bH = 2;
   private static final int bI = 1200;

   public cni(bwj<? extends cni> $$0, dip $$1) {
      super($$0, $$1);
      this.fY();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bye.a j() {
      return cnp.q().a(byf.v, 0.3F).a(byf.c, 8.0).a(byf.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awk u() {
      return this.bj() ? awl.ij : awl.ik;
   }

   @Override
   protected awk e(bup $$0) {
      return this.bj() ? awl.ip : awl.iq;
   }

   @Override
   protected awk l_() {
      return this.bj() ? awl.im : awl.in;
   }

   @Override
   protected awk n() {
      return awl.io;
   }

   @Override
   protected void a(aro $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         bve $$1 = new bve(bvg.d, 6000, 2);
         List<arp> $$2 = bvf.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new acz(acz.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.ge()) {
         this.a(this.dv(), 16);
      }
   }
}

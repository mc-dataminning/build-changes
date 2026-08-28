import java.util.List;

public class cmy extends cnf {
   public static final float a = bwb.M.l() / bwb.ai.l();
   private static final int d = 1200;
   private static final int bE = 50;
   private static final int bF = 6000;
   private static final int bG = 2;
   private static final int bH = 1200;

   public cmy(bwb<? extends cmy> $$0, dhp $$1) {
      super($$0, $$1);
      this.fY();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bxw.a j() {
      return cnf.q().a(bxx.v, 0.3F).a(bxx.c, 8.0).a(bxx.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awj u() {
      return this.bj() ? awk.ij : awk.ik;
   }

   @Override
   protected awj e(buh $$0) {
      return this.bj() ? awk.ip : awk.iq;
   }

   @Override
   protected awj l_() {
      return this.bj() ? awk.im : awk.in;
   }

   @Override
   protected awj n() {
      return awk.io;
   }

   @Override
   protected void a(arn $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         buw $$1 = new buw(buy.d, 6000, 2);
         List<aro> $$2 = bux.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new acy(acy.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.ge()) {
         this.a(this.dv(), 16);
      }
   }
}

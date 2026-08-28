import java.util.List;

public class cjg extends cjn {
   public static final float b = bsn.D.l() / bsn.Y.l();
   private static final int e = 1200;
   private static final int ca = 50;
   private static final int cb = 6000;
   private static final int cc = 2;
   private static final int cd = 1200;

   public cjg(bsn<? extends cjg> $$0, dcg $$1) {
      super($$0, $$1);
      this.fQ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static buj.a s() {
      return cjn.gn().a(buk.v, 0.3F).a(buk.c, 8.0).a(buk.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected avg v() {
      return this.bj() ? avh.hO : avh.hP;
   }

   @Override
   protected avg d(bra $$0) {
      return this.bj() ? avh.hU : avh.hV;
   }

   @Override
   protected avg n_() {
      return this.bj() ? avh.hR : avh.hS;
   }

   @Override
   protected avg x() {
      return avh.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.an()) % 1200 == 0) {
         brp $$0 = new brp(brr.d, 6000, 2);
         List<aqn> $$1 = brq.a((aqm)this.dR(), this, this.dp(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new acu(acu.l, this.aY() ? 0.0F : 1.0F)));
      }

      if (!this.fX()) {
         this.a(this.dr(), 16);
      }
   }
}

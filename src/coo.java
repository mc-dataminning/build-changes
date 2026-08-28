import java.util.List;

public class coo extends cov {
   public static final float a = bxc.N.l() / bxc.aj.l();
   private static final int d = 1200;
   private static final int e = 50;
   private static final int f = 6000;
   private static final int bI = 2;
   private static final int bJ = 1200;

   public coo(bxc<? extends coo> $$0, djx $$1) {
      super($$0, $$1);
      this.gc();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static byz.a j() {
      return cov.q().a(bza.v, 0.3F).a(bza.c, 8.0).a(bza.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awo u() {
      return this.bi() ? awp.im : awp.in;
   }

   @Override
   protected awo e(bvi $$0) {
      return this.bi() ? awp.is : awp.it;
   }

   @Override
   protected awo l_() {
      return this.bi() ? awp.ip : awp.iq;
   }

   @Override
   protected awo n() {
      return awp.ir;
   }

   @Override
   protected void a(ars $$0) {
      super.a($$0);
      if ((this.af + this.ao()) % 1200 == 0) {
         bvx $$1 = new bvx(bvz.d, 6000, 2);
         List<art> $$2 = bvy.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new add(add.l, this.ba() ? 0.0F : 1.0F)));
      }

      if (!this.gi()) {
         this.a(this.dv(), 16);
      }
   }
}

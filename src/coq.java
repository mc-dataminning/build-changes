import java.util.List;

public class coq extends cox {
   public static final float a = bxe.N.l() / bxe.aj.l();
   private static final int d = 1200;
   private static final int e = 50;
   private static final int f = 6000;
   private static final int bI = 2;
   private static final int bJ = 1200;

   public coq(bxe<? extends coq> $$0, djz $$1) {
      super($$0, $$1);
      this.gc();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bzb.a j() {
      return cox.q().a(bzc.v, 0.3F).a(bzc.c, 8.0).a(bzc.s, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected awq u() {
      return this.bi() ? awr.im : awr.in;
   }

   @Override
   protected awq e(bvk $$0) {
      return this.bi() ? awr.is : awr.it;
   }

   @Override
   protected awq l_() {
      return this.bi() ? awr.ip : awr.iq;
   }

   @Override
   protected awq n() {
      return awr.ir;
   }

   @Override
   protected void a(aru $$0) {
      super.a($$0);
      if ((this.af + this.ao()) % 1200 == 0) {
         bvz $$1 = new bvz(bwb.d, 6000, 2);
         List<arv> $$2 = bwa.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adf(adf.l, this.ba() ? 0.0F : 1.0F)));
      }

      if (!this.gi()) {
         this.a(this.dv(), 16);
      }
   }
}

import java.util.List;

public class coz extends cpg {
   public static final float a = bxn.N.l() / bxn.aj.l();
   private static final int d = 1200;
   private static final int e = 50;
   private static final int f = 6000;
   private static final int bI = 2;
   private static final int bJ = 1200;

   public coz(bxn<? extends coz> $$0, dkj $$1) {
      super($$0, $$1);
      this.gc();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bzk.a m() {
      return cpg.gu().a(bzl.v, 0.3F).a(bzl.c, 8.0).a(bzl.s, 80.0);
   }

   @Override
   public int p() {
      return 60;
   }

   @Override
   protected awx s() {
      return this.bi() ? awy.im : awy.in;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.bi() ? awy.is : awy.it;
   }

   @Override
   protected awx j_() {
      return this.bi() ? awy.ip : awy.iq;
   }

   @Override
   protected awx u() {
      return awy.ir;
   }

   @Override
   protected void a(asb $$0) {
      super.a($$0);
      if ((this.af + this.ao()) % 1200 == 0) {
         bwi $$1 = new bwi(bwk.d, 6000, 2);
         List<asc> $$2 = bwj.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adm(adm.l, this.ba() ? 0.0F : 1.0F)));
      }

      if (!this.gi()) {
         this.a(this.dv(), 16);
      }
   }
}

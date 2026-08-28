import java.util.List;

public class cjs extends cjz {
   public static final float b = bsx.D.l() / bsx.Y.l();
   private static final int e = 1200;
   private static final int cc = 50;
   private static final int cd = 6000;
   private static final int ce = 2;
   private static final int cf = 1200;

   public cjs(bsx<? extends cjs> $$0, dcw $$1) {
      super($$0, $$1);
      this.fR();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static buv.a s() {
      return cjz.gk().a(buw.v, 0.3F).a(buw.c, 8.0).a(buw.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected avo v() {
      return this.bi() ? avp.hO : avp.hP;
   }

   @Override
   protected avo d(brk $$0) {
      return this.bi() ? avp.hU : avp.hV;
   }

   @Override
   protected avo n_() {
      return this.bi() ? avp.hR : avp.hS;
   }

   @Override
   protected avo x() {
      return avp.hT;
   }

   @Override
   protected void ab() {
      super.ab();
      if ((this.ai + this.an()) % 1200 == 0) {
         brz $$0 = new brz(bsb.d, 6000, 2);
         List<aqv> $$1 = bsa.a((aqu)this.dO(), this, this.dm(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adb(adb.l, this.aX() ? 0.0F : 1.0F)));
      }

      if (!this.fY()) {
         this.a(this.do(), 16);
      }
   }
}

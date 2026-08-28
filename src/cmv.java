import javax.annotation.Nullable;

public class cmv extends clz implements cmf, cpb {
   private static final ajx<Boolean> a = akb.a(cmv.class, ajz.k);
   private static final int b = 5;
   private static final int bF = 300;
   private final btf bG = new btf(5);

   public cmv(bvi<? extends cmv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new ccd<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bC.a(2, new crf.a(this, 10.0F));
      this.bC.a(3, new cdx<>(this, 1.0, 8.0F));
      this.bC.a(8, new cdt(this, 0.6));
      this.bC.a(9, new cde(this, cpr.class, 15.0F, 1.0F));
      this.bC.a(10, new cde(this, bwa.class, 15.0F));
      this.bD.a(1, new ceo(this, crf.class).a());
      this.bD.a(2, new cep<>(this, cpr.class, true));
      this.bD.a(3, new cep<>(this, coy.class, false));
      this.bD.a(3, new cep<>(this, cib.class, true));
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.v, 0.35F).a(bxg.s, 24.0).a(bxg.c, 5.0).a(bxg.m, 32.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cyc $$0) {
      return $$0 == cxl.wX;
   }

   public boolean q() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.bd = 0;
   }

   @Override
   public axf<cxd> Y() {
      return awy.bV;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dW());
   }

   @Override
   public clz.a j() {
      if (this.q()) {
         return clz.a.f;
      } else if (this.b(cxl.wX)) {
         return clz.a.e;
      } else {
         return this.gj() ? clz.a.b : clz.a.h;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dW());
      this.a_(true);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   public int ai() {
      return 1;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      this.a(bvj.a, new cxh(cxl.wX));
   }

   @Override
   protected void b(dhq $$0, azh $$1, bsw $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cxh $$3 = this.eZ();
         if ($$3.a(cxl.wX)) {
            ddt.a($$3, $$0.F_(), dff.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avz u() {
      return awa.uF;
   }

   @Override
   protected avz l_() {
      return awa.uH;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.uI;
   }

   @Override
   public void a(bvy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public btf n() {
      return this.bG;
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      cxh $$2 = $$1.f();
      if ($$2.h() instanceof cvl) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cxh $$3 = this.bG.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(cxh $$0) {
      return this.gG() && $$0.a(cxl.vR);
   }

   @Override
   public bwq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bG.b() ? bwq.a(this.bG, $$1) : super.a_($$0);
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cre $$3 = this.gD();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cxh $$5 = new cxh(cxl.wX);
         akt<dez> $$6;
         if ($$1 > $$3.a(bsv.c)) {
            $$6 = dff.d;
         } else if ($$1 > $$3.a(bsv.b)) {
            $$6 = dff.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            ddt.a($$5, $$0.F_(), $$6, $$0.d_(this.du()), this.dX());
            this.a(bvj.a, $$5);
         }
      }
   }

   @Override
   public avz ah_() {
      return awa.uG;
   }
}

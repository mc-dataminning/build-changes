import javax.annotation.Nullable;

public class coc extends cng implements cnm, cqi {
   private static final akj<Boolean> a = akn.a(coc.class, akl.k);
   private static final int b = 5;
   private static final int bF = 300;
   private final bui bG = new bui(5);

   public coc(bwm<? extends coc> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cdf<>(this, cpe.class, 8.0F, 1.0, 1.2));
      this.bC.a(2, new cso.a(this, 10.0F));
      this.bC.a(3, new cez<>(this, 1.0, 8.0F));
      this.bC.a(8, new cev(this, 0.6));
      this.bC.a(9, new ceg(this, cqy.class, 15.0F, 1.0F));
      this.bC.a(10, new ceg(this, bxe.class, 15.0F));
      this.bD.a(1, new cfq(this, cso.class).a());
      this.bD.a(2, new cfr<>(this, cqy.class, true));
      this.bD.a(3, new cfr<>(this, cqf.class, false));
      this.bD.a(3, new cfr<>(this, cjg.class, true));
   }

   public static byh.a m() {
      return cnz.gt().a(byi.v, 0.35F).a(byi.s, 24.0).a(byi.c, 5.0).a(byi.m, 32.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(czt $$0) {
      return $$0 == czc.xb;
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
   public axr<cyu> Y() {
      return axk.bV;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cng.a j() {
      if (this.q()) {
         return cng.a.f;
      } else if (this.b(czc.xb)) {
         return cng.a.e;
      } else {
         return this.gh() ? cng.a.b : cng.a.h;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return 0.0F;
   }

   @Override
   public int ai() {
      return 1;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      this.a(bwn.a, new cyy(czc.xb));
   }

   @Override
   protected void b(djm $$0, azv $$1, btz $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cyy $$3 = this.fa();
         if ($$3.a(czc.xb)) {
            dfn.a($$3, $$0.F_(), dgz.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awm u() {
      return awn.uG;
   }

   @Override
   protected awm l_() {
      return awn.uI;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.uJ;
   }

   @Override
   public void a(bxc $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bui n() {
      return this.bG;
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      cyy $$2 = $$1.f();
      if ($$2.h() instanceof cxe) {
         super.a($$0, $$1);
      } else if (this.j($$2)) {
         this.a($$1);
         cyy $$3 = this.bG.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean j(cyy $$0) {
      return this.gE() && $$0.a(czc.vV);
   }

   @Override
   public bxt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bG.b() ? bxt.a(this.bG, $$1) : super.a_($$0);
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      csn $$3 = this.gB();
      boolean $$4 = this.ae.i() <= $$3.s();
      if ($$4) {
         cyy $$5 = new cyy(czc.xb);
         alf<dgt> $$6;
         if ($$1 > $$3.a(bty.c)) {
            $$6 = dgz.d;
         } else if ($$1 > $$3.a(bty.b)) {
            $$6 = dgz.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dfn.a($$5, $$0.F_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bwn.a, $$5);
         }
      }
   }

   @Override
   public awm ad_() {
      return awn.uH;
   }
}

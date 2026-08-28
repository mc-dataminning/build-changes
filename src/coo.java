import javax.annotation.Nullable;

public class coo extends cnr implements cnx, cqt {
   private static final akj<Boolean> a = akn.a(coo.class, akl.k);
   private static final int b = 5;
   private static final int bG = 300;
   private final bun bH = new bun(5);

   public coo(bwr<? extends coo> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cdm<>(this, cpp.class, 8.0F, 1.0, 1.2));
      this.bD.a(2, new cta.a(this, 10.0F));
      this.bD.a(3, new cfg<>(this, 1.0, 8.0F));
      this.bD.a(8, new cfc(this, 0.6));
      this.bD.a(9, new cen(this, crj.class, 15.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 15.0F));
      this.bE.a(1, new cfx(this, cta.class).a());
      this.bE.a(2, new cfy<>(this, crj.class, true));
      this.bE.a(3, new cfy<>(this, cqq.class, false));
      this.bE.a(3, new cfy<>(this, cjp.class, true));
   }

   public static byo.a m() {
      return cok.gw().a(byp.v, 0.35F).a(byp.s, 24.0).a(byp.c, 5.0).a(byp.m, 32.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(daf $$0) {
      return $$0 == czo.xg;
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
   public axr<czg> Y() {
      return axk.bW;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.b($$0, this.dW());
   }

   @Override
   public cnr.a j() {
      if (this.q()) {
         return cnr.a.f;
      } else if (this.b(czo.xg)) {
         return cnr.a.e;
      } else {
         return this.gk() ? cnr.a.b : cnr.a.h;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dW());
      this.a_(true);
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return 0.0F;
   }

   @Override
   public int fW() {
      return 1;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      this.a(bws.a, new czk(czo.xg));
   }

   @Override
   protected void b(djy $$0, azv $$1, bue $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         czk $$3 = this.fa();
         if ($$3.a(czo.xg)) {
            dfz.a($$3, $$0.F_(), dhl.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awm u() {
      return awn.uJ;
   }

   @Override
   protected awm l_() {
      return awn.uL;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.uM;
   }

   @Override
   public void a(bxj $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bun n() {
      return this.bH;
   }

   @Override
   protected void a(arq $$0, cno $$1) {
      czk $$2 = $$1.f();
      if ($$2.h() instanceof cxq) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         czk $$3 = this.bH.b($$2);
         if ($$3.f()) {
            $$1.aq();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(czk $$0) {
      return this.gH() && $$0.a(czo.wa);
   }

   @Override
   public bya a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bH.b() ? bya.a(this.bH, $$1) : super.a_($$0);
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      csz $$3 = this.gE();
      boolean $$4 = this.ae.i() <= $$3.s();
      if ($$4) {
         czk $$5 = new czk(czo.xg);
         alf<dhf> $$6;
         if ($$1 > $$3.a(bud.c)) {
            $$6 = dhl.d;
         } else if ($$1 > $$3.a(bud.b)) {
            $$6 = dhl.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dfz.a($$5, $$0.F_(), $$6, $$0.d_(this.du()), this.dX());
            this.a(bws.a, $$5);
         }
      }
   }

   @Override
   public awm ae_() {
      return awn.uK;
   }
}

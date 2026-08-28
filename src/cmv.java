import javax.annotation.Nullable;

public class cmv extends clz implements cmf, cpc {
   private static final alc<Boolean> a = alg.a(cmv.class, ale.k);
   private static final int b = 5;
   private static final int bZ = 300;
   private final btl ca = new btl(5);

   public cmv(bvm<? extends cmv> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(1, new ccg<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new crg.a(this, 10.0F));
      this.bT.a(3, new cea<>(this, 1.0, 8.0F));
      this.bT.a(8, new cdw(this, 0.6));
      this.bT.a(9, new cdh(this, cps.class, 15.0F, 1.0F));
      this.bT.a(10, new cdh(this, bwd.class, 15.0F));
      this.bU.a(1, new cer(this, crg.class).a());
      this.bU.a(2, new ces<>(this, cps.class, true));
      this.bU.a(3, new ces<>(this, coz.class, false));
      this.bU.a(3, new ces<>(this, cie.class, true));
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.v, 0.35F).a(bxj.s, 24.0).a(bxj.c, 5.0).a(bxj.m, 32.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cyg $$0) {
      return $$0 == cxo.wL;
   }

   public boolean x() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public clz.a m() {
      if (this.x()) {
         return clz.a.f;
      } else if (this.b(cxo.wL)) {
         return clz.a.e;
      } else {
         return this.gb() ? clz.a.b : clz.a.h;
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return 0.0F;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      this.a(bvn.a, new cxk(cxo.wL));
   }

   @Override
   protected void b(dhr $$0, bam $$1, btc $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cxk $$3 = this.eX();
         if ($$3.a(cxo.wL)) {
            ddt.a($$3, $$0.K_(), dff.b, $$2, $$1);
         }
      }
   }

   @Override
   protected axe u() {
      return axf.uo;
   }

   @Override
   protected axe o_() {
      return axf.uq;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ur;
   }

   @Override
   public void a(bwb $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public btl t() {
      return this.ca;
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      cxk $$2 = $$1.l();
      if ($$2.h() instanceof cvn) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cxk $$3 = this.ca.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.L());
         }
      }
   }

   private boolean i(cxk $$0) {
      return this.gC() && $$0.a(cxo.vF);
   }

   @Override
   public bwt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ca.b() ? bwt.a(this.ca, $$1) : super.a_($$0);
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
      crf $$3 = this.gz();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cxk $$5 = new cxk(cxo.wL);
         aly<dez> $$6;
         if ($$1 > $$3.a(btb.c)) {
            $$6 = dff.d;
         } else if ($$1 > $$3.a(btb.b)) {
            $$6 = dff.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            ddt.a($$5, $$0.K_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bvn.a, $$5);
         }
      }
   }

   @Override
   public axe ak_() {
      return axf.up;
   }
}

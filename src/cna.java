import javax.annotation.Nullable;

public class cna extends cme implements cmk, cph {
   private static final alc<Boolean> a = alg.a(cna.class, ale.k);
   private static final int b = 5;
   private static final int bZ = 300;
   private final btq ca = new btq(5);

   public cna(bvr<? extends cna> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new ccl<>(this, cob.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new crl.a(this, 10.0F));
      this.bT.a(3, new cef<>(this, 1.0, 8.0F));
      this.bT.a(8, new ceb(this, 0.6));
      this.bT.a(9, new cdm(this, cpx.class, 15.0F, 1.0F));
      this.bT.a(10, new cdm(this, bwi.class, 15.0F));
      this.bU.a(1, new cew(this, crl.class).a());
      this.bU.a(2, new cex<>(this, cpx.class, true));
      this.bU.a(3, new cex<>(this, cpe.class, false));
      this.bU.a(3, new cex<>(this, cij.class, true));
   }

   public static bxn.a p() {
      return cmx.gt().a(bxo.v, 0.35F).a(bxo.s, 24.0).a(bxo.c, 5.0).a(bxo.m, 32.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cyl $$0) {
      return $$0 == cxt.wL;
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
      this.b($$0, this.dY());
   }

   @Override
   public cme.a m() {
      if (this.x()) {
         return cme.a.f;
      } else if (this.b(cxt.wL)) {
         return cme.a.e;
      } else {
         return this.gd() ? cme.a.b : cme.a.h;
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      return 0.0F;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      this.a(bvs.a, new cxp(cxt.wL));
   }

   @Override
   protected void b(dhz $$0, bam $$1, bth $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cxp $$3 = this.eZ();
         if ($$3.a(cxt.wL)) {
            deb.a($$3, $$0.K_(), dfn.b, $$2, $$1);
         }
      }
   }

   @Override
   protected axe u() {
      return axf.up;
   }

   @Override
   protected axe o_() {
      return axf.ur;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.us;
   }

   @Override
   public void a(bwg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public btq t() {
      return this.ca;
   }

   @Override
   protected void a(ash $$0, cmb $$1) {
      cxp $$2 = $$1.l();
      if ($$2.h() instanceof cvs) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cxp $$3 = this.ca.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.L());
         }
      }
   }

   private boolean i(cxp $$0) {
      return this.gE() && $$0.a(cxt.vF);
   }

   @Override
   public bwy a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ca.b() ? bwy.a(this.ca, $$1) : super.a_($$0);
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
      crk $$3 = this.gB();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cxp $$5 = new cxp(cxt.wL);
         aly<dfh> $$6;
         if ($$1 > $$3.a(btg.c)) {
            $$6 = dfn.d;
         } else if ($$1 > $$3.a(btg.b)) {
            $$6 = dfn.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            deb.a($$5, $$0.K_(), $$6, $$0.d_(this.dw()), this.dZ());
            this.a(bvs.a, $$5);
         }
      }
   }

   @Override
   public axe ak_() {
      return axf.uq;
   }
}

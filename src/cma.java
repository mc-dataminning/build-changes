import javax.annotation.Nullable;

public class cma extends cle implements clk, cog {
   private static final ajx<Boolean> a = akb.a(cma.class, ajz.k);
   private static final int b = 5;
   private static final int bY = 300;
   private final bsq bZ = new bsq(5);

   public cma(bur<? extends cma> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cbl<>(this, cnb.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cql.a(this, 10.0F));
      this.bS.a(3, new cdf<>(this, 1.0, 8.0F));
      this.bS.a(8, new cdb(this, 0.6));
      this.bS.a(9, new ccm(this, cox.class, 15.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 15.0F));
      this.bT.a(1, new cdw(this, cql.class).a());
      this.bT.a(2, new cdx<>(this, cox.class, true));
      this.bT.a(3, new cdx<>(this, cod.class, false));
      this.bT.a(3, new cdx<>(this, chj.class, true));
   }

   public static bwn.a p() {
      return clx.gu().a(bwo.v, 0.35F).a(bwo.s, 24.0).a(bwo.c, 5.0).a(bwo.m, 32.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cxl $$0) {
      return $$0 == cwt.wV;
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
   public axf<cwl> W() {
      return awy.bV;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dY());
   }

   @Override
   public cle.a m() {
      if (this.x()) {
         return cle.a.f;
      } else if (this.b(cwt.wV)) {
         return cle.a.e;
      } else {
         return this.ge() ? cle.a.b : cle.a.h;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      this.a_(true);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   @Override
   public int af() {
      return 1;
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwp(cwt.wV));
   }

   @Override
   protected void b(dgz $$0, azh $$1, bsh $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwp $$3 = this.eZ();
         if ($$3.a(cwt.wV)) {
            ddb.a($$3, $$0.K_(), den.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avz u() {
      return awa.uv;
   }

   @Override
   protected avz o_() {
      return awa.ux;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.uy;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bsq t() {
      return this.bZ;
   }

   @Override
   protected void a(arc $$0, clb $$1) {
      cwp $$2 = $$1.l();
      if ($$2.h() instanceof cus) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cwp $$3 = this.bZ.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(cwp $$0) {
      return this.gF() && $$0.a(cwt.vP);
   }

   @Override
   public bvy a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvy.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
      cqk $$3 = this.gC();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cwp $$5 = new cwp(cwt.wV);
         akt<deh> $$6;
         if ($$1 > $$3.a(bsg.c)) {
            $$6 = den.d;
         } else if ($$1 > $$3.a(bsg.b)) {
            $$6 = den.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            ddb.a($$5, $$0.K_(), $$6, $$0.d_(this.dw()), this.dZ());
            this.a(bus.a, $$5);
         }
      }
   }

   @Override
   public avz aj_() {
      return awa.uw;
   }
}

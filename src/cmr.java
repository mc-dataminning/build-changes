import javax.annotation.Nullable;

public class cmr extends clv implements cmb, coy {
   private static final aks<Boolean> a = akw.a(cmr.class, aku.k);
   private static final int b = 5;
   private static final int bZ = 300;
   private final bth ca = new bth(5);

   public cmr(bvi<? extends cmr> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new ccc<>(this, cns.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new crc.a(this, 10.0F));
      this.bT.a(3, new cdw<>(this, 1.0, 8.0F));
      this.bT.a(8, new cds(this, 0.6));
      this.bT.a(9, new cdd(this, cpo.class, 15.0F, 1.0F));
      this.bT.a(10, new cdd(this, bvz.class, 15.0F));
      this.bU.a(1, new cen(this, crc.class).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true));
      this.bU.a(3, new ceo<>(this, cov.class, false));
      this.bU.a(3, new ceo<>(this, cia.class, true));
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.v, 0.35F).a(bxf.s, 24.0).a(bxf.c, 5.0).a(bxf.m, 32.0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cyc $$0) {
      return $$0 == cxk.wV;
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
   public void b(um $$0) {
      super.b($$0);
      this.b($$0, this.dY());
   }

   @Override
   public clv.a m() {
      if (this.x()) {
         return clv.a.f;
      } else if (this.b(cxk.wV)) {
         return clv.a.e;
      } else {
         return this.gd() ? clv.a.b : clv.a.h;
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      this.a(bvj.a, new cxg(cxk.wV));
   }

   @Override
   protected void b(dhq $$0, bac $$1, bsy $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cxg $$3 = this.eZ();
         if ($$3.a(cxk.wV)) {
            dds.a($$3, $$0.K_(), dfe.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awu u() {
      return awv.uv;
   }

   @Override
   protected awu o_() {
      return awv.ux;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.uy;
   }

   @Override
   public void a(bvx $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bth t() {
      return this.ca;
   }

   @Override
   protected void a(arx $$0, cls $$1) {
      cxg $$2 = $$1.l();
      if ($$2.h() instanceof cvj) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cxg $$3 = this.ca.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(cxg $$0) {
      return this.gE() && $$0.a(cxk.vP);
   }

   @Override
   public bwp a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ca.b() ? bwp.a(this.ca, $$1) : super.a_($$0);
   }

   @Override
   public void a(arx $$0, int $$1, boolean $$2) {
      crb $$3 = this.gB();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cxg $$5 = new cxg(cxk.wV);
         alo<dey> $$6;
         if ($$1 > $$3.a(bsx.c)) {
            $$6 = dfe.d;
         } else if ($$1 > $$3.a(bsx.b)) {
            $$6 = dfe.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dds.a($$5, $$0.K_(), $$6, $$0.d_(this.dw()), this.dZ());
            this.a(bvj.a, $$5);
         }
      }
   }

   @Override
   public awu ak_() {
      return awv.uw;
   }
}

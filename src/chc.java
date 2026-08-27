import javax.annotation.Nullable;

public class chc extends cgg implements cgm, cje {
   private static final aiy<Boolean> b = ajc.a(chc.class, aja.k);
   private static final int e = 5;
   private static final int bX = 300;
   private final boj bY = new boj(5);

   public chc(bqb<? extends chc> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this));
      this.bR.a(2, new clf.a(this, 10.0F));
      this.bR.a(3, new bym<>(this, 1.0, 8.0F));
      this.bR.a(8, new byi(this, 0.6));
      this.bR.a(9, new bxt(this, cjt.class, 15.0F, 1.0F));
      this.bR.a(10, new bxt(this, bqq.class, 15.0F));
      this.bS.a(1, new bzd(this, clf.class).a());
      this.bS.a(2, new bze<>(this, cjt.class, true));
      this.bS.a(3, new bze<>(this, cjb.class, false));
      this.bS.a(3, new bze<>(this, ccp.class, true));
   }

   public static bru.a u() {
      return cgz.gt().a(brv.r, 0.35F).a(brv.q, 24.0).a(brv.c, 5.0).a(brv.k, 32.0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(crz $$0) {
      return $$0 == crm.vR;
   }

   public boolean gn() {
      return this.an.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      this.b($$0, this.dO());
   }

   @Override
   public cgg.a r() {
      if (this.gn()) {
         return cgg.a.f;
      } else if (this.b(crm.vR)) {
         return cgg.a.e;
      } else {
         return this.gf() ? cgg.a.b : cgg.a.h;
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a($$0, this.dO());
      this.s(true);
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return 0.0F;
   }

   @Override
   public int fO() {
      return 1;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      this.a(bqc.a, new crj(crm.vR));
   }

   @Override
   protected void a(axr $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         crj $$2 = this.eU();
         if ($$2.a(crm.vR)) {
            $$2.a(cwt.K, 1);
            this.a(bqc.a, $$2);
         }
      }
   }

   @Override
   protected aul v() {
      return aum.tz;
   }

   @Override
   protected aul o_() {
      return aum.tB;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.tC;
   }

   @Override
   public void a(bqo $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boj y() {
      return this.bY;
   }

   @Override
   protected void b(cgd $$0) {
      crj $$1 = $$0.p();
      if ($$1.f() instanceof cpe) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         crj $$2 = this.bY.a($$1);
         if ($$2.d()) {
            $$0.am();
         } else {
            $$1.e($$2.G());
         }
      }
   }

   private boolean n(crj $$0) {
      return this.gC() && $$0.a(crm.uN);
   }

   @Override
   public brf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? brf.a(this.bY, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cle $$2 = this.gB();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         crj $$4 = new crj(crm.vR);
         if ($$0 > $$2.a(bnx.c)) {
            $$4.a(cwt.J, 2);
         } else if ($$0 > $$2.a(bnx.b)) {
            $$4.a(cwt.J, 1);
         }

         $$4.a(cwt.I, 1);
         this.a(bqc.a, $$4);
      }
   }

   @Override
   public aul ae_() {
      return aum.tA;
   }
}

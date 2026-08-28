import java.util.UUID;
import javax.annotation.Nullable;

public class cik extends chs implements bwg {
   private static final alc<Boolean> bZ = alg.a(cik.class, ale.k);
   private static final float ca = 6.0F;
   private float cb;
   private float cd;
   private int ce;
   private static final bsp cf = bbg.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public cik(bvm<? extends cik> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return bvm.aV.a($$0, bvl.e);
   }

   @Override
   public boolean j(cxk $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cik.c());
      this.bT.a(1, new cds(this, 2.0, $$0 -> $$0.e_() ? axw.F : axw.G));
      this.bT.a(4, new ccy(this, 1.25));
      this.bT.a(5, new cdw(this, 1.0));
      this.bT.a(6, new cdh(this, cps.class, 6.0F));
      this.bT.a(7, new cdu(this));
      this.bU.a(1, new cik.b());
      this.bU.a(2, new cik.a());
      this.bU.a(3, new ces<>(this, cps.class, 10, true, false, this::a));
      this.bU.a(4, new ces<>(this, cic.class, 10, true, true, null));
      this.bU.a(5, new cey<>(this, false));
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 30.0).a(bxj.m, 20.0).a(bxj.v, 0.25).a(bxj.c, 6.0);
   }

   public static boolean c(bvm<cik> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      jq<dic> $$5 = $$1.t($$3);
      return !$$5.a(axt.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axu.ce);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   protected axe u() {
      return this.e_() ? axf.uQ : axf.uP;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.uS;
   }

   @Override
   protected axe o_() {
      return axf.uR;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.uT, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.ce <= 0) {
         this.b(axf.uU);
         this.ce = 40;
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.cd != this.cb) {
            this.m_();
         }

         this.cb = this.cd;
         if (this.x()) {
            this.cd = bae.a(this.cd + 1.0F, 0.0F, 6.0F);
         } else {
            this.cd = bae.a(this.cd - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (!this.dV().C) {
         this.a((ash)this.dV(), true);
      }
   }

   @Override
   public bvi e(bwn $$0) {
      if (this.cd > 0.0F) {
         float $$1 = this.cd / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bZ);
   }

   public void x(boolean $$0) {
      this.al.a(bZ, $$0);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cb, this.cd) / 6.0F;
   }

   @Override
   protected float fk() {
      return 0.98F;
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$3 == null) {
         $$3 = new buw.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ces<cps> {
      public a() {
         super(cik.this, cps.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cik.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (cik $$1 : cik.this.dV().a(cik.class, cik.this.cR().c(8.0, 4.0, 8.0))) {
                  if ($$1.e_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends cer {
      public b() {
         super(cik.this);
      }

      @Override
      public void d() {
         super.d();
         if (cik.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bwd $$0, bwb $$1) {
         if ($$0 instanceof cik && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cdj {
      public c() {
         super(cik.this, 1.25, true);
      }

      @Override
      protected void a(bwb $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cik.this.x(false);
         } else if (this.a.g((bvf)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cik.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cik.this.x(true);
               cik.this.t();
            }
         } else {
            this.h();
            cik.this.x(false);
         }
      }

      @Override
      public void e() {
         cik.this.x(false);
         super.e();
      }
   }
}

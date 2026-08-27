import javax.annotation.Nullable;

public class cfy extends cgk implements cge {
   private static final int e = 4;
   private static final int bX = 3;
   private static final int bY = 3;
   private int bZ;
   private final ept[][] ca;

   public cfy(bpd<? extends cfy> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.ca = new ept[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.ca[0][$$2] = ept.b;
         this.ca[1][$$2] = ept.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new cgk.b());
      this.bR.a(4, new cfy.b());
      this.bR.a(5, new cfy.a());
      this.bR.a(6, new bxm<>(this, 0.5, 20, 15.0F));
      this.bR.a(8, new bxj(this, 0.6));
      this.bR.a(9, new bwu(this, ciu.class, 3.0F, 1.0F));
      this.bR.a(10, new bwu(this, bpr.class, 8.0F));
      this.bS.a(1, new bye(this, ckg.class).a());
      this.bS.a(2, new byf<>(this, ciu.class, true).c(300));
      this.bS.a(3, new byf<>(this, cic.class, false).c(300));
      this.bS.a(3, new byf<>(this, cbq.class, false).c(300));
   }

   public static bqv.a s() {
      return cga.gt().a(bqw.r, 0.5).a(bqw.k, 18.0).a(bqw.q, 32.0);
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.a(bpe.a, new cqm(cqp.ot));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public epo h_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dM().B && this.ce()) {
         this.bZ--;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.aN == 1 || this.ah % 1200 == 0) {
            this.bZ = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.ca[0][$$2] = this.ca[1][$$2];
               this.ca[1][$$2] = new ept(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(kc.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), aty.mR, this.db(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bZ = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.ca[0][$$4] = this.ca[1][$$4];
               this.ca[1][$$4] = new ept(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public atx ae_() {
      return aty.mN;
   }

   public ept[] G(float $$0) {
      if (this.bZ <= 0) {
         return this.ca[1];
      } else {
         double $$1 = (double)(((float)this.bZ - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ept[] $$2 = new ept[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.ca[1][$$3].a(1.0 - $$1).e(this.ca[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected atx v() {
      return aty.mN;
   }

   @Override
   protected atx n_() {
      return aty.mP;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.mQ;
   }

   @Override
   protected atx gn() {
      return aty.mO;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bpp $$0, float $$1) {
      cqm $$2 = this.g(this.b(cjo.a(this, cqp.ot)));
      cja $$3 = cjo.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(aty.wO, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cfh.a r() {
      if (this.gx()) {
         return cfh.a.c;
      } else {
         return this.gf() ? cfh.a.d : cfh.a.a;
      }
   }

   class a extends cgk.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cfy.this.p() == null) {
            return false;
         } else {
            return cfy.this.p().aj() == this.e ? false : cfy.this.dM().d_(cfy.this.dm()).a((float)bna.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bpp $$0 = cfy.this.p();
         if ($$0 != null) {
            this.e = $$0.aj();
         }
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 180;
      }

      @Override
      protected void k() {
         cfy.this.p().b(new bok(bom.o, 400), cfy.this);
      }

      @Override
      protected atx l() {
         return aty.mS;
      }

      @Override
      protected cgk.a m() {
         return cgk.a.f;
      }
   }

   class b extends cgk.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cfy.this.a(bom.n);
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         cfy.this.b(new bok(bom.n, 1200));
      }

      @Nullable
      @Override
      protected atx l() {
         return aty.mT;
      }

      @Override
      protected cgk.a m() {
         return cgk.a.e;
      }
   }
}

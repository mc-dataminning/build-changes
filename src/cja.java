import javax.annotation.Nullable;

public class cja extends cjo implements cji {
   private static final int e = 4;
   private static final int ch = 3;
   private static final int ci = 3;
   private int cj;
   private final ewu[][] ck;

   public cja(bsb<? extends cja> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
      this.ck = new ewu[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.ck[0][$$2] = ewu.b;
         this.ck[1][$$2] = ewu.b;
      }
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cjo.b());
      this.cb.a(4, new cja.b());
      this.cb.a(5, new cja.a());
      this.cb.a(6, new cal<>(this, 0.5, 20, 15.0F));
      this.cb.a(8, new cai(this, 0.6));
      this.cb.a(9, new bzt(this, cly.class, 3.0F, 1.0F));
      this.cb.a(10, new bzt(this, bsq.class, 8.0F));
      this.cc.a(1, new cbd(this, cnn.class).a());
      this.cc.a(2, new cbe<>(this, cly.class, true).c(300));
      this.cc.a(3, new cbe<>(this, clg.class, false).c(300));
      this.cc.a(3, new cbe<>(this, ceq.class, false).c(300));
   }

   public static btu.a t() {
      return cjd.gG().a(btv.r, 0.5).a(btv.k, 18.0).a(btv.q, 32.0);
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.a(bsc.a, new cuh(cuk.pK));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewp h_() {
      return this.cP().c(3.0, 0.0, 3.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dU().C && this.cm()) {
         this.cj--;
         if (this.cj < 0) {
            this.cj = 0;
         }

         if (this.aZ == 1 || this.am % 1200 == 0) {
            this.cj = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.ck[0][$$2] = this.ck[1][$$2];
               this.ck[1][$$2] = new ewu(
                  (double)(-6.0F + (float)this.al.a(13)) * 0.5, (double)Math.max(0, this.al.a(6) - 4), (double)(-6.0F + (float)this.al.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dU().a(lb.e, this.d(0.5), this.dC(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dU().a(this.dz(), this.dB(), this.dF(), avo.ny, this.dj(), 1.0F, 1.0F, false);
         } else if (this.aZ == this.ba - 1) {
            this.cj = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.ck[0][$$4] = this.ck[1][$$4];
               this.ck[1][$$4] = new ewu(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avn af_() {
      return avo.nu;
   }

   public ewu[] G(float $$0) {
      if (this.cj <= 0) {
         return this.ck[1];
      } else {
         double $$1 = (double)(((float)this.cj - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ewu[] $$2 = new ewu[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.ck[1][$$3].a(1.0 - $$1).e(this.ck[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avn u() {
      return avo.nu;
   }

   @Override
   protected avn n_() {
      return avo.nw;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.nx;
   }

   @Override
   protected avn gy() {
      return avo.nv;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bso $$0, float $$1) {
      cuh $$2 = this.g(this.b(cmu.a(this, cuk.pK)));
      cme $$3 = cmu.a(this, $$2, $$1);
      double $$4 = $$0.dz() - this.dz();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dB();
      double $$6 = $$0.dF() - this.dF();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dU().al().a() * 4));
      this.a(avo.xI, 1.0F, 1.0F / (this.et().i() * 0.4F + 0.8F));
      this.dU().b($$3);
   }

   @Override
   public cij.a r() {
      if (this.gI()) {
         return cij.a.c;
      } else {
         return this.gq() ? cij.a.d : cij.a.a;
      }
   }

   class a extends cjo.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cja.this.p() == null) {
            return false;
         } else {
            return cja.this.p().al() == this.e ? false : cja.this.dU().d_(cja.this.du()).a((float)bpx.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bso $$0 = cja.this.p();
         if ($$0 != null) {
            this.e = $$0.al();
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
         cja.this.p().b(new brh(brj.o, 400), cja.this);
      }

      @Override
      protected avn l() {
         return avo.nz;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.f;
      }
   }

   class b extends cjo.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cja.this.b(brj.n);
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
         cja.this.b(new brh(brj.n, 1200));
      }

      @Nullable
      @Override
      protected avn l() {
         return avo.nA;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.e;
      }
   }
}

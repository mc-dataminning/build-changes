import javax.annotation.Nullable;

public class cil extends cix implements cir {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final etp[][] cb;

   public cil(brn<? extends cil> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new etp[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = etp.b;
         this.cb[1][$$2] = etp.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(1, new cix.b());
      this.bS.a(4, new cil.b());
      this.bS.a(5, new cil.a());
      this.bS.a(6, new bzx<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new bzu(this, 0.6));
      this.bS.a(9, new bzf(this, clh.class, 3.0F, 1.0F));
      this.bS.a(10, new bzf(this, bsc.class, 8.0F));
      this.bT.a(1, new cap(this, cmt.class).a());
      this.bT.a(2, new caq<>(this, clh.class, true).c(300));
      this.bT.a(3, new caq<>(this, ckp.class, false).c(300));
      this.bT.a(3, new caq<>(this, ceb.class, false).c(300));
   }

   public static btg.a u() {
      return cin.gv().a(bth.r, 0.5).a(bth.k, 18.0).a(bth.q, 32.0);
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.a(bro.a, new csz(ctc.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public etk h_() {
      return this.cI().c(3.0, 0.0, 3.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dN().B && this.cf()) {
         this.ca--;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.aP == 1 || this.ai % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new etp(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dN().a(kx.e, this.d(0.5), this.dv(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dN().a(this.ds(), this.du(), this.dy(), avc.mY, this.dc(), 1.0F, 1.0F, false);
         } else if (this.aP == this.aQ - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new etp(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avb ae_() {
      return avc.mU;
   }

   public etp[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         etp[] $$2 = new etp[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avb v() {
      return avc.mU;
   }

   @Override
   protected avb o_() {
      return avc.mW;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.mX;
   }

   @Override
   protected avb gp() {
      return avc.mV;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bsa $$0, float $$1) {
      csz $$2 = this.g(this.b(cmb.a(this, ctc.ou)));
      cln $$3 = cmb.a(this, $$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().ak().a() * 4));
      this.a(avc.wZ, 1.0F, 1.0F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   @Override
   public chu.a r() {
      if (this.gz()) {
         return chu.a.c;
      } else {
         return this.gh() ? chu.a.d : chu.a.a;
      }
   }

   class a extends cix.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cil.this.p() == null) {
            return false;
         } else {
            return cil.this.p().aj() == this.e ? false : cil.this.dN().d_(cil.this.dn()).a((float)bpj.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bsa $$0 = cil.this.p();
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
         cil.this.p().b(new bqt(bqv.o, 400), cil.this);
      }

      @Override
      protected avb l() {
         return avc.mZ;
      }

      @Override
      protected cix.a m() {
         return cix.a.f;
      }
   }

   class b extends cix.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cil.this.b(bqv.n);
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
         cil.this.b(new bqt(bqv.n, 1200));
      }

      @Nullable
      @Override
      protected avb l() {
         return avc.na;
      }

      @Override
      protected cix.a m() {
         return cix.a.e;
      }
   }
}

import javax.annotation.Nullable;

public class cbx extends ccj implements ccd {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final elb[][] bW;

   public cbx(blj<? extends cbx> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new elb[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = elb.b;
         this.bW[1][$$2] = elb.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new ccj.b());
      this.bO.a(4, new cbx.b());
      this.bO.a(5, new cbx.a());
      this.bO.a(6, new btr<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bto(this, 0.6));
      this.bO.a(9, new bsz(this, cer.class, 3.0F, 1.0F));
      this.bO.a(10, new bsz(this, blx.class, 8.0F));
      this.bP.a(1, new buj(this, cga.class).a());
      this.bP.a(2, new buk<>(this, cer.class, true).c(300));
      this.bP.a(3, new buk<>(this, cdz.class, false).c(300));
      this.bP.a(3, new buk<>(this, bxu.class, false).c(300));
   }

   public static bna.a w() {
      return cbz.gk().a(bnb.m, 0.5).a(bnb.g, 18.0).a(bnb.l, 32.0);
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.a(blk.a, new cmh(cmk.or));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public ekw i_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B && this.ce()) {
         this.bV--;
         if (this.bV < 0) {
            this.bV = 0;
         }

         if (this.aK == 1 || this.ah % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new elb(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(jv.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), arc.mu, this.db(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new elb(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public arb af_() {
      return arc.mq;
   }

   public elb[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         elb[] $$2 = new elb[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(blf $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof blv && ((blv)$$0).eS() == bma.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arb y() {
      return arc.mq;
   }

   @Override
   protected arb n_() {
      return arc.ms;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.mt;
   }

   @Override
   protected arb ge() {
      return arc.mr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(blv $$0, float $$1) {
      cmh $$2 = this.g(this.b(cfk.a(this, cmk.or)));
      cex $$3 = cfk.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(arc.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cbh.a u() {
      if (this.go()) {
         return cbh.a.c;
      } else {
         return this.fW() ? cbh.a.d : cbh.a.a;
      }
   }

   class a extends ccj.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cbx.this.q() == null) {
            return false;
         } else {
            return cbx.this.q().aj() == this.e ? false : cbx.this.dM().d_(cbx.this.dm()).a((float)bji.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         blv $$0 = cbx.this.q();
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
         cbx.this.q().b(new bks(bku.o, 400), cbx.this);
      }

      @Override
      protected arb l() {
         return arc.mv;
      }

      @Override
      protected ccj.a m() {
         return ccj.a.f;
      }
   }

   class b extends ccj.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cbx.this.a(bku.n);
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
         cbx.this.b(new bks(bku.n, 1200));
      }

      @Nullable
      @Override
      protected arb l() {
         return arc.mw;
      }

      @Override
      protected ccj.a m() {
         return ccj.a.e;
      }
   }
}

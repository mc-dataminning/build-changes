import javax.annotation.Nullable;

public class cep extends cfb implements cev {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final enz[][] bW;

   public cep(bnw<? extends cep> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new enz[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = enz.b;
         this.bW[1][$$2] = enz.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(1, new cfb.b());
      this.bO.a(4, new cep.b());
      this.bO.a(5, new cep.a());
      this.bO.a(6, new bwf<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bwc(this, 0.6));
      this.bO.a(9, new bvn(this, chl.class, 3.0F, 1.0F));
      this.bO.a(10, new bvn(this, bok.class, 8.0F));
      this.bP.a(1, new bwx(this, civ.class).a());
      this.bP.a(2, new bwy<>(this, chl.class, true).c(300));
      this.bP.a(3, new bwy<>(this, cgt.class, false).c(300));
      this.bP.a(3, new bwy<>(this, caj.class, false).c(300));
   }

   public static bpo.a w() {
      return cer.gm().a(bpp.o, 0.5).a(bpp.i, 18.0).a(bpp.n, 32.0);
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.a(bnx.a, new cpd(cpg.ot));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public enu i_() {
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

         if (this.aK == 1 || this.ag % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new enz(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(jz.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), atl.mK, this.db(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new enz(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public atk ag_() {
      return atl.mG;
   }

   public enz[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         enz[] $$2 = new enz[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected atk y() {
      return atl.mG;
   }

   @Override
   protected atk n_() {
      return atl.mI;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.mJ;
   }

   @Override
   protected atk gg() {
      return atl.mH;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(boi $$0, float $$1) {
      cpd $$2 = this.g(this.b(cif.a(this, cpg.ot)));
      chr $$3 = cif.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(atl.wG, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cdz.a u() {
      if (this.gq()) {
         return cdz.a.c;
      } else {
         return this.fY() ? cdz.a.d : cdz.a.a;
      }
   }

   class a extends cfb.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cep.this.q() == null) {
            return false;
         } else {
            return cep.this.q().aj() == this.e ? false : cep.this.dM().d_(cep.this.dm()).a((float)blt.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         boi $$0 = cep.this.q();
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
         cep.this.q().b(new bnd(bnf.o, 400), cep.this);
      }

      @Override
      protected atk l() {
         return atl.mL;
      }

      @Override
      protected cfb.a m() {
         return cfb.a.f;
      }
   }

   class b extends cfb.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cep.this.a(bnf.n);
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
         cep.this.b(new bnd(bnf.n, 1200));
      }

      @Nullable
      @Override
      protected atk l() {
         return atl.mM;
      }

      @Override
      protected cfb.a m() {
         return cfb.a.e;
      }
   }
}

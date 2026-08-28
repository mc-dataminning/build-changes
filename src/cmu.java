import javax.annotation.Nullable;

public class cmu extends cng implements cna {
   private static final int bZ = 4;
   private static final int ca = 3;
   public static final int a = 3;
   private int cb;
   private final fbx[][] cc;

   public cmu(bvq<? extends cmu> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.cc = new fbx[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cc[0][$$2] = fbx.c;
         this.cc[1][$$2] = fbx.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cng.b());
      this.bT.a(3, new cck<>(this, coa.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cmu.b());
      this.bT.a(5, new cmu.a());
      this.bT.a(6, new ced<>(this, 0.5, 20, 15.0F));
      this.bT.a(8, new cea(this, 0.6));
      this.bT.a(9, new cdl(this, cpw.class, 3.0F, 1.0F));
      this.bT.a(10, new cdl(this, bwh.class, 8.0F));
      this.bU.a(1, new cev(this, crk.class).a());
      this.bU.a(2, new cew<>(this, cpw.class, true).c(300));
      this.bU.a(3, new cew<>(this, cpd.class, false).c(300));
      this.bU.a(3, new cew<>(this, cii.class, false).c(300));
   }

   public static bxm.a p() {
      return cmw.gr().a(bxn.v, 0.5).a(bxn.m, 18.0).a(bxn.s, 32.0);
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.a(bvr.a, new cxo(cxs.oR));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV().C && this.cp()) {
         this.cb--;
         if (this.cb < 0) {
            this.cb = 0;
         }

         if (this.aN == 1 || this.af % 1200 == 0) {
            this.cb = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cc[0][$$2] = this.cc[1][$$2];
               this.cc[1][$$2] = new fbx(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(ls.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), axf.nA, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.cb = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cc[0][$$4] = this.cc[1][$$4];
               this.cc[1][$$4] = new fbx(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public axe ak_() {
      return axf.nw;
   }

   public fbx[] J(float $$0) {
      if (this.cb <= 0) {
         return this.cc[1];
      } else {
         double $$1 = (double)(((float)this.cb - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fbx[] $$2 = new fbx[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cc[1][$$3].c(1.0 - $$1).e(this.cc[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected axe u() {
      return axf.nw;
   }

   @Override
   protected axe o_() {
      return axf.ny;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.nz;
   }

   @Override
   protected axe x() {
      return axf.nx;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bwf $$0, float $$1) {
      cxo $$2 = this.b(cqr.a(this, cxs.oR));
      cxo $$3 = this.d($$2);
      cqd $$4 = cqr.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ash $$9) {
         cqp.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.al().a() * 4));
      }

      this.a(axf.xH, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cmd.a m() {
      if (this.gv()) {
         return cmd.a.c;
      } else {
         return this.gb() ? cmd.a.d : cmd.a.a;
      }
   }

   class a extends cng.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cmu.this.O_() == null) {
            return false;
         } else {
            return cmu.this.O_().ar() == this.e ? false : cmu.this.dV().d_(cmu.this.dv()).a((float)btf.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bwf $$0 = cmu.this.O_();
         if ($$0 != null) {
            this.e = $$0.ar();
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
         cmu.this.O_().b(new buo(buq.o, 400), cmu.this);
      }

      @Override
      protected axe l() {
         return axf.nB;
      }

      @Override
      protected cng.a m() {
         return cng.a.f;
      }
   }

   class b extends cng.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cmu.this.b(buq.n);
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
         cmu.this.a(new buo(buq.n, 1200));
      }

      @Nullable
      @Override
      protected axe l() {
         return axf.nC;
      }

      @Override
      protected cng.a m() {
         return cng.a.e;
      }
   }
}

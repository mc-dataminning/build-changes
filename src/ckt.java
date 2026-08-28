import javax.annotation.Nullable;

public class ckt extends clf implements ckz {
   private static final int bZ = 4;
   private static final int ca = 3;
   public static final int b = 3;
   private int cb;
   private final eye[][] cc;

   public ckt(btq<? extends ckt> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.cc = new eye[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cc[0][$$2] = eye.c;
         this.cc[1][$$2] = eye.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(1, new clf.b());
      this.bT.a(4, new ckt.b());
      this.bT.a(5, new ckt.a());
      this.bT.a(6, new ccc<>(this, 0.5, 20, 15.0F));
      this.bT.a(8, new cbz(this, 0.6));
      this.bT.a(9, new cbk(this, cnp.class, 3.0F, 1.0F));
      this.bT.a(10, new cbk(this, buh.class, 8.0F));
      this.bU.a(1, new ccu(this, cpd.class).a());
      this.bU.a(2, new ccv<>(this, cnp.class, true).c(300));
      this.bU.a(3, new ccv<>(this, cmx.class, false).c(300));
      this.bU.a(3, new ccv<>(this, cgh.class, false).c(300));
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.v, 0.5).a(bvm.m, 18.0).a(bvm.s, 32.0);
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.a(btr.a, new cvl(cvo.ow));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dS().B && this.cm()) {
         this.cb--;
         if (this.cb < 0) {
            this.cb = 0;
         }

         if (this.aK == 1 || this.ag % 1200 == 0) {
            this.cb = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cc[0][$$2] = this.cc[1][$$2];
               this.cc[1][$$2] = new eye(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dS().a(ln.e, this.d(0.5), this.dA(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dS().a(this.dx(), this.dz(), this.dD(), awd.nj, this.di(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.cb = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cc[0][$$4] = this.cc[1][$$4];
               this.cc[1][$$4] = new eye(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awc ah_() {
      return awd.nf;
   }

   public eye[] J(float $$0) {
      if (this.cb <= 0) {
         return this.cc[1];
      } else {
         double $$1 = (double)(((float)this.cb - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eye[] $$2 = new eye[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cc[1][$$3].c(1.0 - $$1).e(this.cc[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awc w() {
      return awd.nf;
   }

   @Override
   protected awc n_() {
      return awd.nh;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.ni;
   }

   @Override
   protected awc go() {
      return awd.ng;
   }

   @Override
   public void a(arg $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(buf $$0, float $$1) {
      cvl $$2 = this.b(cok.a(this, cvo.ow));
      cvl $$3 = this.h($$2);
      cnw $$4 = cok.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arg $$9) {
         coi.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awd.xo, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   @Override
   public ckc.a q() {
      if (this.gy()) {
         return ckc.a.c;
      } else {
         return this.gf() ? ckc.a.d : ckc.a.a;
      }
   }

   class a extends clf.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (ckt.this.m() == null) {
            return false;
         } else {
            return ckt.this.m().ap() == this.e ? false : ckt.this.dS().d_(ckt.this.ds()).a((float)brh.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         buf $$0 = ckt.this.m();
         if ($$0 != null) {
            this.e = $$0.ap();
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
         ckt.this.m().b(new bsq(bss.o, 400), ckt.this);
      }

      @Override
      protected awc l() {
         return awd.nk;
      }

      @Override
      protected clf.a m() {
         return clf.a.f;
      }
   }

   class b extends clf.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !ckt.this.b(bss.n);
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
         ckt.this.b(new bsq(bss.n, 1200));
      }

      @Nullable
      @Override
      protected awc l() {
         return awd.nl;
      }

      @Override
      protected clf.a m() {
         return clf.a.e;
      }
   }
}

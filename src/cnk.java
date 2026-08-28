import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnk extends cmw implements bxe {
   public static final float a = 45.836624F;
   public static final int b = bae.f((float) (Math.PI * 5.0 / 4.0));
   protected static final alc<Byte> c = alg.a(cnk.class, ale.a);
   private static final int d = 1;
   @Nullable
   bwh bZ;
   @Nullable
   private jh ca;
   private boolean cb;
   private int cc;

   public cnk(bvq<? extends cnk> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new cnk.c(this);
      this.bO = 3;
   }

   @Override
   public boolean ba() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aL() {
      return !this.dR();
   }

   @Override
   public void h() {
      this.ad = true;
      super.h();
      this.ad = false;
      this.f(true);
      if (this.cb && --this.cc <= 0) {
         this.cc = 20;
         this.a(this.dX().j(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(4, new cnk.a());
      this.bT.a(8, new cnk.d());
      this.bT.a(9, new cdl(this, cpw.class, 3.0F, 1.0F));
      this.bT.a(10, new cdl(this, bwh.class, 8.0F));
      this.bU.a(1, new cev(this, crk.class).a());
      this.bU.a(2, new cnk.b(this));
      this.bU.a(3, new cew<>(this, cpw.class, true));
   }

   public static bxm.a m() {
      return cmw.gt().a(bxn.s, 14.0).a(bxn.c, 4.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.ca = new jh($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bvj $$0) {
      super.x($$0);
      if ($$0 instanceof cnk $$1) {
         this.bZ = $$1.t();
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.ca != null) {
         $$0.a("BoundX", this.ca.u());
         $$0.a("BoundY", this.ca.v());
         $$0.a("BoundZ", this.ca.w());
      }

      if (this.cb) {
         $$0.a("LifeTicks", this.cc);
      }
   }

   @Nullable
   public bwh t() {
      return this.bZ;
   }

   @Nullable
   public jh x() {
      return this.ca;
   }

   public void h(@Nullable jh $$0) {
      this.ca = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.al.a(c);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.al.a(c);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.al.a(c, (byte)($$2 & 0xFF));
   }

   public boolean go() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bwh $$0) {
      this.bZ = $$0;
   }

   public void b(int $$0) {
      this.cb = true;
      this.cc = $$0;
   }

   @Override
   protected axe u() {
      return axf.Bn;
   }

   @Override
   protected axe o_() {
      return axf.Bp;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.Bq;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      this.a(bvr.a, new cxo(cxs.px));
      this.a(bvr.a, 0.0F);
   }

   class a extends cdd {
      public a() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         bwf $$0 = cnk.this.O_();
         return $$0 != null && $$0.bL() && !cnk.this.I().b() && cnk.this.ae.a(b(7)) == 0 ? cnk.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cnk.this.I().b() && cnk.this.go() && cnk.this.O_() != null && cnk.this.O_().bL();
      }

      @Override
      public void d() {
         bwf $$0 = cnk.this.O_();
         if ($$0 != null) {
            fbx $$1 = $$0.bF();
            cnk.this.bQ.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cnk.this.x(true);
         cnk.this.a(axf.Bo, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cnk.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bwf $$0 = cnk.this.O_();
         if ($$0 != null) {
            if (cnk.this.cR().c($$0.cR())) {
               cnk.this.c(a(cnk.this.dW()), $$0);
               cnk.this.x(false);
            } else {
               double $$1 = cnk.this.g($$0);
               if ($$1 < 9.0) {
                  fbx $$2 = $$0.bF();
                  cnk.this.bQ.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cfd {
      private final cgw b = cgw.b().d().e();

      public b(final bwn $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cnk.this.bZ != null && cnk.this.bZ.O_() != null && this.a(cnk.this.bZ.O_(), this.b);
      }

      @Override
      public void d() {
         cnk.this.h(cnk.this.bZ.O_());
         super.d();
      }
   }

   class c extends ccg {
      public c(final cnk $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == ccg.a.b) {
            fbx $$0 = new fbx(this.e - cnk.this.dB(), this.f - cnk.this.dD(), this.g - cnk.this.dH());
            double $$1 = $$0.g();
            if ($$1 < cnk.this.cR().a()) {
               this.k = ccg.a.a;
               cnk.this.h(cnk.this.dz().c(0.5));
            } else {
               cnk.this.h(cnk.this.dz().e($$0.c(this.h * 0.05 / $$1)));
               if (cnk.this.O_() == null) {
                  fbx $$2 = cnk.this.dz();
                  cnk.this.v(-((float)bae.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cnk.this.aX = cnk.this.dM();
               } else {
                  double $$3 = cnk.this.O_().dB() - cnk.this.dB();
                  double $$4 = cnk.this.O_().dH() - cnk.this.dH();
                  cnk.this.v(-((float)bae.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cnk.this.aX = cnk.this.dM();
               }
            }
         }
      }
   }

   class d extends cdd {
      public d() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         return !cnk.this.I().b() && cnk.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jh $$0 = cnk.this.x();
         if ($$0 == null) {
            $$0 = cnk.this.dw();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jh $$2 = $$0.b(cnk.this.ae.a(15) - 7, cnk.this.ae.a(11) - 5, cnk.this.ae.a(15) - 7);
            if (cnk.this.dW().u($$2)) {
               cnk.this.bQ.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cnk.this.O_() == null) {
                  cnk.this.H().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}

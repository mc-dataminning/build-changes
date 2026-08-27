import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjb extends cin implements bsy {
   public static final float b = 45.836624F;
   public static final int c = axz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajm<Byte> d = ajq.a(cjb.class, ajo.a);
   private static final int e = 1;
   @Nullable
   bsc bY;
   @Nullable
   private in bZ;
   private boolean ca;
   private int cb;

   public cjb(brn<? extends cjb> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new cjb.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aT() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bsf $$0, etp $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dO().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(4, new cjb.a());
      this.bS.a(8, new cjb.d());
      this.bS.a(9, new bzf(this, clh.class, 3.0F, 1.0F));
      this.bS.a(10, new bzf(this, bsc.class, 8.0F));
      this.bT.a(1, new cap(this, cmt.class).a());
      this.bT.a(2, new cjb.b(this));
      this.bT.a(3, new caq<>(this, clh.class, true));
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 14.0).a(bth.c, 4.0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new in($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(brh $$0) {
      super.w($$0);
      if ($$0 instanceof cjb $$1) {
         this.bY = $$1.y();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.bZ != null) {
         $$0.a("BoundX", this.bZ.u());
         $$0.a("BoundY", this.bZ.v());
         $$0.a("BoundZ", this.bZ.w());
      }

      if (this.ca) {
         $$0.a("LifeTicks", this.cb);
      }
   }

   @Nullable
   public bsc y() {
      return this.bY;
   }

   @Nullable
   public in gp() {
      return this.bZ;
   }

   public void i(@Nullable in $$0) {
      this.bZ = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.ao.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.ao.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gq() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bsc $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avb v() {
      return avc.Az;
   }

   @Override
   protected avb o_() {
      return avc.AB;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.AC;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      this.a(bro.a, new csz(ctc.pa));
      this.a(bro.a, 0.0F);
   }

   class a extends byx {
      public a() {
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         bsa $$0 = cjb.this.p();
         return $$0 != null && $$0.bB() && !cjb.this.H().b() && cjb.this.ah.a(b(7)) == 0 ? cjb.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cjb.this.H().b() && cjb.this.gq() && cjb.this.p() != null && cjb.this.p().bB();
      }

      @Override
      public void c() {
         bsa $$0 = cjb.this.p();
         if ($$0 != null) {
            etp $$1 = $$0.bv();
            cjb.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cjb.this.w(true);
         cjb.this.a(avc.AA, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cjb.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsa $$0 = cjb.this.p();
         if ($$0 != null) {
            if (cjb.this.cI().c($$0.cI())) {
               cjb.this.C($$0);
               cjb.this.w(false);
            } else {
               double $$1 = cjb.this.g($$0);
               if ($$1 < 9.0) {
                  etp $$2 = $$0.bv();
                  cjb.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cax {
      private final ccq b = ccq.b().d().e();

      public b(bsi $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cjb.this.bY != null && cjb.this.bY.p() != null && this.a(cjb.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         cjb.this.h(cjb.this.bY.p());
         super.c();
      }
   }

   class c extends bya {
      public c(cjb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bya.a.b) {
            etp $$0 = new etp(this.e - cjb.this.ds(), this.f - cjb.this.du(), this.g - cjb.this.dy());
            double $$1 = $$0.f();
            if ($$1 < cjb.this.cI().a()) {
               this.k = bya.a.a;
               cjb.this.g(cjb.this.dq().a(0.5));
            } else {
               cjb.this.g(cjb.this.dq().e($$0.a(this.h * 0.05 / $$1)));
               if (cjb.this.p() == null) {
                  etp $$2 = cjb.this.dq();
                  cjb.this.r(-((float)axz.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cjb.this.aZ = cjb.this.dD();
               } else {
                  double $$3 = cjb.this.p().ds() - cjb.this.ds();
                  double $$4 = cjb.this.p().dy() - cjb.this.dy();
                  cjb.this.r(-((float)axz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cjb.this.aZ = cjb.this.dD();
               }
            }
         }
      }
   }

   class d extends byx {
      public d() {
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         return !cjb.this.H().b() && cjb.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         in $$0 = cjb.this.gp();
         if ($$0 == null) {
            $$0 = cjb.this.dn();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            in $$2 = $$0.b(cjb.this.ah.a(15) - 7, cjb.this.ah.a(11) - 5, cjb.this.ah.a(15) - 7);
            if (cjb.this.dN().u($$2)) {
               cjb.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cjb.this.p() == null) {
                  cjb.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}

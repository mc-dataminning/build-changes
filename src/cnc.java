import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnc extends cmo implements bww {
   public static final float a = 45.836624F;
   public static final int b = azu.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aks<Byte> c = akw.a(cnc.class, aku.a);
   private static final int d = 1;
   @Nullable
   bvz bZ;
   @Nullable
   private jh ca;
   private boolean cb;
   private int cc;

   public cnc(bvi<? extends cnc> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cnc.c(this);
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
      this.bT.a(0, new ccp(this));
      this.bT.a(4, new cnc.a());
      this.bT.a(8, new cnc.d());
      this.bT.a(9, new cdd(this, cpo.class, 3.0F, 1.0F));
      this.bT.a(10, new cdd(this, bvz.class, 8.0F));
      this.bU.a(1, new cen(this, crc.class).a());
      this.bU.a(2, new cnc.b(this));
      this.bU.a(3, new ceo<>(this, cpo.class, true));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 14.0).a(bxf.c, 4.0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.ca = new jh($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bvb $$0) {
      super.x($$0);
      if ($$0 instanceof cnc $$1) {
         this.bZ = $$1.t();
      }
   }

   @Override
   public void b(um $$0) {
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
   public bvz t() {
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

   public void a(bvz $$0) {
      this.bZ = $$0;
   }

   public void b(int $$0) {
      this.cb = true;
      this.cc = $$0;
   }

   @Override
   protected awu u() {
      return awv.BD;
   }

   @Override
   protected awu o_() {
      return awv.BF;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.BG;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      this.a(bvj.a, new cxg(cxk.pG));
      this.a(bvj.a, 0.0F);
   }

   class a extends ccv {
      public a() {
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         bvx $$0 = cnc.this.O_();
         return $$0 != null && $$0.bL() && !cnc.this.I().b() && cnc.this.ae.a(b(7)) == 0 ? cnc.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cnc.this.I().b() && cnc.this.go() && cnc.this.O_() != null && cnc.this.O_().bL();
      }

      @Override
      public void d() {
         bvx $$0 = cnc.this.O_();
         if ($$0 != null) {
            fbr $$1 = $$0.bF();
            cnc.this.bQ.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cnc.this.x(true);
         cnc.this.a(awv.BE, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cnc.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvx $$0 = cnc.this.O_();
         if ($$0 != null) {
            if (cnc.this.cR().c($$0.cR())) {
               cnc.this.c(a(cnc.this.dW()), $$0);
               cnc.this.x(false);
            } else {
               double $$1 = cnc.this.g($$0);
               if ($$1 < 9.0) {
                  fbr $$2 = $$0.bF();
                  cnc.this.bQ.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cev {
      private final cgo b = cgo.b().d().e();

      public b(final bwf $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cnc.this.bZ != null && cnc.this.bZ.O_() != null && this.a(cnc.this.bZ.O_(), this.b);
      }

      @Override
      public void d() {
         cnc.this.h(cnc.this.bZ.O_());
         super.d();
      }
   }

   class c extends cby {
      public c(final cnc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cby.a.b) {
            fbr $$0 = new fbr(this.e - cnc.this.dB(), this.f - cnc.this.dD(), this.g - cnc.this.dH());
            double $$1 = $$0.g();
            if ($$1 < cnc.this.cR().a()) {
               this.k = cby.a.a;
               cnc.this.h(cnc.this.dz().c(0.5));
            } else {
               cnc.this.h(cnc.this.dz().e($$0.c(this.h * 0.05 / $$1)));
               if (cnc.this.O_() == null) {
                  fbr $$2 = cnc.this.dz();
                  cnc.this.v(-((float)azu.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cnc.this.aX = cnc.this.dM();
               } else {
                  double $$3 = cnc.this.O_().dB() - cnc.this.dB();
                  double $$4 = cnc.this.O_().dH() - cnc.this.dH();
                  cnc.this.v(-((float)azu.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cnc.this.aX = cnc.this.dM();
               }
            }
         }
      }
   }

   class d extends ccv {
      public d() {
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         return !cnc.this.I().b() && cnc.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jh $$0 = cnc.this.x();
         if ($$0 == null) {
            $$0 = cnc.this.dw();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jh $$2 = $$0.b(cnc.this.ae.a(15) - 7, cnc.this.ae.a(11) - 5, cnc.this.ae.a(15) - 7);
            if (cnc.this.dW().u($$2)) {
               cnc.this.bQ.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cnc.this.O_() == null) {
                  cnc.this.H().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}

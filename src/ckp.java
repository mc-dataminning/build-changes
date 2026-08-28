import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckp extends ckb implements bul {
   public static final float b = 45.836624F;
   public static final int c = ayn.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajv<Byte> d = ajz.a(ckp.class, ajx.a);
   private static final int e = 1;
   @Nullable
   btn ca;
   @Nullable
   private jd cb;
   private boolean cc;
   private int cd;

   public ckp(bsw<? extends ckp> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new ckp.c(this);
      this.bP = 3;
   }

   @Override
   public boolean aW() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btq $$0, eww $$1) {
      super.a($$0, $$1);
      this.aT();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.g(true);
      if (this.cc && --this.cd <= 0) {
         this.cd = 20;
         this.a(this.dR().j(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cae(this));
      this.bU.a(4, new ckp.a());
      this.bU.a(8, new ckp.d());
      this.bU.a(9, new cas(this, cmv.class, 3.0F, 1.0F));
      this.bU.a(10, new cas(this, btn.class, 8.0F));
      this.bV.a(1, new ccc(this, coh.class).a());
      this.bV.a(2, new ckp.b(this));
      this.bV.a(3, new ccd<>(this, cmv.class, true));
   }

   public static but.a t() {
      return ckb.gs().a(buu.s, 14.0).a(buu.c, 4.0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.cb = new jd($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsq $$0) {
      super.w($$0);
      if ($$0 instanceof ckp $$1) {
         this.ca = $$1.x();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.cb != null) {
         $$0.a("BoundX", this.cb.u());
         $$0.a("BoundY", this.cb.v());
         $$0.a("BoundZ", this.cb.w());
      }

      if (this.cc) {
         $$0.a("LifeTicks", this.cd);
      }
   }

   @Nullable
   public btn x() {
      return this.ca;
   }

   @Nullable
   public jd gm() {
      return this.cb;
   }

   public void g(@Nullable jd $$0) {
      this.cb = $$0;
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

   public boolean gn() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(btn $$0) {
      this.ca = $$0;
   }

   public void b(int $$0) {
      this.cc = true;
      this.cd = $$0;
   }

   @Override
   protected avn v() {
      return avo.AO;
   }

   @Override
   protected avn n_() {
      return avo.AQ;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.AR;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      this.a(bsx.a, new cuo(cur.pb));
      this.a(bsx.a, 0.0F);
   }

   class a extends cak {
      public a() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         btl $$0 = ckp.this.p();
         return $$0 != null && $$0.bE() && !ckp.this.H().b() && ckp.this.ah.a(b(7)) == 0 ? ckp.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return ckp.this.H().b() && ckp.this.gn() && ckp.this.p() != null && ckp.this.p().bE();
      }

      @Override
      public void d() {
         btl $$0 = ckp.this.p();
         if ($$0 != null) {
            eww $$1 = $$0.by();
            ckp.this.bR.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckp.this.w(true);
         ckp.this.a(avo.AP, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         ckp.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         btl $$0 = ckp.this.p();
         if ($$0 != null) {
            if (ckp.this.cL().c($$0.cL())) {
               ckp.this.D($$0);
               ckp.this.w(false);
            } else {
               double $$1 = ckp.this.g($$0);
               if ($$1 < 9.0) {
                  eww $$2 = $$0.by();
                  ckp.this.bR.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cck {
      private final ced b = ced.b().d().e();

      public b(final btu $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return ckp.this.ca != null && ckp.this.ca.p() != null && this.a(ckp.this.ca.p(), this.b);
      }

      @Override
      public void d() {
         ckp.this.h(ckp.this.ca.p());
         super.d();
      }
   }

   class c extends bzn {
      public c(final ckp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzn.a.b) {
            eww $$0 = new eww(this.e - ckp.this.dv(), this.f - ckp.this.dx(), this.g - ckp.this.dB());
            double $$1 = $$0.f();
            if ($$1 < ckp.this.cL().a()) {
               this.k = bzn.a.a;
               ckp.this.i(ckp.this.dt().a(0.5));
            } else {
               ckp.this.i(ckp.this.dt().e($$0.a(this.h * 0.05 / $$1)));
               if (ckp.this.p() == null) {
                  eww $$2 = ckp.this.dt();
                  ckp.this.s(-((float)ayn.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckp.this.aY = ckp.this.dG();
               } else {
                  double $$3 = ckp.this.p().dv() - ckp.this.dv();
                  double $$4 = ckp.this.p().dB() - ckp.this.dB();
                  ckp.this.s(-((float)ayn.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckp.this.aY = ckp.this.dG();
               }
            }
         }
      }
   }

   class d extends cak {
      public d() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         return !ckp.this.H().b() && ckp.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jd $$0 = ckp.this.gm();
         if ($$0 == null) {
            $$0 = ckp.this.dq();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jd $$2 = $$0.b(ckp.this.ah.a(15) - 7, ckp.this.ah.a(11) - 5, ckp.this.ah.a(15) - 7);
            if (ckp.this.dQ().u($$2)) {
               ckp.this.bR.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckp.this.p() == null) {
                  ckp.this.F().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}

import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckr extends ckd implements bun {
   public static final float b = 45.836624F;
   public static final int c = ayo.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajw<Byte> d = aka.a(ckr.class, ajy.a);
   private static final int e = 1;
   @Nullable
   btp ca;
   @Nullable
   private jd cb;
   private boolean cc;
   private int cd;

   public ckr(bsx<? extends ckr> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new ckr.c(this);
      this.bP = 3;
   }

   @Override
   public boolean aW() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bts $$0, exa $$1) {
      super.a($$0, $$1);
      this.aT();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.cc && --this.cd <= 0) {
         this.cd = 20;
         this.a(this.dQ().j(), 1.0F);
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(0, new cag(this));
      this.bU.a(4, new ckr.a());
      this.bU.a(8, new ckr.d());
      this.bU.a(9, new cau(this, cmx.class, 3.0F, 1.0F));
      this.bU.a(10, new cau(this, btp.class, 8.0F));
      this.bV.a(1, new cce(this, coj.class).a());
      this.bV.a(2, new ckr.b(this));
      this.bV.a(3, new ccf<>(this, cmx.class, true));
   }

   public static buv.a t() {
      return ckd.gr().a(buw.s, 14.0).a(buw.c, 4.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.cb = new jd($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsr $$0) {
      super.w($$0);
      if ($$0 instanceof ckr $$1) {
         this.ca = $$1.x();
      }
   }

   @Override
   public void b(ub $$0) {
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
   public btp x() {
      return this.ca;
   }

   @Nullable
   public jd gl() {
      return this.cb;
   }

   public void h(@Nullable jd $$0) {
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

   public boolean gm() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(btp $$0) {
      this.ca = $$0;
   }

   public void b(int $$0) {
      this.cc = true;
      this.cd = $$0;
   }

   @Override
   protected avo v() {
      return avp.AO;
   }

   @Override
   protected avo n_() {
      return avp.AQ;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.AR;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      this.a(bsy.a, new cuq(cut.pb));
      this.a(bsy.a, 0.0F);
   }

   class a extends cam {
      public a() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         btn $$0 = ckr.this.p();
         return $$0 != null && $$0.bE() && !ckr.this.J().b() && ckr.this.ah.a(b(7)) == 0 ? ckr.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return ckr.this.J().b() && ckr.this.gm() && ckr.this.p() != null && ckr.this.p().bE();
      }

      @Override
      public void d() {
         btn $$0 = ckr.this.p();
         if ($$0 != null) {
            exa $$1 = $$0.by();
            ckr.this.bR.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckr.this.w(true);
         ckr.this.a(avp.AP, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         ckr.this.w(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         btn $$0 = ckr.this.p();
         if ($$0 != null) {
            if (ckr.this.cL().c($$0.cL())) {
               ckr.this.D($$0);
               ckr.this.w(false);
            } else {
               double $$1 = ckr.this.g($$0);
               if ($$1 < 9.0) {
                  exa $$2 = $$0.by();
                  ckr.this.bR.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends ccm {
      private final cef b = cef.b().d().e();

      public b(final btw $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return ckr.this.ca != null && ckr.this.ca.p() != null && this.a(ckr.this.ca.p(), this.b);
      }

      @Override
      public void d() {
         ckr.this.h(ckr.this.ca.p());
         super.d();
      }
   }

   class c extends bzp {
      public c(final ckr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b) {
            exa $$0 = new exa(this.e - ckr.this.du(), this.f - ckr.this.dw(), this.g - ckr.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckr.this.cL().a()) {
               this.k = bzp.a.a;
               ckr.this.i(ckr.this.ds().a(0.5));
            } else {
               ckr.this.i(ckr.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckr.this.p() == null) {
                  exa $$2 = ckr.this.ds();
                  ckr.this.t(-((float)ayo.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckr.this.aY = ckr.this.dF();
               } else {
                  double $$3 = ckr.this.p().du() - ckr.this.du();
                  double $$4 = ckr.this.p().dA() - ckr.this.dA();
                  ckr.this.t(-((float)ayo.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckr.this.aY = ckr.this.dF();
               }
            }
         }
      }
   }

   class d extends cam {
      public d() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         return !ckr.this.J().b() && ckr.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jd $$0 = ckr.this.gl();
         if ($$0 == null) {
            $$0 = ckr.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jd $$2 = $$0.b(ckr.this.ah.a(15) - 7, ckr.this.ah.a(11) - 5, ckr.this.ah.a(15) - 7);
            if (ckr.this.dP().u($$2)) {
               ckr.this.bR.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckr.this.p() == null) {
                  ckr.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
